package entitids;

public class Product {

	public String name;
	public double price; 
	public int quantidade; 
	
	public double totalValueInStock() {
		
		return price * quantidade;
		
	}
	
	public void addProducts(int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void removeProducts(int quantidade) {
		
		this.quantidade -= quantidade;
		
	}
	
	
	public String toString() {
		return name + ", $ " + price + ", " + quantidade + " units, Total: $ " +  totalValueInStock();
	}
	
	
	
	
}
