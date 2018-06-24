package uslugiProjekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class OknoDodaj extends JFrame {

	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_nazwa;
	private JTextField textField_cena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		textField_id.setEditable(false);
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
		btnDodaj.setBounds(176, 214, 177, 23);
		contentPane.add(btnDodaj);
		
		ListaUslug instance = ListaUslug.getInstance();
		if(instance.czytajListe().size() > 0) {
			textField_id.setText(String.valueOf(instance.czytajListe().size()));
		}
		else {
			textField_id.setText(String.valueOf(0));
		}
		
		String kategorie[] = {"Rozrywka", "Edukacja", "Finanse i Ubezpieczenia", "Zdrowie i Uroda", "Inne"};
		
		JComboBox<String> comboBox = new JComboBox<String>(kategorie);
		comboBox.setBounds(176, 128, 177, 20);
		contentPane.add(comboBox);
		int selectedIndex = comboBox.getSelectedIndex();
		
		
		JLabel lblKategoria = new JLabel("Kategoria:");
		lblKategoria.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblKategoria.setBounds(51, 123, 115, 27);
		contentPane.add(lblKategoria);
		
		btnDodaj.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				//int id = Integer.parseInt(textField_id.getText());
				try
				{
					Double.parseDouble(textField_cena.getText());
				}
				catch(NumberFormatException e)
				{
		            System.out.println("Wprowadzono nieprawid³ow¹ wartoœæ w polu 'Cena'");
		            return;
				}
				double cena = Double.parseDouble(textField_cena.getText());
				
				UslugaFactory uslugaFactory = new UslugaFactory();
				String nazwa = textField_nazwa.getText();
				if(nazwa.equals("")) {
					System.out.println("xDD");
					
					UslugaInterface usluga = uslugaFactory.getType(true, null, 0, null);
					instance.dodajDoListy(usluga);
				}
				else {
				String kategoria = kategorie[comboBox.getSelectedIndex()];
				
				UslugaInterface usluga = uslugaFactory.getType(false, nazwa, cena, kategoria);
				
				instance.dodajDoListy(usluga);
				textField_id.setText(String.valueOf(usluga.getID()));
				//System.out.println(usluga.getID() + "nazwa: " + usluga.getNazwa() + " " + usluga.getCena());
				textField_nazwa.setText("");
				textField_cena.setText("");
				textField_id.setText(String.valueOf(instance.getInstance().size()));
				}
				
				Dodano frame1 = new Dodano();
				frame1.setVisible(true);
				
			}
			
		});
		
		
	}
}
