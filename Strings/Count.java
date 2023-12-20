

// public class Count {
//     public static void main(String arg[]){
//         String str = "aditya" ; 
//         int count = 0 ; 
//         for(int i = 0 ; i < str.length();i++){
//             count++ ; 
//         }
//         System.out.println("Nukber of characters in the string are :" + count) ; 
//     }
    
// }


public class Count {
    public static void main(String arg[]){
        String str = "aa  bb  cc  dd " ; 

        String newString = str.replaceAll("\s", "");

        System.out.println(newString);
    }
}