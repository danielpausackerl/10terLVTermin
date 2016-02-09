package konto;

public class SparKonto extends Konto {

	public SparKonto(String inhaber) {
		super(inhaber);
	}

	@Override
	public void auszahlen(double wert) {
		if(kontostand-wert<=0){
			System.out.println("Konto überzogen!");
		}
		else {
		super.auszahlen(wert);
		}
	}
}
