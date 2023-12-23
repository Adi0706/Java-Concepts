

import java.util.* ; 

public class Tasks {

    //Task-1
    // public static void main (String arg[]){
    //     Scanner input = new Scanner(System.in) ; 
    //     System.out.println("Enter a number you wnat to check :") ;
    //     int number = input.nextInt();

    //     if(number % 2 == 0 ) {
    //         System.out.println("The number is even") ; 
    //     }else{
    //         System.out.println("The number is odd") ; 
    //     }


    //     input.close() ; 
    // }


//Task-2
// public static void main (String arg[]) {
//     Scanner age = new Scanner(System.in) ; 
//     System.out.println("Enter your age : ") ; 
//     int user_age = age.nextInt();


//     if(user_age < 30){
//         System.out.println("You are young");
//     }else{
//         System.out.println("You are old") ; 
//     }

//     age.close() ;

// }


// Task-3 
public static void main(String arg[]) {
    Scanner marks = new Scanner(System.in);
    System.out.println("Enter your marks :");
    int currentMarks = marks.nextInt();

    if (currentMarks >= 90 && currentMarks <= 100) {
        System.out.println("GRADE A");
    } else if (currentMarks >= 80 && currentMarks < 90) {
        System.out.println("Grade B");
    }

    marks.close();
}

    
}
