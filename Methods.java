import java.util.* ; 



public class Methods {

    int findProduct(int x , int y )
      {
        return (x*y);
      }




    public static void main(String arg[]){
        // multiply 2 numbers 

        Scanner input = new Scanner(System.in) ; 
        System.out.println("ENTER 2 NUMBERS TO MULTIPLY : ") ; 
        

        int num1 = input.nextInt() ; 
        int num2 = input.nextInt() ; 

        Methods mp = new Methods() ; 
        int result = mp.findProduct(num1,num2);
        System.out.println("THE PRODUCT OF 2 NOS :" + result) ;

        input.close() ;

    }
    
}
