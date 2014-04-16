/**
 * @author Jason.w  2014/4/16
 * @description
 *   
 */
package com.jason.office;

import java.awt.EventQueue;
/**
 * 
 */
public class GenAmendhisCSV {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindown window = new MainWindown();
					window.getFrame().setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
