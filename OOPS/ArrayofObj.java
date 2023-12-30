class Subject {
    private String subID ; 
    private String name ; 
    private int maxMarks ;
    private int marksObtain ; 

    public Subject(String subjectId , String subjectName , int maximumMarks , int marksObtain){
        this.subID = subjectId;
        this.name = subjectName ; 
        this.maxMarks = maximumMarks ; 
        this.marksObtain = marksObtain ; 
    }

}

class Student {
    private int rollno;
    private String Name ; 
    private String dept ; 
    
}


public class ArrayofObj {
    public static void main(String arg[]){

    Subject subs[] = new Subject[3];
    subs[0] =  new Subject( "HIN101" , "HINDI" , 100 , 99) ;
    subs[1] = new Subject ("MATH102","MATHS",100,80);
    subs[2] = new Subject ("SAN103" , "SANSKRIT",100,50) ; 
    
    
    
}}
