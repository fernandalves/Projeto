package br.com.sistema.interfaceGrafica;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class CadastroProduto extends JPanel {

	private JTextField codProduto;
	private JTextField nomeProduto;
	private JTextField tipoProduto;
	private JTextField fornecedorProduto;
	
	public CadastroProduto() {
		JPanel Produtos = new JPanel();
		setBounds(10, 11, 436, 149);
		setBorder(new TitledBorder(null, "Cadastro de Produtos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		setVisible(false);
		
		JLabel lblCodProduto = new JLabel("Cod Produto");
		lblCodProduto.setBounds(10, 22, 110, 14);
		add(lblCodProduto);
		
		codProduto = new JTextField();
		codProduto.setBounds(10, 38, 86, 20);
		add(codProduto);
		codProduto.setColumns(10);
		
		
		JLabel lblNomeDoProduto = new JLabel("Nome do Produto");
		lblNomeDoProduto.setBounds(103, 22, 103, 14);
		add(lblNomeDoProduto);
		
		nomeProduto = new JTextField();
		nomeProduto.setColumns(10);
		nomeProduto.setBounds(103, 38, 323, 20);
		add(nomeProduto);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 63, 57, 14);
		add(lblTipo);
		
		tipoProduto = new JTextField();
		tipoProduto.setBounds(10, 81, 86, 20);
		add(tipoProduto);
		tipoProduto.setColumns(10);
		
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setBounds(103, 63, 86, 14);
		add(lblFornecedor);
		
		fornecedorProduto = new JTextField();
		fornecedorProduto.setColumns(10);
		fornecedorProduto.setBounds(103, 81, 227, 20);
		add(fornecedorProduto);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(342, 63, 46, 14);
		add(lblStatus);
		
		JComboBox statusProduto = new JComboBox();
		statusProduto.setModel(new DefaultComboBoxModel(new String[] {"Selecione\t", "Ativo", "Inativo"}));
		statusProduto.setBounds(340, 81, 86, 20);
		add(statusProduto);
		
		JButton Salvar = new JButton("Salvar");
		Salvar.setBounds(243, 112, 84, 23);
		add(Salvar);
		
		JButton Cancelar = new JButton("Cancelar ");
		Cancelar.setBounds(332, 111, 94, 23);
		add(Cancelar);
	}

}
