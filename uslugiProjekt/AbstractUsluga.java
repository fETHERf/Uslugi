package uslugiProjekt;

public abstract class AbstractUsluga implements UslugaInterface {
	protected int id_uslugi;
	protected String nazwa_uslugi;
	protected double cena_uslugi;
	protected String kategoria;
	
	public abstract boolean isNil();

	public abstract String getNazwa();
	public abstract int getID();
	public abstract double getCena();
	public abstract String getKategoria();
	public abstract void edytuj(String nazwa, double cena);
}