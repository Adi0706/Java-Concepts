import java.util.* ; 



class Area {
    public static void main(String arg[]){
         Scanner dimensions = new Scanner(System.in) ; 

         int height ; 
         int base ; 
         double area ; 
System.out.println("Enter the dimensions of the triangle");

        height = dimensions.nextInt();
        base = dimensions.nextInt();

         area = (1.0/2 ) * (base * height) ; // 1/2 will give 0 cuz both 1 and 2 are in integer 

         System.out.println("The area of the triangle is " + area);
         dimensions.close();
    }
}