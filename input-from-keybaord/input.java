import java.util.*;


// addtion of 2 number program 

public class input {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);


        int a , b , ans ;
        System.out.println("Enter the value of a and b :") ; 
        a = s.nextInt();
        b= s.nextInt();

        ans = a + b ; 

        System.out.println("The  sum of 2 numbers is : " + ans) ; 
    }
}
//nextInt 
//nextFloat
//next-one w- one word 
//nextLine()-one sentence

// hasNextInt()- boolean value 
//hasNExtFLot() - for float