public class Palindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int original = number;
        int lastDigit = number % 10;

        while (original != 0){
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }


    public static void main(String[] args) {
        boolean checkNumber = isPalindrome(1211);
        System.out.println(checkNumber);
    }
}
