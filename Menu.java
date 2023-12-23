import java.util.*;

public class Menu {
    public static void main(String arg[]) {
        System.out.println("THIS IS A MENU DRIVEN PROGRAM ");
        System.out.println("Do you wish to continue?");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter 2 numbers");
            int number1, number2;
            number1 = input.nextInt();
            number2 = input.nextInt();
            input.nextLine(); // Consume the newline character

            System.out.println("WHICH OPERATION?");
            String operation = input.nextLine();

            switch (operation.toLowerCase()) {
                case "addition":
                    System.out.println( "ANSWER IS " + (number1 + number2));
                    break;
                case "substraction" :
                if(number1 > number2) {
                    System.out.println("ANSWER IS :"+ (number1-number2));
                }else{
                    System.out.println("ANSWER IS :"+ (number2-number1));
                }
                break;
                case "multiplication" :
                System.out.println("ANSWER IS : " + (number1 * number2)) ;
                break;
                case "division" :
                System.out.println("ANSWER IS : " + (number1/number2)) ; 
                break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }

            System.out.println("Do you wish to continue?");
            choice = input.nextLine();
        }
        input.close() ; 
    }
    
}
