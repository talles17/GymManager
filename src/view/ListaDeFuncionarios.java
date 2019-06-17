package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import dao.FuncionarioDAO;
import model.Funcionario;
import model.ModeloTabela;

public class ListaDeFuncionarios  {
	
	JFrame frame;


	private JPanel contentPane;
	private JTable table;

	
	public void preencherTabela() {
		
		ArrayList<Object> dados = new ArrayList<>();
		String [] linhas = new String[] {"Matrícula","Nome","Sobrenome"};
		FuncionarioDAO funcionarioDao = new FuncionarioDAO();
		
		try {
			for (Funcionario funcionario : funcionarioDao.getAllFuncionario()) {
				
				dados.add(new Object[]{funcionario.getMatricula(),funcionario.getNome(),funcionario.getSobrenome()});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ModeloTabela modelo = new ModeloTabela(dados, linhas);
		
		table.setModel(modelo);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(140);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDeFuncionarios window = new ListaDeFuncionarios();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ListaDeFuncionarios() {
		initialize();
		preencherTabela();
	}
	
	/**
	 * Create the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 486, 351);
		frame.setSize(650,400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		
		table = new JTable();
		table.setBounds(174, 11, 300, 340);
		contentPane.setLayout(null);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(234, 0, 400, 362);
		contentPane.add(scrollPane);
		
		JButton btnVerTreino = new JButton("Ver detalhes");
		btnVerTreino.setBounds(12, 65, 180, 23);
		contentPane.add(btnVerTreino);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MenuGerente().frame.setVisible(true);
				frame.dispose();
			
				
			}
		});
		btnVoltar.setBounds(59, 328, 89, 23);
		contentPane.add(btnVoltar);
		
		
		
	}
}
