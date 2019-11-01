package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class abc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abc window = new abc();
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
	public abc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton radioButton1 = new JRadioButton("New radio button");
		radioButton1.setBounds(0, 104, 127, 25);
		frame.getContentPane().add(radioButton1);
		radioButton1.putClientProperty(COURSE_ID, 2);
		radioButton1.addActionListener(actionListener);
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		radioButton.setBounds(0, 66, 127, 25);
		frame.getContentPane().add(radioButton);
		radioButton1.putClientProperty(COURSE_ID, 1);
		radioButton1.addActionListener(actionListener);
		
		JRadioButton radioButton_1 = new JRadioButton("submit");
		radioButton_1.setBounds(0, 134, 127, 25);
		frame.getContentPane().add(radioButton_1);
		
		JButton btnNewButton = new JButton("New button");
		submit.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        myStats.setCourseOfferings(selectedRadioButton);
			    }
			}
				
			
				 
			
		});
		btnNewButton.setBounds(89, 202, 97, 25);
		frame.getContentPane().add(btnNewButton);
		radioButton1.putClientProperty(COURSE_ID, 3);
		radioButton1.addActionListener(actionListener);
	}

}
