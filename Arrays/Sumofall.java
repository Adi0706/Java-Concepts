import java.util.* ; 

public class Sumofall {



   static int sumOfAll(int arr[],int n){

    int sum = 0 ;
    for(int i = 0 ; i < n ; i++){
        sum = sum+arr[i] ; 
    }

    return sum ; 

    }
    

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in) ; 
        System.out.println("ENTER INTO ARRAY :");

           int[] arr = new int[10] ; 

        for(int i = 0 ;i<10;i++){
            arr[i] = input.nextInt() ; 
        }

        int result = sumOfAll(arr,10);
        System.out.println("THE SUM OF ALL ELEMENTS IN THE ARRAY IS :" + result) ; 


        input.close() ; 
    }
}
