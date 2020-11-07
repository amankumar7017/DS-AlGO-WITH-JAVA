import java.util.*;
class LIS{
	public static void main(String[] args) {
		
		int[] arr = {10,9,2,5,3,7,101,18};

		// longest increasing sequence

		System.out.println(lisTD(arr,arr.length));
		System.out.println(LISBU(arr,arr.length));

		}

	// n^2 approch

	public static int lisTD(int[] arr, int length){

		int[] strg = new int[length];

		int max = Integer.MIN_VALUE;

		Arrays.fill(strg,1);

		for(int i =0 ; i< length;i++){
			for (int j = 0 ;j<i ;j++) {
				
				if(arr[j]<arr[i]){
					strg[i] = Math.max(strg[i],strg[j]+1);

				}

				max = Math.max(max,strg[i]);
			}
		}

		return max;

	}

	// nlogn Approch

	public static int LISBU(int[] arr,int length){

		int[] lastElement =new int[length];

		int len =1 ;

		lastElement[0] = arr[0] ;


		for(int i =0 ; i< length;i++){

			if(arr[i] > lastElement[len-1]){
				lastElement[len] = arr[i];
				len++;
			}else{

				int idx = binarySearch(lastElement,0,len-1,arr[i]);

				lastElement[idx] = arr[i];



			}


		}

		return len;

	}

	public static int binarySearch(int[] arr, int si , int li , int ets){

		
		int low = si ;
		int high = li;


		while(low<=high){

			int mid  = (low+high)/2;

			if(ets > arr[mid]){
				low = mid+1;
			}else{
				high = mid-1;
			}



		}


		return low;

	}

}