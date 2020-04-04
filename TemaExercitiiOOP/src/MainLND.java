
public class MainLND {

	public static void main(String[] args) {
		Caching lnd = new Caching(20000000);

		long start;
		long end;

		start = System.nanoTime();
		lnd.isPrime();
		end = System.nanoTime();
		System.out.println("Time spent: " + (end - start));

	
		start = System.nanoTime();
//		System.out.println(lnd.isPrime());
		lnd.isPrime();
		end = System.nanoTime();
		System.out.println("Time spent: " + (end - start));
	
		start = System.nanoTime();
		lnd.isPrime();
		end = System.nanoTime();
		System.out.println("Time spent: " + (end - start));

		
		
		
		start = System.nanoTime();
//		System.out.println(lnd.isPerfect());
		lnd.isPerfect();
		end = System.nanoTime();
		System.out.println("Time spent: " + (end - start));
		
		start = System.nanoTime();
		lnd.isPerfect();
		end = System.nanoTime();
		System.out.println("Time spent: " + (end - start));
		
		
		
		
		start = System.nanoTime();
//		System.out.println(lnd.isMagic());
		lnd.isMagic();
		end = System.nanoTime();
		System.out.println("Time spent: " + (end - start));
		
		start = System.nanoTime();
		lnd.isMagic();
		end = System.nanoTime();
		System.out.println("Time spent: " + (end - start));
	}

}
