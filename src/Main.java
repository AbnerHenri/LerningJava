import java.util.Scanner;
import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira as medidas do triangulo X:");
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do traingulo Y:");
		
		 y.a = sc.nextDouble();
		 y.a = sc.nextDouble();
		 y.a = sc.nextDouble();
		 
		double areay = y.areaResult();
		double areax = x.areaResult();
		
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
