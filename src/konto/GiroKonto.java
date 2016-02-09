package konto;

public class GiroKonto extends Konto {
	
	protected double limit;

	public GiroKonto(String inhaber, double limit) {
		super(inhaber);
		this.limit = limit;
	}

	public void auszahlen(double wert) {
		if(kontostand - wert < limit*-1 ){
			System.out.println("Limit �berzogen!");
		}
		else {
		super.auszahlen(wert);
		}
	}
}
