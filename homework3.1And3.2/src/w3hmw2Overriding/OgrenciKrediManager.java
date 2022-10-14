package w3hmw2Overriding;

public class OgrenciKrediManager extends BaseKrediManager{

	
	public double hesapla(double tutar) {
		System.out.print("Öğrenci Kredisi : " );
		return tutar * 1.10;
	}
	
}
