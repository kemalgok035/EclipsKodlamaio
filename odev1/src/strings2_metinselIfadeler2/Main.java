package strings2_metinselIfadeler2;

public class Main {

	public static void main(String[] args) {
	
		
		String mesaj = "Bugün Hava Çok Güzel.";
		System.out.println(mesaj);
		
		
		
		String yeniMesaj= mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		
		
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String boslukluMesaj = "    mesajım var    ..    ";
		System.out.println(boslukluMesaj.trim());

	}

}
