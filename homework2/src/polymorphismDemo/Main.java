package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		/*BaseLoger[] loggers = new BaseLoger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		
		for (BaseLoger logger : loggers) {
			logger.Log("Log Mesajı..");
		}*/
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		
		
		
		
	}

}
