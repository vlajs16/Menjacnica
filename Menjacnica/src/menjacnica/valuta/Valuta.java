package menjacnica.valuta;

import java.util.ArrayList;

import menjacnica.valuta.kurs.Kurs;

public class Valuta {
	private String nazivValute;
	private String skraceniNaziv;
	private ArrayList<Kurs> kursevi;
	
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public ArrayList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(ArrayList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	
	
}
