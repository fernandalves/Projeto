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
		setBounds(10, 11, 436, 179);
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(11, 126, 416, 34);
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
