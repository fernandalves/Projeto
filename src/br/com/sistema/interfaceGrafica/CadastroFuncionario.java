package br.com.sistema.interfaceGrafica;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroFuncionario extends JPanel {

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
	
	public CadastroFuncionario() {
		JPanel Funcionarios = new JPanel();
		setBounds(10, 11, 436, 325);
		setBorder(new TitledBorder(null, "Cadastro de Funcion\u00E1rios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		setVisible(false);
		
		JLabel label = new JLabel("Nome");
		label.setBounds(10, 23, 58, 14);
		add(label);
		
		nomeFuncionario = new JTextField();
		nomeFuncionario.setColumns(10);
		nomeFuncionario.setBounds(10, 39, 230, 20);
		add(nomeFuncionario);
		
		JLabel label_1 = new JLabel("CPF");
		label_1.setBounds(10, 65, 46, 14);
		add(label_1);
		
		cepFuncionario = new JTextField();
		cepFuncionario.setColumns(10);
		cepFuncionario.setBounds(10, 84, 122, 20);
		add(cepFuncionario);
		
		JLabel label_2 = new JLabel("Sexo");
		label_2.setBounds(142, 65, 46, 14);
		add(label_2);
		
		JComboBox sexoFuncionario = new JComboBox();
		sexoFuncionario.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Feminino", "Masculino"}));
		sexoFuncionario.setBounds(142, 84, 98, 20);
		add(sexoFuncionario);
		
		JLabel label_3 = new JLabel("Rua");
		label_3.setBounds(10, 128, 46, 14);
		add(label_3);
		
		ruaFuncionario = new JTextField();
		ruaFuncionario.setColumns(10);
		ruaFuncionario.setBounds(10, 145, 230, 20);
		add(ruaFuncionario);
		
		JLabel label_4 = new JLabel("N\u00FAmero");
		label_4.setBounds(245, 128, 58, 14);
		Funcionarios.add(label_4);
		
		numeroFuncionario = new JTextField();
		numeroFuncionario.setColumns(10);
		numeroFuncionario.setBounds(245, 145, 86, 20);
		add(numeroFuncionario);
		
		JLabel label_5 = new JLabel("CEP");
		label_5.setBounds(340, 128, 46, 14);
		add(label_5);
		
		cepFuncionarios = new JTextField();
		cepFuncionarios.setColumns(10);
		cepFuncionarios.setBounds(340, 145, 86, 20);
		add(cepFuncionarios);
		
		JLabel label_6 = new JLabel("Estado");
		label_6.setBounds(322, 176, 46, 14);
		add(label_6);
		
		estadoFuncionario = new JTextField();
		estadoFuncionario.setColumns(10);
		estadoFuncionario.setBounds(322, 190, 104, 20);
		add(estadoFuncionario);
		
		cidadeFuncionario = new JTextField();
		cidadeFuncionario.setColumns(10);
		cidadeFuncionario.setBounds(179, 190, 136, 20);
		add(cidadeFuncionario);
		
		JLabel label_7 = new JLabel("Cidade");
		label_7.setBounds(179, 176, 46, 14);
		add(label_7);
		
		JLabel label_8 = new JLabel("Bairro");
		label_8.setBounds(10, 176, 46, 14);
		add(label_8);
		
		bairroFuncionario = new JTextField();
		bairroFuncionario.setColumns(10);
		bairroFuncionario.setBounds(10, 190, 160, 20);
		add(bairroFuncionario);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 115, 416, 2);
		add(separator_1);
		
		contatoFuncionario = new JTextField();
		contatoFuncionario.setColumns(10);
		contatoFuncionario.setBounds(244, 84, 160, 20);
		add(contatoFuncionario);
		
		JLabel label_9 = new JLabel("Contato");
		label_9.setBounds(245, 65, 46, 14);
		add(label_9);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 221, 416, 2);
		add(separator_2);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(10, 234, 46, 14);
		add(lblCargo);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(156, 234, 46, 14);
		add(lblLogin);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(302, 234, 46, 14);
		add(lblNewLabel_2);
		
		cargoFuncionario = new JTextField();
		cargoFuncionario.setBounds(10, 252, 136, 20);
		add(cargoFuncionario);
		cargoFuncionario.setColumns(10);
		
		login = new JTextField();
		login.setColumns(10);
		login.setBounds(155, 252, 136, 20);
		add(login);
		
		senha = new JTextField();
		senha.setColumns(10);
		senha.setBounds(302, 252, 124, 20);
		add(senha);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(245, 128, 46, 14);
		add(lblNmero);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 283, 416, 34);
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
