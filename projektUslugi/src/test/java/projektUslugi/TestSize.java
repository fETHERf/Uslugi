package projektUslugi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSize {

	
	String nazwa[] = {"Internet", "Telefon", "Telefon", "Kino", "Restauracja"};
	double cena[] = {1, 2.0, -15.2, 190, 3};
	String kategoria[] = {"Edukacja", "Finanse i Ubezpieczenia", "Finanse i Ubezpieczenia", "25123", "CAPSLOCK"};
	
	ListaUslug lista = ListaUslug.getInstance();
	
	Usluga usluga = new Usluga(nazwa[0], cena[0], kategoria[0]);
	
	@Test
	void test() {
		assertEquals(5, lista.size());
		
		lista.dodajDoListy(usluga);
		
		assertEquals(6, lista.size());
	}

}
