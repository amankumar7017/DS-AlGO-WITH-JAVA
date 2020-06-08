import java.util.*;
class RotatedSortedArrayHaveMinimumElement{

	static int Rsame(int[] arr,int n){

		int left = 0;
		int right = n-1;

		for(int i=0;i<n;i++){

			int midpoint = left+(right-left)/2;

			if(arr[midpoint] < arr[midpoint-1] ){
				return arr[midpoint];
			}else if(arr[left]  <= arr[midpoint] && arr[midpoint] > arr[right]){
				left = midpoint+1;
			}else{
				right = midpoint -1;
			}


		}

		return arr[left];
	}


	public static void main(String args[]) 
    { 
    	// Assupmtion Rotated sorted Array as input.

        int arr[] = { 3,4,5,1,2 }; 
        int n = arr.length; 
        System.out.println( 
            "Rotated sorted array have minimum element is "
            + Rsame(arr, n)); 
    } 
} 