package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuGerente {
	
	JFrame frame;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGerente window = new MenuGerente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuGerente() {
		initialize();
	}
	/**
	 * Create the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 534, 332);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFuncionrio = new JMenu("Funcion\u00E1rio");
		menuBar.add(mnFuncionrio);
		
		JMenuItem mntmCadastrarFuncionrio = new JMenuItem("Cadastrar Funcion\u00E1rio");
		mnFuncionrio.add(mntmCadastrarFuncionrio);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Visualizar Funcion\u00E1rios");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ListaDeFuncionarios().frame.setVisible(true);
				frame.dispose();
			}
		});
		mnFuncionrio.add(mntmNewMenuItem);
		
		JMenuItem mntmDemitirFuncionrio = new JMenuItem("Demitir Funcion\u00E1rio");
		mnFuncionrio.add(mntmDemitirFuncionrio);
		
		JMenu mnModalidade = new JMenu("Modalidade");
		menuBar.add(mnModalidade);
		
		JMenuItem mntmCadastrarModalidade = new JMenuItem("Cadastrar Modalidade");
		mnModalidade.add(mntmCadastrarModalidade);
		
		JMenuItem mntmViasualizarModalidades = new JMenuItem("Viasualizar Modalidades");
		mntmViasualizarModalidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ListaModalidades().frame.setVisible(true);
				frame.dispose();
			}
		});
		mnModalidade.add(mntmViasualizarModalidades);
		
		JMenuItem mntmRemoverMensalidaddes = new JMenuItem("Remover Modalidades");
		mnModalidade.add(mntmRemoverMensalidaddes);
		
		JMenu mnPagamento = new JMenu("Financeiro");
		menuBar.add(mnPagamento);
		
		JMenuItem mntmRealizarPagamentos = new JMenuItem("Realizar Pagamentos");
		mnPagamento.add(mntmRealizarPagamentos);
		
		JMenuItem mntmExtratosDePagamento = new JMenuItem("Extratos de Pagamento ");
		mnPagamento.add(mntmExtratosDePagamento);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
