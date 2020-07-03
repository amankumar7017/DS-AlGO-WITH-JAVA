import java.util.*;
public class A{
    
  public static void main(String args[]) {



      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-->0){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i < n;i++) {
            arr[i]=sc.nextInt();
        }
        
        int sum = sc.nextInt();

        coinChange(arr,sum,"",0);



        }
   }

   public static void coinChange(int[] arr,int sum ,String ans,int lastDenominationIndex){

         if(sum == 0){
          System.out.println(ans);
          return;
         }

          for (int i= lastDenominationIndex;i< arr.length ;i++ ) {
                
                if(sum >= arr[i]){
                  coinChange(arr,sum-arr[i],ans+arr[i],i);
                }

          }


   } 
}
   