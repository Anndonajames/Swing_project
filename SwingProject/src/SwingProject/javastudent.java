package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class javastudent {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;

	double t,avg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javastudent window = new javastudent();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public javastudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		frame.setTitle("Student Report");
		frame.setBounds(100, 100, 1011, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 13, 501, 374);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(136, 35, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentid.setBounds(22, 38, 88, 16);
		panel.add(lblStudentid);
		
		JLabel lblFirst = new JLabel("Firstname");
		lblFirst.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFirst.setBounds(22, 87, 88, 16);
		panel.add(lblFirst);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 84, 116, 22);
		panel.add(textField_1);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSurname.setBounds(22, 128, 88, 16);
		panel.add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 125, 116, 22);
		panel.add(textField_2);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCourseCode.setBounds(22, 179, 88, 16);
		panel.add(lblCourseCode);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DMCA101", "DMCA102", "DMCA103", "DMCA104", "DMCA105"}));
		comboBox.setBounds(136, 176, 116, 22);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(22, 225, 230, 10);
		panel.add(separator);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalScore.setBounds(22, 261, 88, 16);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAverage.setBounds(22, 302, 88, 16);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRanking.setBounds(22, 331, 88, 16);
		panel.add(lblRanking);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(136, 258, 116, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(136, 293, 116, 22);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(136, 328, 116, 22);
		panel.add(textField_5);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMalayalam.setBounds(291, 38, 88, 16);
		panel.add(lblMalayalam);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnglish.setBounds(291, 87, 88, 16);
		panel.add(lblEnglish);
		
		JLabel lblHindi = new JLabel("Hindi");
		lblHindi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHindi.setBounds(291, 128, 88, 16);
		panel.add(lblHindi);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMaths.setBounds(291, 176, 88, 16);
		panel.add(lblMaths);
		
		JLabel lblBiology = new JLabel("Physics");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBiology.setBounds(291, 219, 88, 16);
		panel.add(lblBiology);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChemistry.setBounds(291, 261, 88, 16);
		panel.add(lblChemistry);
		
		JLabel lblBiology_1 = new JLabel("Biology");
		lblBiology_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBiology_1.setBounds(291, 302, 88, 16);
		panel.add(lblBiology_1);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblComputer.setBounds(291, 331, 88, 16);
		panel.add(lblComputer);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
				
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(366, 35, 116, 22);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(366, 84, 116, 22);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {char num=evt.getKeyChar();
            if(!(Character.isDigit(num))
                    ||(num==KeyEvent.VK_BACK_SPACE)
                    ||(num==KeyEvent.VK_DELETE)) {
                evt.consume();
            }
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(366, 125, 116, 22);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }

			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(366, 176, 116, 22);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }

			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(366, 213, 116, 22);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }

			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(366, 258, 116, 22);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }

			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(366, 299, 116, 22);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }

			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(366, 331, 116, 22);
		panel.add(textField_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(106, 90, 205));
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(525, 13, 445, 389);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtareaShowReport = new JTextArea();
		txtareaShowReport.setWrapStyleWord(true);
		txtareaShowReport.setForeground(Color.BLACK);
		txtareaShowReport.setLineWrap(true);
		txtareaShowReport.setBackground(new Color(255, 255, 255));
		txtareaShowReport.setColumns(2);
		//txtareaShowReport.setText();
		txtareaShowReport.setRows(13);
		txtareaShowReport.setBounds(12, 24, 421, 317);
		panel_1.add(txtareaShowReport);
		
		JLabel lblAbc = new JLabel("Abc");
		lblAbc.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAbc.setBounds(40, 86, 56, 16);
		panel_1.add(lblAbc);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//txtareaShowReport.setText(null););
				txtareaShowReport.setText(null);
			}
		});
		btnClear.setForeground(new Color(0, 0, 205));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClear.setBounds(176, 347, 95, 29);
		panel_1.add(btnClear);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Name", "Malayalam", "English", "Hindi", "Maths", "Physics", "Chemistry", "Biology", "Computer", "Total Score", "Average", "Ranking"},
				/*{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},*/
			},
			new String[] {
				"Student_ID", "Course_Name", "Malayalam", "English", "Hindi", "Maths", "Physics", "Chemistry", "Biology", "Computer", "Total Score", "Average", "Ranking"
			}
		));
		table.setBounds(12, 400, 956, 106);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Add Report");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 t=Double.parseDouble(textField_6.getText())+Double.parseDouble(textField_7.getText())+Double.parseDouble(textField_8.getText())+Double.parseDouble(textField_9.getText())+Double.parseDouble(textField_10.getText())+Double.parseDouble(textField_11.getText())+Double.parseDouble(textField_12.getText())+Double.parseDouble(textField_13.getText());
					textField_3.setText(String.format("%.2f", t));
					avg=t/8;
					textField_4.setText(String.format("%.2f", avg));
					if(avg>=90)
					{
						textField_5.setText("1");
					}
					else if(avg>=70 && avg <=89)
					{
						textField_5.setText("2");
					}
					else if(avg>=60 && avg <=79)
					{
						textField_5.setText("3");
					}	
					else if(avg>=50 && avg <=69)
					{
						textField_5.setText("4");
					}	
					else
						textField_5.setText("Fail");

				DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.addRow(new String[]
				{
					textField.getText(),
					(String) comboBox.getSelectedItem(),
					textField_6.getText(),
					textField_7.getText(),
					textField_8.getText(),
					textField_9.getText(),
					textField_10.getText(),
					textField_11.getText(),
					textField_12.getText(),
					textField_13.getText(),
					textField_3.getText(),
					textField_4.getText(),
					textField_5.getText(),
					
				});
				
			}
		});
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setBounds(46, 506, 116, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				try
				{
					int row=table.getSelectedRow();
					model.removeRow(row);
				}
				catch(Exception msg)
				{
					JOptionPane.showMessageDialog(null, "Please choose the particular row");
				
				}
				
			}
		});
		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBackground(SystemColor.menu);
		btnDelete.setBounds(179, 506, 116, 25);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			/*	ListSelectionModel cellSelectionModel = table.getSelectionModel();
				cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

				cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
				  public void valueChanged(ListSelectionEvent e) {
				    String selectedData = null;

				    int[] selectedRow = table.getSelectedRows();
				    int[] selectedColumns = table.getSelectedColumns();

				    for (int i = 0; i < selectedColumns.length; i++) {
				      for (int j = 0; j < selectedColumns.length; j++) {
				        selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
				        System.out.println("Selected: " + selectedData);
				      }
				    }
				    
				  }

				});*/
				
				
				
				txtareaShowReport.append("Student Record\n"
				+"Student Name:\t\t"+textField_1.getText()+" "+textField_2.getText()
				+"\n=====================================\n"
				+"Malayalam:\t\t"+textField_6.getText()+"\n"
				+"English:\t\t"+textField_7.getText()+"\n"
				+"Hindi:\t\t"+textField_8.getText()+"\n"
				+"Maths\t\t"+textField_9.getText()+"\n"
				+"Physics:\t\t"+textField_10.getText()+"\n"
				+"Chemistry:\t\t"+textField_11.getText()+"\n"
				+"Biology:\t\t"+textField_12.getText()+"\n"
				+"Computer:\t\t"+textField_13.getText()+"\n"
				
				);
			
			txtareaShowReport.append("=====================================\n"+
			"Total Average:\t\t"+textField_3.getText()+"\n"
			+"Average:\t\t"+textField_4.getText()+"\n"
			+"Ranking:\t\t"+textField_5.getText()+"\n");

				
			}
		});
		btnShowReport.setForeground(new Color(0, 0, 139));
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnShowReport.setBackground(SystemColor.menu);
		btnShowReport.setBounds(322, 506, 116, 25);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(frame,"Do you want to Exit?","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(255, 0, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBackground(SystemColor.menu);
		btnExit.setBounds(467, 506, 116, 25);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				comboBox.setSelectedItem(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				txtareaShowReport.setText(null);
				
						
					
				//textField_14.setText(null);

			}
		});
		btnReset.setForeground(new Color(106, 90, 205));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBackground(SystemColor.menu);
		btnReset.setBounds(618, 506, 116, 25);
		frame.getContentPane().add(btnReset);
		
		
		
		
		
	}
}
