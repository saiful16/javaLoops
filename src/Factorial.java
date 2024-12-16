import java.util.Scanner;

public class Factorial {
    public static void factorial(int n) {
        int fact = 1;
        if (n < 1) {
            System.out.println("Invalid number");
            return;
        }
        for (int i = n; i >=1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }

//main method?
//    git conncection checking
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);
    }
}
