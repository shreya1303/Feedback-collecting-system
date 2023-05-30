package feedsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class feedbackform extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField q1;
private JTextField q2;
private JTextField q3;
private JTextField q4;
private JTextField q5;
private JTextField inst;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
feedbackform frame = new feedbackform();
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
public feedbackform() {
setTitle("FeedBack Form generator");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(0, 0, 1299, 729);
contentPane = new JPanel();
contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 10));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblNewLabel = new JLabel("Add question 2:");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel.setBounds(408, 246, 119, 14);
contentPane.add(lblNewLabel);

q1 = new JTextField();
q1.setBounds(602, 169, 454, 26);
contentPane.add(q1);
q1.setColumns(10);

JLabel lblNewLabel_1 = new JLabel("Add question 1:");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_1.setBounds(408, 174, 119, 14);
contentPane.add(lblNewLabel_1);
;
JLabel lblNewLabel_2 = new JLabel("Add question 4:");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_2.setBounds(408, 391, 119, 14);
contentPane.add(lblNewLabel_2);

JLabel lblNewLabel_2_1 = new JLabel("Add question 3:");
lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_2_1.setBounds(408, 313, 119, 14);
contentPane.add(lblNewLabel_2_1);

JLabel lblNewLabel_2_2 = new JLabel("Add question 5:");
lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_2_2.setBounds(408, 464, 119, 14);
contentPane.add(lblNewLabel_2_2);

q2 = new JTextField();
q2.setColumns(10);
q2.setBounds(602, 242, 454, 26);
contentPane.add(q2);

q3 = new JTextField();
q3.setColumns(10);
q3.setBounds(602, 309, 454, 26);
contentPane.add(q3);

q4 = new JTextField();
q4.setColumns(10);
q4.setBounds(602, 387, 454, 26);
contentPane.add(q4);

q5 = new JTextField();
q5.setColumns(10);
q5.setBounds(602, 460, 454, 26);
contentPane.add(q5);

JLabel lblNewLabel_3 = new JLabel("Enter institute code:");
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_3.setBounds(408, 526, 169, 21);
contentPane.add(lblNewLabel_3);

inst = new JTextField();
inst.setColumns(10);
inst.setBounds(602, 526, 454, 26);
contentPane.add(inst);

JButton Done = new JButton("Done");
Done.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
//			s1=con.createStatement();
			PreparedStatement p=con.prepareStatement("update admininfo set q1=?,q2=?,q3=?,q4=?,q5=? where inst_code=?");
			p.setString(1,q1.getText());
			p.setString(2,q2.getText());
			p.setString(3,q3.getText());
			p.setString(4,q4.getText());
			p.setString(5,q5.getText());
//			p.setString(6,q6.getText());
//			p.setString(7,q7.getText());
//			p.setString(8,q8.getText());
//			p.setString(9,q9.getText());
//			p.setString(10,q10.getText());
			p.setString(6,inst.getText());
			p.executeUpdate();
			con.close();
			p.close();
			q1.setText("");
			q2.setText("");
			q3.setText("");
			q4.setText("");
			q5.setText("");
//			q6.setText("");
//			q7.setText("");
//			q8.setText("");
//			q9.setText("");
//			q10.setText("");
			inst.setText("");
			JOptionPane.showMessageDialog(null,"Generated successfully"); 
			
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(Done, e1);
//				textField.setText("");
//				passwordField.setText("");
			}
	}
});
Done.setBounds(774, 610, 89, 23);
contentPane.add(Done);


JPanel panel = new JPanel();
panel.setBackground(new Color(137, 166, 79));
panel.setBounds(10, 10, 1265, 117);
contentPane.add(panel);
panel.setLayout(null);

JLabel lblNewLabel_4 = new JLabel("FEEDBACK FORM GENERATOR");
lblNewLabel_4.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
lblNewLabel_4.setForeground(new Color(255, 255, 255));
lblNewLabel_4.setBackground(new Color(240, 240, 240));
lblNewLabel_4.setBounds(10, 25, 465, 47);
panel.add(lblNewLabel_4);

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
btnNewButton.setBounds(920, 42, 89, 35);
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
btnAboutUs.setBounds(1031, 42, 89, 35);
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
btnContact.setBounds(1151, 42, 89, 35);
panel.add(btnContact);
}
}