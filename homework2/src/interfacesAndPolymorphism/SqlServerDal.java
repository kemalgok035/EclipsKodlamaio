package interfacesAndPolymorphism;

public class SqlServerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("SQL Server added...");
		
	}

}
