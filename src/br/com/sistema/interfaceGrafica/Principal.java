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
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmAnimal_1 = new JMenuItem("Animal");
		mnEditar.add(mntmAnimal_1);
		
		JMenuItem mntmCliente_1 = new JMenuItem("Cliente");
		mnEditar.add(mntmCliente_1);
		
		JMenuItem mntmFornecedor_1 = new JMenuItem("Fornecedor");
		mnEditar.add(mntmFornecedor_1);
		
		JMenuItem mntmFuncionrio = new JMenuItem("Funcion\u00E1rio");
		mnEditar.add(mntmFuncionrio);
		
		JMenuItem mntmProduto_1 = new JMenuItem("Produto");
		mnEditar.add(mntmProduto_1);
		
		JMenu mnBuscar = new JMenu("Buscar");
		menuBar.add(mnBuscar);
		
		JMenuItem mntmAnimal_2 = new JMenuItem("Animal");
		mnBuscar.add(mntmAnimal_2);
		
		JMenuItem mntmCliente_2 = new JMenuItem("Cliente");
		mnBuscar.add(mntmCliente_2);
		
		JMenuItem mntmFornecedor_2 = new JMenuItem("Fornecedor");
		mnBuscar.add(mntmFornecedor_2);
		
		JMenuItem mntmFuncionrio_1 = new JMenuItem("Funcion\u00E1rio");
		mnBuscar.add(mntmFuncionrio_1);
		
		JMenuItem mntmProduto_2 = new JMenuItem("Produto");
		mnBuscar.add(mntmProduto_2);
		
		JMenu mnVendas = new JMenu("Vendas");
		menuBar.add(mnVendas);
		
		JMenu mnServios = new JMenu("Servi\u00E7os");
		menuBar.add(mnServios);
		
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
			
		setVisible(true);
	}
}
