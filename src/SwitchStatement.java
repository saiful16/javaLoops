public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("from switch 1 statement");
                break;
            case 2:
                System.out.println("From switch 2 statement");
                break;
            case 3:
                System.out.println("From switch 3 statement");
                break;
            default:
                System.out.println("Neither from switch 1, 2 or 3 statement");
                break;
        }
//        more code here
    }
}
