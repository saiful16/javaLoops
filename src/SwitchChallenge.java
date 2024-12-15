public class SwitchChallenge {
    public static void main(String[] args) {
        System.out.println(getName('F'));
    }

    public static String getName(char c){
        switch (c){
            case 'A':
                return "Able" ;
            case 'B' :
                return "Backer" ;
            case 'C' :
                return "Charlie" ;
                case 'D' :
                    return "David" ;
                    case 'E' :
                        return "Emma" ;
        }
        return  c + " is not found";
    }
}
