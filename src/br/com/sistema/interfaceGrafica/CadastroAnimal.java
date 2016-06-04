package br.com.sistema.interfaceGrafica;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroAnimal extends JPanel {

	private JTextField nomeAnimal;
	private JTextField racaAnimal;
	private JTextField especieAnimal;
	private JTextField corAnimal;
	
	public CadastroAnimal() {
	
				JPanel Animais = new JPanel();
				setBounds(10, 11, 436, 243);
				setBorder(new TitledBorder(null, "Cadastro de Animais", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				setLayout(null);
				setVisible(false);
				
				JLabel lblNomeDoAnimal = new JLabel("Nome do Animal");
				lblNomeDoAnimal.setBounds(10, 22, 101, 14);
				add(lblNomeDoAnimal);
				
				JLabel lblRaa = new JLabel("Ra\u00E7a");
				lblRaa.setBounds(10, 70, 70, 14);
				add(lblRaa);
				
				JLabel lblEspcie = new JLabel("Esp\u00E9cie");
				lblEspcie.setBounds(166, 70, 60, 14);
				add(lblEspcie);
				
				nomeAnimal = new JTextField();
				nomeAnimal.setColumns(10);
				nomeAnimal.setBounds(10, 39, 295, 20);
				add(nomeAnimal);
				
				racaAnimal = new JTextField();
				racaAnimal.setColumns(10);
				racaAnimal.setBounds(10, 88, 148, 20);
				add(racaAnimal);
				
				especieAnimal = new JTextField();
				especieAnimal.setBounds(164, 88, 141, 20);
				add(especieAnimal);
				especieAnimal.setColumns(10);
				
				JLabel lblCor = new JLabel("Cor");
				lblCor.setBounds(309, 70, 46, 14);
				add(lblCor);
				
				corAnimal = new JTextField();
				corAnimal.setBounds(309, 88, 117, 20);
				add(corAnimal);
				corAnimal.setColumns(10);
				
				JLabel lblSexo = new JLabel("Sexo");
				lblSexo.setBounds(309, 22, 46, 14);
				add(lblSexo);
				
				JComboBox sexoAnimal = new JComboBox();
				sexoAnimal.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Feminino", "Masculino"}));
				sexoAnimal.setBounds(309, 39, 117, 20);
				add(sexoAnimal);
				
				JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
				lblObservaes.setBounds(10, 114, 101, 14);
				add(lblObservaes);
				
				JEditorPane obsAnimal = new JEditorPane();
				obsAnimal.setBounds(10, 131, 416, 54);
				add(obsAnimal);
				
				JPanel panel = new JPanel();
				panel.setBounds(10, 196, 416, 34);
				add(panel);
				panel.setLayout(null);
				
				JButton Salvar = new JButton("Salvar");
				Salvar.setBounds(54, 11, 70, 23);
				panel.add(Salvar);
				
				JButton btnEditar = new JButton("Editar");
				btnEditar.setBounds(129, 11, 76, 23);
				panel.add(btnEditar);
				
				JButton Cancelar = new JButton("Cancelar ");
				Cancelar.setBounds(288, 11, 92, 23);
				panel.add(Cancelar);
				
				JButton buttonExcluir = new JButton("Excluir");
				buttonExcluir.setBounds(209, 11, 76, 23);
				panel.add(buttonExcluir);
				Cancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
	}

}
