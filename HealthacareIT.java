import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HealthacareIT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtAge;
	private JTextField txtNumber;
	private JTextField txtEmail;
	private JTextField txtDisease;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthacareIT frame = new HealthacareIT();
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
	public HealthacareIT() {
		setTitle("HealthCare Patient Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(26, 30, 98, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(26, 73, 61, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(26, 129, 61, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(26, 174, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile Number");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(27, 213, 109, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(26, 255, 61, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Disease ");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(26, 301, 74, 13);
		contentPane.add(lblNewLabel_6);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtName.setBounds(185, 28, 124, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtAddress.setBounds(185, 68, 124, 52);
		contentPane.add(txtAddress);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(188, 126, 103, 21);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(293, 126, 103, 21);
		contentPane.add(rdbtnFemale);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtAge.setBounds(185, 172, 124, 19);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		txtNumber = new JTextField();
		txtNumber.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtNumber.setBounds(185, 211, 124, 19);
		contentPane.add(txtNumber);
		txtNumber.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtEmail.setBounds(185, 253, 124, 19);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtDisease = new JTextField();
		txtDisease.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtDisease.setBounds(185, 299, 124, 19);
		contentPane.add(txtDisease);
		txtDisease.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAddress.setText("");
				txtAge.setText("");
				txtEmail.setText("");
				txtNumber.setText("");
				txtDisease.setText("");
				buttonGroup.clearSelection();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(108, 387, 98, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Healthcare", "root","sam1234");
					String query = "insert into PatientRegister values(?,?,?,?,?,?,?)";
					PreparedStatement ps =con.prepareStatement(query);
					ps.setString(1, txtName.getText());
					ps.setString(2, txtAddress.getText());
					if(rdbtnMale.isSelected())
					{
						ps.setString(3, rdbtnMale.getText());
					}else {
						ps.setString(3, rdbtnFemale.getText());
					}
					ps.setInt(4, Integer.parseInt(txtAge.getText()));
					ps.setLong(5, Long.parseLong(txtNumber.getText()));
					ps.setString(6, txtEmail.getText());
					ps.setString(7,  txtDisease.getText());
					int i = ps.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_1, i+"Details Have Been Inserted Successfully");
					ps.close();
					con.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(277, 387, 98, 30);
		contentPane.add(btnNewButton_1);
	}
}
