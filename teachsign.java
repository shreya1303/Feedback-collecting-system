package feedsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class teachsign extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfname;
	private JTextField tmname;
	private JTextField tlname;
	private JTextField temail;
	private JPasswordField tpass;
	private JTextField tid;
	private JTextField tweb;
	private JTextField tsub;
	private JTextField texp;
	private JTextField tdept;
	private JTextField tedu;
	private JTextField t_inst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teachsign frame = new teachsign();
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
	public teachsign() {
		setTitle("Teacher Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1297, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 11));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(137, 166, 79));
		panel.setBounds(10, 11, 1263, 98);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTeacherRegistration = new JLabel("TEACHER REGISTRATION");
		lblTeacherRegistration.setBounds(23, 29, 383, 46);
		lblTeacherRegistration.setForeground(Color.WHITE);
		lblTeacherRegistration.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
		panel.add(lblTeacherRegistration);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginform frame=new loginform();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(132, 157, 72));
		btnNewButton_1.setBounds(936, 40, 89, 35);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("About");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"We are REVIEWINS, a feedback collecting system which makes giving feedback a very easy process.");
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(new Color(132, 157, 72));
		btnNewButton_1_1.setBounds(1035, 40, 89, 35);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Contact");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Contact us on phone at: 401234 or on email at: reviewins@gmail.com");
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1_2.setBackground(new Color(132, 157, 72));
		btnNewButton_1_2.setBounds(1134, 40, 110, 35);
		panel.add(btnNewButton_1_2);
		
//		JLabel lblNewLabel = new JLabel("New label");
//		Image img = new ImageIcon(this.getClass().getResource("/teacher.png")).getImage();
//		lblNewLabel.setIcon(new ImageIcon(img));
//		lblNewLabel.setBounds(10, 108, 653, 575);
//		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First name : ");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1.setBounds(677, 141, 88, 21);
		contentPane.add(lblNewLabel_1);
		
		tfname = new JTextField();
		tfname.setBounds(775, 140, 150, 20);
		contentPane.add(tfname);
		tfname.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Middle name : ");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(677, 173, 113, 21);
		contentPane.add(lblNewLabel_1_1);
		
		tmname = new JTextField();
		tmname.setColumns(10);
		tmname.setBounds(797, 172, 150, 20);
		contentPane.add(tmname);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Last name : ");
		lblNewLabel_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(677, 205, 88, 21);
		contentPane.add(lblNewLabel_1_1_1);
		
		tlname = new JTextField();
		tlname.setColumns(10);
		tlname.setBounds(775, 204, 150, 20);
		contentPane.add(tlname);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email address :");
		lblNewLabel_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1.setBounds(677, 237, 113, 21);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		temail = new JTextField();
		temail.setColumns(10);
		temail.setBounds(797, 236, 224, 20);
		contentPane.add(temail);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Password :");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1.setBounds(677, 269, 88, 21);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		tpass = new JPasswordField();
		tpass.setBounds(764, 268, 172, 20);
		contentPane.add(tpass);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Teacher ID :");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1.setBounds(677, 301, 88, 21);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		tid = new JTextField();
		tid.setColumns(10);
		tid.setBounds(775, 299, 150, 20);
		contentPane.add(tid);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Teacher's personal website (if any)  :");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(677, 336, 270, 21);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		tweb = new JTextField();
		tweb.setColumns(10);
		tweb.setBounds(944, 335, 246, 20);
		contentPane.add(tweb);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Subject taught :");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1_2.setBounds(677, 367, 113, 21);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2);
		
		tsub = new JTextField();
		tsub.setColumns(10);
		tsub.setBounds(797, 366, 208, 20);
		contentPane.add(tsub);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1 = new JLabel("Teaching experience :");
		lblNewLabel_1_1_1_1_1_1_2_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1_2_1.setBounds(677, 402, 161, 21);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1);
		
		texp = new JTextField();
		texp.setColumns(10);
		texp.setBounds(842, 401, 88, 20);
		contentPane.add(texp);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1 = new JLabel("Department :");
		lblNewLabel_1_1_1_1_1_1_2_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1_2_1_1.setBounds(677, 434, 101, 21);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1_1);
		
		tdept = new JTextField();
		tdept.setColumns(10);
		tdept.setBounds(783, 434, 208, 20);
		contentPane.add(tdept);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_2 = new JLabel("Educational qualification : ");
		lblNewLabel_1_1_1_1_1_1_2_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1_2_1_2.setBounds(677, 466, 200, 21);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1_2);
		
		tedu = new JTextField();
		tedu.setColumns(10);
		tedu.setBounds(865, 465, 325, 20);
		contentPane.add(tedu);
		
		JLabel lblNewLabel_3 = new JLabel("NOTE : All entered information should be true to your knowlegde. ");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Calibri", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(677, 543, 426, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminlogin frame=new adminlogin();
				frame.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(1158, 632, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton signup = new JButton("Sign Up");
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
//					s1=con.createStatement();
					PreparedStatement p=con.prepareStatement("insert into teachinfo(t_fname,t_mname,t_lname,t_email,t_password,t_prn,teach_web,t_sub,teach_exp,teach_dept,teach_edu,inst_code) values (?,?,?,?,?,?,?,?,?,?,?,?)");
					p.setString(1,tfname.getText());
					p.setString(2,tmname.getText());
					p.setString(3,tlname.getText());
					p.setString(4,temail.getText());
//					p.setString(5,(String) City.getSelectedItem());
//					p.setString(6,(String) State_1.getSelectedItem());
					int pwd=tpass.getText().hashCode();
					p.setLong(5,pwd);
					p.setString(6,tid.getText());
					p.setString(7,tweb.getText());
					p.setString(8,tsub.getText());
					p.setString(9,texp.getText());
					p.setString(10,tdept.getText());
					p.setString(11,tedu.getText());
					p.setString(12,t_inst.getText());
					p.executeUpdate();
					con.close();
					p.close();
					JOptionPane.showMessageDialog(null,"Signed up successfully"); 
					
					}
					catch(Exception e1)
					{
						System.out.println(e1);
						JOptionPane.showMessageDialog(signup, e1);
						tfname.setText("");
						tmname.setText("");
						tlname.setText("");
						temail.setText("");
						tpass.setText("");
						tid.setText("");
						tweb.setText("");
						tsub.setText("");
						texp.setText("");
						tdept.setText("");
						tedu.setText("");
						t_inst.setText("");
					}
			}
		});
		signup.setBounds(892, 588, 113, 33);
		contentPane.add(signup);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_2_1 = new JLabel("Institute code:");
		lblNewLabel_1_1_1_1_1_1_2_1_2_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1_2_1_2_1.setBounds(677, 498, 200, 21);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1_2_1);
		
		t_inst = new JTextField();
		t_inst.setColumns(10);
		t_inst.setBounds(790, 498, 325, 20);
		contentPane.add(t_inst);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/treg.jpeg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 106, 639, 577);
		contentPane.add(lblNewLabel);
	}
}