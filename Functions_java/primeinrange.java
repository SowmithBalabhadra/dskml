public class PrimeInRange {
    // Method to check if a number is prime
    public static Boolean check(int a) {
        if (a <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // Prime number
    }

    // Method to find and return the first prime number in the range [0, a]
    public static int primerng(int a) {
        for (int i = 0; i <= a; i++) {
            if (check(i)) {
                return i; // Return the first prime number found
            }
        }
        return -1; // Return -1 if no prime number is found
    }

    public static void main(String[] args) {
        System.out.println(primerng(10)); // Test the method
    }
}