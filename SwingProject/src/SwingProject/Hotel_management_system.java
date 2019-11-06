package SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Hotel_management_system {

private JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_drink;
private JTextField textField_4;
private JTextField textField_cod;
private JTextField textField_com;
private JTextField textField_codel;
private JTextField textField_tax;
private JTextField textField_sub_tot;
private JTextField textField_tot;
double drink_cost,drink1,cb, cheese_b,cbm,hd,tax;
String drink;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Hotel_management_system window = new Hotel_management_system();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
double USA=70.95;
double china=10.056;
double Russia=34;
   double Japan=65;
   double UK=45;
   double France=98;
   double India=60;
   double South=67;
   private JTextField textField_11;
/**
* Create the application.
*/
public Hotel_management_system() {
	// TODO Auto-generated constructor stub
 
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 1100, 560);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblHotelManagement = new JLabel("Hotel Management System");
lblHotelManagement.setFont(new Font("Tahoma", Font.BOLD, 20));
lblHotelManagement.setBounds(220, 11, 302, 54);
frame.getContentPane().add(lblHotelManagement);

JPanel panel = new JPanel();
panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
panel.setBounds(10, 74, 383, 218);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblChickenBurger = new JLabel("Chicken Burger");
lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
lblChickenBurger.setBounds(10, 11, 108, 14);
panel.add(lblChickenBurger);

JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
lblChickenBurgerMeal.setBounds(10, 47, 126, 14);
panel.add(lblChickenBurgerMeal);

JLabel lblCheeseBurger = new JLabel("Cheese Burger");
lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
lblCheeseBurger.setBounds(10, 84, 108, 14);
panel.add(lblCheeseBurger);

textField = new JTextField();
textField.setBounds(181, 9, 120, 20);
panel.add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(181, 45, 120, 20);
panel.add(textField_1);

textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(181, 82, 120, 20);
panel.add(textField_2);

JLabel lblDrink = new JLabel("Drink");
lblDrink.setFont(new Font("Tahoma", Font.BOLD, 12));
lblDrink.setBounds(10, 133, 46, 14);
panel.add(lblDrink);

JLabel lblQty = new JLabel("Qty");
lblQty.setFont(new Font("Tahoma", Font.BOLD, 13));
lblQty.setBounds(170, 134, 46, 14);
panel.add(lblQty);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"Coffee", "Tea"}));
comboBox.setBounds(10, 152, 114, 20);
panel.add(comboBox);

textField_drink = new JTextField();
textField_drink.setBounds(180, 152, 121, 20);
panel.add(textField_drink);
textField_drink.setColumns(10);

JRadioButton Rbhome_del = new JRadioButton("Home Delivery");
Rbhome_del.setBounds(9, 188, 127, 23);
panel.add(Rbhome_del);

JRadioButton rb_tax = new JRadioButton("Tax");
rb_tax.setBounds(144, 188, 109, 23);
panel.add(rb_tax);

JSeparator separator = new JSeparator();
separator.setBackground(Color.BLUE);
separator.setBounds(10, 113, 291, 9);
panel.add(separator);

JPanel panel_1 = new JPanel();
panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
panel_1.setBounds(403, 76, 304, 216);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblCurrencyConverter = new JLabel("Currency Converter");
lblCurrencyConverter.setBounds(75, 11, 185, 14);
lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 16));
panel_1.add(lblCurrencyConverter);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setBounds(58, 48, 217, 20);
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"USA", "Russia", "Japan", "UK", "France", "India", "South", "china"}));
panel_1.add(comboBox_1);

textField_4 = new JTextField();
textField_4.setBounds(58, 96, 217, 20);
panel_1.add(textField_4);
textField_4.setColumns(10);

JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBounds(58, 127, 222, 28);
panel_1.add(lblNewLabel);

JButton btnOnvert = new JButton("Convert");
btnOnvert.setBounds(24, 171, 89, 23);
btnOnvert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
double bp=Double.parseDouble(textField_4.getText());
if(comboBox_1.getSelectedItem().equals("china"))
{
String c=String.format("Renminbi %.2f",bp*china);
lblNewLabel.setText(c);
}
if(comboBox_1.getSelectedItem().equals("USA"))
{
String c=String.format("$ %.2f",bp*USA);
lblNewLabel.setText(c);
}
if(comboBox_1.getSelectedItem().equals("Russia"))
{
String c=String.format("Ruble %.2f",bp*Russia);
lblNewLabel.setText(c);
}
if(comboBox_1.getSelectedItem().equals("Japan"))
{
String c=String.format("Yen  %.2f",bp*Japan);
lblNewLabel.setText(c);
}
if(comboBox_1.getSelectedItem().equals("UK"))
{
String c=String.format("Pound  %.2f",bp*UK);
lblNewLabel.setText(c);
}
if(comboBox_1.getSelectedItem().equals("France"))
{
String c=String.format("Euro  %.2f",bp*France);
lblNewLabel.setText(c);
}
if(comboBox_1.getSelectedItem().equals("India"))
{
String c=String.format("Rs  %.2f",bp*India);
lblNewLabel.setText(c);
}
if(comboBox_1.getSelectedItem().equals("South"))
{
String c=String.format("South  %.2f",bp*South);
lblNewLabel.setText(c);
}




}
});
panel_1.add(btnOnvert);

JButton btnClose = new JButton("Close");
btnClose.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
textField_4.setText(null);
lblNewLabel.setText(null);


}
});
btnClose.setBounds(186, 171, 89, 23);
panel_1.add(btnClose);



JPanel panel_2 = new JPanel();
panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
panel_2.setBounds(10, 303, 390, 113);
frame.getContentPane().add(panel_2);
panel_2.setLayout(null);

JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 13));
lblCostOfDrinks.setBounds(10, 11, 91, 14);
panel_2.add(lblCostOfDrinks);

JLabel lblCostOfMeal = new JLabel("Cost of Meal");
lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 13));
lblCostOfMeal.setBounds(10, 47, 91, 14);
panel_2.add(lblCostOfMeal);

JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 13));
lblCostOfDelivery.setBounds(10, 84, 103, 14);
panel_2.add(lblCostOfDelivery);

textField_cod = new JTextField();
textField_cod.setBounds(185, 9, 118, 20);
panel_2.add(textField_cod);
textField_cod.setColumns(10);

textField_com = new JTextField();
textField_com.setColumns(10);
textField_com.setBounds(185, 45, 118, 20);
panel_2.add(textField_com);

textField_codel = new JTextField();
textField_codel.setColumns(10);
textField_codel.setBounds(185, 82, 118, 20);
panel_2.add(textField_codel);

JPanel panel_3 = new JPanel();
panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
panel_3.setBounds(403, 303, 304, 113);
frame.getContentPane().add(panel_3);
panel_3.setLayout(null);

JLabel lblTax = new JLabel("Tax");
lblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
lblTax.setBounds(10, 11, 46, 14);
panel_3.add(lblTax);

JLabel lblSubTotal = new JLabel("Sub Total");
lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
lblSubTotal.setBounds(10, 47, 66, 21);
panel_3.add(lblSubTotal);

JLabel lblTotal = new JLabel("Total");
lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
lblTotal.setBounds(10, 88, 46, 14);
panel_3.add(lblTotal);

textField_tax = new JTextField();
textField_tax.setBounds(144, 9, 126, 20);
panel_3.add(textField_tax);
textField_tax.setColumns(10);

textField_sub_tot = new JTextField();
textField_sub_tot.setColumns(10);
textField_sub_tot.setBounds(144, 48, 126, 20);
panel_3.add(textField_sub_tot);

textField_tot = new JTextField();
textField_tot.setColumns(10);
textField_tot.setBounds(144, 86, 126, 20);
panel_3.add(textField_tot);

JPanel panel_4 = new JPanel();
panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
panel_4.setBounds(713, 74, 318, 342);
frame.getContentPane().add(panel_4);
panel_4.setLayout(null);

JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setBounds(10, 40, 298, 291);
panel_4.add(tabbedPane);

JPanel panel_7 = new JPanel();
tabbedPane.addTab("calculator", null, panel_7, null);
panel_7.setLayout(null);

textField_11 = new JTextField();
textField_11.setBounds(10, 11, 273, 49);
panel_7.add(textField_11);
textField_11.setColumns(10);

JButton btn1 = new JButton("B");
btn1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
}
});
btn1.setBounds(10, 79, 56, 28);
panel_7.add(btn1);

JButton button7 = new JButton("7");
button7.setBounds(10, 108, 56, 28);
panel_7.add(button7);

JButton button4 = new JButton("4");
button4.setBounds(10, 138, 56, 28);
panel_7.add(button4);

JButton button_5 = new JButton("5");
button_5.setBounds(67, 138, 56, 28);
panel_7.add(button_5);

JButton button8 = new JButton("8");
button8.setBounds(67, 108, 56, 28);
panel_7.add(button8);

JButton btn2 = new JButton("C");
btn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
}
});
btn2.setBounds(67, 79, 56, 28);
panel_7.add(btn2);

JButton btn4 = new JButton("+");
btn4.setBounds(124, 79, 115, 28);
panel_7.add(btn4);

JButton button1 = new JButton("1");
button1.setBounds(10, 167, 56, 28);
panel_7.add(button1);

JButton button6 = new JButton("6");
button6.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	}
});
button6.setBounds(124, 138, 56, 28);
panel_7.add(button6);

JButton button2 = new JButton("2");
button2.setBounds(67, 167, 56, 28);
panel_7.add(button2);

JButton button9 = new JButton("9");
button9.setBounds(124, 108, 56, 28);
panel_7.add(button9);

JButton buttonmul = new JButton("*");
buttonmul.setBounds(183, 138, 56, 28);
panel_7.add(buttonmul);

JButton buttonminus = new JButton("-");
buttonminus.setBounds(183, 108, 56, 28);
panel_7.add(buttonminus);

JButton btnNewButton_1 = new JButton("=");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
}
});
btnNewButton_1.setBounds(124, 199, 115, 28);
panel_7.add(btnNewButton_1);

JButton button0 = new JButton("0");
button0.setBounds(10, 199, 56, 28);
panel_7.add(button0);

JButton button3 = new JButton("3");
button3.setBounds(124, 167, 56, 28);
panel_7.add(button3);

JButton buttondiv = new JButton("/");
buttondiv.setBounds(183, 167, 56, 28);
panel_7.add(buttondiv);

JButton buttondot = new JButton(".");
buttondot.setBounds(67, 199, 56, 28);
panel_7.add(buttondot);

JPanel panel_8 = new JPanel();
tabbedPane.addTab("Receipt", null, panel_8, null);
panel_8.setLayout(null);
JTextArea textArea = new JTextArea();
textArea.setBounds(12, 13, 269, 235);
panel_8.add(textArea);

JPanel panel_6 = new JPanel();
panel_6.setBounds(10, 40, 298, 291);
panel_4.add(panel_6);
panel_6.setLayout(null);

JPanel panel_5 = new JPanel();
panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
panel_5.setBounds(10, 427, 1019, 54);
frame.getContentPane().add(panel_5);
panel_5.setLayout(null);

JButton btnTotl = new JButton("Total");
btnTotl.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		String  cb=textField.getText();
		double cb1=Double.parseDouble(cb);
		String cbm=textField_1.getText();
		double cbm1=Double.parseDouble(cbm);
		String cheese_b=textField_2.getText();
		double cheese_b1=Double.parseDouble(cheese_b);
		String dq=textField_drink.getText();
		double dq1=Double.parseDouble(dq);
		String drinkk = comboBox.getSelectedItem().toString();
		
		//textField_3.getText();
		if(drinkk.equals("Tea"))
		{
			drink_cost=9;
		}
		else
			drink_cost=13;
		if(Rbhome_del.isSelected())
		{
			hd=25;
		}
		else
			hd=0;
		
		double drink_cost_tot,cost_of_cb,cost_of_cbm,cost_of_cheese_burger,cost_of_meal,cost_of_home_del,tax;
		double cost_of_food,sub_total,tot;
		
		drink_cost_tot=drink_cost*dq1;
		textField_cod.setText(String.format("%.0f", drink_cost_tot) );
		cost_of_cb=cb1*50;
		cost_of_cbm=cbm1*75;
		cost_of_cheese_burger=cheese_b1*75;
		cost_of_meal=cost_of_cb+cost_of_cbm+cost_of_cheese_burger;
		cost_of_food=cost_of_meal+drink_cost_tot;
		textField_com.setText(String.format("%.0f",cost_of_meal));
		if(Rbhome_del.isSelected())
		{
			cost_of_home_del=25;
		}
		else
			cost_of_home_del=0;
		
		
		textField_codel.setText(String.format("%.0f",cost_of_home_del));
		tax=(.18)*(cost_of_food+cost_of_home_del);
		
	 	textField_tax.setText(String.format("%.0f", tax));
	 	sub_total=cost_of_food+cost_of_home_del;
	 	textField_sub_tot.setText(String.format("%.0f", sub_total));
	 	tot=sub_total+tax;
	 	textField_tot.setText(String.format("%.0f", tot));
	 	textField_4.setText(String.format("%.0f", tot));
	
	}
});
btnTotl.setBounds(142, 20, 89, 23);
panel_5.add(btnTotl);

JButton btnReceipt = new JButton("Receipt");
btnReceipt.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		textArea.append("\n"
				+"Restaurant Management System:\t\t\n"
				+"==================================\n"
				+"Chicken Burger:\t\t"+textField.getText()+"\n"
				+"Chicken Burger Meal:\t\t"+textField_1.getText()+"\n"        
				+"Cheese Burger :\t\t"+textField_2.getText()+"\n"  
				+"Thanks for using\t\t\n"
				
				);
		
		
		
		
	}
});
btnReceipt.setBounds(265, 20, 89, 23);
panel_5.add(btnReceipt);

JButton btnReset = new JButton("Reset");
btnReset.setBounds(386, 20, 89, 23);
panel_5.add(btnReset);


JButton btnExit = new JButton("Exit");
btnExit.setBounds(506, 20, 89, 23);
panel_5.add(btnExit);
}
}
