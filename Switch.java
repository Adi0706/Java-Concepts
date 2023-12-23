import java.util.*;

public class Switch {
    // public static void main (String arg[])
    // {
    // Scanner input = new Scanner(System.in) ;

    // System.out.println("Enter a day :") ;
    // int day = input.nextInt() ;

    // switch(day) {
    // case 1 : System.out.println("Monday") ;
    // break ;
    // case 2 : System.out.println("Tuesday") ;
    // break ;
    // case 3 : System.out.println("Wednesday") ;
    // break ;
    // case 4 : System.out.println("Thursday") ;
    // break ;
    // case 5 : System.out.println("Friday") ;
    // break ;
    // case 6 : System.out.println("Saturday") ;
    // break ;
    // case 7 : System.out.println("Sunday") ;
    // break ;
    // default : System.out.println("Day does not exist");
    // break;
    // }

    // input.close() ;
    // }

    // domain name switch case
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an URL : ");
        String url = input.nextLine();
        String domain = url.substring(url.lastIndexOf(".") + 1);

        switch (domain) {
            case "com":
                System.out.println("commercial");
                break;
            case "org":
                System.out.println("organisation");
                break;
            case "net":
                System.out.println("network");
                break;
            case "gov":
                System.out.println("government");
                break;
            case "in":
                System.out.println("india");
                break;
            default:
                System.out.println("INVALID");
                break;
        }
                  input.close() ; 
    }
}
