import java.util.* ; 


public class Strings {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in) ; 

        String str[] = {"a","d","i","t","y","a"} ; 

        System.out.println("Enter a string :") ; 
        str = input.next() ; 

          int len = str.length() ; 
          System.out.println("LENGTH OF THE STRING IS :" + str) ; 

           
          String upper = str[0].toUpperCase() ; 
          System.out.println("upper case :" + str[0]) ; 


          input.close() ; 


    }

}


