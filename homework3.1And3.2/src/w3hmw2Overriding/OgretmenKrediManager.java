package w3hmw2Overriding;

public class OgretmenKrediManager extends BaseKrediManager{
		
	
	public double hesapla(double tutar) {
		System.out.print("Öğretmen Kredisi : " );
		return tutar * 1.18;
	}
	
	
	
}
