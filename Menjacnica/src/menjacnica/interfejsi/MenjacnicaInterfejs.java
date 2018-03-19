package menjacnica.interfejsi;

import java.util.GregorianCalendar;

import menjacnica.valuta.Valuta;
import menjacnica.valuta.kurs.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodavanjeKursa(GregorianCalendar datum, Valuta valuta, 
			double prodajniKurs, double kupovniKurs, double srednjiKurs);
	
	public void brisanjeKursa(GregorianCalendar datum, Valuta valuta);
	
	public Kurs pronalazenjeKursa(GregorianCalendar datum, Valuta valuta);
	
}
