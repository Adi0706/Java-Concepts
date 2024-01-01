

class Rectangle {
    int length ; 
    int breadth ; 

    public Rectangle(int l , int b ){
        this.length = l ; 
        this.breadth = b ; 
    }
    public  int Area(){
        return length * breadth ; 
    }
}

class Cuboid extends Rectangle {
    private int height ; 
    public Cuboid(int l,int b,int h ){
        super(l,b) ; 
        height = h ; 
    }
    public int volume(){
        return l*b*height;
    }
}




public class SUper {


    
}
