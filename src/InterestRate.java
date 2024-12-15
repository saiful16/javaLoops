public class InterestRate {
    public static void main(String[] args) {

//        for ( double rate = 2.0; rate <= 6; rate++) {
//            double interestRate = calculateInterestRate(10000, rate);
//            System.out.println("for amount 10000, interest rate at " + rate +"% is " + interestRate) ;
//        }

        for (double rate = 7.5; rate <= 10; rate += 0.25){

            double interest = calculateInterestRate(1000,rate);
            System.out.println("For amount 100$, interest rate at " + rate + " is " + interest + "$");
        }
    }


    public static double calculateInterestRate(double amount, double rate) {
        return (amount * (rate / 100));
    }
}


