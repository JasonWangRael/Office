/**
 * @author Jason.w  2014/4/4
 * @description
 *   
 */
package com.testproject;

import java.awt.*;
import java.io.*;
import java.applet.*;


/**
 * 
 */
public class MyApp extends Applet{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	DataOutputStream outFile;

	/* 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		super.paint(g);
		try {
			String name = System.getProperty("user.name");
			outFile = new DataOutputStream(new FileOutputStream("Test.txt"));
			outFile.writeChars("Your Name: " + name + "\n");
			outFile.close();
			
			g.drawString("Your Name has been written to file <Test.txt>", 20, 20);
		}
		catch (IOException e) {
			g.drawString("File i/o error", 12, 12);
		}
		catch (SecurityException se) {
			g.drawString("You can not write to disk or get User Name", 12, 12);
		}
	}
	
}
