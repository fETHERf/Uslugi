package uslugiProjekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OknoDodaj extends JFrame {

	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_nazwa;
	private JTextField textField_cena;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OknoDodaj frame = new OknoDodaj();
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
	public OknoDodaj() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdUsugi = new JLabel("ID Us\u0142ugi:");
		lblIdUsugi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdUsugi.setBounds(51, 25, 125, 27);
		contentPane.add(lblIdUsugi);
		
		JLabel lblNazwaUsugi = new JLabel("Nazwa Us\u0142ugi:");
		lblNazwaUsugi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNazwaUsugi.setBounds(51, 58, 125, 27);
		contentPane.add(lblNazwaUsugi);
		
		JLabel lblCenaUsugi = new JLabel("Cena Us\u0142ugi:");
		lblCenaUsugi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCenaUsugi.setBounds(51, 90, 125, 27);
		contentPane.add(lblCenaUsugi);
		
		textField_id = new JTextField();
		textField_id.setBounds(176, 30, 177, 22);
		contentPane.add(textField_id);
		textField_id.setColumns(10);
		
		textField_nazwa = new JTextField();
		textField_nazwa.setColumns(10);
		textField_nazwa.setBounds(176, 63, 177, 22);
		contentPane.add(textField_nazwa);
		
		textField_cena = new JTextField();
		textField_cena.setColumns(10);
		textField_cena.setBounds(176, 95, 177, 22);
		contentPane.add(textField_cena);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setBounds(176, 128, 177, 23);
		contentPane.add(btnDodaj);
	}
}