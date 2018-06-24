package projektUslugi;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;

import org.jfree.ui.RefineryUtilities;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {

	public JFrame frmZarzdzanieUsugami;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZarzdzanieUsugami = new JFrame();
		frmZarzdzanieUsugami.setTitle("Zarz\u0105dzanie Us\u0142ugami");
		frmZarzdzanieUsugami.setBounds(100, 100, 583, 300);
		frmZarzdzanieUsugami.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZarzdzanieUsugami.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JButton btnNewButton = new JButton("Dodaj Usluge");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				OknoDodaj frame1 = new OknoDodaj();
				frame1.setVisible(true);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		frmZarzdzanieUsugami.getContentPane().add(btnNewButton);
		
		
		JButton btnPrzegldajUsugi = new JButton("Przegl\u0105daj Us\u0142ugi");
		btnPrzegldajUsugi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Przegladaj frame1 = new Przegladaj();
				frame1.setVisible(true);
			}
		});
		frmZarzdzanieUsugami.getContentPane().add(btnPrzegldajUsugi);
		
		JButton btnStatystyki = new JButton("Statystyki");
		frmZarzdzanieUsugami.getContentPane().add(btnStatystyki);
		
		btnStatystyki.addActionListener(new ActionListener() {
        	
		    
		    public void actionPerformed(ActionEvent event) {
		    	chart demo = new chart( "Wykres wydanych pieniêdzy na us³ugi poszczególnych kategorii" );
		        demo.setSize( 560 , 367 );    
		        RefineryUtilities.centerFrameOnScreen( demo );    
		        demo.setVisible( true ); 
		        
		    }
		});
	}
	

}
