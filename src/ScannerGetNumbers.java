import java.util.Scanner;

public class ScannerGetNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter a number #" + counter + " :");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }
        }while (counter <= 5);
        System.out.println(STR." The Sum of 5 number is = \{sum}");
    }
}
