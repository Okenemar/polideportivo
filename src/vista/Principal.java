package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	public JButton GestionarUsuarios;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Principal frame = new Principal();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton GestionarInscripciones = new JButton("Gestionar inscripciones");
		GestionarInscripciones.setBounds(170, 60, 141, 23);
		contentPane.add(GestionarInscripciones);

		GestionarUsuarios = new JButton("Gestionar usuarios");
		GestionarUsuarios.setBounds(180, 26, 121, 23);
		contentPane.add(GestionarUsuarios);
		
		JButton Gest = new JButton("New button");
		Gest.setBounds(190, 128, 89, 23);
		contentPane.add(Gest);
	}
}
