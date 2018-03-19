package menjacnica.valuta;

import java.util.ArrayList;

import menjacnica.valuta.kurs.Kurs;

public class Valuta {
	private String nazivValute;
	private String skraceniNaziv;
	private ArrayList<Kurs> kursevi;
	
	
	@Override
	public String toString() {
		return nazivValute + " (" + skraceniNaziv +")" + "\n"
				+ kursevi.get(kursevi.size()-1).toString();
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}



	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		if(nazivValute.equals(null))
			throw new RuntimeException("Naziv valute je NULL");
		if(nazivValute.isEmpty())
			throw new RuntimeException("Naziv valute je prazan string");
		this.nazivValute = nazivValute;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv.equals(null))
			throw new RuntimeException("Skraceni naziv valute je NULL");
		if(skraceniNaziv.isEmpty())
			throw new RuntimeException("Skraceni naziv valute je prazan string");
		this.skraceniNaziv = skraceniNaziv;
	}
	public ArrayList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(ArrayList<Kurs> kursevi) {
		if(kursevi.equals(null))
			throw new RuntimeException("Kursevi su null");
		this.kursevi = kursevi;
	}

	
	
}
