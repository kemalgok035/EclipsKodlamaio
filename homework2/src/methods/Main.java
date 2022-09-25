package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
		
			
	}
	
	
	public static void sayiBulmaca() {

		
			int[] sayilar = new int[] {1,2,5,7,9,0};
			int aranacak = 5;
			boolean varMı = false;
			
			for(int sayi : sayilar){
				if (sayi == aranacak){
					varMı=true;
					break;
				}
			}
			
			String message = "";
			if(varMı == true) {
				message = "Sayı Dizide Bulunmaktadır : " + aranacak;
				
				showMessage(message);
			
			} else {
				message = "Sayı Dizide Bulunmamaktadır : " + aranacak;
				showMessage(message);
				

			}

			

	
	
	
	
}
	
	public static void showMessage(String message) {
		
		System.out.println(message);
		
	}



}
