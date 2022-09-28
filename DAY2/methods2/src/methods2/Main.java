package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);	
		int sayi=topla(5,7);
		System.out.println(sayi);
		System.out.println(topla2(5,7,3,4,34,64,73));
		
	}
	
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	
	public static void sil() {
		System.out.println("Silindi");
		
	}
	
	public static void guncelle() {
		System.out.println("Guncellendi.");
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	//Variable Arguments
	public static int topla2(int ... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}

}
