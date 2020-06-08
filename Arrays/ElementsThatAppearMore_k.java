import java.util.*;
class ElementsThatAppearMore_k{

	//problem name  - Given an array of size n and a number k, 
	//                find all elements that appear more than n/k times

	//Approch 1 First, sort all elements using a O(nLogn) algorithm. 
	//         Once the array is sorted, we can find all required elements 
	//         in a linear scan of array. So overall time complexity of
	//         this method is O(nLogn) + O(n) which is O(nLogn). 

	// Approch 2 - using map
	//            use arr[i] key and its count as value .
	//            traverse elements,  which is value is greater then n/k print that  

	// Approch 2 is implemented here

	static void appears(int[] arr,int n,int k){

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		for (int i=0;i<n;i++) {
				
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}else{
				map.put(arr[i],1);
			}


			}
			int z= 4;
			Set<Integer> set = new HashSet<>();
			
			
			for(int i=0;i<n;i++){
				
				if(map.get(arr[i]) > z)
				{
					set.add(arr[i]);

				}
			}
			

			Object[] ar = set.toArray(); 
			for (int j = 0; j < ar.length; j++) 
            System.out.println(ar[j]); 
    		 
			

			//System.out.print(set); 
		
	}


	public static void main(String args[]) 
    { 
    	   	
        int arr[] = { 3,1,2,2,1,2,3,3,2,2}; 
        int n = arr.length; 
        int k =2;
        System.out.println( 
            "elements that appear more than n/k times "
            ); 
        appears(arr, n,k);
    } 
} 