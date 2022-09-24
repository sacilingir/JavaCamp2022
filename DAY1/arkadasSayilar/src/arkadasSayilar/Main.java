package arkadasSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  System.out.print("Enter the first number:");
	        Scanner scan = new Scanner(System.in);
	        int firstNumber = scan.nextInt();

	        System.out.print("Enter the second number:");
	        Scanner scan1 = new Scanner(System.in);
	        int secondNumber = scan1.nextInt();

	        int total1 = 0;
	        int total2 = 0;


	        for(int i=1 ; i < firstNumber ; i++) {
	            if(firstNumber % i == 0) {
	                total1 += i;
	            }
	        }

	        for(int i=1 ; i < secondNumber ; i++) {
	            if(secondNumber % i == 0) {
	                total2 += i;
	            }
	        }

	        if (firstNumber == total2 && secondNumber == total1) {
	            System.out.println("Bu sayılar arkadaş sayılardır.");
	        }else {
	            System.out.println("Bu sayılar arkadaş sayı değildir.");
	        }

	}

}
