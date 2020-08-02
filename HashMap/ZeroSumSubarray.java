// A Java program to find if there is a zero sum subarray 
import java.util.Set; 
import java.util.HashSet; 

class ZeroSumSubarray { 
	
	// Returns true if arr[] has a subarray with sero sum 
	static Boolean subArrayExists(int arr[]) 
	{ 
		// Creates an empty hashset hs 
		Set<Integer> hs = new HashSet<Integer>(); 
		
		// Initialize sum of elements 
		int sum = 0;	 
		
		// Traverse through the given array 
		for (int i = 0; i < arr.length; i++) 
		{ 
			// Add current element to sum 
			sum += arr[i]; 
			
			// Return true in following cases 
			// a) Current element is 0 
			// b) sum of elements from 0 to i is 0 
			// c) sum is already present in hash map 
			if (arr[i] == 0 || sum == 0 || hs.contains(sum))						 
				return true; 
			
			// Add sum to hash set 
			hs.add(sum); 
		} 
		
		// We reach here only when there is 
		// no subarray with 0 sum 
		return false; 
	}	 
	
	// driver code 
	public static void main(String arg[]) 
	{ 
		int arr[] = {-3, 2, 3, 1, 6}; 
		if (subArrayExists(arr)) 
			System.out.println("Found a subarray with 0 sum"); 
		else
			System.out.println("No Such Sub Array Exists!");		 
	}		 
} 
// Input: {4, 2, -3, 1, 6}
// Output: true 
// There is a subarray with zero sum from index 1 to 3.

// Input: {4, 2, 0, 1, 6}
// Output: true 
// There is a subarray with zero sum from index 2 to 2.

// Input: {-3, 2, 3, 1, 6}
// Output: false
// There is no subarray with zero sum.