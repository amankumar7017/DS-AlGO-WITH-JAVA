class Sort012{

    public static void printArray(int[] arr){

    	for (int temp : arr ) {
    		System.out.print(" "+temp);
    	}
    	System.out.println();
    }


	public static void swap(int a, int b,int[] arr){
    		int temp = arr[a];
    		arr[a] = arr[b];
    		arr[b] = temp;
    	}
   	
   	// main crux 
    public static void sort012(int[] arr,int size){
    		
    		int mid = 0,start =0,end = size-1;

    		while(mid <= end){

    			if(arr[mid]==0){
    				swap(start , mid,arr);
    				mid++;
    				start++;
    			}else if(arr[mid] == 1){
    				mid++;
    			}else if(arr[mid]==2){
    				swap(end,mid,arr);
    				end--;

    			}

    		}

    	}

 

 public static void main(String[] args) 
    { 

    	//0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1
        int arr[] = {0,1,2,0,1,2}; 
        int arr_size = arr.length; 
        sort012(arr, arr_size); 
        System.out.println("Array after seggregation "); 
        printArray(arr); 
    } 
}
