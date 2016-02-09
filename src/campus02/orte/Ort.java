package campus02.orte;

import java.util.ArrayList;

public class Ort {
	
	private String name;
	private ArrayList <Ort> orte;
	
	
	public Ort(String name) {
		this.name = name;
		orte = new ArrayList<>();
	}
	
	public void addNachbar(Ort o){
		orte.add(o);
	}
	
	
}
