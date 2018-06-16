package uslugiProjekt;

public class Usluga {
	private int id_uslugi;
	private String nazwa_uslugi;
	private double cena_uslugi;
	
	public Usluga() {}
	public Usluga(int id, String nazwa, double cena) {
		id_uslugi = id;
		nazwa_uslugi = nazwa;
		cena_uslugi = cena;
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
	
	public void edytuj(int id, String nazwa, double cena) {
		this.id_uslugi = id;
		this.nazwa_uslugi = nazwa;
		this.cena_uslugi = cena;
	}
	
	
	
}
