import java.util.*;
class DublicateFindinArray{
		
	
	//main task  to find in O(1) without any extra space..
	
	// Assumption for input array number is less or equal to  array length 
	
	//main crux  = make all number negetive by taking reference of each element in array . a number will be detectected 
	//             for dublicate that , that number is already has negetive index .. 

	public static void main(String[] args) {
			
		int[] arr = { 4,3,2,7,8,2,3,1};

		for(int i=0; i<arr.length ;i++){
			int index =Math.abs(arr[i])-1; // index genrating
		if(arr[index]>= 0){
			arr[index]  = -arr[index];
		}else{
			System.out.println(" "+Math.abs(arr[index]));
		}

		}

	}
}
