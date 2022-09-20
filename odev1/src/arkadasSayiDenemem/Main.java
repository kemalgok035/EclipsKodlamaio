package arkadasSayiDenemem;

public class Main {

	public static void main(String[] args) {
		int sayi1,sayi2 = 1;
		int i,j = 1;
		int toplam1 = 0;
		int toplam2= 0;
		
		for (sayi1 = 1; sayi1 <=1000; sayi1++) {
		for (sayi2 = 1; sayi2 <=1000; sayi2++) {	
			for (i = 2; i <= 1000; i++) {
				if (sayi1 % i == 0) {
					toplam1 = toplam1 + i;
				}
			}
			for (j = 2; j <= 1000; j++) {
				if (sayi2 % j == 0) {
					toplam2 = toplam2 + j;
				}		
					
				if (sayi1 == toplam2 && sayi2 == toplam1) {
					System.out.println(sayi1 + " ve " + sayi2);
					System.out.println("Bu İki Sayı Arkadaştır...");
				} 
			}
			
		}
				

	}
	}
	
}
