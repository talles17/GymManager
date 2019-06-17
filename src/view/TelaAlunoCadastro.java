package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.AlunoDAO;
import model.Aluno;
import util.Util;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Label;

public class TelaAlunoCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField textSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlunoCadastro frame = new TelaAlunoCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TelaAlunoCadastro() {
		initialize();
	}
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setTitle("Gym Manager");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(111, 90, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSobrenome.setBounds(70, 132, 87, 14);
		contentPane.add(lblSobrenome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCpf.setBounds(70, 167, 87, 14);
		contentPane.add(lblCpf);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setBounds(166, 87, 360, 25);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textSobrenome.setColumns(10);
		textSobrenome.setBounds(166, 129, 360, 25);
		contentPane.add(textSobrenome);
		
		JFormattedTextField frmtdtxtfldCpf = new JFormattedTextField(Util.Mascara("###.###.###-##"));
		frmtdtxtfldCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmtdtxtfldCpf.setBounds(167, 164, 100, 25);
		contentPane.add(frmtdtxtfldCpf);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataDeNascimento.setBounds(256, 167, 160, 14);
		contentPane.add(lblDataDeNascimento);
		
		JFormattedTextField formattedTextFieldData = new JFormattedTextField(Util.Mascara("##/##/####"));
		formattedTextFieldData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formattedTextFieldData.setBounds(426, 162, 100, 25);
		contentPane.add(formattedTextFieldData);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSexo.setBounds(166, 203, 87, 14);
		contentPane.add(lblSexo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 429, 555, -116);
		contentPane.add(separator);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(327, 480, 96, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblCadastarAluno = new JLabel("CADASTAR ALUNO");
		lblCadastarAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCadastarAluno.setBounds(236, 11, 187, 37);
		contentPane.add(lblCadastarAluno);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino",true);
		rdbtnMasculino.setBounds(256, 200, 87, 23);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino", false);
		rdbtnFeminino.setBounds(339, 200, 107, 23);
		contentPane.add(rdbtnFeminino);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnMasculino);
		grupo.add(rdbtnFeminino);
		
		JTextArea txtrAnamnese = new JTextArea();
		txtrAnamnese.setBounds(166, 265, 360, 96);
		contentPane.add(txtrAnamnese);
		
		JLabel lblAnamnese = new JLabel("Anamnese");
		lblAnamnese.setBounds(166, 245, 87, 16);
		contentPane.add(lblAnamnese);
		
		JTextArea txtrObjetivo = new JTextArea();
		txtrObjetivo.setBounds(166, 393, 365, 75);
		contentPane.add(txtrObjetivo);
		
		Label label = new Label("Objetivo");
		label.setBounds(166, 372, 69, 23);
		contentPane.add(label);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Aluno aluno = new Aluno();
				aluno.setMatricula(Util.geradorDeMatricula());
				aluno.setCpf(Util.removeMascaraCpf(frmtdtxtfldCpf.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setSobrenome(textSobrenome.getText());
				if(rdbtnMasculino.isSelected()) {
					aluno.setSexo("M");
				}else{
					aluno.setSexo("F");
				}
				aluno.setData_nascimento(Util.trataData(formattedTextFieldData.getText()));
				aluno.setStatus_matricula(true);
				aluno.setAnamnese(txtrAnamnese.getText());
				aluno.setObjetivo(txtrObjetivo.getText());
				
				AlunoDAO alunoDao = new AlunoDAO();
				
				alunoDao.cadastrarAluno(aluno);
				
				frmtdtxtfldCpf.setText("");
				txtNome.setText("");
				textSobrenome.setText("");
				formattedTextFieldData.setText("");
				txtrAnamnese.setText("");
				txtrObjetivo.setText("");
				
				
			}
		});
		btnCadastrar.setBounds(201, 480, 107, 23);
		contentPane.add(btnCadastrar);
		
		
		
	}
}
