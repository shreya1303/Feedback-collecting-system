package feedsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class viewcourse extends JFrame {

	private JPanel contentPane;
	private JTextField cn;
	private JTextField cid;
	private JTextField ct;
	private JTextField csem;
	private JTextField old;
	private JTextField news;
	private JTextField cc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewcourse frame = new viewcourse();
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
	public viewcourse() {
		setTitle("Course");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1299, 729);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 11));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(137, 166, 79));
		panel.setBounds(10, 11, 1263, 117);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCourseAddupdation = new JLabel("COURSE ADD/UPDATION");
		lblCourseAddupdation.setForeground(Color.WHITE);
		lblCourseAddupdation.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
		lblCourseAddupdation.setBounds(20, 36, 405, 46);
		panel.add(lblCourseAddupdation);
		
		JButton btnNewButton_1_2 = new JButton("Home");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1_2.setBackground(new Color(137, 166, 79));
		btnNewButton_1_2.setBounds(910, 36, 89, 35);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("About");
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1_1_1.setBackground(new Color(132, 157, 72));
		btnNewButton_1_1_1.setBounds(1020, 36, 89, 35);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Contact");
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1_2_1.setBackground(new Color(132, 157, 72));
		btnNewButton_1_2_1.setBounds(1130, 36, 108, 35);
		panel.add(btnNewButton_1_2_1);
		
		JButton btnNewButton = new JButton("View Courses");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(137, 166, 79));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coursetable frame=new coursetable();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton.setBounds(678, 526, 186, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("To view course list click here =>");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(433, 535, 224, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(152, 189, 481, 246);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ADD COURSE");
		lblNewLabel_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		lblNewLabel_1.setBounds(133, 11, 224, 47);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Course name : ");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 86, 136, 21);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Course ID : ");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(10, 118, 103, 21);
		panel_1.add(lblNewLabel_2_1);
		
		cn = new JTextField();
		cn.setBounds(146, 85, 237, 20);
		panel_1.add(cn);
		cn.setColumns(10);
		
		cid = new JTextField();
		cid.setColumns(10);
		cid.setBounds(113, 117, 224, 20);
		panel_1.add(cid);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Course Type : ");
		lblNewLabel_2_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(10, 150, 189, 21);
		panel_1.add(lblNewLabel_2_1_1);
		
		ct = new JTextField();
		ct.setColumns(10);
		ct.setBounds(133, 149, 224, 20);
		panel_1.add(ct);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Course Semester : ");
		lblNewLabel_2_1_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(10, 180, 189, 21);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		csem = new JTextField();
		csem.setColumns(10);
		csem.setBounds(173, 179, 237, 20);
		panel_1.add(csem);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
					// s1=con.createStatement();
					PreparedStatement p=con.prepareStatement("insert into subinfo(sub_name,sub_code,sub_type,sub_sem) values (?,?,?,?)");
					p.setString(1,cn.getText());
					p.setString(2,cid.getText());
					p.setString(3,ct.getText());
					p.setString(4,csem.getText());
					p.executeUpdate();
					con.close();
					p.close();
					cn.setText("");
					cid.setText("");
					ct.setText("");
					csem.setText("");
					JOptionPane.showMessageDialog(null,"Added successfully");

					}
					catch(Exception e1)
					{
					System.out.println(e1);
					JOptionPane.showMessageDialog(submit, e1);
					// textField.setText("");
					// passwordField.setText("");
					}
			}
		});
		submit.setForeground(new Color(255, 255, 255));
		submit.setBackground(new Color(255, 0, 0));
		submit.setBounds(183, 212, 89, 23);
		panel_1.add(submit);
//		Image img4 = new ImageIcon(this.getClass().getResource("/coursee.jpg")).getImage();
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1_1.setBounds(656, 189, 481, 246);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("UPDATE COURSE");
		lblNewLabel_1_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(105, 11, 285, 47);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New course name:");
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(10, 101, 164, 21);
		panel_1_1.add(lblNewLabel_2_2);
		
		old = new JTextField();
		old.setColumns(10);
		old.setBounds(182, 100, 237, 20);
		panel_1_1.add(old);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("New course sem:");
		lblNewLabel_2_1_1_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2_1_1_2.setBounds(10, 133, 189, 21);
		panel_1_1.add(lblNewLabel_2_1_1_2);
		
		news = new JTextField();
		news.setColumns(10);
		news.setBounds(182, 131, 224, 20);
		panel_1_1.add(news);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Course code:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(10, 165, 189, 21);
		panel_1_1.add(lblNewLabel_2_1_1_1_1);
		
		cc = new JTextField();
		cc.setColumns(10);
		cc.setBounds(171, 164, 224, 20);
		panel_1_1.add(cc);
		
		JButton sub = new JButton("SUBMIT");
		sub.addActionListener(new ActionListener() {
			private Statement smt;

			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
					smt=con.createStatement();
					PreparedStatement p=con.prepareStatement("update subinfo set sub_name=?,sub_sem=? where sub_code=?");
					p.setString(1,old.getText());
					p.setString(2,news.getText());
					p.setString(3,cc.getText());
					p.executeUpdate();
					JOptionPane.showMessageDialog(null,"Updated successfully");
					cc.setText("");
				}
					catch(Exception e3)
					{
						System.out.println(e3);
						JOptionPane.showMessageDialog(sub, e3);
						cc.setText("");
					}
			}
		});
		sub.setForeground(Color.WHITE);
		sub.setBackground(Color.RED);
		sub.setBounds(182, 212, 89, 23);
		panel_1_1.add(sub);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(1150, 596, 89, 23);
		contentPane.add(btnNewButton_2);
		
//		JLabel lblNewLabel_3 = new JLabel("");
//		Image img = new ImageIcon(this.getClass().getResource("/c.png")).getImage();
//		lblNewLabel_3.setIcon(new ImageIcon(img));
//		lblNewLabel_3.setBounds(266, 474, 136, 145);
//		contentPane.add(lblNewLabel_3);
//		
//		JLabel lblNewLabel_3_1 = new JLabel("");
//		Image img1 = new ImageIcon(this.getClass().getResource("/c.png")).getImage();
//		lblNewLabel_3_1.setIcon(new ImageIcon(img1));
//		lblNewLabel_3_1.setBounds(907, 463, 136, 145);
//		contentPane.add(lblNewLabel_3_1);
//		
	
	}
}