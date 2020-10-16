package br.ucsal.estrutuda.dado.view;

import java.awt.Color;
import java.awt.EventQueue;
//import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.ucsal.estrutuda.dado.game.LinkedList;
import br.ucsal.estrutuda.dado.game.LinkedQueue;
import br.ucsal.estrutuda.dado.game.LinkedStack;
import br.ucsal.estrutuda.dado.game.List;
import br.ucsal.estrutuda.dado.game.Queue;
import br.ucsal.estrutuda.dado.game.Stack;

public class ViewJogo1<T> extends JFrame {

	// nï¿½o aparecer as vidas se tiver sï¿½ uma chance

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField nextText;
	private static Random rd = new Random();
	private static Integer n1 = 0, n2 = 0, n3 = 0, n4 = 0, result = 0;
	private static Queue<Integer> queueNumbers = new LinkedQueue<>();
	private static Stack<Integer> lives = new LinkedStack<>();
	private static List <String> logic = new LinkedList<>();
	private static int repetitions = 1;
	private static boolean inGame = false;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					@SuppressWarnings("rawtypes")
					ViewJogo1 frame = new ViewJogo1();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	// mÃ©todo para gerar uma sequÃªncia lÃ³gica de nÃºmeros inteiros
	public static void gerarSeqLogica() {
		int logicaSorteada = rd.nextInt(4) + 1;
		n1 = rd.nextInt(9) + 1;
		queueNumbers.add(n1);

		switch (logicaSorteada) {

		case 1:
			dobrarValor();
			break;

		case 2:
			multiplicarPor3Subtrair2();
			break;

		case 3:
			somar8();
			break;

		case 4:
			multiplicarPor3soma5();
			break;

		default:
			break;
		}
	}

	private static void multiplicarPor3soma5() {
		n2 = (n1 * 3) + 5;
		queueNumbers.add(n2);

		n3 = (n2 * 3) + 5;
		queueNumbers.add(n3);

		n4 = (n3 * 3) + 5;
		queueNumbers.add(n4);

		result = (n4 * 3) + 5;
		System.out.println("result: " + result);
		queueNumbers.add(result);
		logic.add("Multiplicar por 3 e somar 5");

	}


	private static void somar8() {

		n2 = n1 + 8;
		queueNumbers.add(n2);

		n3 = n2 + 8;
		queueNumbers.add(n3);

		n4 = n3 + 8;
		queueNumbers.add(n4);

		result = n4 + 8;
		System.out.println("result: " + result);
		queueNumbers.add(result);
		logic.add("Somar 8");

	}

	private static void multiplicarPor3Subtrair2() {
		n2 = (n1 * 3) - 2;
		queueNumbers.add(n2);

		n3 = (n2 * 3) - 2;
		queueNumbers.add(n3);

		n4 = (n3 * 3) - 2;
		queueNumbers.add(n4);

		result = (n4 * 3) - 2;
		System.out.println("result: " + result);
		queueNumbers.add(result);
		logic.add("Multiplicar por 3 e subtrair 2");

	}

	private static void dobrarValor() {
		n2 = n1 * 2;
		queueNumbers.add(n2);

		n3 = n2 * 2;
		queueNumbers.add(n3);

		n4 = n3 * 2;
		queueNumbers.add(n4);

		result = n4 * 2;
		System.out.println("result: " + result);
		queueNumbers.add(result);
		logic.add("Multiplicar por 2");
	}

	/**
	 * Create the frame.
	 */
	public ViewJogo1() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ViewJogo1.class.getResource("/br/ucsal/estrutuda/dado/view/image/1543269534.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnNewButton = new JButton("Verificar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon(ViewJogo1.class.getResource("/br/ucsal/estrutuda/dado/view/image/lampada.jpg")));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(0, 0, 109, 102);
		contentPane.add(lblNewLabel);

		nextText = new JTextField();
		nextText.setFont(new Font("Tahoma", Font.BOLD, 18));
		nextText.setBackground(Color.ORANGE);
		nextText.setBounds(296, 108, 42, 23);
		contentPane.add(nextText);
		nextText.setColumns(10);
		btnNewButton.setBounds(140, 171, 115, 36);
		contentPane.add(btnNewButton);

		gerarSeqLogica();
		JLabel numero1 = new JLabel(Integer.toString(queueNumbers.remove()));
		numero1.setFont(new Font("Tahoma", Font.BOLD, 18));
		numero1.setBounds(88, 115, 42, 17);
		contentPane.add(numero1);

		JLabel numero2 = new JLabel(Integer.toString(queueNumbers.remove()));
		numero2.setFont(new Font("Tahoma", Font.BOLD, 18));
		numero2.setBounds(140, 115, 42, 17);
		contentPane.add(numero2);

		JLabel numero3 = new JLabel(Integer.toString(queueNumbers.remove()));
		numero3.setFont(new Font("Tahoma", Font.BOLD, 18));
		numero3.setBounds(192, 115, 42, 17);
		contentPane.add(numero3);

		JLabel numero4 = new JLabel(Integer.toString(queueNumbers.remove()));
		numero4.setFont(new Font("Tahoma", Font.BOLD, 18));
		numero4.setBounds(244, 115, 42, 17);
		contentPane.add(numero4);

		JLabel lblQualOPrximo = new JLabel("Qual o pr\u00F3ximo n\u00FAmero?");
		lblQualOPrximo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQualOPrximo.setBounds(141, 29, 230, 47);
		contentPane.add(lblQualOPrximo);

		// CriaÃ§Ã£o das vidas
		if (!inGame) {
			lives.push(0);
			lives.push(1);
			lives.push(2);
			lives.push(3);
		}

		JLabel lblVida1 = new JLabel("");
		lblVida1.setIcon(
				new ImageIcon(ViewJogo1.class.getResource("/br/ucsal/estrutuda/dado/view/image/coracaojogo.png")));
		lblVida1.setEnabled(true);
		lblVida1.setBounds(296, 0, 36, 28);

		JLabel lblVida2 = new JLabel("");
		lblVida2.setIcon(
				new ImageIcon(ViewJogo1.class.getResource("/br/ucsal/estrutuda/dado/view/image/coracaojogo.png")));
		lblVida2.setBounds(328, 0, 36, 28);
		lblVida2.setEnabled(true);

		JLabel lblVida3 = new JLabel("");
		lblVida3.setIcon(
				new ImageIcon(ViewJogo1.class.getResource("/br/ucsal/estrutuda/dado/view/image/coracaojogo.png")));
		lblVida3.setBounds(356, 0, 36, 28);
		lblVida3.setEnabled(true);

		// visualizacao das Vidas:

		switch (lives.top()) {

		case 3:
			contentPane.add(lblVida1);
			contentPane.add(lblVida2);
			contentPane.add(lblVida3);
			break;
			
		case 2:
			
			contentPane.add(lblVida2);
			contentPane.add(lblVida3);
			break;
			
		case 1:
			
			contentPane.add(lblVida3);
			break;

		default:
			break;
		}

		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {

				if (repetitions <= 3 && lblVida3.isEnabled()
						&& nextText.getText().equals(Integer.toString(queueNumbers.element()))) {

					queueNumbers.remove();
					repetitions++;
					inGame = true;
					dispose();
					JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
					LinkedQueue<T> linkedqueue = new LinkedQueue<T>();
					linkedqueue.add((T) result);
					@SuppressWarnings("rawtypes")
					ViewJogo1 viewjogo1 = new ViewJogo1();
					viewjogo1.setVisible(true);

				} else if (repetitions > 3 && lblVida3.isEnabled()
						&& nextText.getText().equals(Integer.toString(queueNumbers.element()))) {
					
					queueNumbers.remove();
					dispose();
					JOptionPane.showMessageDialog(null, "Parabéns, você venceu!!!\n\n" + "Lógicas utilizadas:\n"
					+ logic.toString());

				} else if ((lives.top() != 1)
						&& !(nextText.getText().equals(Integer.toString(queueNumbers.element())))) {

					lives.pop();
					
					switch (lives.top()) {
						
					case 2:
						
						lblVida1.setVisible(false);
						
						break;
						
					case 1:						
					
						lblVida2.setVisible(false);
					
						break;
						
					default:
						break;
					}
					
					JOptionPane.showMessageDialog(null, "Número incorreto. Você perdeu uma vida.");
					System.out.println("tenho " + lives.top() + " vida");

				} else {
					
					lblVida3.setVisible(false);
					queueNumbers.remove();
					repetitions = 1;
					lives.clear();
					inGame = false;
					ViewTelaInicial viewtelainicial = new ViewTelaInicial();
					viewtelainicial.setVisible(true);
					dispose();
					logic.clear();
					JOptionPane.showMessageDialog(null, "Infelizmente, você perdeu.");
				}

			}

		});

	}
}
