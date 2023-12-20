
import java.util.*;

public class Exercise {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = input.next();
       
     for(int i  = 0 ; i < str.length() ; i ++){
        System.out.print("THE CHARACTERS IN THE STRING ARE : " + str.charAt(i)) ; 
     }
      


        input.close();
    }
}
