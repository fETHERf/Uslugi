package uslugiProjekt;

import java.util.ArrayList;
import java.util.List;

//singleton
public class ListaUslug {
	private List<Usluga> listaUslug = new ArrayList<>();
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
    
    public void dodajDoListy(Usluga usluga) {
    	instance.listaUslug.add(usluga);
    	size++;
    }
    
    public int size() {
    	return size;
    }
    
    public List<Usluga> czytajListe() {
    	return instance.listaUslug;
    }
    
    public void usunZListy(int id) {
    	for (int i = 0; i < instance.listaUslug.size(); i++) {
    		if (id == instance.listaUslug.get(i).getID()) {
    			instance.listaUslug.remove(instance.listaUslug.get(i));
    		}
    	}
    }
    
}