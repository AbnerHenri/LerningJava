import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many emplyoees will be registered: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		List<Emplyoee> emplyoee = new ArrayList<>();
		
		for(int i = 0; i < quantity; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Emplyoee newEmplyoee = new Emplyoee(id, name, salary);
			
			emplyoee.add(newEmplyoee);
		}
		
		System.out.println();
		for(Emplyoee element : emplyoee) {
			System.out.printf("%d, %s, %.2f %n", element.getId(), element.getName(), element.getSalary());
		}
		
		
		
		sc.close();
	}
}
