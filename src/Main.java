import java.util.Locale;
import java.util.Scanner;

import packest.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		String nome;
		double preco;
		Integer quantidade;
		Integer x,y;
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		
			nome = sc.nextLine();
			prod.setName(nome);	
			
		System.out.print("Price: ");
		
			preco = sc.nextDouble();
			prod.setPrice(preco);
			
		System.out.print("Quantity in stock: ");
		
			quantidade = sc.nextInt();
			prod.setQuantity(quantidade);
			
		System.out.println(prod.toString());
		
		
		System.out.println("Product data: " + prod.getName() +
		", $ " + prod.getPrice() + ", " + prod.getQuantity() + " units, Total: $ " + prod.TotalValueInStock());
		
		System.out.print("Enter the number of products to be added in stock: ");
			x = sc.nextInt();
			prod.AddProducts(x);
		
		System.out.println("Product data: " + prod.getName() +
		", $ " + prod.getPrice() + ", " + prod.getQuantity() + " units, Total: $ " + prod.TotalValueInStock());
		
		System.out.print("Enter the number of products to be removed from stock: ");
			y = sc.nextInt();
			prod.RemoveProducts(y);
		
		System.out.println("Product data: " + prod.getName() + 
		", $ " + prod.getPrice() + ", " + prod.getQuantity() + " units, Total: $ " + prod.TotalValueInStock());
		
		
			sc.close();
		
	}

}
