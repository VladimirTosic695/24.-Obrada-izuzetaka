package paket;

public class Main {

	public static void main(String[] args) {
		
		try {
			int a = 0;
			int b = 10 / a;
			System.out.println("a = " + a);
			
			try {
				if(a == 1) {
					a = a / (a-a);
				}
				if(a == 2) {
					int c[] = {1};
					c[10] = 100;
				}
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Greska sa indeksom. " + e);
			}
			
		} catch (ArithmeticException e) {
			System.out.println("Greska prilikom deljenja. " + e);
		}

	}

}
