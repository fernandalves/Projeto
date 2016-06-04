package br.com.sistema.interfaceGrafica;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class CadastroCliente extends JPanel {
	private JTextField nomeCliente;
	private JTextField cpfCliente;
	private JTextField ruaCliente;
	private JTextField bairroCliente;
	private JTextField cidadeCliente;
	private JTextField numeroCliente;
	private JTextField cepCliente;
	private JTextField estadoCliente;
	private JTextField contatoCliente;


	public CadastroCliente() {
		JPanel Clientes = new JPanel();
		setBorder(new TitledBorder(null, "Cadastro de Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBounds(10, 11, 436, 261);
		setLayout(null);
		setVisible(false);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 24, 58, 14);
		add(lblNome);
		
		nomeCliente = new JTextField();
		nomeCliente.setBounds(10, 40, 230, 20);
		add(nomeCliente);
		nomeCliente.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 66, 46, 14);
		add(lblCpf);
		
		cpfCliente = new JTextField();
		cpfCliente.setBounds(10, 85, 122, 20);
		add(cpfCliente);
		cpfCliente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sexo");
		lblNewLabel.setBounds(142, 66, 46, 14);
		add(lblNewLabel);
		
		ruaCliente = new JTextField();
		ruaCliente.setBounds(10, 146, 230, 20);
		add(ruaCliente);
		ruaCliente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Rua");
		lblNewLabel_1.setBounds(10, 129, 46, 14);
		add(lblNewLabel_1);
		
		JComboBox sexoCliente = new JComboBox();
		sexoCliente.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Feminino", "Masculino"}));
		sexoCliente.setBounds(142, 85, 98, 20);
		add(sexoCliente);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(245, 129, 58, 14);
		add(lblNmero);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(340, 129, 46, 14);
		add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 177, 46, 14);
		add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(179, 177, 46, 14);
		add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(322, 177, 46, 14);
		add(lblEstado);
		
		JLabel lblContato = new JLabel("Contato");
		lblContato.setBounds(247, 65, 46, 14);
		add(lblContato);
		
		bairroCliente = new JTextField();
		bairroCliente.setBounds(10, 191, 160, 20);
		add(bairroCliente);
		bairroCliente.setColumns(10);
		
		cidadeCliente = new JTextField();
		cidadeCliente.setBounds(179, 191, 136, 20);
		add(cidadeCliente);
		cidadeCliente.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 116, 416, 2);
		add(separator);
		
		numeroCliente = new JTextField();
		numeroCliente.setBounds(245, 146, 86, 20);
		add(numeroCliente);
		numeroCliente.setColumns(10);
		
		cepCliente = new JTextField();
		cepCliente.setBounds(340, 146, 86, 20);
		add(cepCliente);
		cepCliente.setColumns(10);
		
		estadoCliente = new JTextField();
		estadoCliente.setBounds(322, 191, 104, 20);
		add(estadoCliente);
		estadoCliente.setColumns(10);
		
		contatoCliente = new JTextField();
		contatoCliente.setBounds(249, 84, 160, 20);
		add(contatoCliente);
		contatoCliente.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 213, 416, 34);
		add(panel);
		
		JButton button = new JButton("Salvar");
		button.setBounds(54, 11, 70, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Editar");
		button_1.setBounds(129, 11, 76, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Cancelar ");
		button_2.setBounds(288, 11, 93, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Excluir");
		button_3.setBounds(209, 11, 76, 23);
		panel.add(button_3);
		
	}
	
}
