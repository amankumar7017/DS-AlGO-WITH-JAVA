import java.util.*;
public class selctionSort {
    public static void main(String args[]) {

      //selection sort 

      Scanner sc = new Scanner(System.in);
      int length = sc.nextInt();
      int arr[]  = new int[length];

        for (int i =0;i<length;i++) {
            arr[i] = sc.nextInt();
        }

        selctionSort(arr,arr.length);

        


  }
       public static void selctionSort(int[] arr,int n){

            
                for (int i=0;i<n-1;i++ ) {
                  
                  int min  = i;

                  for (int j=i;j<n ;j++) {
                    
                      if(arr[j] < arr[min]){
                        min = j;
                      
                    

                        int temp = arr[i];
                        arr[i] = arr[min];
                        arr[min] = temp;
                      }
                    }
                  }
             
       
       for (int temp :arr ) {
            System.out.println(temp);
        }
       
  }
}


