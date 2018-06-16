package uslugiProjekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dodano extends JFrame {

	private JPanel contentPane;
	private JTextField txtDodanoNowUsug;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dodano frame = new Dodano();
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
	public Dodano() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDodanoNowUsug = new JTextField();
		txtDodanoNowUsug.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDodanoNowUsug.setText("Dodano now\u0105 us\u0142ug\u0119 do bazy");
		txtDodanoNowUsug.setBounds(0, 0, 233, 41);
		contentPane.add(txtDodanoNowUsug);
		txtDodanoNowUsug.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOk.setBounds(48, 52, 144, 41);
		contentPane.add(btnOk);
	}
}
