package w3hmw2AbstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
		
	
	}

}
