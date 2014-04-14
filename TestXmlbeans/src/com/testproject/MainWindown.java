/** 
* @author Jason.w  2014/4/11
*/
package com.testproject;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

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
	private JToolBar toolBar;
	private JButton btnAddRow;
	private JButton btnGenCsv;
	private Component horizontalStrut;
	private JPopupMenu popupMenu;
	private JMenuItem mntmInsertAfterSelection;
	private JMenuItem mntmDeleteCurrentRow;

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
					//((DefaultTableModel)window.getTable().getModel());
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
		gridBagLayout.rowHeights = new int[] {40, 40, 440, 40};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("\u7248\u672c");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(5, 10, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		label = new JLabel("\u751f\u6548\u65e5\u671f");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		frame.getContentPane().add(label, gbc_label);
		
		lblNewLabel_1 = new JLabel("\u9700\u6c42\u8bf4\u660e");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 6;
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		label_1 = new JLabel("\u4fee\u6539\u7a0b\u5e8f\u4e3b\u76ee\u5f55");
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
		table.setRowHeight(22);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setRowSelectionAllowed(false);
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[16][9],
			new String[] {
				"\u9700\u6C42\u7F16\u53F7", "\u5B50\u76EE\u5F55\u7A0B", "\u7A0B\u5E8F\u540D", "UPDTYPE", "REVIEW", "UPDBY", "COD", "TST", "\u4FEE\u6539\u8BF4\u660E"
			}
		) {
			private static final long serialVersionUID = 1L;
			
			@Override
			public void setValueAt(Object aValue, int row, int column) {
				//column updtype/review/updby:auto upcaps
				if(column == 3 || column == 4 || column == 5) {
					aValue = aValue.toString().toUpperCase();
				}
				
				//column cod and tst:auto format xx%
				if (column == 6 || column == 7) {
					try {
						double mValue = Double.parseDouble(aValue.toString());
						if (mValue >= 0.00 && mValue <= 100.00)
							aValue = aValue.toString() + "%";
						else {
							JOptionPane.showMessageDialog(null, "Illegal Input:Value Out of Range!");
							aValue = null;
						}
					}
					catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Only Number(Without %) Allowed!");
						aValue = null;
					}
				}
				
				super.setValueAt(aValue, row, column);
			}
		});
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
		table.getColumnModel().getColumn(6).setPreferredWidth(50);
		table.getColumnModel().getColumn(7).setResizable(false);
		table.getColumnModel().getColumn(7).setPreferredWidth(50);
		table.getColumnModel().getColumn(8).setResizable(false);
		table.getColumnModel().getColumn(8).setPreferredWidth(515);		
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				if(e.getButton() == MouseEvent.BUTTON3)
					if(table.getEditingRow() != -1)
						table.getCellEditor(table.getSelectedRow(), table.getSelectedColumn()).stopCellEditing();
					table.changeSelection(table.rowAtPoint(e.getPoint()), table.columnAtPoint(e.getPoint()), false, false);
			}
			
		});
		
		popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);
		
		mntmInsertAfterSelection = new JMenuItem("Insert Row Above Selected");
		mntmInsertAfterSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel)table.getModel()).insertRow(table.getSelectedRow(), new Object[9]);
			}
		});
		popupMenu.add(mntmInsertAfterSelection);
		
		mntmDeleteCurrentRow = new JMenuItem("Delete Row On Selected");
		mntmDeleteCurrentRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel)table.getModel()).removeRow(table.getSelectedRow());
			}
		});
		popupMenu.add(mntmDeleteCurrentRow);
		
		toolBar = new JToolBar();
		toolBar.setFloatable(false);
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.fill = GridBagConstraints.BOTH;
		gbc_toolBar.anchor = GridBagConstraints.WEST;
		gbc_toolBar.gridwidth = 2;
		gbc_toolBar.insets = new Insets(0, 15, 0, 5);
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 3;
		frame.getContentPane().add(toolBar, gbc_toolBar);
		
		btnAddRow = new JButton("Add Row");
		btnAddRow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((DefaultTableModel)table.getModel()).addRow(new Object[9]);
			}
		});
		toolBar.add(btnAddRow);
		
		horizontalStrut = Box.createHorizontalStrut(10);
		toolBar.add(horizontalStrut);
		
		btnGenCsv = new JButton("Gen CSV");
		btnGenCsv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(textFieldHeadVersion.getText());
			}
		});
		toolBar.add(btnGenCsv);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
