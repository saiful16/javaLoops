public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ( firstNumber < 10 || secondNumber < 10 || firstNumber > 99 || secondNumber > 99) {
            return false;
        } else {
            int lastDigitOfFirstNumber = firstNumber % 10;
            int firstDigitOfFirstNumber = firstNumber / 10;
            int lastDigitOfSecondNumber = secondNumber % 10;
            int firstDigitOfSecondNumber = secondNumber / 10;
            if (lastDigitOfFirstNumber == lastDigitOfSecondNumber || lastDigitOfFirstNumber == firstDigitOfSecondNumber || firstDigitOfFirstNumber == firstDigitOfSecondNumber || firstDigitOfFirstNumber == lastDigitOfSecondNumber ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(100,10));
    }
}
//nothings is changed
