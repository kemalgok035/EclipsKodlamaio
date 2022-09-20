package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'a';
		
		switch (harf) {
		case 'A' | 'a':
		case 'I' | 'ı':
		case 'O' | 'o':
		case 'U' | 'u':
			System.out.println("Kalın Sesli Harf...");
			break;
		default:
				System.out.println("İnce Sesli Harf...");
			
		}
	}

}
