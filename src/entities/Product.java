package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int newQuantity) {
		quantity += newQuantity;
	}
	
	public void removeProducts(int newQuantity) {
		quantity -= newQuantity;
	}
	
	public String toString() {
		return name + ", $ " + price + ", " + quantity + " units, Total: " + totalValueInStock();
	}
}