public class DaysOfTheWeek {
    public static void main(String[] args) {
    printDaysOfTheWeek(0);
    printDaysOfTheWeek(1);
    printDaysOfTheWeek(2);
    printDaysOfTheWeek(3);
    printDaysOfTheWeek(4);
    printDaysOfTheWeek(5);
    printDaysOfTheWeek(6);
    printDaysOfTheWeek(7);
    }

//    public static void printDaysOfTheWeek(int day) {
//        System.out.println(switch (day) {
//            case 0 -> "Sunday";
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            default -> "Invalid day";
//        });
//    }
    public static void printDaysOfTheWeek(int day) {
        String daysOfTheWeek = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "invalid day";
        };
        System.out.println(day + " is " + daysOfTheWeek);
    }
}
