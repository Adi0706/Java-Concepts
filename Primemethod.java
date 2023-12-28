import java.util.Scanner;

public class Primemethod {

    static void findPrime(int x){
        if(x % 2 == 0 ){
            System.out.println("THE NUMBER IS NOT PRIME") ;
        }else{
            System.out.println("THE NUMBER IS PRIME :") ; 
        }
 
    }

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in) ; 
        System.out.println("ENTER A NUMBER :") ;


        int num = input.nextInt();
        findPrime(num);


        input.close();
    }



    
}
