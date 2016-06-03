package br.com.sistema.interfaceGrafica;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class CadastroFornecedor extends JPanel {

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
	
	public CadastroFornecedor() {
		JPanel Fornecedores = new JPanel();
		setBounds(10, 11, 436, 269);
		setBorder(new TitledBorder(null, "Cadastro de Fornecedores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		setVisible(false);
		
		JLabel label_10 = new JLabel("Nome");
		label_10.setBounds(10, 21, 58, 14);
		add(label_10);
		
		nomeFornecedor = new JTextField();
		nomeFornecedor.setColumns(10);
		nomeFornecedor.setBounds(10, 37, 229, 20);
		add(nomeFornecedor);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 113, 416, 2);
		add(separator_3);
		
		JLabel label_11 = new JLabel("Rua");
		label_11.setBounds(10, 126, 46, 14);
		add(label_11);
		
		JLabel label_12 = new JLabel("N\u00FAmero");
		label_12.setBounds(245, 126, 58, 14);
		add(label_12);
		
		numeroFornecedor = new JTextField();
		numeroFornecedor.setColumns(10);
		numeroFornecedor.setBounds(245, 143, 86, 20);
		add(numeroFornecedor);
		
		JLabel label_13 = new JLabel("CEP");
		label_13.setBounds(340, 126, 46, 14);
		add(label_13);
		
		cepFornecedor = new JTextField();
		cepFornecedor.setColumns(10);
		cepFornecedor.setBounds(340, 143, 86, 20);
		add(cepFornecedor);
		
		JLabel label_14 = new JLabel("Estado");
		label_14.setBounds(322, 174, 46, 14);
		add(label_14);
		
		estadoFornecedor = new JTextField();
		estadoFornecedor.setColumns(10);
		estadoFornecedor.setBounds(322, 188, 104, 20);
		add(estadoFornecedor);
		
		cidadeFornecedor = new JTextField();
		cidadeFornecedor.setColumns(10);
		cidadeFornecedor.setBounds(179, 188, 136, 20);
		add(cidadeFornecedor);
		
		JLabel label_15 = new JLabel("Cidade");
		label_15.setBounds(179, 174, 46, 14);
		add(label_15);
		
		JLabel label_16 = new JLabel("Bairro");
		label_16.setBounds(10, 174, 46, 14);
		add(label_16);
		
		bairroFornecedor = new JTextField();
		bairroFornecedor.setColumns(10);
		bairroFornecedor.setBounds(10, 188, 160, 20);
		add(bairroFornecedor);
		
		JLabel label_17 = new JLabel("Contato");
		label_17.setBounds(10, 219, 46, 14);
		add(label_17);
		
		contatoFornecedor = new JTextField();
		contatoFornecedor.setColumns(10);
		contatoFornecedor.setBounds(10, 235, 160, 20);
		add(contatoFornecedor);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(10, 64, 46, 14);
		add(lblCnpj);
		
		cnpjFornecedor = new JTextField();
		cnpjFornecedor.setBounds(10, 82, 136, 20);
		add(cnpjFornecedor);
		cnpjFornecedor.setColumns(10);
		
		JLabel lblInscrioEstadual = new JLabel("Inscri\u00E7\u00E3o Estadual");
		lblInscrioEstadual.setBounds(153, 64, 127, 14);
		add(lblInscrioEstadual);
		
		inscricaoEstadualFor = new JTextField();
		inscricaoEstadualFor.setBounds(153, 82, 136, 20);
		add(inscricaoEstadualFor);
		inscricaoEstadualFor.setColumns(10);
		
		ruaFornecedor = new JTextField();
		ruaFornecedor.setColumns(10);
		ruaFornecedor.setBounds(9, 143, 230, 20);
		add(ruaFornecedor);
		
		JButton Salvar = new JButton("Salvar");
		Salvar.setBounds(233, 234, 86, 23);
		add(Salvar);
		
		JButton Cancelar = new JButton("Cancelar ");
		Cancelar.setBounds(322, 234, 104, 23);
		add(Cancelar);
	}

}
