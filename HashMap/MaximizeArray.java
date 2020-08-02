// Java program to print the maximum elements 
// giving second array higher priority 
import java.util.*; 

class MaximizeArray
{ 

// Function to maximize array elements 
static void maximizeArrayApproch1(int[] arr1,int[] arr2) 
{ 
	// auxiliary array arr3 to store 
	// elements of arr1 & arr2 
	int arr3[] = new int[10]; 
	for(int i = 0; i < arr3.length; i++) 
	{ 
		//arr2 has high priority 
		arr3[i] = 0; 
	} 
	
	// Arraylist to store n largest 
	// unique elements 
	ArrayList<Integer> al = new ArrayList<Integer>(); 
	
	for(int i = 0; i < arr2.length; i++) 
	{ 
		if(arr3[arr2[i]] == 0) 
		{ 
			// to avoid repetition of digits of arr2 in arr3 
			arr3[arr2[i]] = 2; 
			
			// simultaneously setting arraylist to 
			// preserve order of arr2 and arr3 
			al.add(arr2[i]); 
		} 
	} 
	
	for(int i = 0; i < arr1.length; i++) 
	{ 
		if(arr3[arr1[i]] == 0) 
		{ 
			// if digit is already present in arr2 
			// then priority is arr2 
			arr3[arr1[i]] = 1; 
			
			// simultaneously setting arraylist to 
			// preserve order of arr1 
			al.add(arr1[i]); 
		} 
	} 

	// to get only highest n elements(arr2+arr1) 
	// and remove others from arraylist 
	int count = 0; 
	for(int j = 9; j >= 0; j--) 
	{ 
		if(count < arr1.length & 
		(arr3[j] == 2 || arr3[j] == 1)) 
		{ 
			// to not allow those elements 
			// which are absent in both arrays 
			count++; 
		} 
		else
		{ 
			al.remove(Integer.valueOf(j)); 
		} 
	} 

	int i = 0; 
	for(int x:al) 
	{ 
		arr1[i++] = x; 
	} 
} 

// Function to print array elements 
static void printArray(int[] arr) 
{ 
	for(int x:arr) 
	{ 
		System.out.print(x + " "); 
	} 
} 

static void maximizeArrayApproch2(int[] arr1,int[] arr2){


	PriorityQueue<Integer> queue = new PriorityQueue<>();
	
	for(int temp : arr1){
		queue.add(temp);
	}
	for(int temp : arr2){
		queue.add(temp);
	}

	for(int i=0;i<arr2.length;i++){
		queue.remove();
	}

	for(int i=0;i<arr2.length;i++){
		arr1[i] = queue.remove();
	}

}

 
public static void main(String args[]) 
{ 
	int arr1[] = {7, 4, 8, 0, 1}; 
	int arr2[] = {9, 7, 2, 3, 6}; 
	// maximizeArrayApproch1(arr1,arr2); 
	// printArray(arr1); 
	maximizeArrayApproch2(arr1,arr2); 
	printArray(arr1);
} 
} 


