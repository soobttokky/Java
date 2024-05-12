import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class teste {

	private JFrame frmLogin;
	private JTextField txtUser;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste window = new teste();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			}
		});
		btnExit.setBounds(335, 227, 89, 23);
		frmLogin.getContentPane().add(btnExit);
		
		JButton btnLogIn = new JButton("Sign In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUser.getText();
				String password = txtPassword.getText();
				tela.main(null);
			}
		});
		btnLogIn.setBounds(10, 227, 89, 23);
		frmLogin.getContentPane().add(btnLogIn);
		
		txtUser = new JTextField();
		txtUser.setBounds(101, 96, 229, 20);
		frmLogin.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(101, 156, 229, 20);
		frmLogin.getContentPane().add(txtPassword);
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setBounds(101, 71, 46, 14);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(101, 131, 78, 14);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		JButton btnClear = new JButton("Clean");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUser.setText(null);
				txtPassword.setText(null);
			}
		});
		btnClear.setBounds(174, 227, 89, 23);
		frmLogin.getContentPane().add(btnClear);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(121, 254, 1));
		panel.setBounds(101, 11, 229, 55);
		frmLogin.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("LOG IN");
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 45));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
	}
}
