package polymorphismDemo;

public class EmailLogger extends BaseLoger{
	
	public void log(String message) {
		
		System.out.println("Logged to E-mail : " + message);	
			
		}
	
}
