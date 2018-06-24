package projektUslugi;


import java.util.ArrayList;
import java.util.List;

//singleton
public class ListaUslug {
	private List<UslugaInterface> listaUslug = new ArrayList<>();
    private static ListaUslug instance;
    static int size = 0;
    
    
    private ListaUslug() {
    }
    
    public static ListaUslug getInstance() {
        if (instance == null) {
            instance = new ListaUslug();
        }
        
        return instance;
    }
    
    public void dodajDoListy(UslugaInterface usluga) {
    	instance.listaUslug.add(usluga);
    	size++;
    }
    
    public int size() {
    	return size;
    }
    
    public List<UslugaInterface> czytajListe() {
    	return instance.listaUslug;
    }
    
    public double policzSume(String kategoria) {
    	double suma = 0;
    	for (int i = 0; i < instance.listaUslug.size(); i++) {
    		if(instance.listaUslug.get(i).getKategoria() == kategoria) {
    			suma += instance.listaUslug.get(i).getCena();
    		}
    	}
    	return suma;
    }
    
    public void usunZListy(int id) {
    	for (int i = 0; i < instance.listaUslug.size(); i++) {
    		if (id == instance.listaUslug.get(i).getID()) {
    			instance.listaUslug.remove(instance.listaUslug.get(i));
    		}
    	}
    }
    
    
    
}