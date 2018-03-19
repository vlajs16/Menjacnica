package menjacnica.valuta.kurs;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	
	@Override
	public String toString() {
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyy");
		return sf.format(datum.getTime()) 
				+ "\n\tProdajni kurs: " + prodajniKurs
				+ "\n\tKupovni kurs: " + kupovniKurs
				+ "\n\tSrednji kurs: " + srednjiKurs;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
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
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		return true;
	}




	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
}
