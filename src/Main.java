import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Insira o nome: ");
		product.name = sc.next();
		
		System.out.print("Insira o preco: ");
		product.price = sc.nextDouble();
		
		System.out.print("Insira a quantidade: ");
		product.quantity = sc.nextInt();
		System.out.println(product.toString());
		
		System.out.print("Enter the number of the products to be added in stock: ");
		int add = sc.nextInt();
		product.addProducts(add);
		System.out.println(product.toString());
		
		System.out.print("Enter the number of the products to be remove in stock: ");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		System.out.println(product.toString());

		
		sc.close();
	}

}
