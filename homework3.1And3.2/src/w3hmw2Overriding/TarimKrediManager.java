package w3hmw2Overriding;

public class TarimKrediManager extends BaseKrediManager{
	
	public double hesapla(double tutar) {
		System.out.print("Tarım Kredisi : " );
		return tutar * 1.15;
		
	}

	
	
	
}
