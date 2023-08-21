import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra: ");
		double preco = sc.nextDouble();
		double novoPreco = (preco < 20) ? preco * 0.1 : preco *0.05;
		
		System.out.println("Valor do Desconto: " + novoPreco);
		System.out.println("Valor total: " + (preco - novoPreco));
		
		sc.close();
	}

}
