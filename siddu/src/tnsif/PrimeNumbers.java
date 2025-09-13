package tnsif;

	public class PrimeNumbers {

	    public static void main(String[] args) {
	        for (int n = 1; n <= 100; n++) {
	            if (isPrime(n)) {
	                System.out.println(n + " is a prime number");
	            }
	        }
	    }

	    static boolean isPrime(int n) {
	        if (n <= 1) return false; // 0 and 1 are not prime

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false; // not prime if divisible
	            }
	        }

	        return true; // no divisors found, it's prime
	    }
	}



