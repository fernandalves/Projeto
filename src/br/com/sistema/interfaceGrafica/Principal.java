package br.com.sistema.interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Canvas;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;

public class Principal extends JFrame {
	
	private CadastroAnimal cadastroAnimal;
	private CadastroCliente cadastroCliente;
	private CadastroProduto cadastroProduto;
	private CadastroFuncionario cadastroFuncionario;
	private CadastroFornecedor cadastroFornecedor;
	private Logo logo;
	private Pesquisar pesquisar;
	private Vendas vendas;
	private Servico servico;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Fernanda\\Downloads\\logoPata.jpg"));
		setTitle("PETSHOP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 417);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmPginaInicial = new JMenuItem("P\u00E1gina inicial");
		mntmPginaInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(true);
				cadastroCliente.setVisible(false);
				cadastroFuncionario.setVisible(false);
				cadastroProduto.setVisible(false);
				cadastroAnimal.setVisible(false);
				cadastroFornecedor.setVisible(false);
			}
		});
		mnHome.add(mntmPginaInicial);
		
		JMenuItem mntmEncerrar = new JMenuItem("Encerrar");
		mntmEncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		mnHome.add(mntmEncerrar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmAnimal = new JMenuItem("Animal");
		mntmAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(false);
				cadastroCliente.setVisible(false);
				cadastroFuncionario.setVisible(false);
				cadastroProduto.setVisible(false);
				cadastroAnimal.setVisible(true);
				cadastroFornecedor.setVisible(false);
			}
		});
		mnCadastrar.add(mntmAnimal);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(false);
				cadastroCliente.setVisible(true);
				cadastroFuncionario.setVisible(false);
				cadastroProduto.setVisible(false);
				cadastroAnimal.setVisible(false);
				cadastroFornecedor.setVisible(false);
			}
		});
		mnCadastrar.add(mntmCliente);
		
		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(false);
				cadastroCliente.setVisible(false);
				cadastroFuncionario.setVisible(false);
				cadastroProduto.setVisible(false);
				cadastroAnimal.setVisible(false);
				cadastroFornecedor.setVisible(true);
			}
		});
		mnCadastrar.add(mntmFornecedor);
		
		JMenuItem mntmFuncionrip = new JMenuItem("Funcion\u00E1rio");
		mntmFuncionrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(false);
				cadastroCliente.setVisible(false);
				cadastroFuncionario.setVisible(true);
				cadastroProduto.setVisible(false);
				cadastroAnimal.setVisible(false);
				cadastroFornecedor.setVisible(false);
			}
		});
		mnCadastrar.add(mntmFuncionrip);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(false);
				cadastroCliente.setVisible(false);
				cadastroFuncionario.setVisible(false);
				cadastroProduto.setVisible(true);
				cadastroAnimal.setVisible(false);
				cadastroFornecedor.setVisible(false);
			}
		});
		mnCadastrar.add(mntmProduto);
		
		JMenu mnBuscar = new JMenu("Pesquisar");
		menuBar.add(mnBuscar);
		
		JMenuItem mntmPesquisar = new JMenuItem("Realizar pesquisa");
		mntmPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(false);
				cadastroCliente.setVisible(false);
				cadastroFuncionario.setVisible(false);
				cadastroProduto.setVisible(false);
				cadastroAnimal.setVisible(false);
				cadastroFornecedor.setVisible(false);
				pesquisar.setVisible(true);
			}
		});
		mnBuscar.add(mntmPesquisar);
		
		JMenu mnVendas = new JMenu("Vendas");
		menuBar.add(mnVendas);
		
		JMenuItem mntmRealizarVenda = new JMenuItem("Realizar Venda");
		mntmRealizarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(false);
				cadastroCliente.setVisible(false);
				cadastroFuncionario.setVisible(false);
				cadastroProduto.setVisible(false);
				cadastroAnimal.setVisible(false);
				cadastroFornecedor.setVisible(false);
				pesquisar.setVisible(false);
				vendas.setVisible(true);
			}
		});
		mnVendas.add(mntmRealizarVenda);
		
		JMenu mnServios = new JMenu("Servi\u00E7os");
		menuBar.add(mnServios);
		
		JMenuItem mntmRealizarServio = new JMenuItem("Realizar Servi\u00E7o");
		mntmRealizarServio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logo.setVisible(false);
				cadastroCliente.setVisible(false);
				cadastroFuncionario.setVisible(false);
				cadastroProduto.setVisible(false);
				cadastroAnimal.setVisible(false);
				cadastroFornecedor.setVisible(false);
				servico.setVisible(true);
			}
		});
		mnServios.add(mntmRealizarServio);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
					
		logo = new Logo();
		panelPrincipal.add(logo);
		logo.setVisible(true);
		
		cadastroAnimal = new CadastroAnimal();
		panelPrincipal.add(cadastroAnimal);
		
		cadastroProduto = new CadastroProduto();
		panelPrincipal.add(cadastroProduto);
		
		cadastroFuncionario = new CadastroFuncionario();
		panelPrincipal.add(cadastroFuncionario);
		
		cadastroFornecedor = new CadastroFornecedor();
		panelPrincipal.add(cadastroFornecedor);
		
		cadastroCliente = new CadastroCliente();
		panelPrincipal.add(cadastroCliente);
		
		pesquisar = new Pesquisar();
		panelPrincipal.add(pesquisar);
		
		vendas = new Vendas();
		panelPrincipal.add(vendas);
		
		servico = new Servico();
		panelPrincipal.add(servico);
			
		setVisible(true);
	}
}
