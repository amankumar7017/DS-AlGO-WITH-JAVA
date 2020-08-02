// Java program to count 
// the number of unique 
// triplets whose XOR is 0 
import java.io.*; 
import java.util.*; 

class XORTriplet
{ 
	// function to count the 
	// number of unique triplets 
	// whose xor is 0 
	static int countTriplets(int []a, 
							int n) 
	{ 
		// To store values 
		// that are present 
		ArrayList<Integer> s = 
				new ArrayList<Integer>(); 
		for (int i = 0; i < n; i++) 
			s.add(a[i]); 
		
		// stores the count 
		// of unique triplets 
		int count = 0; 
		
		// traverse for all i, 
		// j pairs such that j>i 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = i + 1; 
					j < n; j++) 
			{ 
	
			// xor of a[i] and a[j] 
			int xr = a[i] ^ a[j]; 
		
			// if xr of two numbers 
			// is present, then 
			// increase the count 
			if (s.contains(xr) && 
				xr != a[i] && xr != a[j]) 
				count++; 
			} 
		} 
		
		
		return count / 3; 
	} 
	
	
	public static void main(String srgs[]) 
	{ 
		int []a = {1, 3, 5, 
				10, 14, 15}; 
		int n = a.length; 
		System.out.print(countTriplets(a, n)); 
	} 
} 
