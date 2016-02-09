package org.campus02.figures;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

	private ArrayList<Figure> figures;

	public FigureManager() {
		figures = new ArrayList<>();
	}

	public void add(Figure f) {
		figures.add(f);
	}

	public double getMaxPerimeter() {
		double max = 0;
		for (Figure figure : figures) {
			double Perimeter = figure.getPerimeter();
			if (Perimeter > max)
				max = Perimeter;
		}
		return max;
	}

	public double getAverageAreaSize() {
		double average = 0;
		for (Figure figure : figures) {
			average += figure.getArea();
		}
		return average / figures.size();
	}

	public HashMap<String, Double> getAreaBySizeCategories() {

		HashMap<String, Double> ergebnis = new HashMap<>();

		ergebnis.put("Klein", 0.0);
		ergebnis.put("Mittel", 0.0);
		ergebnis.put("Groß", 0.0);

		for (Figure figure : figures) {
			double area = figure.getArea();

			if (area < 1000) {
				ergebnis.put("Klein", ergebnis.get("Klein") + area);
			}
			if (area >= 1000 && area <= 4999) {
				ergebnis.put("Mittel", ergebnis.get("Mittel") + area);
			} else {
				ergebnis.put("Groß", ergebnis.get("Groß") + area);
			}
		}
		return ergebnis;
	}
}
