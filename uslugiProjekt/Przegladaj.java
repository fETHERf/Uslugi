<<<<<<< HEAD
=======
/**PRzegl¹danie**/

>>>>>>> Kamila
package uslugiProjekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;

public class Przegladaj extends JFrame {

	private JPanel contentPane;
	private JTextField txtDodanoNowUsug;
	private JTextField textField_id;
	private JTextField textField_nazwa;
	private JTextField textField_cena;
	private JTextField textField_Kategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Przegladaj frame = new Przegladaj();
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
	public Przegladaj() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
<<<<<<< HEAD
		
		ListaUslug instance = ListaUslug.getInstance();
		
		String[] ar = new String[instance.size()];
		
		
		for (int i = 0; i < instance.size(); i++) {
			ar[i] = instance.czytajListe().get(i).getNazwa();
		}
		
		
		
		JComboBox<String> comboBox = new JComboBox<String>(ar);
		comboBox.setBounds(37, 11, 275, 20);
		contentPane.add(comboBox);
		
=======

		ListaUslug instance = ListaUslug.getInstance();

		String[] ar = new String[instance.size()];


		for (int i = 0; i < instance.size(); i++) {
			ar[i] = instance.czytajListe().get(i).getNazwa();
		}



		JComboBox<String> comboBox = new JComboBox<String>(ar);
		comboBox.setBounds(37, 11, 275, 20);
		contentPane.add(comboBox);

>>>>>>> Kamila
		textField_id = new JTextField();
		textField_id.setEditable(false);
		textField_id.setBounds(126, 38, 186, 20);
		contentPane.add(textField_id);
		textField_id.setColumns(10);
<<<<<<< HEAD
		
=======

>>>>>>> Kamila
		textField_nazwa = new JTextField();
		textField_nazwa.setEditable(false);
		textField_nazwa.setColumns(10);
		textField_nazwa.setBounds(126, 66, 186, 20);
		contentPane.add(textField_nazwa);
<<<<<<< HEAD
		
=======

>>>>>>> Kamila
		textField_cena = new JTextField();
		textField_cena.setEditable(false);
		textField_cena.setColumns(10);
		textField_cena.setBounds(126, 96, 186, 20);
		contentPane.add(textField_cena);
<<<<<<< HEAD
		
=======

>>>>>>> Kamila
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(47, 42, 46, 14);
		contentPane.add(lblId);
<<<<<<< HEAD
		
=======

>>>>>>> Kamila
		JLabel lblNazwa = new JLabel("Nazwa");
		lblNazwa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNazwa.setBounds(47, 69, 46, 14);
		contentPane.add(lblNazwa);
<<<<<<< HEAD
		
=======

>>>>>>> Kamila
		JLabel lblCena = new JLabel("Cena");
		lblCena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCena.setBounds(47, 99, 46, 14);
		contentPane.add(lblCena);
<<<<<<< HEAD
		
		JButton btnEdytuj = new JButton("Edytuj");
		btnEdytuj.setBounds(126, 161, 89, 23);
		contentPane.add(btnEdytuj);
		
		JButton btnZapisz = new JButton("Zapisz");
		btnZapisz.setBounds(223, 161, 89, 23);
		contentPane.add(btnZapisz);
		
		 textField_id.setText(String.valueOf(instance.czytajListe().get(0).getID()));
	     textField_cena.setText(String.valueOf(instance.czytajListe().get(0).getCena()));
	     textField_nazwa.setText(instance.czytajListe().get(0).getNazwa());
	     
=======

		JButton btnEdytuj = new JButton("Edytuj");
		btnEdytuj.setBounds(126, 161, 89, 23);
		contentPane.add(btnEdytuj);

		JButton btnZapisz = new JButton("Zapisz");
		btnZapisz.setBounds(223, 161, 89, 23);
		contentPane.add(btnZapisz);

		 textField_id.setText(String.valueOf(instance.czytajListe().get(0).getID()));
	     textField_cena.setText(String.valueOf(instance.czytajListe().get(0).getCena()));
	     textField_nazwa.setText(instance.czytajListe().get(0).getNazwa());

>>>>>>> Kamila
	     JLabel Kategoria = new JLabel("Kategoria");
	     Kategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
	     Kategoria.setBounds(47, 124, 89, 14);
	     contentPane.add(Kategoria);
<<<<<<< HEAD
	     
=======

>>>>>>> Kamila
	     textField_Kategoria = new JTextField();
	     textField_Kategoria.setEditable(false);
	     textField_Kategoria.setColumns(10);
	     textField_Kategoria.setBounds(126, 123, 186, 20);
	     contentPane.add(textField_Kategoria);
<<<<<<< HEAD
	     
		
		int selectedIndex = comboBox.getSelectedIndex();
		
		comboBox.addActionListener(new ActionListener() {
			 
=======


		int selectedIndex = comboBox.getSelectedIndex();

		comboBox.addActionListener(new ActionListener() {

>>>>>>> Kamila
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        int selectedIndex = combo.getSelectedIndex();
<<<<<<< HEAD
		        
		        textField_cena.setEditable(false);
		    	textField_nazwa.setEditable(false);
		 
=======

		        textField_cena.setEditable(false);
		    	textField_nazwa.setEditable(false);

>>>>>>> Kamila
		        textField_id.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getID()));
		        textField_cena.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getCena()));
		        textField_nazwa.setText(instance.czytajListe().get(selectedIndex).getNazwa());
		        textField_Kategoria.setText(instance.czytajListe().get(selectedIndex).getKategoria());
<<<<<<< HEAD
		        
		       
				
		      
		        
		        
		    }
		    
		    
		});
		
		
		 btnEdytuj.addActionListener(new ActionListener() {
	        	
=======






		    }


		});


		 btnEdytuj.addActionListener(new ActionListener() {

>>>>>>> Kamila
			    @Override
			    public void actionPerformed(ActionEvent event) {
			    	//textField_id.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getID()));
			        //textField_cena.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getCena()));
			        //textField_nazwa.setText(instance.czytajListe().get(selectedIndex).getNazwa());
<<<<<<< HEAD
			    	
			    	
			    	textField_cena.setEditable(true);
			    	textField_nazwa.setEditable(true);
			        

			    }
			});
		 
		 
		 btnZapisz.addActionListener(new ActionListener() {
	        	
=======


			    	textField_cena.setEditable(true);
			    	textField_nazwa.setEditable(true);


			    }
			});


		 btnZapisz.addActionListener(new ActionListener() {

>>>>>>> Kamila
			    @Override
			    public void actionPerformed(ActionEvent event) {
			    	//textField_id.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getID()));
			        //textField_cena.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getCena()));
			        //textField_nazwa.setText(instance.czytajListe().get(selectedIndex).getNazwa());
<<<<<<< HEAD
			    	
			    	String nazwa = textField_nazwa.getText();
			    	double cena = Double.parseDouble(textField_cena.getText());
			    	
			    	instance.czytajListe().get(comboBox.getSelectedIndex()).edytuj(nazwa, cena);
			    	
			    	
			    	textField_cena.setEditable(false);
			    	textField_nazwa.setEditable(false);
			        

			    }
			});
		
		
=======

			    	String nazwa = textField_nazwa.getText();
			    	double cena = Double.parseDouble(textField_cena.getText());

			    	instance.czytajListe().get(comboBox.getSelectedIndex()).edytuj(nazwa, cena);


			    	textField_cena.setEditable(false);
			    	textField_nazwa.setEditable(false);


			    }
			});


>>>>>>> Kamila
	}
}
