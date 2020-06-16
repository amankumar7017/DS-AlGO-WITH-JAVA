import java.util.*;
public class BinaySearch {
    public static void main(String args[]) {

  

        int[] arr = {2,5,8,12,16,23,38,56,72,91};

      int result =  BinaySearch(arr,arr.length,56);

      System.out.println(result)    ;


  }
       public static int BinaySearch(int[] arr,int n,int data){

        int startIndex =0;
        int endIndex = n-1;
        int mid  = 0;  
        while(startIndex <=endIndex){

            mid= (startIndex+endIndex)/2;

            if(arr[mid] < data){
              startIndex=mid+1;
            }else if(arr[mid] > data){
              endIndex = mid-1;
            }else{
              return mid;
            }
          }
            return -1;
        
  }
}



