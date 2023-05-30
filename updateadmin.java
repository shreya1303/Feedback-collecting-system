package feedsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class updateadmin extends JFrame {

	private JPanel contentPane;
	private JTextField instcode;
	private JTextField old;
	private JTextField newpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateadmin frame = new updateadmin();
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
	public updateadmin() {
		setTitle("Update admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1297, 733);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 11));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1266, 107, -1253, -93);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(137, 166, 79));
		panel_1.setBounds(10, 11, 1263, 120);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(132, 157, 72));
		btnNewButton_1.setBounds(945, 44, 89, 35);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("About");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(new Color(132, 157, 72));
		btnNewButton_1_1.setBounds(1044, 44, 89, 35);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Contact");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1_2.setBackground(new Color(132, 157, 72));
		btnNewButton_1_2.setBounds(1143, 44, 110, 35);
		panel_1.add(btnNewButton_1_2);
		
		JLabel lblUpdateAdminProfile = new JLabel("UPDATE ADMIN PROFILE");
		lblUpdateAdminProfile.setForeground(Color.WHITE);
		lblUpdateAdminProfile.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
		lblUpdateAdminProfile.setBounds(20, 35, 375, 44);
		panel_1.add(lblUpdateAdminProfile);
//		
//		JLabel lblNewLabel = new JLabel("");
//		Image img = new ImageIcon(this.getClass().getResource("/ad.png")).getImage();
//		lblNewLabel.setIcon(new ImageIcon(img));
//		lblNewLabel.setBounds(52, 159, 135, 134);
//		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Institute code  :");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1.setBounds(237, 189, 158, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter old password :");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(237, 221, 158, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter new password :");
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(237, 253, 187, 21);
		contentPane.add(lblNewLabel_1_2);
		
		instcode = new JTextField();
		instcode.setBounds(405, 188, 253, 20);
		contentPane.add(instcode);
		instcode.setColumns(10);
		
		old = new JTextField();
		old.setColumns(10);
		old.setBounds(394, 220, 253, 20);
		contentPane.add(old);
		
		newpass = new JTextField();
		newpass.setColumns(10);
		newpass.setBounds(405, 252, 253, 20);
		contentPane.add(newpass);
		
		JButton done = new JButton("Done");
		done.addActionListener(new ActionListener() {
			private Statement smt;

			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
					smt=con.createStatement();
					PreparedStatement p=con.prepareStatement("update admininfo set admin_password=? where admin_password=? and inst_code=?");
					p.setString(1,newpass.getText());
					p.setString(2,old.getText());
					p.setString(3,instcode.getText());
					p.executeUpdate();
					JOptionPane.showMessageDialog(null,"Updated successfully");
					instcode.setText("");
				}
					catch(Exception e3)
					{
						System.out.println(e3);
						JOptionPane.showMessageDialog(done, e3);
						instcode.setText("");
					}
			}
		});
		done.setForeground(new Color(255, 255, 255));
		done.setBackground(new Color(255, 0, 0));
		done.setFont(new Font("Calibri", Font.BOLD, 17));
		done.setBounds(275, 332, 120, 31);
		contentPane.add(done);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(1158, 601, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}