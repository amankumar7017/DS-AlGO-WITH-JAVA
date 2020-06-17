import java.util.*;
public class  InsertionSort{
    public static void main(String args[]) {

  
      Scanner sc = new Scanner(System.in);
      int length = sc.nextInt();
      int arr[]  = new int[length];

        for (int i =0;i<length;i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort(arr,arr.length);

        


  }
        public static void InsertionSort(int[] arr,int n){

                for (int i=1;i<=n-1;i++ ) {
                  

        int val= arr[i];

      
        int j= i-1;
        while(j>=0 && arr[j] > val){
          arr[j+1] = arr[j];
          j--;
        } 
        arr[j+1] =val;
      }
       
       for (int temp : arr ) {
            System.out.println(temp);
        }





       
  }
}         