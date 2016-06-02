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

public class Principal extends JFrame {
	private JTextField nomeCliente;
	private JTextField cpfCliente;
	private JTextField ruaCliente;
	private JTextField bairroCliente;
	private JTextField cidadeCliente;
	private JTextField numeroCliente;
	private JTextField cepCliente;
	private JTextField estadoCliente;
	private JTextField contatoCliente;
	private JTextField nomeFuncionario;
	private JTextField cepFuncionario;
	private JTextField ruaFuncionario;
	private JTextField numeroFuncionario;
	private JTextField cepFuncionarios;
	private JTextField estadoFuncionario;
	private JTextField cidadeFuncionario;
	private JTextField bairroFuncionario;
	private JTextField contatoFuncionario;
	private JTextField cargoFuncionario;
	private JTextField login;
	private JTextField senha;
	private JTextField nomeFornecedor;
	private JTextField numeroFornecedor;
	private JTextField cepFornecedor;
	private JTextField estadoFornecedor;
	private JTextField cidadeFornecedor;
	private JTextField bairroFornecedor;
	private JTextField contatoFornecedor;
	private JTextField cnpjFornecedor;
	private JTextField inscricaoEstadualFor;
	private JTextField ruaFornecedor;
	private JTextField codProduto;
	private JTextField nomeProduto;
	private JTextField tipoProduto;
	private JTextField fornecedorProduto;
	private JTextField nomeAnimal;
	private JTextField racaAnimal;
	private JTextField especieAnimal;
	private JTextField corAnimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
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
		mnCadastrar.add(mntmAnimal);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnCadastrar.add(mntmCliente);
		
		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mnCadastrar.add(mntmFornecedor);
		
		JMenuItem mntmFuncionrip = new JMenuItem("Funcion\u00E1rio");
		mnCadastrar.add(mntmFuncionrip);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
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
		JPanel Principal = new JPanel();
		Principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Principal);
		Principal.setLayout(null);
		
		//CADASTRO DE CLIENTES
		JPanel Clientes = new JPanel();
		Clientes.setBorder(new TitledBorder(null, "Cadastro de Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Clientes.setBounds(10, 11, 436, 269);
		Principal.add(Clientes);
		Clientes.setLayout(null);
		Clientes.setVisible(false);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 24, 58, 14);
		Clientes.add(lblNome);
		
		nomeCliente = new JTextField();
		nomeCliente.setBounds(10, 40, 230, 20);
		Clientes.add(nomeCliente);
		nomeCliente.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 66, 46, 14);
		Clientes.add(lblCpf);
		
		cpfCliente = new JTextField();
		cpfCliente.setBounds(10, 85, 122, 20);
		Clientes.add(cpfCliente);
		cpfCliente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sexo");
		lblNewLabel.setBounds(142, 66, 46, 14);
		Clientes.add(lblNewLabel);
		
		ruaCliente = new JTextField();
		ruaCliente.setBounds(10, 146, 230, 20);
		Clientes.add(ruaCliente);
		ruaCliente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Rua");
		lblNewLabel_1.setBounds(10, 129, 46, 14);
		Clientes.add(lblNewLabel_1);
		
		JComboBox sexoCliente = new JComboBox();
		sexoCliente.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Feminino", "Masculino"}));
		sexoCliente.setBounds(142, 85, 98, 20);
		Clientes.add(sexoCliente);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(245, 129, 58, 14);
		Clientes.add(lblNmero);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(340, 129, 46, 14);
		Clientes.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 177, 46, 14);
		Clientes.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(179, 177, 46, 14);
		Clientes.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(322, 177, 46, 14);
		Clientes.add(lblEstado);
		
		JLabel lblContato = new JLabel("Contato");
		lblContato.setBounds(10, 222, 46, 14);
		Clientes.add(lblContato);
		
		bairroCliente = new JTextField();
		bairroCliente.setBounds(10, 191, 160, 20);
		Clientes.add(bairroCliente);
		bairroCliente.setColumns(10);
		
		cidadeCliente = new JTextField();
		cidadeCliente.setBounds(179, 191, 136, 20);
		Clientes.add(cidadeCliente);
		cidadeCliente.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 116, 416, 2);
		Clientes.add(separator);
		
		numeroCliente = new JTextField();
		numeroCliente.setBounds(245, 146, 86, 20);
		Clientes.add(numeroCliente);
		numeroCliente.setColumns(10);
		
		cepCliente = new JTextField();
		cepCliente.setBounds(340, 146, 86, 20);
		Clientes.add(cepCliente);
		cepCliente.setColumns(10);
		
		estadoCliente = new JTextField();
		estadoCliente.setBounds(322, 191, 104, 20);
		Clientes.add(estadoCliente);
		estadoCliente.setColumns(10);
		
		contatoCliente = new JTextField();
		contatoCliente.setBounds(10, 238, 160, 20);
		Clientes.add(contatoCliente);
		contatoCliente.setColumns(10);
		
		//CADASTRO DE ANIMAIS
		JPanel Animais = new JPanel();
		Animais.setBounds(10, 11, 436, 199);
		Principal.add(Animais);
		Animais.setBorder(new TitledBorder(null, "Cadastro de Animais", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Animais.setLayout(null);
		Animais.setVisible(false);
		
		JLabel lblNomeDoAnimal = new JLabel("Nome do Animal");
		lblNomeDoAnimal.setBounds(10, 22, 101, 14);
		Animais.add(lblNomeDoAnimal);
		
		JLabel lblRaa = new JLabel("Ra\u00E7a");
		lblRaa.setBounds(10, 70, 70, 14);
		Animais.add(lblRaa);
		
		JLabel lblEspcie = new JLabel("Esp\u00E9cie");
		lblEspcie.setBounds(166, 70, 60, 14);
		Animais.add(lblEspcie);
		
		nomeAnimal = new JTextField();
		nomeAnimal.setColumns(10);
		nomeAnimal.setBounds(10, 39, 295, 20);
		Animais.add(nomeAnimal);
		
		racaAnimal = new JTextField();
		racaAnimal.setColumns(10);
		racaAnimal.setBounds(10, 88, 148, 20);
		Animais.add(racaAnimal);
		
		especieAnimal = new JTextField();
		especieAnimal.setBounds(164, 88, 141, 20);
		Animais.add(especieAnimal);
		especieAnimal.setColumns(10);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(309, 70, 46, 14);
		Animais.add(lblCor);
		
		corAnimal = new JTextField();
		corAnimal.setBounds(309, 88, 117, 20);
		Animais.add(corAnimal);
		corAnimal.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(309, 22, 46, 14);
		Animais.add(lblSexo);
		
		JComboBox sexoAnimal = new JComboBox();
		sexoAnimal.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Feminino", "Masculino"}));
		sexoAnimal.setBounds(309, 39, 117, 20);
		Animais.add(sexoAnimal);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
		lblObservaes.setBounds(10, 114, 101, 14);
		Animais.add(lblObservaes);
		
		JEditorPane obsAnimal = new JEditorPane();
		obsAnimal.setBounds(10, 131, 416, 54);
		Animais.add(obsAnimal);
		
		//CADASTRO DE FORNECEDORES
		JPanel Fornecedores = new JPanel();
		Fornecedores.setBounds(10, 11, 436, 269);
		Principal.add(Fornecedores);
		Fornecedores.setBorder(new TitledBorder(null, "Cadastro de Fornecedores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Fornecedores.setLayout(null);
		Fornecedores.setVisible(false);
		
		JLabel label_10 = new JLabel("Nome");
		label_10.setBounds(10, 21, 58, 14);
		Fornecedores.add(label_10);
		
		nomeFornecedor = new JTextField();
		nomeFornecedor.setColumns(10);
		nomeFornecedor.setBounds(10, 37, 229, 20);
		Fornecedores.add(nomeFornecedor);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 113, 416, 2);
		Fornecedores.add(separator_3);
		
		JLabel label_11 = new JLabel("Rua");
		label_11.setBounds(10, 126, 46, 14);
		Fornecedores.add(label_11);
		
		JLabel label_12 = new JLabel("N\u00FAmero");
		label_12.setBounds(245, 126, 58, 14);
		Fornecedores.add(label_12);
		
		numeroFornecedor = new JTextField();
		numeroFornecedor.setColumns(10);
		numeroFornecedor.setBounds(245, 143, 86, 20);
		Fornecedores.add(numeroFornecedor);
		
		JLabel label_13 = new JLabel("CEP");
		label_13.setBounds(340, 126, 46, 14);
		Fornecedores.add(label_13);
		
		cepFornecedor = new JTextField();
		cepFornecedor.setColumns(10);
		cepFornecedor.setBounds(340, 143, 86, 20);
		Fornecedores.add(cepFornecedor);
		
		JLabel label_14 = new JLabel("Estado");
		label_14.setBounds(322, 174, 46, 14);
		Fornecedores.add(label_14);
		
		estadoFornecedor = new JTextField();
		estadoFornecedor.setColumns(10);
		estadoFornecedor.setBounds(322, 188, 104, 20);
		Fornecedores.add(estadoFornecedor);
		
		cidadeFornecedor = new JTextField();
		cidadeFornecedor.setColumns(10);
		cidadeFornecedor.setBounds(179, 188, 136, 20);
		Fornecedores.add(cidadeFornecedor);
		
		JLabel label_15 = new JLabel("Cidade");
		label_15.setBounds(179, 174, 46, 14);
		Fornecedores.add(label_15);
		
		JLabel label_16 = new JLabel("Bairro");
		label_16.setBounds(10, 174, 46, 14);
		Fornecedores.add(label_16);
		
		bairroFornecedor = new JTextField();
		bairroFornecedor.setColumns(10);
		bairroFornecedor.setBounds(10, 188, 160, 20);
		Fornecedores.add(bairroFornecedor);
		
		JLabel label_17 = new JLabel("Contato");
		label_17.setBounds(10, 219, 46, 14);
		Fornecedores.add(label_17);
		
		contatoFornecedor = new JTextField();
		contatoFornecedor.setColumns(10);
		contatoFornecedor.setBounds(10, 235, 160, 20);
		Fornecedores.add(contatoFornecedor);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(10, 64, 46, 14);
		Fornecedores.add(lblCnpj);
		
		cnpjFornecedor = new JTextField();
		cnpjFornecedor.setBounds(10, 82, 136, 20);
		Fornecedores.add(cnpjFornecedor);
		cnpjFornecedor.setColumns(10);
		
		JLabel lblInscrioEstadual = new JLabel("Inscri\u00E7\u00E3o Estadual");
		lblInscrioEstadual.setBounds(153, 64, 127, 14);
		Fornecedores.add(lblInscrioEstadual);
		
		inscricaoEstadualFor = new JTextField();
		inscricaoEstadualFor.setBounds(153, 82, 136, 20);
		Fornecedores.add(inscricaoEstadualFor);
		inscricaoEstadualFor.setColumns(10);
		
		ruaFornecedor = new JTextField();
		ruaFornecedor.setColumns(10);
		ruaFornecedor.setBounds(9, 143, 230, 20);
		Fornecedores.add(ruaFornecedor);
		
		//CADASTRO DE PRODUTOS
		JPanel Produtos = new JPanel();
		Produtos.setBounds(10, 11, 436, 110);
		Principal.add(Produtos);
		Produtos.setBorder(new TitledBorder(null, "Cadastro de Produtos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Produtos.setLayout(null);
		Produtos.setVisible(false);
		
		JLabel lblCodProduto = new JLabel("Cod Produto");
		lblCodProduto.setBounds(10, 22, 110, 14);
		Produtos.add(lblCodProduto);
		
		codProduto = new JTextField();
		codProduto.setBounds(10, 38, 86, 20);
		Produtos.add(codProduto);
		codProduto.setColumns(10);
		
		
		JLabel lblNomeDoProduto = new JLabel("Nome do Produto");
		lblNomeDoProduto.setBounds(103, 22, 103, 14);
		Produtos.add(lblNomeDoProduto);
		
		nomeProduto = new JTextField();
		nomeProduto.setColumns(10);
		nomeProduto.setBounds(103, 38, 323, 20);
		Produtos.add(nomeProduto);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 63, 57, 14);
		Produtos.add(lblTipo);
		
		tipoProduto = new JTextField();
		tipoProduto.setBounds(10, 81, 86, 20);
		Produtos.add(tipoProduto);
		tipoProduto.setColumns(10);
		
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setBounds(103, 63, 86, 14);
		Produtos.add(lblFornecedor);
		
		fornecedorProduto = new JTextField();
		fornecedorProduto.setColumns(10);
		fornecedorProduto.setBounds(103, 81, 227, 20);
		Produtos.add(fornecedorProduto);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(342, 63, 46, 14);
		Produtos.add(lblStatus);
		
		JComboBox statusProduto = new JComboBox();
		statusProduto.setModel(new DefaultComboBoxModel(new String[] {"Selecione\t", "Ativo", "Inativo"}));
		statusProduto.setBounds(340, 81, 86, 20);
		Produtos.add(statusProduto);
		
		//CADASTRO DE FUNCIONARIOS
		JPanel Funcionarios = new JPanel();
		Funcionarios.setBounds(10, 11, 436, 336);
		Principal.add(Funcionarios);
		Funcionarios.setBorder(new TitledBorder(null, "Cadastro de Funcion\u00E1rios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Funcionarios.setLayout(null);
		Funcionarios.setVisible(false);
		
		JLabel label = new JLabel("Nome");
		label.setBounds(10, 23, 58, 14);
		Funcionarios.add(label);
		
		nomeFuncionario = new JTextField();
		nomeFuncionario.setColumns(10);
		nomeFuncionario.setBounds(10, 39, 230, 20);
		Funcionarios.add(nomeFuncionario);
		
		JLabel label_1 = new JLabel("CPF");
		label_1.setBounds(10, 65, 46, 14);
		Funcionarios.add(label_1);
		
		cepFuncionario = new JTextField();
		cepFuncionario.setColumns(10);
		cepFuncionario.setBounds(10, 84, 122, 20);
		Funcionarios.add(cepFuncionario);
		
		JLabel label_2 = new JLabel("Sexo");
		label_2.setBounds(142, 65, 46, 14);
		Funcionarios.add(label_2);
		
		JComboBox sexoFuncionario = new JComboBox();
		sexoFuncionario.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Feminino", "Masculino"}));
		sexoFuncionario.setBounds(142, 84, 98, 20);
		Funcionarios.add(sexoFuncionario);
		
		JLabel label_3 = new JLabel("Rua");
		label_3.setBounds(10, 128, 46, 14);
		Funcionarios.add(label_3);
		
		ruaFuncionario = new JTextField();
		ruaFuncionario.setColumns(10);
		ruaFuncionario.setBounds(10, 145, 230, 20);
		Funcionarios.add(ruaFuncionario);
		
		JLabel label_4 = new JLabel("N\u00FAmero");
		label_4.setBounds(245, 128, 58, 14);
		Funcionarios.add(label_4);
		
		numeroFuncionario = new JTextField();
		numeroFuncionario.setColumns(10);
		numeroFuncionario.setBounds(245, 145, 86, 20);
		Funcionarios.add(numeroFuncionario);
		
		JLabel label_5 = new JLabel("CEP");
		label_5.setBounds(340, 128, 46, 14);
		Funcionarios.add(label_5);
		
		cepFuncionarios = new JTextField();
		cepFuncionarios.setColumns(10);
		cepFuncionarios.setBounds(340, 145, 86, 20);
		Funcionarios.add(cepFuncionarios);
		
		JLabel label_6 = new JLabel("Estado");
		label_6.setBounds(322, 176, 46, 14);
		Funcionarios.add(label_6);
		
		estadoFuncionario = new JTextField();
		estadoFuncionario.setColumns(10);
		estadoFuncionario.setBounds(322, 190, 104, 20);
		Funcionarios.add(estadoFuncionario);
		
		cidadeFuncionario = new JTextField();
		cidadeFuncionario.setColumns(10);
		cidadeFuncionario.setBounds(179, 190, 136, 20);
		Funcionarios.add(cidadeFuncionario);
		
		JLabel label_7 = new JLabel("Cidade");
		label_7.setBounds(179, 176, 46, 14);
		Funcionarios.add(label_7);
		
		JLabel label_8 = new JLabel("Bairro");
		label_8.setBounds(10, 176, 46, 14);
		Funcionarios.add(label_8);
		
		bairroFuncionario = new JTextField();
		bairroFuncionario.setColumns(10);
		bairroFuncionario.setBounds(10, 190, 160, 20);
		Funcionarios.add(bairroFuncionario);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 115, 416, 2);
		Funcionarios.add(separator_1);
		
		contatoFuncionario = new JTextField();
		contatoFuncionario.setColumns(10);
		contatoFuncionario.setBounds(10, 237, 160, 20);
		Funcionarios.add(contatoFuncionario);
		
		JLabel label_9 = new JLabel("Contato");
		label_9.setBounds(10, 221, 46, 14);
		Funcionarios.add(label_9);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 268, 416, 2);
		Funcionarios.add(separator_2);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(10, 281, 46, 14);
		Funcionarios.add(lblCargo);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(156, 281, 46, 14);
		Funcionarios.add(lblLogin);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(302, 281, 46, 14);
		Funcionarios.add(lblNewLabel_2);
		
		cargoFuncionario = new JTextField();
		cargoFuncionario.setBounds(10, 299, 136, 20);
		Funcionarios.add(cargoFuncionario);
		cargoFuncionario.setColumns(10);
		
		login = new JTextField();
		login.setColumns(10);
		login.setBounds(155, 299, 136, 20);
		Funcionarios.add(login);
		
		senha = new JTextField();
		senha.setColumns(10);
		senha.setBounds(302, 299, 124, 20);
		Funcionarios.add(senha);
		
		//PANEL LOGO PAGINA PRINCIPAL
		JPanel PaginaPrincipal = new JPanel();
		PaginaPrincipal.setBounds(10, 11, 436, 336);
		Principal.add(PaginaPrincipal);
		PaginaPrincipal.setBorder(null);
		PaginaPrincipal.setLayout(null);
		PaginaPrincipal.setVisible(true);
		
		JLabel lblNewLabel_3 = new JLabel("logoPetShop");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Fernanda\\Downloads\\LogoPetshop.png"));
		lblNewLabel_3.setBounds(10, 11, 403, 268);
		PaginaPrincipal.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Desenvolvimento por Fernanda e Klemerson");
		lblNewLabel_4.setBounds(104, 311, 296, 14);
		PaginaPrincipal.add(lblNewLabel_4);
		
	
		// TELA EDITAR ANIMAL
		mntmAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos.setVisible(false);
				Funcionarios.setVisible(false);
				Fornecedores.setVisible(false);
				Clientes.setVisible(false);
				Animais.setVisible(true);
				PaginaPrincipal.setVisible(false);
			}			
		});
		
		// TELA EDITAR CLIENTE
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos.setVisible(false);
				Funcionarios.setVisible(false);
				Fornecedores.setVisible(false);
				Clientes.setVisible(true);
				Animais.setVisible(false);
				PaginaPrincipal.setVisible(false);
			}
		});
		
		// TELA EDITAR FORNECEDOR
		mntmFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos.setVisible(false);
				Funcionarios.setVisible(false);
				Fornecedores.setVisible(true);
				Clientes.setVisible(false);
				Animais.setVisible(false);
				PaginaPrincipal.setVisible(false);
			}
		});
		
		// TELA EDITAR FUNCIONARIO
		mntmFuncionrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos.setVisible(false);
				Funcionarios.setVisible(true);
				Fornecedores.setVisible(false);
				Clientes.setVisible(false);
				Animais.setVisible(false);
				PaginaPrincipal.setVisible(false);
			}
		});
		
		// TELA EDITAR PRODUTO
		mntmProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos.setVisible(true);
				Funcionarios.setVisible(false);
				Fornecedores.setVisible(false);
				Clientes.setVisible(false);
				Animais.setVisible(false);
				PaginaPrincipal.setVisible(false);
			}
		});		
		
		//PAGINA PRINCIPAL
		mntmPginaInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos.setVisible(false);
				Funcionarios.setVisible(false);
				Fornecedores.setVisible(false);
				Clientes.setVisible(false);
				Animais.setVisible(false);
				PaginaPrincipal.setVisible(true);
			}
		});
		
		
		setVisible(true);
	}
}
