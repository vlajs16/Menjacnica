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
		
		Kurs novi = new Kurs(datum, prodajniKurs, kupovniKurs, srednjiKurs);
		
		if(valute.contains(valuta)) {
			for(int i =0; i<valute.size(); i++) {
				if(!valute.get(i).equals(valuta)) continue;
				
				valute.get(i).getKursevi().add(novi);
				return;
			}
		}
		
		valuta.getKursevi().add(novi);
		valute.add(valuta);
	}

	@Override
	public void brisanjeKursa(GregorianCalendar datum, Valuta valuta) {
		if(valuta.equals(null)) return;
		if(!valute.contains(valuta)) return;
		if(datum.equals(null)) return;
		
		for(int i = 0; i<valute.size(); i++) {
			if(!valuta.equals(valute.get(i))) continue;
			for(int j = 0; j<valute.get(i).getKursevi().size(); j++) {
				if(!datum.equals(valute.get(i).getKursevi().get(j).getDatum())) continue;
				
				valute.get(i).getKursevi().remove(j);
				return;
			}
		}
	}

	@Override
	public Kurs pronalazenjeKursa(GregorianCalendar datum, Valuta valuta) {
		if(valuta.equals(null)) 
			throw new RuntimeException("Valuta je null");
		if(!valute.contains(valuta)) 
			throw new RuntimeException("Lista ne sadrzi ovu valutu");
		if(datum.equals(null))
			throw new RuntimeException("Datum je null");
		
		for(int i = 0; i<valute.size(); i++) {
			if(!valuta.equals(valute.get(i))) continue;
			for(int j = 0; j<valute.get(i).getKursevi().size(); j++) {
				if(!datum.equals(valute.get(i).getKursevi().get(j).getDatum())) continue;
				return valute.get(i).getKursevi().get(j);
			}
		}
		
		return null;
	}

}
