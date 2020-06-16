import java.util.*;
public class  BubbleSort {
    public static void main(String args[]) {

  
      Scanner sc = new Scanner(System.in);
      int length = sc.nextInt();
      int arr[]  = new int[length];

        for (int i =0;i<length;i++) {
            arr[i] = sc.nextInt();
        }

        BubbleSort(arr,arr.length);

        


  }
        public static void BubbleSort(int[] arr,int n){

                for (int i=0;i<n-1;i++ ) {
                  
                  for (int j=1;j<n ;j++) {
                      
                        if(arr[j-1] > arr[j]){

                          int temp = arr[j-1];
                          arr[j-1]= arr[j];
                          arr[j] = temp;

                        }

                    }
                   
             }
       
       for (int temp : arr ) {
            System.out.println(temp);
        }
       
  }
}