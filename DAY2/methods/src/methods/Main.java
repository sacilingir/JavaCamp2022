package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		System.out.print("Sayi gir:");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		boolean varMi = false;

		for (int number : numbers) {
			if (number == sayi) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Girdiğiniz sayi var:" + sayi);
		} else {
			mesajVer("Girdiğiniz sayi yok.");
		}

	}

	public static void mesajVer(String mesaj) {

		System.out.println(mesaj);

	}

}
