package w3hmw2Constructor;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(2,"Telefon","Sıfır Telefon",15000, 2, "Gold");
		
		
		Product product = new Product();
		product.setName("Laptop");
		product.getId();
		product.setDescription("Asus Laptop");
		product.setPrice(10000);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println("Ürün Kodu : " + product.getKod());
		
		productManager .add(product1);
		System.out.println("Ürün Kodu : " + product1.getKod());
		
		
		

	}

}
