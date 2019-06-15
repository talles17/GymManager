package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

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
		frame.setBounds(100, 100, 450, 106);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 74);
		frame.getContentPane().add(panel);
		
		JButton buttonFrequencia = new JButton("Frequencia");
		buttonFrequencia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(buttonFrequencia);
		
		JButton buttonTreinos = new JButton("Treinos");
		panel.add(buttonTreinos);
		
		JButton buttonCriarTreino = new JButton("Criar Treino");
		panel.add(buttonCriarTreino);
		
		JButton buttonCriarExercicio = new JButton("Cria exerc\u00EDcio");
		panel.add(buttonCriarExercicio);
	}
}
