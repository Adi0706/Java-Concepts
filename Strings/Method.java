

public class Method {
    public static void main(String arg[]){
        String str = "adityab76@gmail.com" ; 

           int index = str.indexOf("@") ; 

           String uname = str.substring(0, index) ; // substring()--> specifying the starting and ending indexs of the username since its at
           // the beginning of the string so 0 , index of @
           String domain = str.substring(index+1, str.length()) ; // domain is after so @ so index + 1 to str.length().

           System.out.println("Username is :" + uname) ; 
           System.out.println("Domain name :" + domain) ; 


           System.out.println(domain.startsWith("gmail")) ; // checking the "gmail" string in domain 

    }
    
}
