package br.ucsal.estrutuda.dado.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class ViewTelaInicial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 458407139561290580L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaInicial frame = new ViewTelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @param <T>
	 */
	public <T> ViewTelaInicial() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ViewJogo1.class.getResource("/br/ucsal/estrutuda/dado/view/image/1543269534.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 368);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Jogar");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewJogo1<T> primeiratela = new ViewJogo1<T>();
				primeiratela.setVisible(true);
				dispose();
			}
		});

		JButton btnRegras = new JButton("Regras");
		btnRegras.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnRegras.setBackground(Color.PINK);
		btnRegras.setBounds(124, 171, 122, 47);
		contentPane.add(btnRegras);
		btnNewButton.setBounds(124, 113, 122, 47);
		contentPane.add(btnNewButton);
		btnRegras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRegras telaregras = new ViewRegras();
				telaregras.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon(ViewJogo1.class.getResource("/br/ucsal/estrutuda/dado/view/image/fundo1.png")));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(0, 0, 418, 272);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel("New label");
		lblNewLabel1.setIcon(new ImageIcon(
				ViewTelaInicial.class.getResource("/br/ucsal/estrutuda/dado/view/image/lampada.jpg")));
		lblNewLabel1.setBounds(250, 216, 99, 113);
		contentPane.add(lblNewLabel1);
		
	}
}
