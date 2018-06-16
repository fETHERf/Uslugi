package uslugiProjekt;


public class Main {
	public static void main(String[] args) {
	    Usluga usluga = new Usluga("oyster", 5.0);
	    Usluga usluga1 = new Usluga("shell", 4.75);
	    System.out.println("id: " + usluga.getID() + ", nazwa: " + usluga.getNazwa());
	    
	    ListaUslug instance = ListaUslug.getInstance();
	    instance.dodajDoListy(usluga);
	    instance.dodajDoListy(usluga1);
	    instance.usunZListy(2);
	    
	    
	    
	    System.out.println(instance.czytajListe().get(0).getNazwa());
	}
}
