/**
 * @author Jason.w  2014/4/9
 * @description
 *   
 */
package com.testproject;

import java.util.LinkedList;
import java.util.Queue;


/**
 * 
 */
public class TestCSV {
	
	public enum FORM {
		TOP_DEL      ("|=============|=========================|=========================================================|===================================================================|"),
		HEAD_CONTENT ("|             |                         |                                                         |                                                                   |"),
		HEAD_DEL     ("|-------------|-------------------------|---------------------------------------------------------|-------------------------------------------------------------------|"),
		ALL_CONTENT  ("|             |                         |                          |    |        |      |    |    |                                                                   |"),
		ALL_DEL      ("|-------------|-------------------------|--------------------------|----|--------|------|----|----|-------------------------------------------------------------------|"),
		NUMBER_DEL   ("|             |-------------------------|--------------------------|----|--------|------|----|----|                                                                   |"),
		DIRECTORY_DEL("|             |                         |--------------------------|----|--------|------|----|----|                                                                   |"),
		PGMNAME_DEL  ("|             |                         |                          |----|--------|------|----|----|                                                                   |");
		
		
		private final String line;
		
		public String getLine() {
			return line;
		}
		
		FORM(String line) {
			this.line = line;
		}
		
	}

	final String tableLine[] = {
		/*0*/"|=============|=========================|=========================================================|===================================================================|",
		/*1*/"|             |                         |                                                         |                                                                   |",
		/*2*/"|-------------|-------------------------|---------------------------------------------------------|-------------------------------------------------------------------|",
		/*3*/"|             |                         |                          |    |        |      |    |    |                                                                   |",
		/*4*/"|-------------|-------------------------|--------------------------|----|--------|------|----|----|-------------------------------------------------------------------|",
		/*5*/"|             |-------------------------|--------------------------|----|--------|------|----|----|-------------------------------------------------------------------|",
		/*6*/"|             |                         |--------------------------|----|--------|------|----|----|-------------------------------------------------------------------|",
		/*7*/"|             |                         |                          |----|--------|------|----|----|-------------------------------------------------------------------|"
	};
	
	
	
	public void print(Integer index) {
		System.out.println(tableLine[index.intValue()]);
	}
	
	public static void main(String[] args) {
		
		Queue<FORM> formQueue = new LinkedList<FORM>();
		/*formQueue.offer(0);
		formQueue.offer(1);
		formQueue.offer(2);
		formQueue.offer(1);
		formQueue.offer(0);
		formQueue.offer(3);
		formQueue.offer(3);
		formQueue.offer(4);
		formQueue.offer(3);
		formQueue.offer(4);
		formQueue.offer(3);
		formQueue.offer(0);*/
		
		formQueue.offer(FORM.TOP_DEL);
		formQueue.offer(FORM.HEAD_CONTENT);
		formQueue.offer(FORM.HEAD_DEL);
		formQueue.offer(FORM.ALL_CONTENT);
		formQueue.offer(FORM.ALL_CONTENT);
		formQueue.offer(FORM.ALL_DEL);
		formQueue.offer(FORM.ALL_CONTENT);
		formQueue.offer(FORM.NUMBER_DEL);
		formQueue.offer(FORM.ALL_CONTENT);
		formQueue.offer(FORM.DIRECTORY_DEL);
		formQueue.offer(FORM.ALL_CONTENT);
		formQueue.offer(FORM.PGMNAME_DEL);
		formQueue.offer(FORM.ALL_CONTENT);
		formQueue.offer(FORM.NUMBER_DEL);
		formQueue.offer(FORM.ALL_CONTENT);
		formQueue.offer(FORM.ALL_DEL);
		formQueue.offer(FORM.ALL_CONTENT);
		formQueue.offer(FORM.TOP_DEL);
		
		FORM form;
		while ((form = formQueue.poll()) != null) {
			if (form.equals(FORM.ALL_CONTENT)) {
				ContentLine contentLine = new ContentLine();
				contentLine.setRequireID("SZ-R14-xxxxx");
				contentLine.setDirectory("init/crt_tb_dir/schema");
				contentLine.setProgram("DW8SJLN.sql");
				contentLine.setUpdType("ADD");
				contentLine.setReviewBy("aaa");
				contentLine.setUpdBy(" WJS");
				contentLine.setCod("100%");
				contentLine.setTst("100%");
				contentLine.setDesc("");
				System.out.println(contentLine);
				continue;
			}
				System.out.println(form.getLine());
		}
	}
}
