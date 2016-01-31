package banksys.atm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Criando a aplicação.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Inicializando o Frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		frame.setResizable(false);
		
		JButton gerenciarContas = new JButton("Gerenciamento de Contas");
		gerenciarContas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ManagerWindow();
				frame.setVisible(false);
			}
		});
		gerenciarContas.setBackground(Color.WHITE);
		gerenciarContas.setForeground(Color.GRAY);
		frame.getContentPane().add(gerenciarContas);
		
		JButton atendimentoCliente = new JButton("Atendimento ao Cliente");
		atendimentoCliente.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AtmWindow();
				frame.setVisible(false);
			}
		});
		atendimentoCliente.setBackground(Color.WHITE);
		atendimentoCliente.setForeground(Color.GRAY);
		frame.getContentPane().add(atendimentoCliente);
	}

}