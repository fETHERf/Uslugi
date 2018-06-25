package projektUslugi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUsuwania {

	String nazwa[] = {"Internet", "Telefon", "Us³uga Bankowa_51", "Kino", "Restauracja"};
	double cena[] = {1, 2.0, -15.2, 190, 3};
	String kategoria[] = {"Edukacja", "Finanse i Ubezpieczenia", "Rozrywka", "25123", "CAPSLOCK"};
	
	ListaUslug lista = ListaUslug.getInstance();
	
	Usluga usluga = new Usluga(nazwa[0], cena[0], kategoria[0]);
	Usluga usluga1 = new Usluga(nazwa[1], cena[1], kategoria[1]);
	Usluga usluga2 = new Usluga(nazwa[2], cena[2], kategoria[2]);
	Usluga usluga3 = new Usluga(nazwa[3], cena[3], kategoria[3]);
	Usluga usluga4 = new Usluga(nazwa[4], cena[4], kategoria[4]);
	
	
	
	
	@Test
	void test() {
		lista.dodajDoListy(usluga);
		lista.dodajDoListy(usluga1);
		lista.dodajDoListy(usluga2);
		lista.dodajDoListy(usluga3);
		lista.dodajDoListy(usluga4);
		
		lista.usunZListy(3);
		lista.usunZListy(4);
		
	
		assertEquals(nazwa[0],lista.czytajListe().get(0).getNazwa());
		assertEquals(nazwa[1],lista.czytajListe().get(1).getNazwa());
		
		
		
	}

}

