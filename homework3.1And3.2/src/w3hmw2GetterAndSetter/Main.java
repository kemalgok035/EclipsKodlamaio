package w3hmw2GetterAndSetter;

public class Main {

	public static void main(String[] args) {
		
		
		Product product = new Product();
		product.setName("Laptop");
		product.getId();
		product.setDescription("Asus Laptop");
		product.setPrice(10000);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println("Ürün Kodu : " + product.getKod());
		
		

	}

}
