import java.util.* ; 

class Student {
    public int rollnumber ; 
    public String name ; 
    public String course ; 
    public int[] marks = new int[3];

    public void displayStudentDetails(){
        System.out.println("THE DETAILS ARE : " + rollnumber + name + course) ; 
    }

  public  void displayMarks(){
    for(int i = 0 ; i < 3;i++){
        System.out.println("MARKS IN SUBJECT " + (i+1) + ":"+ marks[i]);
    }
  }
    
  public int totalMarks(){
    int sum = 0 ; 
    for(int x : marks){
        sum=sum+x;
    }
    return sum ; 

  }

   public int avgMarks() {
    int sum = 0;
    for (int x : marks) {
        sum += x;
    }
    return sum / marks.length; 
}

public String getGrade() {
    int averageMarks = avgMarks();

    if (averageMarks >= 90 && averageMarks <= 100) {
        return "A";
    } else if (averageMarks >= 80 && averageMarks < 90) {
        return "B";
    } else if (averageMarks >= 70 && averageMarks < 80) {
        return "C";
    } else if (averageMarks >= 60 && averageMarks < 70) {
        return "D";
    } else {
        return "F";
    }
}



    }
  
     




public class studentClass {
    public static void main(String arg[]){

         Student s = new Student() ; 


        Scanner input = new Scanner(System.in) ; 
        System.out.println("ENTER YOUR ROLLNUMBER :") ; 
        s.rollnumber = input.nextInt() ; 
        System.out.println("ENTER YOUR NAME") ; 
        s.name = input.next() ;
        System.out.println("ENTER YOUR COURSE") ; 
        s.course = input.next() ; 

        System.out.println("ENTER YOUR MARKS :") ; 
        
        for(int i = 0 ;i < 3 ; i ++){
           s.marks[i] = input.nextInt() ;
        }

        s.displayStudentDetails();
        s.displayMarks();
        System.out.println("THE AVERAGE MARKS IS : " + s.avgMarks()) ; 
    }
    
}
