package feedsystem;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class adminview extends JFrame {

	private JPanel contentPane;
	private Statement s1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminview frame = new adminview();
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
	public adminview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1273, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1303");
			s1=con.createStatement();
			String query=("select prn,a1,a2,a3,a4,a5 from answer");
			ResultSet rs=s1.executeQuery(query);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(143, 231, 941, 259);
			contentPane.add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			table.setModel(DbUtils.resultSetToTableModel(rs));
//			int i=0;
//			while(rs.next())
//			{
//				table.setValueAt(rs.getString("stu_prn"), i, 0);
//				table.setValueAt(rs.getString("q1"), i, 1);
//				table.setValueAt(rs.getString("q2"), i, 2);
//				table.setValueAt(rs.getString("q3"), i, 3);
//				table.setValueAt(rs.getString("q4"), i, 4);
//				table.setValueAt(rs.getString("q5"), i, 5);
//				i++;
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
