import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o valor de b: ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o valor de c: ");
		int c = sc.nextInt();
		sc.close();
		
		double delta = Math.pow(b, 2.0) - 4*a*c;
		
		double raiz = Math.sqrt(Math.abs(delta));
		
		double x1 = (-b + raiz) / a;
		double x2 = (-b - raiz) / a;
		
		System.out.println();
		
		System.out.printf("O valor de x1: %.4f \n", x1);
		System.out.printf("O valor de x2: %.4f", x2);
	}

}
