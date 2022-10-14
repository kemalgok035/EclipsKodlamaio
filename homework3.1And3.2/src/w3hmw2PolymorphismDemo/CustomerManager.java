package w3hmw2PolymorphismDemo;

public class CustomerManager {
	
	private BaseLoger logger;
	
	public CustomerManager(BaseLoger logger) {
		this.logger = logger;
		
		
	}
	
	
	public void add(){
		
	 System.out.println("Müşteri Eklendi...");
	 this.logger.log("Log Mesajı...");
	 
		
	}
	
}
