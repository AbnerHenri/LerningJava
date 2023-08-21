import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora: ");
		double hora = sc.nextDouble();
		sc.close();
		
		if((hora > 1) && (hora < 11)) {
			System.out.println("Bom Dia");
		}
		
		if((hora >= 12) && (hora < 17)) {
			System.out.println("Boa Tarde");
		}
		
		if(hora >= 18) {
			System.out.println("Boa Noite");
		}
	}

}
