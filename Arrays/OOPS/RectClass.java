

class Rectangle {
    public double length ; 
    public double width ; 

    public double Perimeter(){
        return 2*(length + width) ; 
    }
    public double Area(){
        return length * width ; 
    }

}




public class RectClass {
    public static void main(String arg[]){
        Rectangle r = new Rectangle() ;
        
        r.length=7;
        r.width=5 ; 

        System.out.println("THE PERIMETER OF THE RECTANGLE IS : " + r.Perimeter()) ; 
        System.out.println("THE AREA OF THE RECTANGLE IS : " + r.Area()) ; 
    }
    
}
