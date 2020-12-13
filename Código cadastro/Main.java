import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

	private JButton button = new JButton("Enviar");
	private JFrame frame = new JFrame("Cadastro");
	private JLabel nomeLabel = new JLabel("Digite seu nome");
	private JTextField inputNome = new JTextField();
	private JLabel emailLabel = new JLabel("Digite seu email");
	private JTextField inputEmail = new JTextField();
	private JPasswordField inputPassword = new JPasswordField();
	private JLabel passwordLabel = new JLabel("Digite sua senha");
	private JLabel generoLabel = new JLabel("Genero:");
	private JRadioButton feminino = new JRadioButton("Feminino");
	private JRadioButton masculino = new JRadioButton("Masculino");
	
	ButtonGroup select=new ButtonGroup();

	@Override
	public void actionPerformed(ActionEvent evento) {

		button.setText("Carregando...");

		this.openDialog("Estamos processando suas informações...");

	}

	public void openDialog(String text) {

		System.out.print(text);

		JDialog dialog = new JDialog(frame, "Resposta", true);
		dialog.setLayout(new FlowLayout());

		JLabel label = new JLabel(text);
		label.setBounds(150, 50, 100, 40);
		dialog.add(label);

		dialog.setSize(300, 300);
		dialog.setVisible(true);

	}

	public void janela() {

		nomeLabel.setBounds(50, 50, 100, 40);
		frame.add(nomeLabel);

		inputNome.setBounds(50, 100, 500, 40);
		frame.add(inputNome);

		emailLabel.setBounds(50, 150, 100, 40);
		frame.add(emailLabel);

		inputEmail.setBounds(50, 200, 500, 40);
		frame.add(inputEmail);

		passwordLabel.setBounds(50, 250, 100, 40);
		frame.add(passwordLabel);

		inputPassword.setBounds(50, 300, 500, 40);
		frame.add(inputPassword);

		generoLabel.setBounds(50, 350, 500, 40);
		frame.add(generoLabel);

		feminino.setBounds(50, 380, 500, 40);
		frame.add(feminino);

		masculino.setBounds(50, 420, 500, 30);
		frame.add(masculino);

		select.add(feminino);
		select.add(masculino);

		button.setBounds(250, 300, 100, 40);
		frame.add(button);

		button.addActionListener(this);

		frame.setSize(600, 600);
		frame.setLocation(400, 50);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		Main controller = new Main();
		controller.janela();

	}

}