import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite o nome %d do produto: ", (i + 1));
			String name = sc.next();
			
			System.out.printf("Digite o preco do %d produto: ", (i + 1));
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		double media = 0;
		
		for(int i = 0; i < n; i++) {
			 media += vect[i].getPrice();
		}
		
		System.out.println("A media da soma dos " + n + " produtos e: " + (media / n));
		
		sc.close();
	}
}
