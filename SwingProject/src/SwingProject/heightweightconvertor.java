package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class heightweightconvertor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	Double height;
	Double weight;
	Double result;
	Double result1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heightweightconvertor window = new heightweightconvertor();
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
	public heightweightconvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight Convertor v.Beta 0.12.1");
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 677, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(190, 84, 167, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(190, 164, 167, 30);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewlabel = new JLabel("Height:");
		lblNewlabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewlabel.setBounds(48, 98, 56, 16);
		frame.getContentPane().add(lblNewlabel);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWeight.setBounds(48, 171, 56, 16);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblU = new JLabel("US Measurement");
		lblU.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblU.setBounds(203, 40, 167, 16);
		frame.getContentPane().add(lblU);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMetric.setBounds(433, 40, 56, 16);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHelp.setBounds(12, 13, 56, 16);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAbout.setBounds(67, 13, 56, 16);
		frame.getContentPane().add(lblAbout);
		
		JLabel label1 = new JLabel("");
		label1.setBounds(433, 98, 56, 16);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(433, 164, 56, 27);
		frame.getContentPane().add(label2);

		
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				height=Double.parseDouble(textField.getText());
				weight=Double.parseDouble(textField_1.getText());
				
				result=height*.296;
				String ans1=String.format("%.2f m",result);
				label1.setText(ans1);
				result1=weight*.4514;
				String ans2=String.format("%.0f Kg",result1);
				label2.setText(ans2);
				
			}
		});
		btnNewButton.setBounds(190, 251, 97, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(312, 251, 97, 37);
		frame.getContentPane().add(btnNewButton_1);
		
				
		
	}
}
