package projektUslugi;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JPanel;


 
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
          dataset.setValue( kategorie[i] , instance.policzSume(kategorie[i]) );  
      }
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Wykres wydanych pieniêdzy na poszczególne kategorie",   // chart title 
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

}