/**
 * @author Jason.w  2014/4/16
 * @description
 *   
 */
package com.jason.office;

import java.io.UnsupportedEncodingException;

/**
 * 
 */
public class ContentLine {
	
	String contentLine = "|             |                         |                          |    |        |      |    |    |                                                                   |";
	String[] contents;

	String requireID,
			directory,
			program,
			updType,
			reviewBy,
			updBy,
			cod,
			tst,
			desc;
	

	public ContentLine() {
		contents = contentLine.split("\\|");
		requireID = contents[1];
		directory = contents[2];
		program = contents[3];
		updType = contents[4];
		reviewBy = contents[5];
		updBy = contents[6];
		cod = contents[7];
		tst = contents[8];
		desc = contents[9];
	}
	
	public enum DEL_TYPE {
		ALL_DEL, OTH_DEL
	}
	public ContentLine(DEL_TYPE type) {
		if (type == DEL_TYPE.ALL_DEL) {
			requireID = "-------------";
			directory = "-------------------------";
			program = "--------------------------";
			updType = "----";
			reviewBy = "--------";
			updBy = "------";
			cod = "----";
			tst = "----";
			desc = "-------------------------------------------------------------------";
		}
		
		if (type == DEL_TYPE.OTH_DEL) {
			contents = contentLine.split("\\|");
			requireID = contents[1];
			directory = "-------------------------";
			program = "--------------------------";
			updType = "----";
			reviewBy = contents[5];
			updBy = contents[6];
			cod = contents[7];
			tst = contents[8];
			desc = contents[9];
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
		return "|" + this.getRequireID() + "|" + this.getDirectory() + "|" + this.getProgram() + "|" + this.getUpdType() + "|" + this.getReviewBy() + "|" + this.getUpdBy()
					+ "|" + this.getCod() + "|" + this.getTst() + "|" + this.getDesc() + "|";
	}


	/**
	 * @return the requireID
	 */
	public String getRequireID() {
		return requireID;
	}


	/**
	 * @return the directory
	 */
	public String getDirectory() {
		return directory;
	}


	/**
	 * @return the program
	 */
	public String getProgram() {
		return program;
	}


	/**
	 * @return the updType
	 */
	public String getUpdType() {
		return updType;
	}


	/**
	 * @return the reviewBy
	 */
	public String getReviewBy() {
		return reviewBy;
	}


	/**
	 * @return the updBy
	 */
	public String getUpdBy() {
		return updBy;
	}


	/**
	 * @return the cod
	 */
	public String getCod() {
		return cod;
	}


	/**
	 * @return the tst
	 */
	public String getTst() {
		return tst;
	}


	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}


	/**
	 * @param requireID the requireID to set
	 */
	public void setRequireID(String requireID) {
		this.requireID = fillContent(this.requireID, requireID);
	}


	/**
	 * @param directory the directory to set
	 */
	public void setDirectory(String directory) {
		this.directory = fillContent(this.directory, directory);
	}


	/**
	 * @param program the program to set
	 */
	public void setProgram(String program) {
		this.program = fillContent(this.program, program);
	}


	/**
	 * @param updType the updType to set
	 */
	public void setUpdType(String updType) {
		this.updType = fillContent(this.updType, updType);
	}


	/**
	 * @param reviewBy the reviewBy to set
	 */
	public void setReviewBy(String reviewBy) {
		this.reviewBy = fillContent(this.reviewBy, reviewBy);
	}


	/**
	 * @param updBy the updBy to set
	 */
	public void setUpdBy(String updBy) {
		this.updBy = fillContent(this.updBy, updBy);
	}


	/**
	 * @param cod the cod to set
	 */
	public void setCod(String cod) {
		this.cod = fillContent(this.cod, cod);
	}


	/**
	 * @param tst the tst to set
	 */
	public void setTst(String tst) {
		this.tst = fillContent(this.tst, tst);
	}


	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = fillContent(this.desc, desc);
	}
	
	
}
