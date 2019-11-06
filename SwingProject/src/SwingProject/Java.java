package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;



public class Java {

	private JFrame frame;
	private JTextField textField;
	double num1,num2,result;
	String op;
	
	double USA=70.95;
	double china=10.056;
	double Russia=34;
    double Japan=65;
    double UK=45;
    double France=98;
    double India=60;
    double South=67;
    
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java window = new Java();
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
	public Java() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 841, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		//menuBar.setBounds(0, 0, 849, 26);
		menuBar.setBounds(0, 0, 1005, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStsndard = new JMenuItem("Standard");
		mntmStsndard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.setBounds(12, 39, 320, 560);
				// textField.setBounds(12,39,280,40);
				frame.setBounds(100, 100, 302, 537);

				
			}
		});
		mnFile.add(mntmStsndard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 566, 537);
				//textField.setBounds(12,13,319,47);
				
				
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 1016, 537);
			}
			
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm", "Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
		{
				System.exit(0);
		}
			}
			
		});
		mnFile.add(mntmExit);
		
		textField = new JTextField();
		textField.setBounds(12, 39, 525, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
					
				}
			}
		});
		btnNewButton.setBounds(12, 128, 57, 63);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCe.setBounds(69, 128, 57, 63);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(127, 128, 57, 63);
		frame.getContentPane().add(btnC);
		
		JButton button_2 = new JButton("+ / -");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1=Double.parseDouble(textField.getText());
				String a1=String.format("%.2f", n1);
				textField.setText(" "+a1);
			}
		});
		button_2.setBounds(186, 128, 57, 63);
		frame.getContentPane().add(button_2);
		
		JButton btnRoot = new JButton("sqrt");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		btnRoot.setBounds(244, 128, 57, 63);
		frame.getContentPane().add(btnRoot);
		
		JButton btnL = new JButton("Log");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		btnL.setBounds(302, 128, 57, 63);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(360, 128, 57, 63);
		frame.getContentPane().add(btnSin);
		
		JButton button_6 = new JButton("Sinh");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		button_6.setBounds(420, 128, 57, 63);
		frame.getContentPane().add(button_6);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				//textField.setText(textField.getText() + num1);	
				op="Mod";
				
				
			}
		});
		btnMod.setBounds(480, 128, 57, 63);
		frame.getContentPane().add(btnMod);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_7.getText();
				textField.setText(number1);
			}
		});
		button_7.setBounds(12, 204, 57, 63);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_8.getText();
				textField.setText(number1);
			}
		});
		button_8.setBounds(69, 204, 57, 63);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_9.getText();
				textField.setText(number1);
			}
		});
		button_9.setBounds(127, 204, 57, 63);
		frame.getContentPane().add(button_9);
		
		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_div.setBounds(186, 204, 57, 63);
		frame.getContentPane().add(button_div);
		
		JButton button_mod = new JButton("%");
		button_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_mod.setBounds(244, 204, 57, 63);
		frame.getContentPane().add(button_mod);
		
		JButton btnPi = new JButton("Pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3.14");
			}
		});
		btnPi.setBounds(302, 204, 57, 63);
		frame.getContentPane().add(btnPi);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cos(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(360, 204, 57, 63);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cosh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCosh.setBounds(420, 204, 57, 63);
		frame.getContentPane().add(btnCosh);
		
		JButton btnInx = new JButton("Inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());	
				num1=Math.log(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnInx.setActionCommand("lnx");
		btnInx.setBounds(480, 204, 57, 63);
		frame.getContentPane().add(btnInx);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_4.getText();
				textField.setText(number1);
				
			}
		});
		button_4.setBounds(12, 280, 57, 63);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_5.getText();
				textField.setText(number1);
			}
		});
		button_5.setBounds(69, 280, 57, 63);
		frame.getContentPane().add(button_5);
		
		JButton button_66 = new JButton("6");
		button_66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_66.getText();
				textField.setText(number1);
			}
		});
		button_66.setBounds(127, 280, 57, 63);
		frame.getContentPane().add(button_66);
		
		JButton button_mul = new JButton("*");
		button_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_mul.setBounds(186, 280, 57, 63);
		frame.getContentPane().add(button_mul);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = 1 / Double.parseDouble(textField.getText());
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		btnx.setBounds(244, 280, 57, 63);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
				}
				});

				
				
		
		btnXy.setBounds(302, 280, 57, 63);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tan(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(360, 280, 57, 63);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tanh(num1);
                textField.setText(String.valueOf(num1));
               			}
		});
		btnTanh.setBounds(420, 280, 57, 63);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC_1.setBounds(480, 280, 57, 63);
		frame.getContentPane().add(btnC_1);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button.getText();
				textField.setText(number1);		
			}
		});
		button.setBounds(12, 357, 57, 63);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_1.getText();
				textField.setText(number1);
			}
		});
		
		button_1.setBounds(69, 357, 57, 63);
		frame.getContentPane().add(button_1);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_3.getText();
				textField.setText(number1);
			}
		});
		button_3.setBounds(127, 357, 57, 63);
		frame.getContentPane().add(button_3);
		
		JButton button_min = new JButton("-");
		button_min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_min.setBounds(186, 357, 57, 63);
		frame.getContentPane().add(button_min);
		
		JButton button_eq = new JButton("=");
		button_eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="cbr")
				{
				result=(num1/num2)*100;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="Mod")
				{
				result=num1%num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="x^y")
				{
				num2=Math.pow(num1,num2);
				textField.setText(String.valueOf(num2));
				}
			}
		});
		button_eq.setBounds(244, 357, 57, 137);
		frame.getContentPane().add(button_eq);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Math.pow(Double.parseDouble(textField.getText()), 2);
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		btnX.setBounds(302, 356, 57, 63);
		frame.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="cbr";
			
			}
		});
		btnCbr.setBounds(359, 356, 57, 63);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Radian");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//num1=Double.parseDouble(textField.getText());
				num1=Double.parseDouble(textField.getText());
				               num1=Math.toRadians(num1);
				               textField.setText(String.valueOf(num1));
			//String.format("%.2f", textField.setText(num1));
			
			 // textField.setText(num1);
			}
		});
		btnRund.setBounds(417, 356, 57, 63);
		frame.getContentPane().add(btnRund);
		
		JButton btnpi = new JButton("2*pi");
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num1=Double.parseDouble(textField.getText());
				//num1=2*3.14;
				textField.setText(String.valueOf(2*3.14));
				
				
			}
		});
		btnpi.setBounds(476, 356, 57, 63);
		frame.getContentPane().add(btnpi);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button_0.getText();
				textField.setText(number1);
			}
		});
		button_0.setBounds(12, 431, 114, 63);
		frame.getContentPane().add(button_0);
		
		JButton button_13 = new JButton(".");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
			
		});
		button_13.setBounds(127, 431, 57, 63);
		frame.getContentPane().add(button_13);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_plus.setBounds(186, 431, 57, 63);
		frame.getContentPane().add(button_plus);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Math.pow(Double.parseDouble(textField.getText()), 3);
				textField.setText("");
				textField.setText(textField.getText() + num1);
			}
		});
		btnX_1.setBounds(302, 431, 57, 63);
		frame.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setBounds(359, 431, 57, 63);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnHex.setBounds(417, 431, 57, 63);
		frame.getContentPane().add(btnHex);
		
		JButton btnOct = new JButton("Oct");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnOct.setBounds(476, 431, 57, 63);
		frame.getContentPane().add(btnOct);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(570, 39, 236, 455);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(45, 151, 129, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "Russia", "Japan", "UK", "France", "India", "South", "china"}));
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 216, 141, 32);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblValue = new JLabel("");
		lblValue.setBounds(45, 287, 141, 32);
		panel.add(lblValue);
		
		JLabel lblCurrencyConvertor = new JLabel("Currency Convertor");
		lblCurrencyConvertor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrencyConvertor.setBounds(36, 72, 188, 40);
		panel.add(lblCurrencyConvertor);
		
		JButton btnConverter = new JButton("Convert");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("china"))
				{
					String c=String.format("Renminbi %.2f",bp*china);
					lblValue.setText(c);
				}
				if(comboBox.getSelectedItem().equals("USA"))
				{
					String c=String.format("$ %.2f",bp*USA);
					lblValue.setText(c);
				}
				if(comboBox.getSelectedItem().equals("Russia"))
				{
					String c=String.format("Ruble %.2f",bp*Russia);
					lblValue.setText(c);
				}
				if(comboBox.getSelectedItem().equals("Japan"))
				{
					String c=String.format("Yen  %.2f",bp*Japan);
					lblValue.setText(c);
				}
				if(comboBox.getSelectedItem().equals("UK"))
				{
					String c=String.format("Pound  %.2f",bp*UK);
					lblValue.setText(c);
				}
				if(comboBox.getSelectedItem().equals("France"))
				{
					String c=String.format("Euro  %.2f",bp*France);
					lblValue.setText(c);
				}
				if(comboBox.getSelectedItem().equals("India"))
				{
					String c=String.format("Rs  %.2f",bp*India);
					lblValue.setText(c);
				}
				if(comboBox.getSelectedItem().equals("South"))
				{
				String c=String.format("South  %.2f",bp*South);
				lblValue.setText(c);
				}
				
			}
		});
		btnConverter.setBounds(12, 373, 89, 40);
		panel.add(btnConverter);
		
		JButton btnCancel = new JButton("Clear");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				lblValue.setText(null);
				
				
				
			}
		});
		btnCancel.setBounds(135, 373, 89, 40);
		panel.add(btnCancel);	
		
	}
}
