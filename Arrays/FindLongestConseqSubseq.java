import java.util.*;
class FindLongestConseqSubseq{
	
	
	// longest consecutive mean -- A sequence in array  like in below Array longest consecutive is 1,2,3,4;
	
	// go throught this code easy to understand...
	

	static int findLongestConseqSubseq(int[] arr,int n){

		int ans =0;
		Set<Integer> set = new HashSet<>();

		for(int temp: arr){
			set.add(temp);

		}

		for(int i=0;i<n;i++){

			if(!set.contains(arr[i] -1)){

				int j =arr[i];
				while(set.contains(j)){
					j++;
				}

			

			if(ans < j-arr[i]){

				ans = j-arr[i];	
			}
		}
	}

		return ans;

	}


	public static void main(String args[]) 
    { 
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 }; 
        int n = arr.length; 
        System.out.println( 
            "Length of the Longest consecutive subsequence is "
            + findLongestConseqSubseq(arr, n)); 
    } 
} 
