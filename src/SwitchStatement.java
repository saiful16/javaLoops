public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
            case 1 -> System.out.println("from switch 1 statement");
            case 2 -> System.out.println("From switch 2 statement");
            case 3 -> System.out.println("From switch 3 statement");
            default -> System.out.println("Neither from switch 1, 2 or 3 statement");
        }
//        more code here

        String quarter = getQuaterString("April");
        System.out.println(quarter);
    }

    public static String getQuaterString(String quaterString) {


        return switch (quaterString) {
            case "January", "February", "March" -> "First quarter of the year";
            case "April", "May", "June" -> "second quarter of the year";
            case "July", "August", "September" -> "third quarter of the year";
            case "October", "November", "December" -> "fourth quarter of the year";
            default -> {
                String response = quaterString + " is badly formatted";
                yield response;
            }
        };
    }
}
