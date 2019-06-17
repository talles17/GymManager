package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MenuProfessor {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuProfessor window = new MenuProfessor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuProfessor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 630, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,400);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 614, 512);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton buttonTreinos = new JButton("Visualizar treinos");
		buttonTreinos.setBounds(224, 136, 186, 23);
		panel.add(buttonTreinos);
		
		JButton btnAlunos = new JButton("Lista de Alunos");
		btnAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ListaDeAlunos().frame.setVisible(true);
				frame.dispose();
			}
		});
		btnAlunos.setBounds(224, 163, 186, 23);
		panel.add(btnAlunos);
		
		JLabel lblGymManager = new JLabel("Gym Manager");
		lblGymManager.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblGymManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblGymManager.setBounds(220, 46, 165, 27);
		panel.add(lblGymManager);
		
		JButton btnMatricularAluno = new JButton("Matricular Aluno");
		btnMatricularAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TelaAlunoCadastro().setVisible(true);
				frame.dispose();
			}
		});
		btnMatricularAluno.setBounds(224, 192, 186, 23);
		panel.add(btnMatricularAluno);
	}
}
