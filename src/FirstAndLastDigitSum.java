public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;
        int original = number;
        if (number == 0){
            return 0;
        } else if (number < 0) {
            return -1;
        } else if (number < 10){
            return number + number;
        } else if (number < 100) {
            number = number / 10;
            firstDigit = number % 10;
            sum = firstDigit + lastDigit;
            return sum;
        } else {
            while (original != 0) {
                firstDigit = original % 10;
                original = original / 10;
            }
            return firstDigit + lastDigit;
            }
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1));
        System.out.println(sumFirstAndLastDigit(99));
        System.out.println(sumFirstAndLastDigit(12223434));
    }
    }

