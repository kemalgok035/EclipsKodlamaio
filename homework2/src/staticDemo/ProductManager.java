package staticDemo;

public class ProductManager {
	
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.err.println("Added...");
		} else {
			System.out.println("Not Added...");
		}
		

		
	}

}
