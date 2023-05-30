package feedsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class stuinterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel stuInfo;
	private Statement smt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					stuinterface frame = new stuinterface();
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
	public stuinterface(String prn) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Desktop\\stui.jpg"));
		setTitle("Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1299, 729);
		stuInfo = new JPanel();
		stuInfo.setBorder(new LineBorder(new Color(138, 174, 55), 11));

		setContentPane(stuInfo);
		stuInfo.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(137, 166, 79));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(10, 10, 1265, 117);
		stuInfo.add(panel);
		panel.setLayout(null);
		
		JLabel lblstu = new JLabel("Student Interface");
		lblstu.setForeground(new Color(255, 255, 255));
		lblstu.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
		lblstu.setBounds(24, 20, 288, 54);
		panel.add(lblstu);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginform frame=new loginform();
				frame.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(137, 166, 79));
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton.setBounds(935, 39, 89, 35);
		panel.add(btnNewButton);
		
		JButton btnAboutUs = new JButton("About");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"We are REVIEWINS, a feedback collecting system which makes giving feedback a very easy process.");
				
			}
		});
		btnAboutUs.setForeground(new Color(255, 255, 255));
		btnAboutUs.setFont(new Font("Calibri", Font.BOLD, 17));
		btnAboutUs.setBackground(new Color(137, 166, 79));
		btnAboutUs.setBounds(1034, 39, 89, 35);
		panel.add(btnAboutUs);
		
		JButton btnContact = new JButton("Contact");
		btnContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Contact us on phone at: 401234 or on email at: reviewins@gmail.com");
			}
		});
		btnContact.setForeground(new Color(255, 255, 255));
		btnContact.setFont(new Font("Calibri", Font.BOLD, 17));
		btnContact.setBackground(new Color(137, 166, 79));
		btnContact.setBounds(1134, 39, 89, 35);
		panel.add(btnContact);
		

JLabel lblNewLabel_1 = new JLabel("Name:");
lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 17));
lblNewLabel_1.setForeground(new Color(0, 0, 0));
lblNewLabel_1.setBounds(239, 174, 113, 26);
stuInfo.add(lblNewLabel_1);

JLabel lblNewLabel_1_1 = new JLabel("PRN NO:");
lblNewLabel_1_1.setForeground(Color.BLACK);
lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
lblNewLabel_1_1.setBounds(239, 207, 113, 26);
stuInfo.add(lblNewLabel_1_1);

JLabel lblNewLabel_1_2 = new JLabel("Email address:");
lblNewLabel_1_2.setForeground(Color.BLACK);
lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
lblNewLabel_1_2.setBounds(239, 233, 113, 26);
stuInfo.add(lblNewLabel_1_2);

JLabel lblNewLabel_1_3 = new JLabel("Department:");
lblNewLabel_1_3.setForeground(Color.BLACK);
lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 17));
lblNewLabel_1_3.setBounds(239, 261, 113, 26);
stuInfo.add(lblNewLabel_1_3);

JLabel fname = new JLabel("");
fname.setForeground(Color.BLACK);
fname.setFont(new Font("Calibri", Font.BOLD, 17));
fname.setBounds(363, 174, 153, 26);
stuInfo.add(fname);

JLabel mname = new JLabel("");
mname.setForeground(Color.BLACK);
mname.setFont(new Font("Calibri", Font.BOLD, 17));
mname.setBounds(526, 174, 145, 26);
stuInfo.add(mname);

JLabel lname = new JLabel("");
lname.setForeground(Color.BLACK);
lname.setFont(new Font("Calibri", Font.BOLD, 17));
lname.setBounds(691, 174, 153, 26);
stuInfo.add(lname);

JLabel prnno = new JLabel("");
prnno.setForeground(Color.BLACK);
prnno.setFont(new Font("Calibri", Font.BOLD, 17));
prnno.setBounds(362, 207, 113, 26);
stuInfo.add(prnno);

JLabel email = new JLabel("");
email.setForeground(Color.BLACK);
email.setFont(new Font("Calibri", Font.BOLD, 17));
email.setBounds(362, 233, 154, 26);
stuInfo.add(email);

JLabel deptname = new JLabel("");
deptname.setForeground(Color.BLACK);
deptname.setFont(new Font("Calibri", Font.BOLD, 17));
deptname.setBounds(362, 261, 145, 26);
stuInfo.add(deptname);

JLabel lblNewLabel_1_2_1 = new JLabel("Course year:");
lblNewLabel_1_2_1.setForeground(Color.BLACK);
lblNewLabel_1_2_1.setFont(new Font("Calibri", Font.BOLD, 17));
lblNewLabel_1_2_1.setBounds(239, 287, 113, 26);
stuInfo.add(lblNewLabel_1_2_1);

JLabel crsyr = new JLabel("");
crsyr.setForeground(Color.BLACK);
crsyr.setFont(new Font("Calibri", Font.BOLD, 17));
crsyr.setBounds(363, 287, 153, 26);
stuInfo.add(crsyr);

JLabel lblNewLabel_1_2_2 = new JLabel("Semester:");
lblNewLabel_1_2_2.setForeground(Color.BLACK);
lblNewLabel_1_2_2.setFont(new Font("Calibri", Font.BOLD, 17));
lblNewLabel_1_2_2.setBounds(519, 287, 90, 26);
stuInfo.add(lblNewLabel_1_2_2);

JLabel sem = new JLabel("");
sem.setForeground(Color.BLACK);
sem.setFont(new Font("Calibri", Font.BOLD, 17));
sem.setBounds(619, 287, 113, 26);
stuInfo.add(sem);

JLabel lblNewLabel_1_2_3 = new JLabel("Division:");
lblNewLabel_1_2_3.setForeground(Color.BLACK);
lblNewLabel_1_2_3.setFont(new Font("Calibri", Font.BOLD, 17));
lblNewLabel_1_2_3.setBounds(776, 287, 113, 26);
stuInfo.add(lblNewLabel_1_2_3);

JLabel div = new JLabel("");
div.setForeground(Color.BLACK);
div.setFont(new Font("Calibri", Font.BOLD, 17));
div.setBounds(872, 287, 113, 26);
stuInfo.add(div);

JLabel lblNewLabel_1_2_4 = new JLabel("Phone No:");
lblNewLabel_1_2_4.setForeground(Color.BLACK);
lblNewLabel_1_2_4.setFont(new Font("Calibri", Font.BOLD, 17));
lblNewLabel_1_2_4.setBounds(239, 312, 113, 26);
stuInfo.add(lblNewLabel_1_2_4);

JLabel phno = new JLabel("");
phno.setForeground(Color.BLACK);
phno.setFont(new Font("Calibri", Font.BOLD, 17));
phno.setBounds(363, 312, 113, 26);
stuInfo.add(phno);

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
			smt=con.createStatement();
			String query = ("select * from stuinfo where stu_prn='"+prn+"'");
			ResultSet rs=smt.executeQuery(query);
			if(rs.next()){
//				lblNewLabel.setText(rs.getString(""));
				fname.setText(rs.getString("stu_fname"));
				mname.setText(rs.getString("stu_mname"));
				lname.setText(rs.getString("stu_lname"));
				prnno.setText(rs.getString("stu_prn"));
				email.setText(rs.getString("stu_email"));
				deptname.setText(rs.getString("stu_dept"));
				crsyr.setText(rs.getString("stu_year"));
				sem.setText(rs.getString("stu_sem"));
				div.setText(rs.getString("stu_division"));
				phno.setText(rs.getString("stu_phno"));
				
				
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
		
		JButton btnNewButton_1 = new JButton("Give Feedback");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
					smt=con.createStatement();
					String q=("Select stu_att from stuinfo where stu_prn='"+prn+"'");
					ResultSet rs=smt.executeQuery(q);
//					rs.next();
					int att;
					if(rs.next()) {
						att=rs.getInt("stu_att");
						if(att<75)
						{
							JOptionPane.showMessageDialog(null,"you are not elligible");
						}
						else
						{
							givefeed frame=new givefeed(prn);
							frame.setVisible(true);
						}
					}
//					int att=0;
//						att=rs.getInt("stu_att");
//					if(att<75)
//					{
//						JOptionPane.showMessageDialog(null,"you are not elligible");
//					}
//					else
//					{
//						givefeed frame=new givefeed(prn);
//						frame.setVisible(true);
//					}
				}
					catch(Exception e2)
					{
						System.out.println(e2);
					
//				String q=("Select stu_att from stuinfo");
//				ResultSet rs=smt.executeQuery(q);
//				int att=0;
//				while(rs.next())
//				{
//					att=rs.getInt("Stu_att");
//				}
//				if(att<75)
//				{
//					JOptionPane.showMessageDialog(null,"you ar not elligible");
//				}
			}
		}});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(515, 546, 217, 47);
		stuInfo.add(btnNewButton_1);
		
		
	}
}