import java.util.*;
class RecursionSet1{

	// recursion  basic problem set 1 ;
		

	 public static void  PD(int n){
		
		if(n==0){
			return;
		}


		System.out.print(" "+n);
		PD(n-1);

	}

	public static void PI(int n){

		if(n==0){
			return;
		}
		PI(n-1);
		System.out.print(" "+n);
	}

 	public static void PID(int n){

 		if(n==0){
 			return ;
 		}

 		System.out.print(" "+n);
 		PID(n-1);
 		System.out.print(" "+n);
 	}

 	public static void PIDskip(int n){

 		if(n==0){
 			return ;
 		}

 		if(n%2==1){
 			System.out.print(" "+n);
 		}
 		PIDskip(n-1);
 		if(n%2==0){
 			System.out.print(" "+n);
 		}

 	}

 	public static int factorial(int n){

 		if(n==1){
 			return 1;
 		}

 		int fact = factorial(n-1);
 		int result =  fact*n;
 		return result;
 	}

 	
 	public static int Power(int x,int n){

 		if(x==0){
 			return 1;
 		}

 		int pow = Power(x-1,n);
 		int result =  pow*n;
 		return result;
 	}

 	public static int fibonacciTerm(int n){

 		if(n==1 || n==0){
 			return n;
 		}


		int result = fibonacciTerm(n-1)+fibonacciTerm(n-2);		
		return  result;

 	}

 	 // set 2 


	 public static boolean isSorted(int[] arr,int n){
		
		if(n == arr.length-1){
			return true;
		
		}

			if(arr[n] > arr[n+1]){
				return false;
			}else{
				boolean  res = isSorted(arr,n+1);
				return res;	
			}

		

	}

	// find the first index where the element occure first and return -1 if not present
	 
	 public static int firstIndex(int[] arr, int i, int data){

	 	if(i == arr.length){
	 		return -1;
	 	}
	 	if(arr[i] ==data){
	 		return i;
	 	}else{

	 		int res = firstIndex(arr,i+1,data);	
	 		return res;
	 	}
	 }

	public  static int lastIndex(int[] arr,int i,int data){

		if(i==arr.length){
			return -1;
		}

		int index = lastIndex(arr,i+1,data);

		if(index == -1){
			if(arr[i] == data){
				return i;
			}else{
				return -1;
			}
		}
		return index;
	}

	public static void pattern(int n,int row,int col){

		if(row > n){
			return;
		}
		
		if(col>row){
			System.out.println();
			pattern(n, row+1, 1);
			return;
		}

		System.out.print("*");
		pattern(n,row,col+1);

	}

	public  static void bubbleSort(int[] arr,int si,int li){

		if(li == 0 ){
			return;
		}
	
		if(si == li){
			bubbleSort(arr,0,li-1);
			return ;
		}

		if(arr[si] > arr[si+1]){
			int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = temp;
		}

		bubbleSort(arr,si+1,li);

	} 

	// return array containg all indicies where element occure

	public static int[] allIndics(int[] arr,int si,int data,int count){

		if(si == arr.length){

			int[] base = new int[count];
			return base;
		}


		int[] indicies= null;

		if(arr[si]== data){
			
			indicies = allIndics(arr,si+1,data,count+1);
			
		}else{
		
			indicies = allIndics(arr,si+1,data,count);

		}
		
			
			
			if(arr[si] == data){
				indicies[count] = si;
			}

			return indicies;

	}





	public static void main(String args[]) 
    { 
    	int n=5;
        
       // PD(n);
       // PI(n);
   	    //PID(n);
   	   // PIDskip(n);
    	//System.out.print(factorial(n));
    	//System.out.print(Power(5,n));
    	//System.out.print(fibonacciTerm(11)); // 89 ans
    	int[] arr ={3,6,8,9,5,8,17,1};
      	

      //	System.out.print(isSorted(arr,0)); 
    	//System.out.print(firstIndex(arr,0,8));// result - 2  0 base indexing
     	//System.out.print(lastIndex(arr,-1,8));// result 4  0 base indexing
      //	pattern(5,1,1);
    	// bubbleSort(arr,0,arr.length-1);

    	// for(int temp  : arr){
    	// 	System.out.print(temp+" ");
    	// }

    		int[] res = allIndics(arr,0,8,0);
    		for(int temp  : res){
    		System.out.print(temp+" ");
   			} 
	} 
}