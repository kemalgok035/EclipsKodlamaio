package loopDoWhile_doWhileDongusu;

public class Main {

	public static void main(String[] args) {
		int i = 1;
	
		do {
			
			System.out.println(i);
			
			i ++;
			
		} while(i<=10);
		System.out.println("Do-While Döngüsü Bitti...");
		
		
		i =1;
		do {
			
			System.out.println(i);
			
			i +=2;
		
		} while(i<=10);
		System.out.println("Tek Sayıları Yazan Do-While Döngüsü Bitti...");
		
		
		i =2;
		do {
			
			System.out.println(i);
			
			i +=2;
		
		} while(i<=10);
		System.out.println("Çift Sayıları Yazan Do-While Döngüsü Bitti...");
		
		int j =200;
		do {
			
			System.out.println(j);
			
			j ++;
		
		} while(j<=10);
		System.out.println("Bir Kere Çalışan Do-While Döngüsü Bitti...");
	
	}

}
