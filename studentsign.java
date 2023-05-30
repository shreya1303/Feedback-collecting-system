package feedsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class studentsign extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=1000,-31
	 */
	private final JProgressBar progressBar = new JProgressBar();
	private JTextField Email;
	private JTextField Mname;
	private JTextField Lname;
	private JTextField fname;
	private JTextField PRN;
	private JPasswordField pass;
	private JTextField dept;
	private JTextField year;
	private JTextField sem;
	private JTextField div;
	private JTextField phno;
	private JTextField att;
	private JTextField f_no;
	private JTextField inst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentsign frame = new studentsign();
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
	public studentsign() {
		setTitle("Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1309, 759);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(138, 174, 55));
		contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 11));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(137, 166, 79));
		panel.setBounds(10, 11, 1263, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
		lblNewLabel.setBounds(21, 28, 375, 44);
		panel.add(lblNewLabel);
		
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
		btnNewButton_1.setBounds(945, 28, 89, 35);
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
		btnNewButton_1_1.setBounds(1044, 28, 89, 35);
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
		btnNewButton_1_2.setBounds(1143, 28, 110, 35);
		panel.add(btnNewButton_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(0, 0, 0, 4, (Color) new Color(137, 166, 79)));
		panel_1.setBounds(10, 105, 337, 581);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/studreg.jpeg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(-105, 0, 442, 581);
		panel_1.add(lblNewLabel_1);
		
//		JLabel lblNewLabel_1 = new JLabel("");
//		Image img = new ImageIcon(this.getClass().getResource("/studyi.png")).getImage();
//		lblNewLabel_1.setIcon(new ImageIcon(img));
//		lblNewLabel_1.setBounds(-124, 0, 461, 581);
//		panel_1.add(lblNewLabel_1);
		
	
		
		JLabel lblNewLabel_2 = new JLabel("First Name : ");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2.setBounds(387, 143, 95, 20);
		contentPane.add(lblNewLabel_2);
		
		Email = new JTextField();
		Email.setBounds(569, 227, 239, 20);
		contentPane.add(Email);
		Email.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Middle Name : ");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(672, 143, 110, 20);
		contentPane.add(lblNewLabel_2_1);
		
		Mname = new JTextField();
		Mname.setColumns(10);
		Mname.setBounds(788, 142, 159, 20);
		contentPane.add(Mname);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Last Name : ");
		lblNewLabel_2_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBounds(972, 145, 110, 20);
		contentPane.add(lblNewLabel_2_1_1);
		
		Lname = new JTextField();
		Lname.setColumns(10);
		Lname.setBounds(1067, 142, 159, 20);
		contentPane.add(Lname);
		
		JLabel lblNewLabel_2_2 = new JLabel("Student Email address : ");
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2.setBounds(387, 228, 172, 20);
		contentPane.add(lblNewLabel_2_2);
		
		fname = new JTextField();
		fname.setColumns(10);
		fname.setBounds(483, 142, 159, 20);
		contentPane.add(fname);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Student PRN no. : ");
		lblNewLabel_2_2_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_1.setBounds(387, 187, 131, 20);
		contentPane.add(lblNewLabel_2_2_1);
		
		PRN = new JTextField();
		PRN.setColumns(10);
		PRN.setBounds(529, 186, 159, 20);
		contentPane.add(PRN);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Password : ");
		lblNewLabel_2_2_2.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_2.setBounds(387, 267, 172, 20);
		contentPane.add(lblNewLabel_2_2_2);
		
		pass = new JPasswordField();
		pass.setBounds(483, 266, 172, 20);
		contentPane.add(pass);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Department Name : ");
		lblNewLabel_2_2_3.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_3.setBounds(387, 302, 172, 20);
		contentPane.add(lblNewLabel_2_2_3);
		
		dept = new JTextField();
		dept.setColumns(10);
		dept.setBounds(547, 301, 159, 20);
		contentPane.add(dept);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("Course Year : ");
		lblNewLabel_2_2_3_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_3_1.setBounds(387, 340, 110, 20);
		contentPane.add(lblNewLabel_2_2_3_1);
		
		year = new JTextField();
		year.setColumns(10);
		year.setBounds(495, 339, 159, 20);
		contentPane.add(year);
		
		JLabel lblNewLabel_2_2_3_1_1 = new JLabel("Semester : ");
		lblNewLabel_2_2_3_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_3_1_1.setBounds(387, 376, 79, 20);
		contentPane.add(lblNewLabel_2_2_3_1_1);
		
		sem = new JTextField();
		sem.setColumns(10);
		sem.setBounds(476, 375, 159, 20);
		contentPane.add(sem);
		
		JLabel lblNewLabel_2_2_3_1_1_1 = new JLabel("Division : ");
		lblNewLabel_2_2_3_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_3_1_1_1.setBounds(387, 407, 79, 20);
		contentPane.add(lblNewLabel_2_2_3_1_1_1);
		
		div = new JTextField();
		div.setColumns(10);
		div.setBounds(466, 406, 110, 20);
		contentPane.add(div);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Student Phone no. : ");
		lblNewLabel_2_2_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_1_1.setBounds(387, 438, 152, 20);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		phno = new JTextField();
		phno.setColumns(10);
		phno.setBounds(544, 437, 172, 20);
		contentPane.add(phno);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Student Attendance : ");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_1_1_1.setBounds(387, 469, 172, 20);
		contentPane.add(lblNewLabel_2_2_1_1_1);
		
		att = new JTextField();
		att.setColumns(10);
		att.setBounds(547, 468, 115, 20);
		contentPane.add(att);
		
		JLabel lblNewLabel_3 = new JLabel("NOTE : All entered information should be true to your knowlegde. ");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Calibri", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(396, 603, 426, 14);
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
		btnNewButton.setBounds(1140, 597, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton Signup = new JButton("Sign up");
		Signup.addActionListener(new ActionListener() {
//			private Statement s1;
			
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
//					s1=con.createStatement();
					PreparedStatement p=con.prepareStatement("insert into stuinfo(stu_fname,stu_mname,stu_lname,stu_prn,stu_email,stu_password,stu_dept,stu_year,stu_sem,stu_division,stu_phno,stu_att,s_inst_code) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
					p.setString(1,fname.getText());
					p.setString(2,Mname.getText());
					p.setString(3,Lname.getText());
					p.setString(4,PRN.getText());
//					p.setString(5,(String) City.getSelectedItem());
//					p.setString(6,(String) State_1.getSelectedItem());
					int pswd=pass.getText().hashCode();
					p.setString(5,Email.getText());
					p.setLong(6,pswd);
					p.setString(7,dept.getText());
					p.setString(8,year.getText());
					p.setString(9,sem.getText());
					p.setString(10,div.getText());
					p.setString(11,phno.getText());
					p.setString(12,att.getText());
					p.setString(13,inst.getText());
					p.executeUpdate();
					
//					PreparedStatement ps=con.prepareStatement("insert into answer(prn) values (?)");
//					ps.setString(4,PRN.getText());
//					ps.executeUpdate();
//					ps.close();
					con.close();
					p.close();
					JOptionPane.showMessageDialog(null,"Signed up successfully"); 
					
					}
					catch(Exception e1)
					{
						System.out.println(e1);
						JOptionPane.showMessageDialog(Signup, e1);
						fname.setText("");
						Mname.setText("");
						Lname.setText("");
						PRN.setText("");
						Email.setText("");
						pass.setText("");
						dept.setText("");
						year.setText("");
						sem.setText("");
						div.setText("");
						phno.setText("");
						att.setText("");
					}
			}
		});
		Signup.setBounds(807, 624, 89, 23);
		contentPane.add(Signup);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Sr No:");
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_1_1_1_1.setBounds(387, 500, 61, 20);
		contentPane.add(lblNewLabel_2_2_1_1_1_1);
		
		f_no = new JTextField();
		f_no.setColumns(10);
		f_no.setBounds(444, 499, 115, 20);
		contentPane.add(f_no);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Inst code");
		lblNewLabel_2_2_1_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_2_2_1_1_1_1_1.setBounds(387, 539, 79, 20);
		contentPane.add(lblNewLabel_2_2_1_1_1_1_1);
		
		inst = new JTextField();
		inst.setColumns(10);
		inst.setBounds(461, 538, 115, 20);
		contentPane.add(inst);
	}
}