package paket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static int kolicnik(int im, int br) throws ArithmeticException {
		return br / im;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Unesite brojilac razlomka ");
		int brojilac = sc.nextInt();
		System.out.println("Unesite imenilac razlomka ");
		int imenilac = sc.nextInt();
		
		int rezultat = kolicnik(imenilac, brojilac);
		
		System.out.println("Kolicnik razlomka: "+rezultat);
		
		} catch (ArithmeticException e) {
			System.out.println("Izuzetak. " + e);
		} catch (InputMismatchException e) {
			System.out.println("Unesite celobrojnu vrednost. " + e);
		}

	}

}
