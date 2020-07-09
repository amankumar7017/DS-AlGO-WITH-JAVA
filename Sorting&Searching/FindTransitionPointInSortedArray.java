import java.util.*;
public  class FindTransitionPointInSortedArray{

  public static void main(String args[]) {

       // Scanner sc = new Scanner(System.in);
       //  int t  = sc.nextInt();

    // Find Trasition point in a sorted Array


        int[] arr = {0,0,0,1,1};
        
        int result =  BinaySearch(arr,arr.length-1,1);

        if(result == arr.length-1){

            if(arr[result] == 0){
                System.out.println("data not found");   

            }else{
                 System.out.println("Found data at index "+(result+1));
            }
    
        }else{
        System.out.println("Found data at index "+(result+1));   


   }
}

        public static int BinaySearch(int[] arr , int len , int searchData){

            //si - start index
            // li - last index

            int si = 0 ;
            int li = len;

            int mid = 0;


            while(si<=li){

                mid =  (si+li)/ 2;
                

                if(arr[mid]  < searchData){
                    si = mid+1;
                }else if(arr[mid]  > searchData  ) {
                    li  = mid-1 ;
                }else {
                    return mid;
                }

                }

                return  mid; 


            }




        }




