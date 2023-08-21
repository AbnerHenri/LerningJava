import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Digite outro número: ");
		double numero2 = sc.nextDouble();
		
		
		double result = numero1 + numero2;
		
		System.out.println("O resultado da operação é: " + result);
		sc.close();
	}

}
