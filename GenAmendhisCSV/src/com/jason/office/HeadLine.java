/**
 * @author Jason.w  2014/4/15
 * @description
 *   
 */
package com.jason.office;

import java.io.UnsupportedEncodingException;

/**
 * 
 */
public class HeadLine {

	String headLine = "|             |                         |                                                         |                                                                   |";
	String[] contents;
	
	String version,
			validDate,
			desc,
			mainDir;
	
	public enum DEL_TYPE {
		ALL_DEL, ALL_DEL_2, ALL_CONTENT
	}
	
	public HeadLine(DEL_TYPE type) {
		if (type == DEL_TYPE.ALL_DEL) {
			version = "=============";
			validDate = "=========================";
			desc = "=========================================================";
			mainDir = "===================================================================";
		}
		
		if (type == DEL_TYPE.ALL_DEL_2) {
			version = "-------------";
			validDate = "-------------------------";
			desc = "---------------------------------------------------------";
			mainDir = "-------------------------------------------------------------------";
		}
		
		if (type == DEL_TYPE.ALL_CONTENT) {
			contents = headLine.split("\\|");
			version = contents[1];
			validDate = contents[2];
			desc = contents[3];
			mainDir = contents[4];
		}
	}
	
	private String fillContent(String oStr, String tStr) {
		try {
			if (tStr.getBytes("GBK").length >= oStr.length()) {
				return tStr;
			}
			
			return tStr + oStr.substring(tStr.getBytes("GBK").length);
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	

	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "|" + this.getVersion() + "|" + this.getValidDate() + "|" + this.getDesc() + "|" + this.getMainDir() + "|";
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return the validDate
	 */
	public String getValidDate() {
		return validDate;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @return the mainDir
	 */
	public String getMainDir() {
		return mainDir;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = fillContent(this.version, version);
	}

	/**
	 * @param validDate the validDate to set
	 */
	public void setValidDate(String validDate) {
		this.validDate = fillContent(this.validDate, validDate);
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = fillContent(this.desc, desc);
	}

	/**
	 * @param mainDir the mainDir to set
	 */
	public void setMainDir(String mainDir) {
		this.mainDir = fillContent(this.mainDir, mainDir);
	}
}
