package model;

import interfejs.IPoeni;

public class Kartica extends BasicCard implements IPoeni{
	
	private double sipanoLitara;
	private int tipKartice;
	
	
	
	public Kartica() {
		
	}
	
	
	public Kartica(int id, String pan, double sipanoLitara, int tipKartice) {
		super(id, pan);
		this.sipanoLitara = sipanoLitara;
		this.tipKartice = tipKartice;
	}


	public double getSipanoLitara() {
		return sipanoLitara;
	}


	public void setSipanoLitara(double sipanoLitara) {
		this.sipanoLitara = sipanoLitara;
	}


	public int getTipKartice() {
		return tipKartice;
	}


	public void setTipKartice(int tipKartice) {
		this.tipKartice = tipKartice;
	}


	@Override
	public void ispisiKarticu() {

		System.out.println("ID kartice: " + this.getId());
		System.out.println("PAN kartice: " + this.getPan());
	}


	@Override
	public int izracunajBrojPoena(Kartica kartica) {

		int brojPoena = 0; 
		
		if(kartica.getTipKartice() == 1) {    // Normal kartica - 2 poena
			brojPoena = (int) (kartica.getSipanoLitara() * 2);
		}
		else if(kartica.getTipKartice() == 2) {   // Gold kartica - 3 poena
			brojPoena = (int) (kartica.getSipanoLitara() * 3);
		}
		else {
			System.out.println("Pogresan tip kartice!!!");
		}
		
		
		return brojPoena;
	}
	
	

}
