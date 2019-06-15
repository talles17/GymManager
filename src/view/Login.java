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
public class Login {

	private JFrame frame;
	private JTextField usuario;
	private JPasswordField senha;
	
	private FuncionarioDAO p = new FuncionarioDAO();
	private static Login login;
	private static MenuProfessor mp;
	
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
		frame.setBounds(100, 100, 450, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		usuario = new JTextField();
		usuario.setToolTipText("");
		usuario.setBounds(123, 168, 202, 20);
		frame.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		senha = new JPasswordField();
		senha.setBounds(123, 230, 202, 20);
		frame.getContentPane().add(senha);
		
		JButton buttonEntrar = new JButton("Entrar");
		buttonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(checkLogin(usuario.getText(), new String(senha.getPassword()))) {
					login.frame.setVisible(false);
					mp.frame.setVisible(true);
				//}
			}
		});
		buttonEntrar.setBounds(182, 298, 89, 23);
		frame.getContentPane().add(buttonEntrar);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(123, 134, 69, 20);
		frame.getContentPane().add(lblUsurio);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setBounds(125, 199, 67, 20);
		frame.getContentPane().add(lblNewLabel);
		
	
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
