package entities;

public class Account {
	private int number;
	private String name;
	private double value;
	
	public Account(int number, String name, double value) {
		this.number = number;
		this.name = name;
		this.value = value;
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
		value = 7801.1;
	}
	
	
	public int getNumber() {
		return number;
	}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getValue() {
		return value;
	}


	public void deposit(double value) {
		this.value += value;
		showData();
	}
	
	public void withdraw(double value) {
		this.value -= value;
		showData();
	}
	
	public void showData() {
		System.out.printf("Account %d, Holder: %s, Balance: %.2f %n", number, name, value);
	}
}
