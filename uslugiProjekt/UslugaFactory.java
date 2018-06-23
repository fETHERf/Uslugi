package uslugiProjekt;

public class UslugaFactory {
	   public UslugaInterface getType(boolean isNil, String nazwa, double cena, String kategoria) {
	      
	      if(isNil == false) {
	         return new Usluga(nazwa, cena, kategoria);
	      }
	      else if(isNil == true) {
	    	  return new NullUsluga();
	      }
	      
	      return null;
	   }
	}
