package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class swingsample {

	private JFrame frame;
	private JTextField textField_password;
	private JTextField textField_username;
	private JLabel lblUserName_1;
	private JLabel lblPassword;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblForgotPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingsample window = new swingsample();
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
	public swingsample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Page");
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 618, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnNewButton = new JButton(new ImageIcon("C://Users/FACE-7/Pictures/in.jpg"));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(338, 274, 218, 63);
		frame.getContentPane().add(btnNewButton);
		
		textField_password = new JPasswordField();
		textField_password.setBounds(245, 111, 265, 26);
		frame.getContentPane().add(textField_password);
		textField_password.setColumns(10);
		
		
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(new Color(253, 245, 230));
		lblUserName.setBackground(new Color(240, 255, 240));
		lblUserName.setBounds(80, 49, 84, 26);
		frame.getContentPane().add(lblUserName);
		
		textField_username = new JTextField();
		textField_username.setBounds(245, 49, 265, 26);
		frame.getContentPane().add(textField_username);
		textField_username.setColumns(10);
		
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(253, 245, 230));
		lblPassword.setBackground(new Color(240, 255, 240));
		lblPassword.setBounds(80, 111, 84, 26);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxForgotPassword = new JCheckBox("Remember Me");
		chckbxForgotPassword.setBounds(328, 192, 185, 26);
		frame.getContentPane().add(chckbxForgotPassword);
		
		btnNewButton_1 = new JButton(new ImageIcon("C://Users/FACE-7/Pictures/signin.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(61, 274, 199, 63);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(245, 374, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblForgotPassword = new JLabel("Forgot Password ??");
		lblForgotPassword.setForeground(new Color(230, 230, 250));
		lblForgotPassword.setBounds(386, 374, 185, 26);
		frame.getContentPane().add(lblForgotPassword);
		
		
		
	
	}
}
