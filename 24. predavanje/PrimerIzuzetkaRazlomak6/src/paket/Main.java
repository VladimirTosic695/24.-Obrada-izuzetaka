package paket;

import java.util.Scanner;

public class Main {
	
	public static int kolicnik(int im, int br) {
			return br / im;	
	}

	public static void main(String[] args) {
		
		// 1. Napisati metodu za racunanje kolicnika razlomka
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite brojilac razlomka");
		int brojilac = sc.nextInt();
		System.out.println("Unesite imenilac razlomka");
		int imenilac = sc.nextInt();
		
		try {
			
		int rezultat = kolicnik(imenilac, brojilac);
		System.out.println("Kolicnik iznosi: "+rezultat);
		
		} catch (ArithmeticException e) {
		System.out.println("Deljenje nulom."+ e);
	}
		
	
	}

}
