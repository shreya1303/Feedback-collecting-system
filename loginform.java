package feedsystem;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class loginform extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JPasswordField passwordField_2;
	protected Statement smt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginform frame = new loginform();
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
	public loginform() {
		setTitle("Feedback System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 732);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 11));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(263, 97, 49, 14);
		contentPane.add(lblNewLabel);
		
//		JLabel lblNewLabel_2 = new JLabel("");
//		Image img = new ImageIcon(this.getClass().getResource("/reviewins.png")).getImage();
//		lblNewLabel_2.setIcon(new ImageIcon(img));
//		lblNewLabel_2.setBounds(389, 37, 496, 129);
//		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(53, 266, 310, 190);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN");
		lblNewLabel_1.setForeground(new Color(129, 175, 65));
		lblNewLabel_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		lblNewLabel_1.setBounds(99, 11, 116, 49);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Institute Code :");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 81, 133, 20);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(150, 80, 150, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password :");
		lblNewLabel_3_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(10, 112, 133, 20);
		panel.add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(111, 111, 189, 20);
		panel.add(passwordField);
		
		JButton a_login = new JButton("LOGIN");
		a_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inst=textField.getText();
				int admin=passwordField.getText().hashCode();
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
					smt=con.createStatement();
					String query = ("select * from admininfo where inst_code='"+inst+"' and admin_password='"+admin+"'");
					ResultSet rs=smt.executeQuery(query);
					if(rs.next()){
					setVisible(false);
					adminlogin frame=new adminlogin();
					frame.setVisible(true);
					}
					else
					{
					JOptionPane.showMessageDialog(null,"Invalid username or password");
					textField.setText("");
					passwordField.setText("");
					}
					}
					catch(Exception e1)
					{
						System.out.println(e1);
						JOptionPane.showMessageDialog(a_login, e1);
						textField.setText("");
						passwordField.setText("");
					}
			}
		});
		a_login.setFont(new Font("Tahoma", Font.BOLD, 11));
		a_login.setBounds(99, 156, 102, 23);
		panel.add(a_login);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(490, 266, 310, 190);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("TEACHER");
		lblNewLabel_1_1.setForeground(new Color(129, 175, 65));
		lblNewLabel_1_1.setBounds(81, 11, 158, 43);
		lblNewLabel_1_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Teacher ID/email :");
		lblNewLabel_3_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(10, 81, 158, 20);
		panel_1.add(lblNewLabel_3_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 80, 127, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Password :");
		lblNewLabel_3_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(10, 112, 133, 20);
		panel_1.add(lblNewLabel_3_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(111, 112, 189, 20);
		panel_1.add(passwordField_1);
		
		JButton t_login = new JButton("LOGIN");
		t_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t_id=textField_1.getText();
				int t_pass=passwordField_1.getText().hashCode();
//				try{
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
//					smt=con.createStatement();
//					String query = ("select * from teachinfo where t_prn='"+t_id+"' and t_password='"+t_pass+"'");
//					ResultSet rs=smt.executeQuery(query);
//					if(rs.next()){
//					setVisible(false);
//					teachinterface frame=new teachinterface(t_id);
//					frame.setVisible(true);
//					}
//					else
//					{
//					JOptionPane.showMessageDialog(null,"Invalid username or password");
//					textField_1.setText("");
//					passwordField_1.setText("");
//					}
//					con.close();
//					}
//					catch(Exception e2)
//					{
//						System.out.println(e2);
//						JOptionPane.showMessageDialog(t_login, e2);
//						textField.setText("");
//						passwordField.setText("");
////					}
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
					smt=con.createStatement();
					String query = ("select * from teachinfo where t_prn='"+t_id+"' and t_password='"+t_pass+"'");
					ResultSet rs=smt.executeQuery(query);
					if(rs.next()){
						setVisible(false);
						teachinterface frame=new teachinterface(t_id);
						frame.setVisible(true);
						}
				}
				catch(Exception e2)
				{
					System.out.println(e2);
					JOptionPane.showMessageDialog(t_login, e2);
					JOptionPane.showMessageDialog(null,"Invalid username or password");
					textField_1.setText("");
					passwordField_1.setText("");
				}
				
//				teachinterface frame=new teachinterface(t_id);
//				frame.setVisible(true);
			}}
	);
		t_login.setFont(new Font("Tahoma", Font.BOLD, 11));
		t_login.setBounds(108, 156, 102, 23);
		panel_1.add(t_login);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBounds(916, 266, 310, 190);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("STUDENT");
		lblNewLabel_1_2.setForeground(new Color(129, 175, 65));
		lblNewLabel_1_2.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(83, 11, 153, 49);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Student PRN/email :");
		lblNewLabel_3_2_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_3_2_1.setBounds(10, 81, 180, 20);
		panel_2.add(lblNewLabel_3_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(186, 80, 114, 20);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Password :");
		lblNewLabel_3_1_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_3_1_1_1.setBounds(10, 112, 133, 20);
		panel_2.add(lblNewLabel_3_1_1_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(111, 112, 189, 20);
		panel_2.add(passwordField_2);
		
		JButton s_login = new JButton("LOGIN");
		s_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_id=textField_2.getText();
				int s_pass=passwordField_2.getText().hashCode();
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
					smt=con.createStatement();
					String query = ("select * from stuinfo where stu_prn='"+s_id+"' and stu_password='"+s_pass+"'");
					ResultSet rs=smt.executeQuery(query);
					if(rs.next()){
					setVisible(false);
//					stulogin frame=new stulogin();
//					frame.setVisible(true);
					stuinterface frame1=new stuinterface(s_id);
					frame1.setVisible(true);
					}
					else
					{
					JOptionPane.showMessageDialog(null,"Invalid username or password");
					textField.setText("");
					passwordField.setText("");
					}
					}
					catch(Exception e3)
					{
						System.out.println(e3);
						JOptionPane.showMessageDialog(a_login, e3);
						textField.setText("");
						passwordField.setText("");
					}
				
			}
		});
		s_login.setFont(new Font("Tahoma", Font.BOLD, 11));
		s_login.setBounds(111, 156, 102, 23);
		panel_2.add(s_login);
		
		JLabel lblNewLabel_4 = new JLabel("Join as");
		lblNewLabel_4.setFont(new Font("Calibri Light", Font.BOLD, 25));
		lblNewLabel_4.setBounds(53, 231, 83, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NOTE : ONLY ADMINS CAN REGISTER");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(43, 604, 310, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Join as");
		lblNewLabel_4_1.setFont(new Font("Calibri Light", Font.BOLD, 25));
		lblNewLabel_4_1.setBounds(490, 231, 83, 24);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Join as");
		lblNewLabel_4_2.setFont(new Font("Calibri Light", Font.BOLD, 25));
		lblNewLabel_4_2.setBounds(916, 231, 83, 24);
		contentPane.add(lblNewLabel_4_2);
		
		JButton signup = new JButton("SIGN UP");
		signup.setForeground(new Color(255, 255, 255));
		signup.setBackground(new Color(255, 0, 0));
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_signup frame=new admin_signup();
				frame.setVisible(true);
			}
		});
		signup.setFont(new Font("Tahoma", Font.BOLD, 20));
		signup.setBounds(554, 544, 193, 38);
		contentPane.add(signup);
		
		JLabel lblNewLabel_6 = new JLabel("OR");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(639, 497, 32, 24);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logoo.jpeg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(410, 40, 493, 135);
		contentPane.add(lblNewLabel_2);
		
		
		
		
		
		
	}
}