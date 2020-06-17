import java.util.*;
public class  TargetSum{
    public static void main(String args[]) {

      // target sum pair 
  
      Scanner sc = new Scanner(System.in);
      int length = sc.nextInt();
      int arr[]  = new int[length];

        for (int i =0;i<length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the target sum i will find the pairs of that target number");

        int target = sc.nextInt();

        //sum(arr,arr.length,target);// brute Force

        sum1(arr,arr.length,target); // optimized using 2 pointer


        


  }
        public static void sum(int[] arr,int n,int target){

                for (int i=0;i<n;i++ ) {
                  
                  for (int j=i+1;j<n;j++ ) {
                      
                      if(arr[i]+arr[j]== target){
                      
                          System.out.println(arr[i]+" "+arr[j]);
                      }

                  }
                    }
                  }

                   public static void sum1(int[] arr,int n,int target){

                    Arrays.sort(arr);

                    int start = 0;
                    int end = n-1;

                    while(start < end) 
                    {
                      int sum = arr[start] + arr[end];
                       if( sum == target){
                         System.out.println(arr[start]+" "+arr[end]);
                       }

                       

                          if(sum > target){
                            end --;
                          }
                          else{
                            start++;
                          }


                       }

                    }

                  }
                