
public class Caching {

	private int number;

	private boolean prime;
	private boolean isPrimeClean; // numarul a fost updatat?

	private boolean perfect;
	private boolean isPerfectClean;

	private boolean magic;
	private boolean isMagicClean;

	public Caching(int number) { // constructor
		updateNumber(number);
	}

	public void updateNumber(int number) {
		this.number = number;
		this.prime = false;
		this.isPrimeClean = false;
	}

	private boolean isPrimeAlg() {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isPrime() {
		if (isPrimeClean == false) {
			System.out.println("Rulam alg pt nr prim");
			prime = isPrimeAlg();
			isPrimeClean = true;
		}
		return prime;
	}

	private boolean isPerfectAlg() {

		boolean nrPerfect = false;
		int sumDiv = 0;

		if (number <= 0) {
			nrPerfect = false;
		}

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sumDiv += i;
			}
		}
		System.out.println(sumDiv);

		if (sumDiv == number) {
			nrPerfect = true;
		}

		return nrPerfect;
	}

	public boolean isPerfect() {
		if (isPerfectClean == false) {
			System.out.println("Rulam alg pt nr perfect");
			perfect = isPerfectAlg();
			isPerfectClean = true;
		}
		return perfect;

	}

///

	private int digitSum() {

		int sumaCifre = 0;

		while (number != 0) {
			sumaCifre += number % 10;
			number /= 10;
		}
		return sumaCifre;
	}

	private int sumOut() {
		while (number > 9) {
			number = digitSum();
		}
		return number;
	}

	
	public boolean isMagicAlg() {

		int sum = sumOut();
		if (sum == 3 || sum == 7 || sum == 9) {
			return true;

		}
		return false;
	}

///	

	public boolean isMagic() {
		if (isMagicClean == false) {
			System.out.println("Rulam alg pt nr magic");
			magic = isMagicAlg();
			isMagicClean = true;
		}
		return magic;
	}
}
