public class PrimeUtils {

    // Static function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;       // 0 and 1 are not prime
        if (n == 2) return true;        // 2 is prime
        if (n % 2 == 0) return false;   // multiples of 2 are not prime

        // Check odd divisors from 3 up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true; // no divisors found, number is prime
    }
}
