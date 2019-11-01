package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class javaticketbooking {

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_tax;
	private JTextField textField_subtot;
	private JTextField textField_tot;
	private JTextField textField_name2;
	private JTextField textField_from2;
	private JTextField textField_to;
	private JTextField textField_date;
	private JTextField textField_time;
	private JTextField textField_ticketnum;
	private JTextField textField_price;
	private JTextField textField_route;
	private JTable table;
	public  static double ticket=1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javaticketbooking window = new javaticketbooking();
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
	public javaticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 937, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 895, 544);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setBounds(335, 13, 239, 32);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(80, 77, 56, 16);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblName);
		
		textField_name = new JTextField();
		textField_name.setBounds(184, 75, 160, 22);
		panel.add(textField_name);
		textField_name.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(80, 106, 360, 16);
		separator.setBackground(SystemColor.desktop);
		separator.setForeground(new Color(160, 160, 160));
		panel.add(separator);
		
		JComboBox comboBox_from = new JComboBox();
		comboBox_from.setBounds(80, 199, 105, 22);
		comboBox_from.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_from.setModel(new DefaultComboBoxModel(new String[] {"Kerala", "Tamilnadu", "Karnataka", "Mumbai"}));
		panel.add(comboBox_from);
		
		JComboBox comboBox_to = new JComboBox();
		comboBox_to.setBounds(197, 199, 105, 22);
		comboBox_to.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_to.setModel(new DefaultComboBoxModel(new String[] {"Kerala", "Tamilnadu", "Karanataka", "Mumbai"}));
		panel.add(comboBox_to);
		
		JComboBox comboBox_num = new JComboBox();
		comboBox_num.setBounds(335, 199, 105, 22);
		comboBox_num.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_num.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_num.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		panel.add(comboBox_num);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(80, 244, 360, 16);
		separator_1.setForeground(SystemColor.controlShadow);
		separator_1.setBackground(Color.BLACK);
		panel.add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(80, 259, 56, 16);
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblTax);
		
		textField_tax = new JTextField();
		textField_tax.setBounds(184, 259, 160, 22);
		textField_tax.setColumns(10);
		panel.add(textField_tax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(80, 288, 75, 16);
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblSubTotal);
		
		textField_subtot = new JTextField();
		textField_subtot.setBounds(184, 288, 160, 22);
		textField_subtot.setColumns(10);
		panel.add(textField_subtot);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(80, 317, 75, 16);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblTotal);
		
		textField_tot = new JTextField();
		textField_tot.setBounds(184, 317, 160, 22);
		textField_tot.setColumns(10);
		panel.add(textField_tot);
		
		JRadioButton radioButton = new JRadioButton("Standard");
		radioButton.setBounds(80, 131, 127, 25);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
			}
		});
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(radioButton);
		
		JRadioButton radioButton_single = new JRadioButton("Single Ticket");
		radioButton_single.setBounds(211, 131, 127, 25);
		radioButton_single.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							}
		});
		radioButton_single.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(radioButton_single);
		
		JRadioButton radioButton_2 = new JRadioButton("Adult");
		radioButton_2.setBounds(393, 131, 75, 25);
		radioButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Child");
		radioButton_3.setBounds(393, 165, 63, 25);
		radioButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(radioButton_3);
		
		JRadioButton radioButton_sleeper = new JRadioButton("Sleeper");
		radioButton_sleeper.setBounds(285, 165, 86, 25);
		radioButton_sleeper.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(radioButton_sleeper);
		
		JRadioButton radioButton_ac = new JRadioButton("AC");
		radioButton_ac.setBounds(212, 165, 69, 25);
		radioButton_ac.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(radioButton_ac);
		
		JRadioButton radioButton_6 = new JRadioButton("First Class");
		radioButton_6.setBounds(80, 165, 127, 25);
		radioButton_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(radioButton_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(80, 346, 360, 16);
		separator_2.setForeground(SystemColor.controlShadow);
		separator_2.setBackground(Color.BLACK);
		panel.add(separator_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setBounds(80, 375, 97, 25);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double tax;
				
				double sub_total ; 
				
			
				
				String va = comboBox_num.getSelectedItem().toString();
				double value=Double.parseDouble(va);
	              //1)
				if (radioButton_single.isSelected() && radioButton_sleeper.isSelected() && radioButton_ac.isSelected()) 
	                { 
						tax=400;
						textField_tax.setText(String.format("%.0f", tax));
						
	                    sub_total = 3400*value;     
	                    textField_subtot.setText(String.format("%.0f", sub_total));
	                    textField_tot.setText(String.format("%.0f", sub_total+tax));
	                } 
	  
	                else if (!radioButton_single.isSelected() && radioButton_sleeper.isSelected() && radioButton_ac.isSelected())  
	                { 
	                 tax=400;
	                 textField_tax.setText(String.format("%.0f", tax));
			         sub_total = 4000*value; 
			         textField_subtot.setText(String.format("%.0f", sub_total));
	                    textField_tot.setText(String.format("%.0f", sub_total+tax));
	                } 
	                //2)
				
	                else if (radioButton_single.isSelected() && radioButton_sleeper.isSelected() && !radioButton_ac.isSelected())  
	                { 
	                 tax=200;
	                 textField_tax.setText(String.format("%.0f", tax));
			         sub_total = 3000*value; 
			         textField_subtot.setText(String.format("%.0f", sub_total));
	                 textField_tot.setText(String.format("%.0f", sub_total+tax));
	                }
	                else if (!radioButton_single.isSelected() && radioButton_sleeper.isSelected() && !radioButton_ac.isSelected())  
	                { 
	                 tax=200;
	                 textField_tax.setText(String.format("%.0f", tax));
			         sub_total = 3400*value; 
			         textField_subtot.setText(String.format("%.0f", sub_total));
	                 textField_tot.setText(String.format("%.0f", sub_total+tax));
	                }
				//3)
	                else if (radioButton_single.isSelected() && !radioButton_sleeper.isSelected() && radioButton_ac.isSelected())  
	                { 
	                 tax=400;
	                 textField_tax.setText(String.format("%.0f", tax));
			         sub_total = 3200*value; 
			         textField_subtot.setText(String.format("%.0f", sub_total));
	                 textField_tot.setText(String.format("%.0f", sub_total+tax));
	                }
	                else if (!radioButton_single.isSelected() && !radioButton_sleeper.isSelected() && radioButton_ac.isSelected())  
	                { 
	                tax=400;
	                textField_tax.setText(String.format("%.0f", tax));
			         sub_total = 3800*value; 
			         textField_subtot.setText(String.format("%.0f", sub_total));
	                 textField_tot.setText(String.format("%.0f", sub_total+tax));
	                }
				//4))
	                else if (radioButton_single.isSelected() && !radioButton_sleeper.isSelected() && !radioButton_ac.isSelected())  
	                { 
	                tax=200;
	                textField_tax.setText(String.format("%.0f", tax));
			         sub_total = 2800*value; 
			         textField_subtot.setText(String.format("%.0f", sub_total));
	                  textField_tot.setText(String.format("%.0f", sub_total+tax));
	                }
	                else if  (!radioButton_single.isSelected() && !radioButton_sleeper.isSelected() && !radioButton_ac.isSelected()) { 
	                tax=200;
	                textField_tax.setText(String.format("%.0f", tax));
	                sub_total = 3200*value; 
	                textField_subtot.setText(String.format("%.0f", sub_total));
                    textField_tot.setText(String.format("%.0f", sub_total+tax));
	                }
	                else {
	                	radioButton.getText();
	                	radioButton_2.getText();
	                	radioButton_3.getText();
	                	radioButton_6.getText();
	                }
				String name=textField_name.getText();
	            textField_name2.setText(name); 
	        	String from = comboBox_from.getSelectedItem().toString();
				textField_from2.setText(from);
				String to = comboBox_to.getSelectedItem().toString();
				
				textField_to.setText(to);
				
				  Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_time.setText(tTime.format(timer.getTime()));
	                //Date
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField_date.setText(tdate.format(timer.getTime()));
	               String price=textField_tot.getText();
	               textField_price.setText(price);
	               textField_route.setText("Any");
	               ticket++;
	               textField_ticketnum.setText(String.format("%.0f", ticket));
	            
				
				
	               // JOptionPane.showMessageDialog(frame, sub_total);

				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(205, 375, 97, 25);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField_name.setText(null);
				radioButton.setSelected(false);
				radioButton_2.setSelected(false);
				radioButton_3.setSelected(false);
				radioButton_6.setSelected(false);
				radioButton_ac.setSelected(false);
				radioButton_single.setSelected(false);
				radioButton_sleeper.setSelected(false);
				
				//int itemCount = comboBox_from.getItemCount();

			    /*for(int i=0;i<itemCount;i++){
			        comboBox_from.;
			     }*/
				

				textField_tax.setText(null);
				textField_subtot.setText(null);
				textField_tot.setText(null);
				textField_name2.setText(null);
				textField_from2.setText(null);
				textField_to.setText(null);
				textField_price.setText(null);
				textField_route.setText(null);
				textField_date.setText(null);
				textField_time.setText(null);
				textField_ticketnum.setText(null);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(328, 375, 97, 25);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Do You Want to Exit?",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(474, 78, 421, 322);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(56, 54, 55, 16);
		panel_1.add(label);
		
		textField_name2 = new JTextField();
		textField_name2.setColumns(10);
		textField_name2.setBounds(114, 52, 148, 22);
		panel_1.add(textField_name2);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFrom.setBounds(56, 106, 55, 16);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTo.setBounds(56, 156, 55, 16);
		panel_1.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate.setBounds(56, 201, 55, 16);
		panel_1.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTime.setBounds(56, 239, 55, 16);
		panel_1.add(lblTime);
		
		textField_from2 = new JTextField();
		textField_from2.setColumns(10);
		textField_from2.setBounds(114, 104, 148, 22);
		panel_1.add(textField_from2);
		
		textField_to = new JTextField();
		textField_to.setColumns(10);
		textField_to.setBounds(114, 154, 148, 22);
		panel_1.add(textField_to);
		
		textField_date = new JTextField();
		textField_date.setColumns(10);
		textField_date.setBounds(114, 199, 148, 22);
		panel_1.add(textField_date);
		
		textField_time = new JTextField();
		textField_time.setColumns(10);
		textField_time.setBounds(114, 237, 148, 22);
		panel_1.add(textField_time);
		
		textField_ticketnum = new JTextField();
		textField_ticketnum.setColumns(10);
		textField_ticketnum.setBounds(264, 125, 148, 22);
		panel_1.add(textField_ticketnum);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTicketNo.setBounds(264, 106, 78, 16);
		panel_1.add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(264, 157, 78, 16);
		panel_1.add(lblPrice);
		
		textField_price = new JTextField();
		textField_price.setColumns(10);
		textField_price.setBounds(264, 181, 148, 22);
		panel_1.add(textField_price);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRoute.setBounds(264, 217, 78, 16);
		panel_1.add(lblRoute);
		
		textField_route = new JTextField();
		textField_route.setColumns(10);
		textField_route.setBounds(264, 237, 148, 22);
		panel_1.add(textField_route);
		
		JButton btnComfirm = new JButton("Confirm");
		btnComfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tx;
				if(radioButton_ac.isSelected() && radioButton_sleeper.isSelected())
				{
					tx="AC/Sleeper";
				}
				else if(radioButton_ac.isSelected() && !radioButton_sleeper.isSelected())
					{
					tx="AC/Seater";
					}
				else if(!radioButton_ac.isSelected() && radioButton_sleeper.isSelected())
				{
				tx="Non AC/Sleeper";
				}
				else
					tx="Non AC/Seater";
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new String[]
					{
						textField_name.getText(),
						//(String) comboBox.getSelectedItem(),
						textField_ticketnum.getText(),
						textField_from2.getText(),
						textField_to.getText(),
						(String) comboBox_num.getSelectedItem(),
						textField_time.getText(),
						textField_date.getText(),
						//radioButton_ac.getText(),
						tx,
						//radioButton_sleeper.getText();
						textField_price.getText(),
							
						
					});
						
			}
		});
		btnComfirm.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnComfirm.setBounds(190, 284, 97, 25);
		panel_1.add(btnComfirm);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of Seats", "Time", "Date", "AC/ Non-AC", "Price"},
				
			},
			new String[] {
				"Name", "Booking No", "From", "To", "No of Seats", "Time", "Date", "AC/ Non-AC", "Price"
			}
		));
		table.getColumnModel().getColumn(7).setPreferredWidth(114);
		table.setBounds(29, 402, 833, 90);
		panel.add(table);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(299, 493, 97, 25);
		panel.add(btnDelete);
	
	}
}
