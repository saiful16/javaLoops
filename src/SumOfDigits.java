public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        if(n <0){
            return -1;
        }else if (n <10){
            return n;
        } else {
            while (n > 9){
                sum = sum + n % 10;
                n = n / 10;
            }
            sum = sum + n;
            return sum;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(10));
        System.out.println(sumOfDigits(9));
        System.out.println(sumOfDigits(90));
        System.out.println(sumOfDigits(91));
        System.out.println(sumOfDigits(92));
        System.out.println(sumOfDigits(93545));
        System.out.println(sumOfDigits(-935451));
    }
}
