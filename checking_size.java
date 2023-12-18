import java.util.* ; 


public class checking_size {
  public static void main(String arg[]) {

    Scanner input = new Scanner (System.in) ; 

   Integer integer_variable ;  // class type / Wrapper for int type

    System.out.println("Enter the data type to check the type :") ; 
    integer_variable = input.nextInt() ; 

    System.out.println("The size of the variable is :" + Integer.BYTES); // there is no sizeof() in java
  
    
  }  
}


// Integer.MAX_VALUE ;
//Integer.MIN_VALUE ; 
// Integer.BYTES 

// similarly for FLoat , String ,Boolean etc ...