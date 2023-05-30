package feedsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class admin_signup extends JFrame {

/**
*
*/
private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField Code;
private JTextField Name;
private JTextField Email;
private JTextField Pincode;
private JPasswordField passwordField;
private JLabel textField;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
admin_signup frame = new admin_signup();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public admin_signup() {
setBackground(new Color(240, 240, 240));
setTitle("admin_signup");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(0, 0, 1299, 729);
contentPane = new JPanel();
contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 10));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblNewLabel_1 = new JLabel("Institute Name:");
lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
lblNewLabel_1.setBounds(267, 162, 138, 25);
contentPane.add(lblNewLabel_1);

JLabel lblNewLabel_1_1 = new JLabel("Institute Code:");
lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
lblNewLabel_1_1.setBounds(267, 200, 138, 25);
contentPane.add(lblNewLabel_1_1);

JLabel lblNewLabel_1_2 = new JLabel("Institute City:");
lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 20));
lblNewLabel_1_2.setBounds(267, 340, 138, 25);
contentPane.add(lblNewLabel_1_2);

JLabel lblNewLabel_1_3 = new JLabel("Institute State:");
lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 20));
lblNewLabel_1_3.setBounds(267, 386, 138, 25);
contentPane.add(lblNewLabel_1_3);

JLabel lblNewLabel_1_4 = new JLabel("Pincode:");
lblNewLabel_1_4.setFont(new Font("Calibri", Font.BOLD, 20));
lblNewLabel_1_4.setBounds(267, 432, 106, 25);
contentPane.add(lblNewLabel_1_4);

JLabel lblNewLabel_1_5 = new JLabel("Institute E-mail:");
lblNewLabel_1_5.setFont(new Font("Calibri", Font.BOLD, 20));
lblNewLabel_1_5.setBounds(267, 245, 138, 25);
contentPane.add(lblNewLabel_1_5);

JLabel lblNewLabel_1_6 = new JLabel("Password:");
lblNewLabel_1_6.setFont(new Font("Calibri", Font.BOLD, 20));
lblNewLabel_1_6.setBounds(267, 293, 106, 25);
contentPane.add(lblNewLabel_1_6);

Code = new JTextField();
Code.setBounds(528, 202, 408, 20);
contentPane.add(Code);
Code.setColumns(10);

Name = new JTextField();
Name.setColumns(10);
Name.setBounds(528, 164, 408, 20);
contentPane.add(Name);

Email = new JTextField();
Email.setColumns(10);
Email.setBounds(528, 247, 408, 20);
contentPane.add(Email);

JComboBox<String> City = new JComboBox<String>();
City.setEditable(true);
City.setBounds(528, 341, 408, 22);
contentPane.add(City);
City.addItem("Pune");
City.addItem("Mumbai");
City.addItem("Lucknow");
City.addItem("Panjim");
City.addItem("Chennai");


// JComboBox<String> State = new JComboBox<String>();
// State.setEditable(true);
// State.setBounds(207, 300, 408, 22);
// contentPane.add(State);

JComboBox<Object> State_1 = new JComboBox<Object>();
State_1.setEditable(true);
State_1.setBounds(528, 387, 408, 22);
contentPane.add(State_1);
State_1.addItem("Maharashtra");
State_1.addItem("Uttar Pradesh");
State_1.addItem("Goa");
State_1.addItem("Tamil Nadu");

Pincode = new JTextField();
Pincode.setBounds(528, 434, 408, 20);
contentPane.add(Pincode);
Pincode.setColumns(10);

passwordField = new JPasswordField();
passwordField.setBounds(528, 295, 408, 20);
contentPane.add(passwordField);

JButton Signup = new JButton("Sign Up");
Signup.addActionListener(new ActionListener() {
// private Statement s1;
// private JLabel textField;

public void actionPerformed(ActionEvent e) {
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
// s1=con.createStatement();
PreparedStatement p=con.prepareStatement("insert into admininfo(inst_name,inst_code,inst_email,admin_password,city,state,pincode) values (?,?,?,?,?,?,?)");
p.setString(1,Name.getText());
p.setString(2,Code.getText());
p.setString(3,Email.getText());
int pwd=passwordField.getText().hashCode();
p.setLong(4,pwd);
p.setString(5,(String) City.getSelectedItem());
p.setString(6,(String) State_1.getSelectedItem());
p.setString(7,Pincode.getText());
p.executeUpdate();
con.close();
p.close();
Name.setText("");
Code.setText("");
Email.setText("");
passwordField.setText("");
City.setSelectedItem("");
State_1.setSelectedItem("");
Pincode.setText("");
JOptionPane.showMessageDialog(null,"Signed up successfully");

}
catch(Exception e1)
{
System.out.println(e1);
JOptionPane.showMessageDialog(Signup, e1);
// textField.setText("");
// passwordField.setText("");
}
}
});
Signup.setBounds(542, 518, 138, 41);
contentPane.add(Signup);

JPanel panel = new JPanel();
panel.setBackground(new Color(137, 166, 79));
panel.setBounds(10, 10, 1265, 117);
contentPane.add(panel);
panel.setLayout(null);

JLabel lblNewLabel = new JLabel("ADMIN SIGN  UP");
lblNewLabel.setForeground(new Color(255, 255, 255));
lblNewLabel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
lblNewLabel.setBounds(10, 32, 287, 47);
panel.add(lblNewLabel);

JButton btnNewButton = new JButton("Home");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		loginform frame=new loginform();
		frame.setVisible(true);
	}
});
btnNewButton.setForeground(Color.WHITE);
btnNewButton.setFont(new Font("Calibri", Font.BOLD, 17));
btnNewButton.setBackground(new Color(137, 166, 79));
btnNewButton.setBounds(903, 49, 89, 35);
panel.add(btnNewButton);

JButton btnAboutUs = new JButton("About");
btnAboutUs.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"We are REVIEWINS, a feedback collecting system which makes giving feedback a very easy process.");
		
	}
});
btnAboutUs.setForeground(Color.WHITE);
btnAboutUs.setFont(new Font("Calibri", Font.BOLD, 17));
btnAboutUs.setBackground(new Color(137, 166, 79));
btnAboutUs.setBounds(1028, 49, 89, 35);
panel.add(btnAboutUs);

JButton btnContact = new JButton("Contact");
btnContact.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Contact us on phone at: 401234 or on email at: reviewins@gmail.com");
		
	}
});
btnContact.setForeground(Color.WHITE);
btnContact.setFont(new Font("Calibri", Font.BOLD, 17));
btnContact.setBackground(new Color(137, 166, 79));
btnContact.setBounds(1146, 49, 89, 35);
panel.add(btnContact);

// JComboBox comboBox = new JComboBox();
// comboBox.setBounds(207, 350, 408, 22);
// contentPane.add(comboBox);
// City.addItem("Pune");
// City.addItem("Mumbai");
// City.addItem("Lucknow");
// City.addItem("Panjim");
// City.addItem("Chennai");
}
}
