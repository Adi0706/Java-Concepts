

class Super {
    public void display(){
        System.out.println("Display SUPER : ") ; 
    }
}

class Sub extends Super {
    public void display(){
        System.out.println("Display Sub : ") ; 
    }
}


public class overriding {
    public static void main(String arg[]){
        // Super sup = new Super() ; 
        // sup.display(); 
        
        // Sub su = new Sub() ; --> will give the sub class 
        // su .display();
        

        //DYNAMIC DISPATCH 
        Super s = new Sub() ; //---> method on the basis of object not reference.
        // methods present in super are only accessible //but after overriding methods of object class are called .
        s.display();
    }
    
}
