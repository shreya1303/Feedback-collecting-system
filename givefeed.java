package feedsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class givefeed extends JFrame {

private JPanel contentPane;
private final ButtonGroup buttonGroup = new ButtonGroup();
private final ButtonGroup buttonGroup_1 = new ButtonGroup();
private final ButtonGroup buttonGroup_2 = new ButtonGroup();
private final ButtonGroup buttonGroup_3 = new ButtonGroup();
private final ButtonGroup buttonGroup_4 = new ButtonGroup();

private Statement s1;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
//givefeed frame = new givefeed();
//frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public givefeed(String prn) {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(0, 0, 1299, 729);
contentPane = new JPanel();
contentPane.setForeground(new Color(0, 0, 0));
contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 11));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel que1 = new JLabel("");
que1.setBounds(75, 171, 1119, 34);
que1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
contentPane.add(que1);

JRadioButton q11 = new JRadioButton("Excellent");
q11.setFont(new Font("Tahoma", Font.PLAIN, 16));
q11.setBounds(112, 211, 111, 23);
buttonGroup.add(q11);
buttonGroup.add(q11);
contentPane.add(q11);

JRadioButton q12 = new JRadioButton("Very satisfactory ");
q12.setFont(new Font("Tahoma", Font.PLAIN, 16));
q12.setBounds(289, 211, 154, 23);
buttonGroup.add(q12);
contentPane.add(q12);

JRadioButton q13 = new JRadioButton("Good");
q13.setFont(new Font("Tahoma", Font.PLAIN, 16));
q13.setBounds(510, 211, 103, 23);
buttonGroup.add(q13);
contentPane.add(q13);

JRadioButton q14 = new JRadioButton("Satisfactory");
q14.setFont(new Font("Tahoma", Font.PLAIN, 16));
q14.setBounds(666, 211, 123, 23);
buttonGroup.add(q14);
contentPane.add(q14);

JRadioButton q15 = new JRadioButton("Poor");
q15.setFont(new Font("Tahoma", Font.PLAIN, 16));
q15.setBounds(854, 211, 111, 23);
buttonGroup.add(q15);
contentPane.add(q15);

JLabel que2 = new JLabel("");
que2.setBounds(81, 251, 1119, 34);
que2.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
contentPane.add(que2);

JRadioButton q21 = new JRadioButton("Excellent");
q21.setFont(new Font("Tahoma", Font.PLAIN, 16));
q21.setBounds(112, 291, 111, 23);
buttonGroup_1.add(q21);
contentPane.add(q21);

JRadioButton q22 = new JRadioButton("Very satisfactory ");
q22.setFont(new Font("Tahoma", Font.PLAIN, 16));
q22.setBounds(289, 291, 154, 23);
buttonGroup_1.add(q22);
contentPane.add(q22);

JRadioButton q23 = new JRadioButton("Good");
q23.setFont(new Font("Tahoma", Font.PLAIN, 16));
q23.setBounds(513, 291, 100, 23);
buttonGroup_1.add(q23);
contentPane.add(q23);

JRadioButton q24 = new JRadioButton("Satisfactory");
q24.setFont(new Font("Tahoma", Font.PLAIN, 16));
q24.setBounds(666, 291, 111, 23);
buttonGroup_1.add(q24);
contentPane.add(q24);

JRadioButton q25 = new JRadioButton("Poor");
q25.setFont(new Font("Tahoma", Font.PLAIN, 16));
q25.setBounds(854, 291, 111, 23);
buttonGroup_1.add(q25);
contentPane.add(q25);

JLabel que3 = new JLabel("");
que3.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
que3.setBounds(81, 338, 1119, 34);
contentPane.add(que3);

JRadioButton q31 = new JRadioButton("Excellent");
q31.setFont(new Font("Tahoma", Font.PLAIN, 16));
q31.setBounds(112, 378, 111, 23);
buttonGroup_2.add(q31);
contentPane.add(q31);

JRadioButton q32 = new JRadioButton("Very satisfactory ");
q32.setFont(new Font("Tahoma", Font.PLAIN, 16));
q32.setBounds(289, 378, 154, 23);
buttonGroup_2.add(q32);
contentPane.add(q32);

JRadioButton q33 = new JRadioButton("Good");
q33.setFont(new Font("Tahoma", Font.PLAIN, 16));
q33.setBounds(513, 378, 100, 23);
buttonGroup_2.add(q33);
contentPane.add(q33);

JRadioButton q35 = new JRadioButton("Poor");
q35.setFont(new Font("Tahoma", Font.PLAIN, 16));
q35.setBounds(854, 378, 111, 23);
buttonGroup_2.add(q35);
contentPane.add(q35);

JRadioButton q34 = new JRadioButton("Satisfactory");
q34.setFont(new Font("Tahoma", Font.PLAIN, 16));
q34.setBounds(666, 378, 123, 23);
buttonGroup_2.add(q34);
contentPane.add(q34);


//JLabel lblNewLabel_2 = new JLabel("New label");
//lblNewLabel_2.setBounds(179, 157, 420, -7);
//contentPane.add(lblNewLabel_2);

JLabel que4 = new JLabel("");
que4.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
que4.setBounds(81, 419, 1119, 34);
contentPane.add(que4);

JRadioButton q41 = new JRadioButton("Excellent");
q41.setFont(new Font("Tahoma", Font.PLAIN, 16));
q41.setBounds(112, 459, 111, 23);
contentPane.add(q41);

JRadioButton q42 = new JRadioButton("Very satisfactory ");
q42.setFont(new Font("Tahoma", Font.PLAIN, 16));
q42.setBounds(289, 459, 154, 23);
contentPane.add(q42);

JRadioButton q43 = new JRadioButton("Good");
q43.setFont(new Font("Tahoma", Font.PLAIN, 16));
q43.setBounds(513, 459, 100, 23);
contentPane.add(q43);

JRadioButton q44 = new JRadioButton("Satisfactory");
q44.setFont(new Font("Tahoma", Font.PLAIN, 16));
q44.setBounds(666, 459, 123, 23);
contentPane.add(q44);

JRadioButton q45 = new JRadioButton("Poor");
q45.setFont(new Font("Tahoma", Font.PLAIN, 16));
q45.setBounds(854, 459, 111, 23);
contentPane.add(q45);

JLabel que5 = new JLabel("");
que5.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
que5.setBounds(81, 492, 1119, 34);
contentPane.add(que5);

JRadioButton q51 = new JRadioButton("Excellent");
q51.setFont(new Font("Tahoma", Font.PLAIN, 16));
q51.setBounds(112, 539, 111, 23);
contentPane.add(q51);

JRadioButton q52 = new JRadioButton("Very satisfactory ");
q52.setFont(new Font("Tahoma", Font.PLAIN, 16));
q52.setBounds(289, 539, 154, 23);
contentPane.add(q52);

JRadioButton q53 = new JRadioButton("Good");
q53.setFont(new Font("Tahoma", Font.PLAIN, 16));
q53.setBounds(513, 539, 100, 23);
contentPane.add(q53);

JRadioButton q54 = new JRadioButton("Satisfactory");
q54.setFont(new Font("Tahoma", Font.PLAIN, 16));
q54.setBounds(666, 539, 123, 23);
contentPane.add(q54);

JRadioButton q55 = new JRadioButton("Poor");
q55.setFont(new Font("Tahoma", Font.PLAIN, 16));
q55.setBounds(854, 539, 111, 23);
contentPane.add(q55);
                                              
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
	s1=con.createStatement();
	String query=("select q1,q2,q3,q4,q5 from admininfo inner join stuinfo on admininfo.inst_code=stuinfo.s_inst_code where stuinfo.stu_prn='"+prn+"'");
	ResultSet rs=s1.executeQuery(query);
//	String s;
	if(rs.next())
	{
//		s=rs.getString("q1");
		que1.setText(rs.getString("q1"));
		que2.setText(rs.getString("q2"));
		que3.setText(rs.getString("q3"));
		que4.setText(rs.getString("q4"));
		que5.setText(rs.getString("q5"));
	}
	}
	catch(Exception e1)
	{
		System.out.println(e1);
//		JOptionPane.showMessageDialog(Signup, e1);
//		textField.setText("");
//		passwordField.setText("");
	}

JButton next = new JButton("SUBMIT");
next.setForeground(new Color(255, 255, 255));
next.setBackground(new Color(255, 0, 0));
next.setFont(new Font("Tahoma", Font.PLAIN, 14));
next.setBounds(567, 596, 142, 42);

next.addActionListener(new ActionListener() {
private Statement smt;

public void actionPerformed(ActionEvent e) {
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
		PreparedStatement p=con.prepareStatement("insert into answer (prn,A1,A2,A3,A4,A5) values (?,?,?,?,?,?)");  
		
		p.setString(1,prn);
		
		if(q11.isSelected())
			p.setString(2,q11.getText()); 	
		else if(q12.isSelected())
			p.setString(2,q12.getText());
		else if(q13.isSelected())
			p.setString(2,q13.getText());
		else if(q14.isSelected())
			p.setString(2,q14.getText());
		else
			p.setString(2, q15.getText());
		
		if(q21.isSelected())
			p.setString(3,q21.getText());
		else if(q22.isSelected())
			p.setString(3,q22.getText());
		else if(q23.isSelected())
			p.setString(3,q23.getText());
		else if(q24.isSelected())
			p.setString(3,q24.getText());
		else
			p.setString(3, q25.getText());
		
		if(q31.isSelected())
			p.setString(4,q31.getText());
		else if(q32.isSelected())
			p.setString(4,q32.getText());
		else if(q33.isSelected())
			p.setString(4,q33.getText());
		else if(q34.isSelected())
			p.setString(4,q34.getText());
		else
			p.setString(4, q35.getText());
		
		if(q41.isSelected())
			p.setString(5,q41.getText());
		else if(q42.isSelected())
			p.setString(5,q42.getText());
		else if(q43.isSelected())
			p.setString(5,q43.getText());
		else if(q44.isSelected())
			p.setString(5,q44.getText());
		else
			p.setString(5, q45.getText());
		
		if(q51.isSelected())
			p.setString(6,q51.getText());
		else if(q52.isSelected())
			p.setString(6,q52.getText());
		else if(q53.isSelected())
			p.setString(6,q53.getText());
		else if(q54.isSelected())
			p.setString(6,q54.getText());
		else
			p.setString(6, q55.getText());
		
		
		p.execute();
		con.close();
		p.close();
		JOptionPane.showMessageDialog(null,"Signed up successfully"); 
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
			JOptionPane.showMessageDialog(next, e1);
//			textField.setText("");
//			passwordField.setText("");
		}
	setVisible(false);
}
});
contentPane.add(next);


JPanel panel = new JPanel();
panel.setBackground(new Color(137, 160, 79));
panel.setBounds(10, 10, 1265, 117);
contentPane.add(panel);
panel.setLayout(null);

JLabel lblNewLabel_3 = new JLabel("FEEDBACK FORM");
lblNewLabel_3.setForeground(new Color(255, 255, 255));
lblNewLabel_3.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
lblNewLabel_3.setBounds(30, 30, 360, 61);
panel.add(lblNewLabel_3);

JButton btnNewButton = new JButton("Home");
btnNewButton.setForeground(Color.WHITE);
btnNewButton.setFont(new Font("Calibri", Font.BOLD, 17));
btnNewButton.setBackground(new Color(137, 166, 79));
btnNewButton.setBounds(918, 41, 89, 35);
panel.add(btnNewButton);

JButton btnAboutUs = new JButton("About");
btnAboutUs.setForeground(Color.WHITE);
btnAboutUs.setFont(new Font("Calibri", Font.BOLD, 17));
btnAboutUs.setBackground(new Color(137, 166, 79));
btnAboutUs.setBounds(1017, 41, 89, 35);
panel.add(btnAboutUs);

JButton btnContact = new JButton("Contact");
btnContact.setForeground(Color.WHITE);
btnContact.setFont(new Font("Calibri", Font.BOLD, 17));
btnContact.setBackground(new Color(137, 166, 79));
btnContact.setBounds(1117, 41, 89, 35);
panel.add(btnContact);

JLabel lblNewLabel = new JLabel("SELECT ANY ONE ");
lblNewLabel.setBounds(556, 137, 360, 14);
contentPane.add(lblNewLabel);
lblNewLabel.setForeground(new Color(0, 0, 0));
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
}
private static class __Tmp {
private static void __tmp() {
 javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
}
}
}
