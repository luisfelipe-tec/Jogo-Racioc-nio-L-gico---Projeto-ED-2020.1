package br.ucsal.estrutuda.dado.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ViewRegras extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5572172024749256885L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewRegras frame = new ViewRegras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewRegras() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ViewRegras.class.getResource("/br/ucsal/estrutuda/dado/view/image/1543269534.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				JTextPane txtpnQuandoIniciadoVoc = new JTextPane();
				txtpnQuandoIniciadoVoc.setBackground(Color.LIGHT_GRAY);
				txtpnQuandoIniciadoVoc.setFont(new Font("Tahoma", Font.BOLD, 11));
				txtpnQuandoIniciadoVoc.setText(
						"Quando iniciado o jogo, você vai se deparar com um desafio lógico, mais especificamente, uma sequência lógica. Nesta sequência vão existir 4 números, "
						+ "cada um têm uma similaridade com o número anterior. O seu desafio vai ser utilizar habilidades de raciocínio lógico e acertar o próximo número da sequência,"
						+ " cada vez que acertar uma lógica aparecerá outra logo em seguida, isso vai se repetir quatro vezes e você terá três chances (as vidas que são representados pelos "
						+ "corações). E aí, consegue cumprir o desafio? :D");
				txtpnQuandoIniciadoVoc.setBounds(45, 76, 310, 174);
				contentPane.add(txtpnQuandoIniciadoVoc);
		
		JLabel lblNewLabel_1 = new JLabel("REGRAS DE FUNCIONAMENTO");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(79, 49, 240, 33);
		contentPane.add(lblNewLabel_1);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(0, 0, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon(ViewJogo1.class.getResource("/br/ucsal/estrutuda/dado/view/image/ff.jpg")));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(-61, -94, 590, 634);
		contentPane.add(lblNewLabel);
		
		btnVoltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ViewTelaInicial inicio = new ViewTelaInicial();
				inicio.setVisible(true);
				dispose();

			}

		});
	}
}
