package menjacnica;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import menjacnica.interfejsi.MenjacnicaInterfejs;
import menjacnica.valuta.Valuta;
import menjacnica.valuta.kurs.Kurs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private ArrayList<Valuta> valute;

	@Override
	public void dodavanjeKursa(GregorianCalendar datum, Valuta valuta, double prodajniKurs, double kupovniKurs,
			double srednjiKurs) {
		
		Kurs novi = new Kurs();
		novi.setDatum(datum);
		novi.setKupovniKurs(kupovniKurs);
		novi.setProdajniKurs(prodajniKurs);
		novi.setSrednjiKurs(srednjiKurs);
		
		if(valute.contains(valuta)) {
			int i = 0;
			while(!valute.get(i).equals(valuta)) i++;
			valute.get(i).getKursevi().add(novi);
			return;
		} 
		
		valuta.getKursevi().add(novi);
		valute.add(valuta);
		
	}

	@Override
	public void brisanjeKursa(GregorianCalendar datum, Valuta valuta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs pronalazenjeKursa(GregorianCalendar datum, Valuta valuta) {
		// TODO Auto-generated method stub
		return null;
	}

}
