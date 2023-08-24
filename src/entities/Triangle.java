package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double areaResult() {
		double p = (a + b + c) / 2;
		double areaResult = p*((p - a) * (p - b) * (p - c));
		double area = Math.sqrt(Math.abs(areaResult));
		
		return area;
	}
}
