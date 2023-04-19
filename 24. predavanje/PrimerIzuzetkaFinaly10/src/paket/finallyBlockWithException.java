package paket;

public class finallyBlockWithException {
	
	static void ProcA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo"); // throws je u zaglavlju metode
			// throw koriste se za bacanje izuzetka u telu metode
	
		} finally { // finally block se izvrsava bez obzira da li je doslo do izuzetka ili ne
			System.out.println("procA");
		}
	}
	
	
	static void ProcB() {
		try {
			System.out.println("procB");
			return; // break; System.exit(0); continue
		} finally {
			System.out.println("procB's finally ");
		}
	}
	
	// Execute a try block normally.
	static void ProcC() {
		try {
			System.out.println("inside procC");
		}  finally {
			System.out.println("procC's finally ");
		}
	}

}
