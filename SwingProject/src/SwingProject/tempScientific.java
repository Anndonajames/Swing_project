package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tempScientific {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
    Double tc,tf;
    //char c=248;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempScientific window = new tempScientific();
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
	public tempScientific() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 428, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(113, 104, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(192, 101, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblInput = new JLabel("Input  Scale");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInput.setBounds(51, 204, 110, 16);
		frame.getContentPane().add(lblInput);
		
		JLabel lblOutputScale = new JLabel("Output  Scale");
		lblOutputScale.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutputScale.setBounds(227, 204, 110, 16);
		frame.getContentPane().add(lblOutputScale);
		
		JRadioButton rdbtnCelcius = new JRadioButton("Celcius");
		rdbtnCelcius.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnCelcius.setBounds(35, 272, 127, 25);
		frame.getContentPane().add(rdbtnCelcius);
		
		JRadioButton rdbtnFarenheit = new JRadioButton("Farenheit");
		rdbtnFarenheit.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnFarenheit.setBounds(35, 325, 127, 25);
		frame.getContentPane().add(rdbtnFarenheit);
		
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnKelvin.setBounds(35, 369, 127, 25);
		frame.getContentPane().add(rdbtnKelvin);
		
		JRadioButton radioButton = new JRadioButton("Celcius");
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton.setBounds(227, 272, 127, 25);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Farenheit");
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton_1.setBounds(227, 325, 127, 25);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Kelvin");
		radioButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton_2.setBounds(227, 369, 127, 25);
		frame.getContentPane().add(radioButton_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(203, 417, 116, 22);
		frame.getContentPane().add(textField_1);
		
		JButton btnOutput = new JButton("OUTPUT");
		btnOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCelcius.isSelected() && radioButton_1.isSelected()){ 
					 tc=Double.parseDouble(textField.getText());
					 tf=tc*1.8+32;  
					 String ans=String.format("%.2f F", tf);
					 textField_1.setText(ans);
					}  
				else if(rdbtnCelcius.isSelected() && radioButton_2.isSelected()){ 
					 tc=Double.parseDouble(textField.getText());
					 tf=tc+273.15; 
					 String ans=String.format("%.2f K", tf);
					 textField_1.setText(ans);

					} 
				
				else if(rdbtnFarenheit.isSelected() && radioButton.isSelected())
					{
						tc=Double.parseDouble(textField.getText());
						 tf=(tc-32)/18;
						 String ans=String.format("%.2f C", tf);
						 textField_1.setText(ans);

					}
				else if(rdbtnFarenheit.isSelected() && radioButton_2.isSelected())
				{
					tc=Double.parseDouble(textField.getText());
					 tf=(tc+459.67)*5/9;
					 String ans=String.format("%.2f K", tf);
					 textField_1.setText(ans);

				}
				else if(rdbtnKelvin.isSelected() && radioButton.isSelected())
				{
					tc=Double.parseDouble(textField.getText());
					 tf=tc-273.15;
					 String ans=String.format("%.2f C", tf);
					 textField_1.setText(ans);

				}
				else	
				{
					tc=Double.parseDouble(textField.getText());
					 tf=tc*9/5-459.67;
					 String ans=String.format("%.2f F", tf);
					 textField_1.setText(ans);

				}
			}
		});
		btnOutput.setBounds(83, 416, 97, 25);
		frame.getContentPane().add(btnOutput);
	}
}
