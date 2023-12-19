
import java.util.* ; 


// area of triangles using 3 sides ---> S = 1/2 * (a+b+c) Area = (S*(S-a)(S-b)(S-c))^1/2

public class Sides {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in) ; 

       System.out.println("ENTER ALL THE SIDES OF THE TRAINGLE : ") ; 

       float side1 = input.nextInt();
       float side2 = input.nextInt();
       float side3 = input.nextInt();

       double S = (1.0/2.0) * (side1+side2+side3);

       System.out.println("CAPTIAL S IS :" + S);

       double Area = Math.sqrt(S * (S-side1) * (S-side2) * (S-side3)) ; 

       System.out.println("THE ARE OF THE TRIANGLE IS :" + Area) ; 

       input.close() ; 




    }
    
}
