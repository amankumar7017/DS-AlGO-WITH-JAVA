import java.util.*;
class Print3largest{

	static void print3largest(int[] arr,int n){
		int first,second,third;
		first = second = third = Integer.MIN_VALUE;

		for (int i=0;i<n;i++) {
			
			if(arr[i]> first){
				third  = second;
				second = first;
				first  = arr[i];  

		}else if(arr[i] > second){
			third  =second;
			second = arr[i];
			
		}else if(arr[i]> third){
			third    = arr[i];
		}
}
	System.out.println("first no "+first);
	System.out.println("second no "+second);
	System.out.println("third no "+third);
}


	public static void main(String[] args) 
    	{ 
  
        int arr[] = {12, 13, 1, 10, 34, 1}; 
        int n = arr.length; 
        print3largest(arr, n); 
    } 
		
}