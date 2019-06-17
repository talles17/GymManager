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
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 614, 512);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton buttonTreinos = new JButton("Visualizar treinos");
		buttonTreinos.setBounds(245, 115, 120, 23);
		panel.add(buttonTreinos);
		
		JButton buttonCriarTreino = new JButton("Criar Treino");
		buttonCriarTreino.setBounds(245, 144, 120, 23);
		panel.add(buttonCriarTreino);
		
		JButton btnAlunos = new JButton("Lista de Alunos");
		btnAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAlunos.setBounds(245, 170, 120, 23);
		panel.add(btnAlunos);
		
		JLabel lblGymManager = new JLabel("Gym Manager");
		lblGymManager.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblGymManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblGymManager.setBounds(247, 37, 165, 27);
		panel.add(lblGymManager);
		
		JButton btnMatricularAluno = new JButton("Matricular Aluno");
		btnMatricularAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TelaAlunoCadastro().setVisible(true);
			}
		});
		btnMatricularAluno.setBounds(245, 197, 120, 23);
		panel.add(btnMatricularAluno);
	}
}
