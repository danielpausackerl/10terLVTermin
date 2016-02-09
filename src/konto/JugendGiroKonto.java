package konto;

public class JugendGiroKonto extends GiroKonto {

	protected double buchungsLimit;

	public JugendGiroKonto(String inhaber, double limit, double buchungsLimit) {
		super(inhaber, limit);
		this.buchungsLimit = buchungsLimit;
	}

	@Override
	public void auszahlen(double wert) {
		if(wert>buchungsLimit){
			System.out.println("Buchngslimit überschritten!");
		}
		else{
			super.auszahlen(wert);
		}
	}
}


