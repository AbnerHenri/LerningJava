import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as medidas do triangulo X:");
		
		double ax = sc.nextDouble();
		double bx = sc.nextDouble();
		double cx = sc.nextDouble();
		
		double px = (ax + bx + cx) / 2;
		double areaxResult = px*((px - ax) * (px - bx) * (px - cx));
		double areax = Math.sqrt(areaxResult);
		
		System.out.println("Insira as medidas do traingulo Y:");
		
		double ay = sc.nextDouble();
		double by = sc.nextDouble();
		double cy = sc.nextDouble();
		
		double py = (ay + by + cy) / 2;
		double areayResult = py*((py - ay) * (py - by) * (py - cy));
		double areay = Math.sqrt(areayResult);
		
		System.out.printf("A area do triangulo X: %.4f%n", areax);
		System.out.printf("A area do triangulo Y: %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("A maior area e a do triangulo X");
		}else {
			System.out.println("A maior area e a do traingulo Y");
		}
		
		sc.close();
	}

}
