package feedsystem;

import javax.swing.*;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class adminlogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlogin frame = new adminlogin();
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
	public adminlogin() {
		setTitle("Admin ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1297, 877);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(138, 174, 55), 11));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton tglbtnNewToggleButton = new JButton("REGISTER/UPDATE TEACHER PROFILE");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teachsign frame=new teachsign();
				frame.setVisible(true);
			}
		});
		tglbtnNewToggleButton.setForeground(new Color(255, 255, 255));
		tglbtnNewToggleButton.setBackground(new Color(0, 0, 0));
		tglbtnNewToggleButton.setFont(new Font("Calibri", Font.BOLD, 15));
		tglbtnNewToggleButton.setBounds(48, 283, 347, 59);
		contentPane.add(tglbtnNewToggleButton);
		
		JButton tglbtnRegisterupdateStudentProfile = new JButton("REGISTER/UPDATE STU PROFILE");
		tglbtnRegisterupdateStudentProfile.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				studentsign frame=new studentsign();
				frame.setVisible(true);
			}
		});
		tglbtnRegisterupdateStudentProfile.setForeground(new Color(255, 255, 255));
		tglbtnRegisterupdateStudentProfile.setFont(new Font("Calibri", Font.BOLD, 15));
		tglbtnRegisterupdateStudentProfile.setBackground(new Color(0, 0, 0));
		tglbtnRegisterupdateStudentProfile.setBounds(48, 410, 347, 59);
		contentPane.add(tglbtnRegisterupdateStudentProfile);
		
		JButton tglbtnRegisterupdateAdminProfile = new JButton("UPDATE ADMIN PROFILE");
		tglbtnRegisterupdateAdminProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateadmin frame=new updateadmin();
				frame.setVisible(true);
			}
		});
		tglbtnRegisterupdateAdminProfile.setForeground(new Color(255, 255, 255));
		tglbtnRegisterupdateAdminProfile.setFont(new Font("Calibri", Font.BOLD, 15));
		tglbtnRegisterupdateAdminProfile.setBackground(new Color(0, 0, 0));
		tglbtnRegisterupdateAdminProfile.setBounds(460, 144, 347, 59);
		contentPane.add(tglbtnRegisterupdateAdminProfile);
		
		JButton tglbtnViewStatistics = new JButton("VIEW STATISTICS OF FEEDBACKS");
		tglbtnViewStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminview frame=new adminview();
				frame.setVisible(true);
			}
		});
		tglbtnViewStatistics.setForeground(new Color(255, 255, 255));
		tglbtnViewStatistics.setFont(new Font("Calibri", Font.BOLD, 15));
		tglbtnViewStatistics.setBackground(new Color(0, 0, 0));
		tglbtnViewStatistics.setBounds(460, 544, 347, 59);
		contentPane.add(tglbtnViewStatistics);
		
		JButton tglbtnGenerateFeedbackForm = new JButton("GENERATE FEEDBACK FORM");
		tglbtnGenerateFeedbackForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feedbackform frame=new feedbackform();
				frame.setVisible(true);
			}
		});
		tglbtnGenerateFeedbackForm.setForeground(new Color(255, 255, 255));
		tglbtnGenerateFeedbackForm.setFont(new Font("Calibri", Font.BOLD, 15));
		tglbtnGenerateFeedbackForm.setBackground(new Color(0, 0, 0));
		tglbtnGenerateFeedbackForm.setBounds(855, 263, 347, 59);
		contentPane.add(tglbtnGenerateFeedbackForm);
		
		JButton tglbtnUpdateCourses = new JButton("ADD/UPDATE COURSES");
		tglbtnUpdateCourses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewcourse frame=new viewcourse();
				frame.setVisible(true);
			}
		});
		tglbtnUpdateCourses.setForeground(new Color(255, 255, 255));
		tglbtnUpdateCourses.setFont(new Font("Calibri", Font.BOLD, 15));
		tglbtnUpdateCourses.setBackground(new Color(0, 0, 0));
		tglbtnUpdateCourses.setBounds(855, 382, 347, 59);
		contentPane.add(tglbtnUpdateCourses);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(137, 166, 79));
		panel.setBounds(10, 11, 1263, 102);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN PAGE");
		lblNewLabel.setBounds(29, 24, 206, 52);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(132, 155, 77));
		lblNewLabel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 40));
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginform frame=new loginform();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(132, 157, 72));
		btnNewButton_1.setBounds(945, 30, 89, 35);
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
		btnNewButton_1_1.setBounds(1044, 30, 89, 35);
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
		btnNewButton_1_2.setBounds(1143, 30, 110, 35);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(48, 604, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/adminlog.jpeg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(449, 229, 365, 304);
		contentPane.add(lblNewLabel_1);
		
//		JLabel lblNewLabel_1 = new JLabel("");
//		Image img = new ImageIcon(this.getClass().getResource("/admin.png")).getImage();
//		lblNewLabel_1.setIcon(new ImageIcon(img));
//		lblNewLabel_1.setBounds(465, 226, 360, 297);
//		contentPane.add(lblNewLabel_1);
	
	}
}