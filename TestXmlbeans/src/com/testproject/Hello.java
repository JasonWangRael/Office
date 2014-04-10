/**
 * @author Jason.w  2014/3/6
 * @description
 *   
 */
package com.testproject;


/**
 * This is a sample class just for testing the env.
 */
public class Hello {

	/**
	 * @param args
	 * @description
	 */
	public static void main(String[] args) {
		String t1, t2, t3, content;
		String[] result;
		
		t1 = "SZ-R14-xxxxx";
		t2 = "etc";
		t3 = "fileconf_open.ini";
		
		content = "|             |                         |                          |    |        |      |    |    |                                                                   |";
		System.out.println(content);
		
		result = content.split("\\|");
		content = "|" + t1 + result[1].substring(t1.length()) + "|" + t2 + result[2].substring(t2.length())  + "|" + t3 + result[3].substring(t3.length())  + "|" + result[4]  + "|" + result[5]  + "|" + result[6]  + "|" + result[7]  + "|" + result[8]  + "|" + result[9] + "|" ;
		System.out.println(content);
		
		ContentLine contentLine = new ContentLine();
		contentLine.setRequireID(t1);
		contentLine.setDirectory("init/crt_tb_dir/schema");
		contentLine.setProgram("DW8SJLN.sql");
		contentLine.setUpdType("ADD");
		contentLine.setReviewBy("aaa");
		contentLine.setUpdBy(" WJS");
		contentLine.setCod("100%");
		contentLine.setTst("100%");
		contentLine.setDesc("");
		System.out.println(contentLine);
	}

}
