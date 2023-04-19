package paket;

public class Main {

	public static void main(String[] args) {
		
		finallyBlockWithException fbwe = new finallyBlockWithException();
		
		try {
			fbwe.ProcA();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		fbwe.ProcB();
		fbwe.ProcC();

	}

}
