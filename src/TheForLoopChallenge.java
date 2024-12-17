import java.util.Scanner;

public class TheForLoopChallenge {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 1000; i++){
            if (isPrime(i)){
                System.out.println(i + " is a prime number");
                count++;
                if (count == 10){
                    break;
                }
            }
        }

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

