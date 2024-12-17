public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(1) ? "is a prime number":"is not a prime number" );
        System.out.println(isPrime(2) ? "is a prime number":"is not a prime number" );
        System.out.println(isPrime(3) ? "is a prime number":"is not a prime number" );
        System.out.println(isPrime(4) ? "is a prime number":"is not a prime number" );
        System.out.println(isPrime(5) ? "is a prime number":"is not a prime number" );
        System.out.println(isPrime(6) ? "is a prime number":"is not a prime number" );
        System.out.println(isPrime(7) ? "is a prime number":"is not a prime number" );
        System.out.println(isPrime(17) ? "is a prime number":"is not a prime number" );

    }



    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2)
            return false;
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0)
                return false;
        }
        return true;
    }
}
