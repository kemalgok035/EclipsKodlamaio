package encapsulation;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(8999);
		product.setStockAmount(3);
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());

	}

}
