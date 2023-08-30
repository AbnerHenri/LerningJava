import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de colunas e linhas: ");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print("Digite o número da linha " + (i + 1) + " na " + (j + 1) + "º coluna : ");
				mat[i][j] = sc.nextInt();
				if(j == (n - 1)){ System.out.println(); }
			}
		}

		for(int i = 0; i < n; i++){
			System.out.print("Main Diagonal linha " + (i + 1) + " : ");
			System.out.println(mat[i][i] + " ");
		}

		System.out.println();
		System.out.println("Números Negativos: ");
		boolean negatives = false;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(mat[i][j] < 0){		
					int negative = mat[i][j];
					System.out.println(negative + " ");
					negatives = true;
				}
			}
		}

		if(!negatives) { System.out.println("Não há números negativos"); }

		System.out.println();

		sc.close();
	}
}
