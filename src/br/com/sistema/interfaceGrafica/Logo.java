package br.com.sistema.interfaceGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logo extends JPanel {

	public Logo() {
		JPanel PaginaPrincipal = new JPanel();
		setBounds(10, 11, 436, 336);
		setBorder(null);
		setLayout(null);
		setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("logoPetShop");
		lblNewLabel_3.setIcon(new ImageIcon(Logo.class.getResource("/br/com/sistema/imagens/LogoPetshop.png")));
		lblNewLabel_3.setBounds(15, 11, 404, 268);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Desenvolvimento por Fernanda e Klemerson");
		lblNewLabel_4.setBounds(104, 311, 296, 14);
		add(lblNewLabel_4);
	}

}
