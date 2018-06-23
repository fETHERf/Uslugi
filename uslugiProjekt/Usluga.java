package uslugiProjekt;

public class Usluga extends AbstractUsluga implements UslugaInterface {
	static int id = 0;
	private int id_uslugi;
	private String nazwa_uslugi;
	private double cena_uslugi;
	private String kategoria;
	
	public Usluga() {}
	public Usluga(String nazwa, double cena, String kategoria) {
		id_uslugi = id;
		nazwa_uslugi = nazwa;
		cena_uslugi = cena;
		this.kategoria = kategoria;
		id++;
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
	
	@Override
	public String getKategoria() {
		return kategoria;
	}
	
	@Override
	public void edytuj(String nazwa, double cena) {
		this.nazwa_uslugi = nazwa;
		this.cena_uslugi = cena;
	}
	

	@Override
	public boolean isNil() {
		return false;
	}
	
}
