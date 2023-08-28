import java.util.Scanner;
import entities.Account;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = scan.next();
		
		System.out.print("Is there na initial deposit (y/n)? : ");
		char firstDeposit = scan.next().charAt(0);
		
		if(firstDeposit == 'n') {
			Account newAccount = new Account(number, name);
			System.out.println("Updated data: ");
			newAccount.showData();
			
			System.out.print("Enter a deposit value: ");
			double newValue = scan.nextDouble();
			newAccount.deposit(newValue);
			System.out.println("Updated data: ");
			
			System.out.print("Enter a withdraw value: ");
			double withDrawValue = scan.nextDouble();
			newAccount.withdraw(withDrawValue);
			
		}else {
			System.out.print("Enter inital deposit value: ");
			double value = scan.nextDouble();
			Account newAccount = new Account(number, name, value);
			
			System.out.print("Enter a deposit value: ");
			double newValue = scan.nextDouble();
			System.out.println("Updated data: ");
			newAccount.deposit(newValue);
			
			
			System.out.print("Enter a withdraw value: ");
			double withDrawValue = scan.nextDouble();
			newAccount.withdraw(withDrawValue);
		}
		scan.close();	
	}
}
