import java.util.*;
public class MergeSort {

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


  public static int[] mergedSort(int[] arr,int si,int li){

    int mid = (si+li)/2;

    if(si == li){
      int[] baseResult = new int[1];
      baseResult[0] = arr[si]; // arr[si] == arr[li] chose any one
      return baseResult;
    } 

    int[] firstHalf = mergedSort(arr,si,mid);
    int[] secondHalf = mergedSort(arr,mid+1,li);

    int[] merge = mergeTwoSortedArray(firstHalf,secondHalf);

    return merge;
  }

   public static void main(String[] args) {
      
    
    int[] arr = {30,10,1,70,2,89,90};

    int[] res = mergedSort(arr,0,arr.length-1);

    for (int temp : res) {
      System.out.print(temp+" ");
    }

    }
  }