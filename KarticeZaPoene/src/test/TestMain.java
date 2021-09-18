package test;

import java.util.ArrayList;
import java.util.List;

import model.Kartica;
import model.Korisnik;
import model.Statistika;

public class TestMain {

	public static void main(String[] args) {

		Kartica normalKartica = new Kartica();
			normalKartica.setId(1);
			normalKartica.setPan("5469");
			normalKartica.setSipanoLitara(30);
			normalKartica.setTipKartice(1);
			
		Kartica goldKartica = new Kartica(2, "65741", 25.5, 2);
		
		Korisnik korisnik = new Korisnik();
			korisnik.setPoeniPre(65);
			
		List<Kartica> kartice = new ArrayList<Kartica>();
		
			kartice.add(goldKartica);
			kartice.add(normalKartica);
			
			korisnik.setKartice(kartice);
			
		int ukupnoPoena = korisnik.ukupnoZaradjenihPoena(kartice);
		System.out.println("Ukupno poena na karticama je: " + ukupnoPoena);
		
		korisnik.ukupnoPoenaPreIsaZaradom(korisnik.getPoeniPre(), ukupnoPoena);
		
		int litraza = (int) Statistika.racunajLitre(kartice);
		System.out.println("Ukupna litraza je: " + litraza);
		
		int extraPoeni = Statistika.extraPoeni(korisnik);
		System.out.println("Extra poeni: " + extraPoeni);
			
	}

}
