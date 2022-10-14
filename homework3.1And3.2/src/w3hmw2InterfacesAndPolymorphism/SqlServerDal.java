package w3hmw2InterfacesAndPolymorphism;

public class SqlServerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("SQL Server added...");
		
	}

}
