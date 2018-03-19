package menjacnica.valuta.kurs;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public Kurs() {
		
	}
	
	public Kurs(GregorianCalendar datum, double prodajniKurs, double kupovniKurs, double srednjiKurs) {
		this.setDatum(datum);
		this.setProdajniKurs(prodajniKurs);
		this.setKupovniKurs(kupovniKurs);
		this.setSrednjiKurs(srednjiKurs);
	}
	
	
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
		if(datum == null) 
			throw new RuntimeException("Datum ne sme biti  null");
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<0) 
			throw new RuntimeException("Prodajni kurs ne sme biti manji od nule");
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<0) 
			throw new RuntimeException("Kupovni kurs ne sme biti manji od nule");
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<0) 
			throw new RuntimeException("Srednji kurs ne sme biti manji od nule");
		this.srednjiKurs = srednjiKurs;
	}
}
