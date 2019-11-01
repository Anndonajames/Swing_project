package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JTable;

public class bodymassindex {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	Double num1;
	Double num2;
	Double res;
	private JTextField textField_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bodymassindex window = new bodymassindex();
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
	public bodymassindex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 469, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(12, 25, 427, 104);
		frame.getContentPane().add(panel);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setForeground(SystemColor.textHighlight);
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(12, 156, 427, 234);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height(m)    :");
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHeight.setBounds(26, 41, 104, 16);
		panel_1.add(lblHeight);
		
		JLabel lblWeightkg = new JLabel("Weight(kg)  :");
		lblWeightkg.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWeightkg.setBounds(26, 97, 104, 16);
		panel_1.add(lblWeightkg);
		
		textField = new JTextField();
		textField.setBounds(130, 41, 116, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 94, 116, 22);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("BMI");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(34, 161, 56, 16);
		panel_1.add(lblNewLabel);
		
		
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setBackground(Color.ORANGE);
		textField_2.setBounds(121, 159, 73, 22);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label2 = new JLabel("");
		label2.setForeground(Color.ORANGE);
		label2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label2.setBounds(206, 162, 116, 16);
		panel_1.add(label2);
		
		
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				res=((num1/num2/num2)*10000);
				String ans=String.format("%.2f", res);
				textField_2.setText(ans);
				if(res<18.5)
				{
					label2.setText("Under Weight");
				}
				else if(res>18.5 && res<24.9)
				{
					label2.setText("Normal Weight");
				}
				else if(res>25 && res<29.9)
				{
					label2.setText("Over Weight");
				}
				else
					label2.setText("Obese");
					
				
				
				
				
			}
		});
		btnNewButton.setBounds(67, 196, 97, 25);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				label2.setText(null);
				textField_2.setText(null);
				
			}
		});
		btnNewButton_1.setBounds(199, 196, 63, 25);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnNewButton_2.setBounds(301, 196, 73, 25);
		panel_1.add(btnNewButton_2);
		
		
		
		
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 403, 439, 175);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JList list = new JList();
		list.setBounds(29, 39, 1, 1);
		panel_2.add(list);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(154, 205, 50));
		panel_3.setBounds(12, 13, 415, 149);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnObsess = new JButton(new ImageIcon("C://Users/FACE-7/Pictures"));
		btnObsess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnObsess.setBounds(12, 13, 391, 123);
		panel_3.add(btnObsess);
		
		
		
		
		
		
	}
}
