import java.util.*;
public class MergedSortedArray{

  public static int[] mergeTwoSortedArray(int[] arr1,int[] arr2){

      int[] merged = new int[arr2.length+arr1.length];


      int i=0,j=0,k=0;
      while(i<arr1.length && j<arr2.length){

      

        if(arr1[i]<= arr2[j]){
          merged[k] = arr1[i];
          i++;
          k++;
        }else{
          merged[k] = arr2[j];
          j++;
          k++;
        }
      }
    
      if(i<=arr1.length){
        while(j<arr2.length){
          merged[k] = arr2[j];
          j++;
          k++;
        }
      }

       if(j==arr2.length){
        while(i<arr1.length){
          merged[k] = arr1[i];
          i++;
          k++;
        }
      
}
    return merged;
  }

   public static void main(String[] args) {
      
    int[] arr1 = {10,20,30,40,50};
    int[] arr2 = {15,30,45,60,70,80,90};

    int[] res = mergeTwoSortedArray(arr2,arr1);

    for (int temp : res) {
      System.out.print(temp+" ");
    }


    }
  }