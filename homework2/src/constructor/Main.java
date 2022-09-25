package constructor;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "Laptop", "Asus Laptop", 8999, 3, "Siyah");
		
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(8999);
		product.setStockAmount(3);*/

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());

	}

}
