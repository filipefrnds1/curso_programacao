package packest;

public class Product {
	
	private String name;
	private double price;
	private Integer quantity;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double TotalValueInStock() {
		return this.price * this.quantity;	
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
		
				
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
		
	}
	
	public String toString() {
		return "Product data: " + this.name
				+ ", $ " + String.format("%.2f", this.price) + ", " +
				this.quantity + " units, Total: $ " +
				String.format("%.2f", this.TotalValueInStock());
	}
	

}
