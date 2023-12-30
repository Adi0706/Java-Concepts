

class mycircle{
    public double radius ; 

 public double area(){
  
  return Math.PI *radius*radius;
 }

 public double Perimeter(){
    return 2 * Math.PI*radius ;  
 }

public double Circumference(){
    return Perimeter() ; 
}

}




public class Circle {
    public static void main(String arg[]){
        mycircle c = new mycircle() ; 
        c.radius = 7 ; 
        System.out.println("THE RADIUS OF CIRCLE IS :" + c.radius) ; 
        System.out.println("THE AREA OF THE CIRCLE IS : " + c.area()) ; 
        System.out.println("THE PERIMETER OF THE CIRCLE IS :" + c.Perimeter());
        System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS :" + c.Circumference()) ;
    }
    
}
