package model;

import java.util.List;

public class Statistika {
	
	public static double racunajLitre(List<Kartica> kartice) {
		
		double ukupnoLitara = 0;
		
		for(Kartica k: kartice) {
			
			ukupnoLitara += k.getSipanoLitara();
		}
		
		
		return ukupnoLitara;
	}
	
	public static int extraPoeni(Korisnik korisnik) {
		
		int extraPoeni = 0;
		
		int poeni = korisnik.ukupnoZaradjenihPoena(korisnik.getKartice());
		
		if(poeni > 100) {
			
			extraPoeni = (int) (poeni * 0.2);
		}
		
		
		return extraPoeni;
	}
	
	public void poeniKartice(String pan, List<Kartica > kartice) {
		
		
	}

}
