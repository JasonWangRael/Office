/**
 * @author Jason.w  2014/4/11
 * @description
 *   
 */
package com.testproject;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

/**
 * 
 */
public class MainWindown {

	private JFrame	frame;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel label_1;
	private JTextField textFieldHeadVersion;
	private JTextField textFieldHeadDate;
	private JTextField textFieldHeadDesc;
	private JTextField textFieldHeadDirectory;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * @return the table
	 */
	public JTable getTable() {
		return table;
	}

	/**
	 * @param table the table to set
	 */
	public void setTable(JTable table) {
		this.table = table;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindown window = new MainWindown();
					window.getTable().addInputMethodListener(new InputMethodListener() {
						public void caretPositionChanged(InputMethodEvent event) {
						}
						public void inputMethodTextChanged(InputMethodEvent event) {
							System.out.println("inputMethodTextChanged:" + event.getID());
						}
					});
					window.frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindown() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1330, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {115, 210, 215, 40, 75, 60, 40, 40, 535};
		gridBagLayout.rowHeights = new int[] {40, 40, 440};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("版本");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(5, 10, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		label = new JLabel("生效日期");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		frame.getContentPane().add(label, gbc_label);
		
		lblNewLabel_1 = new JLabel("需求说明");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 6;
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		label_1 = new JLabel("修改程序主目录");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 8;
		gbc_label_1.gridy = 0;
		frame.getContentPane().add(label_1, gbc_label_1);
		
		textFieldHeadVersion = new JTextField();
		textFieldHeadVersion.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_textFieldHeadVersion = new GridBagConstraints();
		gbc_textFieldHeadVersion.insets = new Insets(0, 10, 5, 10);
		gbc_textFieldHeadVersion.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHeadVersion.gridx = 0;
		gbc_textFieldHeadVersion.gridy = 1;
		frame.getContentPane().add(textFieldHeadVersion, gbc_textFieldHeadVersion);
		textFieldHeadVersion.setColumns(10);
		
		textFieldHeadDate = new JTextField();
		textFieldHeadDate.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_textFieldHeadDate = new GridBagConstraints();
		gbc_textFieldHeadDate.insets = new Insets(0, 0, 5, 10);
		gbc_textFieldHeadDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHeadDate.gridx = 1;
		gbc_textFieldHeadDate.gridy = 1;
		frame.getContentPane().add(textFieldHeadDate, gbc_textFieldHeadDate);
		textFieldHeadDate.setColumns(10);
		
		textFieldHeadDesc = new JTextField();
		textFieldHeadDesc.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_textFieldHeadDesc = new GridBagConstraints();
		gbc_textFieldHeadDesc.gridwidth = 6;
		gbc_textFieldHeadDesc.insets = new Insets(0, 0, 5, 10);
		gbc_textFieldHeadDesc.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHeadDesc.gridx = 2;
		gbc_textFieldHeadDesc.gridy = 1;
		frame.getContentPane().add(textFieldHeadDesc, gbc_textFieldHeadDesc);
		textFieldHeadDesc.setColumns(10);
		
		textFieldHeadDirectory = new JTextField();
		textFieldHeadDirectory.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_textFieldHeadDirectory = new GridBagConstraints();
		gbc_textFieldHeadDirectory.insets = new Insets(0, 0, 5, 10);
		gbc_textFieldHeadDirectory.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldHeadDirectory.gridx = 8;
		gbc_textFieldHeadDirectory.gridy = 1;
		frame.getContentPane().add(textFieldHeadDirectory, gbc_textFieldHeadDirectory);
		textFieldHeadDirectory.setColumns(10);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 9;
		gbc_scrollPane.insets = new Insets(0, 10, 10, 10);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setRowSelectionAllowed(false);
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u9700\u6C42\u7F16\u53F7", "\u5B50\u76EE\u5F55\u7A0B", "\u7A0B\u5E8F\u540D", "UPDTYPE", "REVIEW", "UPDBY", "COD", "TST", "\u4FEE\u6539\u8BF4\u660E"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(115);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(210);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(215);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(40);
		table.getColumnModel().getColumn(7).setResizable(false);
		table.getColumnModel().getColumn(7).setPreferredWidth(40);
		table.getColumnModel().getColumn(8).setResizable(false);
		table.getColumnModel().getColumn(8).setPreferredWidth(535);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textFieldHeadVersion, textFieldHeadDate, textFieldHeadDesc, textFieldHeadDirectory}));
	}

}
