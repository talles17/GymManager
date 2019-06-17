package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import dao.CredencialDAO;
import dao.FuncionarioDAO;
import java.awt.Font;
import javax.swing.JPanel;
public class Login {

	private JFrame frmGymManagerLogin;
	
	private FuncionarioDAO p = new FuncionarioDAO();
	private static Login login;
	private static MenuProfessor mp;
	private JTextField txtLogin;
	private JPasswordField pwdSenha;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					login = new Login();
					mp = new MenuProfessor();
					login.frmGymManagerLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGymManagerLogin = new JFrame();
		frmGymManagerLogin.setTitle("Gym Manager Login");
		frmGymManagerLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGymManagerLogin.setSize(500,400);
		frmGymManagerLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 482, 364);
		frmGymManagerLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(165, 155, 168, 23);
		panel.add(txtLogin);
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLogin.setColumns(10);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(165, 196, 168, 20);
		panel.add(pwdSenha);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(117, 158, 38, 17);
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(117, 196, 43, 17);
		panel.add(lblSenha);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(195, 259, 111, 23);
		panel.add(btnEntrar);
		
		JLabel lblGymManager = new JLabel("Gym Manager");
		lblGymManager.setBounds(170, 67, 136, 27);
		panel.add(lblGymManager);
		lblGymManager.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CredencialDAO credencial = new CredencialDAO();
				
			if(credencial.loginCheck(txtLogin.getText(),new String (pwdSenha.getPassword()))){
				
				JOptionPane.showMessageDialog(null,"Bem-Vindo");
			
			}else {
			
				JOptionPane.showMessageDialog(null,"Not this Time");
			}
					
				
			}
		});
		
	
	}
	
	
	
	
	private static class __Tmp {
		private static void __tmp() {
			  new javax.swing.JPanel();
		}
	}
}
