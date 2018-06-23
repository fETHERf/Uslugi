/**Us³uga**/

package uslugiProjekt;

public class Usluga {
	static int id = 0;
	private int id_uslugi;
	private String nazwa_uslugi;
	private double cena_uslugi;
	private String kategoria;
<<<<<<< HEAD
	
=======

>>>>>>> Kamila
	public Usluga() {}
	public Usluga(String nazwa, double cena, String kategoria) {
		id_uslugi = id;
		nazwa_uslugi = nazwa;
		cena_uslugi = cena;
<<<<<<< HEAD
		this.kategoria = kategoria;
		id++;
=======
		id++;
		this.kategoria = kategoria;

>>>>>>> Kamila
	}

	public int getID() {
		return id_uslugi;
	}

	public String getNazwa() {
		return nazwa_uslugi;
	}

	public double getCena() {
		return cena_uslugi;
	}
<<<<<<< HEAD
	
	public String getKategoria() {
		return kategoria;
	}
	
=======

	public String getKategoria() {
		return kategoria;
	}

>>>>>>> Kamila
	public void edytuj(String nazwa, double cena) {
		this.nazwa_uslugi = nazwa;
		this.cena_uslugi = cena;
	}
<<<<<<< HEAD
	

	
	
=======




>>>>>>> Kamila
}
