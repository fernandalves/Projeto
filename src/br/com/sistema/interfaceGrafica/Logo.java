package br.com.sistema.interfaceGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logo extends JPanel {

	public Logo() {
		JPanel PaginaPrincipal = new JPanel();
		setBounds(10, 11, 430, 298);
		setBorder(null);
		setLayout(null);
		setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("logoPetShop");
		lblNewLabel_3.setIcon(new ImageIcon(Logo.class.getResource("/br/com/sistema/imagens/petshop_quatropatas.jpg")));
		lblNewLabel_3.setBounds(10, 25, 410, 254);
		add(lblNewLabel_3);
	}

}
