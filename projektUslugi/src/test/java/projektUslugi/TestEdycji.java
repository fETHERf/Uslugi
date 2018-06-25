package projektUslugi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEdycji {

	String nazwa[] = {"Internet", "Telefon"};
	double cena[] = {1, 2.0};
	String kategoria[] = {"Edukacja", "Finanse i Ubezpieczenia"};
	
	String nazwaTest[] = {"Internet i Telefon", "Costam123"};
	double cenaTest[] = {0.00, 2.15};
	
	
	Usluga usluga = new Usluga(nazwa[0], cena[0], kategoria[0]);
	Usluga usluga1 = new Usluga(nazwa[1], cena[1], kategoria[1]);
	
	
	
	@Test
	void test() {
		  usluga.edytuj(nazwaTest[0], cenaTest[0]);
		  usluga1.edytuj(nazwaTest[1], cenaTest[1]);
		  
	      assertEquals(nazwaTest[0],usluga.getNazwa());
	      assertEquals(cenaTest[0],usluga.getCena());
	      
	      assertEquals(nazwaTest[1],usluga1.getNazwa());
	      assertEquals(cenaTest[1],usluga1.getCena());
	      
	    
	}

}
