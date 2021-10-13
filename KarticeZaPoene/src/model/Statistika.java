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
	
	//ispisuje koliko je poena dobila kartica nakon sto se unese pan
	public static void poeniKartice(String pan, List<Kartica > kartice) {
		
		Kartica kartica = null;
		
		for(Kartica k : kartice) {
			if(k.getPan().equals(pan)) {
				kartica = k;
			}
		}
		
		if(kartica != null) {
			kartica.ispisiKarticu();
			System.out.println("Ima " + kartica.izracunajBrojPoena(kartica) + " poena!");
		}
		else {
			System.out.println("Ne postoji kartica sa unetim PANom!");
		}
		
	}

}
