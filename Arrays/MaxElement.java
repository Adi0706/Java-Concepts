
import java.util.* ; 

public class MaxElement {

   static int findMaxElement(int arr[],int n){

        int max = arr[0] ; 
        for(int i = 0 ; i < n ; i ++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max ; 

    }


    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("ENter the size of the array") ; 
        int size = sc.nextInt() ;


        int[] arr = new int[size] ; 
        System.out.println("ENTER IN THE ARRAY :");
        for(int i = 0 ; i < size ; i ++){
            arr[i] = sc.nextInt();
        }

        int result = findMaxElement(arr,size) ; 
        System.out.println("THE MAX ELEMENT IS :" + result);

        sc.close() ; 
    }
    
}
