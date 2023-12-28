import java.util.* ; 

public class loops {
    // public static void main(String arg[]){
    //     //printing multiplication table...
    //     System.out.println("WHICH MULTIPLICATION YOU WANNA PRINT ?:"); 
    //     Scanner sc = new Scanner(System.in) ; 
    //     int number = sc.nextInt() ; 

    //     for(int i = 0 ; i <=10 ;i ++){
    //         System.out.println(number + " X  " + i + "   =   " + (number * i)); 
    //     }

    //     sc.close();
    // }


    //find sum of n numbers
    // public static void main(String arg[]){
    //     System.out.println("ENTER THE VALUE OF N :") ; 
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     int sum = 0 ;

    //     for(int i = 0 ; i <=n ; i ++){
    //         sum = sum+i ; 
    //     }

    //     System.out.println("The sum till n is" + sum) ; 
    //     sc.close() ;
    // }


    //factorial of a number using loops 

    public static void main(String arg[]){
        System.out.println("ENTER THE NUMBER YOU WANNA FIND THE FACTORIAL OF :") ; 
        Scanner sc = new Scanner(System.in) ; 
        
        int num = sc.nextInt() ; 
          System.out.print(num + " ! "+ "=") ; 
          int mul = 1 ;
        for(int i = 1 ; i<=num ;i++){
             mul = mul* i ; 

            
        }
        System.out.print(mul);

    }
}

// 5 num 
//num-1 = 4 