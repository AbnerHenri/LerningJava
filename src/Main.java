import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Digite a quantidade de alturas: ");
		int n = sc.nextInt();
		double media = 0;
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Height " + (i + 1) + ": ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i = 0; i< n; i++) {
			media += vect[i];
		}
		
		double result = media / n;
		
		System.out.printf("A media dos %d valores e: %.2f", n, result);
		
		sc.close();
	}
}
