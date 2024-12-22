public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number < 0){
            return -1;
        } else {
            while(number !=0){
                int lastDigit = number % 10;
                number = number / 10;
                if (lastDigit % 2 == 0){
                    sum = sum + lastDigit;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(15884));
    }
}
