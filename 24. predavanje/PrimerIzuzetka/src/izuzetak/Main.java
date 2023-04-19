package izuzetak;

public class Main {

	public static void main(String[] args) {
		
		int d, a;
		
		try { // u try bloku se stavljaju naredbe one koje mogu baciti izuzetak
			// kao i one naredbe koje se nece izvrsiti ako dodje do izuzetka
			d = 0;
			a = 10 / d;
			System.out.println("Ova poruka nece biti odstampana.");
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom. ");
		}
		System.out.println("Program nastavlja sa izvrsavanjem");

	}

}
