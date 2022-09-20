package sayiBulma;

public class Main {

	public static void main(String[] args) {
	int[] sayilar = new int[] {1,2,5,7,9,0};
	int aranacak = 5;
	boolean varMı = false;
	
	for(int sayi : sayilar){
		if (sayi == aranacak){
			varMı=true;
			break;
		}
	}
	if(varMı == true) {
		System.out.println("Sayı Dizide Bulunmaktadır...");
	} else {
		System.out.println("Sayı Dizide Bulunmamaktadır...");

	}

	}

}
