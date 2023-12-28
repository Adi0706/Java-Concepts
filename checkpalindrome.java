import java.util.*;


public class checkpalindrome {
    public static void main(String arg[]){
        System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS A PALINDROM OR NOT :") ; 
        Scanner input = new Scanner(System.in) ; 

        int number = input.nextInt() ; 
        int new_number = number ;

        //121 
        // 12  1 
        // 1
        // 1 2
        // 10+2=12
        //12\
        
        int rev = 0 , r ; 
        while(number>0) {
             int rem =  number % 10 ;
            rev = rev*10 + rem ;
            number = number / 10 ; 
        }

    if(rev == new_number) {
        System.out.println("palindrome") ; 

    }else{
        System.out.println("Not a palindrome") ; 
    }
    }
    
}
