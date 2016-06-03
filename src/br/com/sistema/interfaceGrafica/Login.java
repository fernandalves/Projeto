package br.com.sistema.interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import javax.swing.JPasswordField;

public class Login extends JDialog {

	private final JPanel Login = new JPanel();
	private JTextField login;
	private JPasswordField senha;

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setTitle("PETSHOP");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/br/com/sistema/imagens/logoPata.jpg")));
		setBounds(100, 100, 313, 134);
		getContentPane().setLayout(new BorderLayout());
		Login.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Login, BorderLayout.CENTER);
		Login.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(6, 11, 46, 14);
		Login.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(174, 11, 46, 14);
		Login.add(lblSenha);
		
		login = new JTextField();
		login.setBounds(6, 29, 158, 20);
		Login.add(login);
		login.setColumns(10);
		
		senha = new JPasswordField();
		senha.setBounds(174, 29, 117, 20);
		Login.add(senha);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(login.getText().equals("") ||
								senha.getText().equals("")){
								JOptionPane.showMessageDialog(Login.this, "Login ou senha inválida");
							}else{
								Principal principal = new Principal();
								principal.setVisible(true);
								principal.setLocationRelativeTo(null);
								dispose();
								//VALIDAR SENHA
							}	
								
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
