package model;

import java.util.ArrayList;
import java.util.List;

public class Korisnik {
	
	private int poeniPre;
	private List<Kartica> kartice = new ArrayList<Kartica>();
	
	public Korisnik() {
		
	}
	
	public Korisnik(int poeniPre, List<Kartica> kartice) {
		super();
		this.poeniPre = poeniPre;
		this.kartice = kartice;
	}
	

	public int getPoeniPre() {
		return poeniPre;
	}

	public void setPoeniPre(int poeniPre) {
		this.poeniPre = poeniPre;
	}

	public List<Kartica> getKartice() {
		return kartice;
	}

	public void setKartice(List<Kartica> kartice) {
		this.kartice = kartice;
	}
	
	public int ukupnoZaradjenihPoena(List<Kartica> kartice) {
		
		int ukupnoPoena = 0;
		
		for(Kartica k : kartice) {
			
			ukupnoPoena += k.izracunajBrojPoena(k);
			
		}
		
		return ukupnoPoena;
	}
	
	public void ukupnoPoenaPreIsaZaradom(int poeniPre, int ukupnoZaradjenihPoena) {
		
		
		int ukupnoPoena = this.ukupnoZaradjenihPoena(kartice);
		System.out.println("Korisnik do sada ima " + poeniPre + " poena");
		int totalPoena = poeniPre + ukupnoPoena;
		System.out.println("Nakon sipanja goriva ima " + totalPoena + " poena.");
		
	}
	
	

}
