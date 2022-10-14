package w3hmw2Overriding;

public class Main {

	public static void main(String[] args) {

		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] 
				{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager(), new StandartKrediManager()};
		
		for (BaseKrediManager krediManager : krediManagers) {
			
			System.out.println(krediManager.hesapla(1000));
			
		}
		
	}

}
