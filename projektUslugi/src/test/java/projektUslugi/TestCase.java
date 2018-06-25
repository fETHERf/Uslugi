package projektUslugi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	String nazwa[] = {"Internet", "Telefon", "Us³uga Bankowa_51", "Kino", "Restauracja"};
	double cena[] = {1, 2.0, -15.2, 190, 3};
	String kategoria[] = {"Edukacja", "Finanse i Ubezpieczenia", "Rozrywka", "25123", "CAPSLOCK"};
	
	Usluga usluga = new Usluga(nazwa[0], cena[0], kategoria[0]);
	Usluga usluga1 = new Usluga(nazwa[1], cena[1], kategoria[1]);
	Usluga usluga2 = new Usluga(nazwa[2], cena[2], kategoria[2]);
	Usluga usluga3 = new Usluga(nazwa[3], cena[3], kategoria[3]);
	Usluga usluga4 = new Usluga(nazwa[4], cena[4], kategoria[4]);
	
	@Test
	void test() {
	      assertEquals(nazwa[0],usluga.getNazwa());
	      assertEquals(nazwa[1],usluga1.getNazwa());
	      assertEquals(nazwa[2],usluga2.getNazwa());
	      assertEquals(nazwa[3],usluga3.getNazwa());
	      assertEquals(nazwa[4],usluga4.getNazwa());
	      
	      assertEquals(cena[0],usluga.getCena());
	      assertEquals(cena[1],usluga1.getCena());
	      assertEquals(cena[2],usluga2.getCena());
	      assertEquals(cena[3],usluga3.getCena());
	      assertEquals(cena[4],usluga4.getCena());
	      
	      assertEquals(kategoria[0],usluga.getKategoria());
	      assertEquals(kategoria[1],usluga1.getKategoria());
	      assertEquals(kategoria[2],usluga2.getKategoria());
	      assertEquals(kategoria[3],usluga3.getKategoria());
	      assertEquals(kategoria[4],usluga4.getKategoria());
	}

}
