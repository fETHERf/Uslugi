package projektUslugi;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


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

 
public class chart extends ApplicationFrame implements WindowListener{
   
   public chart( String title ) {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   
   public void windowClosing(WindowEvent e) {
	   this.dispose();
   }
   
   private static PieDataset createDataset( ) {
	   String kategorie[] = {"Rozrywka", "Edukacja", "Finanse i Ubezpieczenia", "Zdrowie i Uroda", "Inne"};
	   
	   ListaUslug instance = ListaUslug.getInstance();
      DefaultPieDataset dataset = new DefaultPieDataset( );
      for (int i = 0; i < kategorie.length; i++) {
          dataset.setValue( kategorie[i] , instance.getInstance().policzSume(kategorie[i]) );  
      }
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Mobile Sales",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);

      return chart;
   }
   
   
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }

   public static void main( String[ ] args ) {
      chart demo = new chart( "Mobile Sales" );  
      demo.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true ); 
   }
}