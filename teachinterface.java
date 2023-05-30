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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class teachinterface extends JFrame {

	private JPanel contentPane;
	private Statement smt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					teachinterface frame = new teachinterface();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public teachinterface(String tid) {
		setTitle("Teacher Interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1297, 729);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 11));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(137, 166, 79));
		panel.setBounds(10, 11, 1263, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTeacherInterface = new JLabel("TEACHER PROFILE");
		lblTeacherInterface.setForeground(Color.WHITE);
		lblTeacherInterface.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
		lblTeacherInterface.setBounds(28, 34, 375, 44);
		panel.add(lblTeacherInterface);
		
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
		btnNewButton_1.setBounds(947, 43, 89, 35);
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
		btnNewButton_1_1.setBounds(1044, 43, 89, 35);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Contact");
		btnNewButton_1_2.setBounds(1143, 43, 110, 35);
		panel.add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Contact us on phone at: 401234 or on email at: reviewins@gmail.com");
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1_2.setBackground(new Color(132, 157, 72));
		
//		JLabel lblNewLabel = new JLabel("");
//		Image img = new ImageIcon(this.getClass().getResource("/techer2.png")).getImage();
//		lblNewLabel.setIcon(new ImageIcon(img));
//		lblNewLabel.setBounds(69, 160, 135, 147);
//		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name : ");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1.setBounds(263, 165, 106, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email address : ");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(263, 197, 135, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Teacher ID : ");
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(263, 229, 106, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Teacher's personal website : ");
		lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_3.setBounds(263, 261, 207, 21);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Subject taught : ");
		lblNewLabel_1_4.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_4.setBounds(263, 293, 142, 21);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Teaching experience : ");
		lblNewLabel_1_5.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_5.setBounds(263, 325, 159, 21);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Department : ");
		lblNewLabel_1_6.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_6.setBounds(263, 357, 106, 21);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Educational qualification : ");
		lblNewLabel_1_7.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_7.setBounds(263, 389, 207, 21);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel f_name = new JLabel("");
		f_name.setFont(new Font("Calibri", Font.PLAIN, 17));
		f_name.setBounds(325, 165, 145, 21);
		contentPane.add(f_name);
		
		JLabel m_name = new JLabel("");
		m_name.setFont(new Font("Calibri", Font.PLAIN, 17));
		m_name.setBounds(481, 164, 145, 21);
		contentPane.add(m_name);
		
		JLabel l_name = new JLabel("");
		l_name.setFont(new Font("Calibri", Font.PLAIN, 17));
		l_name.setBounds(636, 164, 145, 21);
		contentPane.add(l_name);
		
		JLabel email = new JLabel("");
		email.setFont(new Font("Calibri", Font.PLAIN, 17));
		email.setBounds(383, 196, 308, 22);
		contentPane.add(email);
		
		JLabel teach_id = new JLabel("");
		teach_id.setFont(new Font("Calibri", Font.PLAIN, 17));
		teach_id.setBounds(356, 231, 250, 19);
		contentPane.add(teach_id);
		
		JLabel web = new JLabel("");
		web.setFont(new Font("Calibri", Font.PLAIN, 17));
		web.setBounds(480, 264, 323, 21);
		contentPane.add(web);
		
		JLabel sub = new JLabel("");
		sub.setFont(new Font("Calibri", Font.PLAIN, 17));
		sub.setBounds(383, 293, 250, 21);
		contentPane.add(sub);
		
		JLabel exp = new JLabel("");
		exp.setFont(new Font("Calibri", Font.PLAIN, 17));
		exp.setBounds(432, 327, 221, 19);
		contentPane.add(exp);
		
		JLabel dept = new JLabel("");
		dept.setFont(new Font("Calibri", Font.PLAIN, 17));
		dept.setBounds(373, 359, 280, 19);
		contentPane.add(dept);
		
		JLabel edu = new JLabel("");
		edu.setFont(new Font("Calibri", Font.PLAIN, 17));
		edu.setBounds(461, 391, 323, 21);
		contentPane.add(edu);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
			smt=con.createStatement();
			String query = ("select * from teachinfo where t_prn='"+tid+"'");
			ResultSet rs=smt.executeQuery(query);
			if(rs.next()){
//				lblNewLabel.setText(rs.getString(""));
				f_name.setText(rs.getString("t_fname"));
				m_name.setText(rs.getString("t_mname"));
				l_name.setText(rs.getString("t_lname"));
				email.setText(rs.getString("t_email"));
				teach_id.setText(rs.getString("t_prn"));
				web.setText(rs.getString("teach_web"));
				sub.setText(rs.getString("t_sub"));
				exp.setText(rs.getString("teach_exp"));
				dept.setText(rs.getString("teach_dept"));
				edu.setText(rs.getString("teach_edu"));
				
//			setVisible(false);
//			adminlogin frame=new adminlogin();
//			frame.setVisible(true);
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Invalid username or password");
			}
			}
			catch(Exception e1)
			{
				System.out.println(e1);
				JOptionPane.showMessageDialog(null, e1);
			}
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(1148, 598, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/tprofile.jpeg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(72, 156, 142, 158);
		contentPane.add(lblNewLabel);
	}
}