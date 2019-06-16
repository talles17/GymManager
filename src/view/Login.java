package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import dao.FuncionarioDAO;
import model.Funcionario;
import java.awt.Font;
public class Login {

	private JFrame frame;
	
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
					login.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLogin.setBounds(130, 95, 233, 25);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(130, 141, 233, 25);
		frame.getContentPane().add(pwdSenha);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(80, 95, 47, 25);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(80, 141, 47, 25);
		frame.getContentPane().add(lblSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(194, 177, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JLabel lblGymManager = new JLabel("Gym Manager");
		lblGymManager.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblGymManager.setBounds(167, 26, 147, 36);
		frame.getContentPane().add(lblGymManager);
		
	
	}
	
	
	/*public boolean checkLogin (String usuario, String senha) {
		for(Funcionario prof : p.getProfessores()) {
			if(prof.getLogin().equals(usuario)) {
				if(prof.getSenha().equals(senha)) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}*/
	
	
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
