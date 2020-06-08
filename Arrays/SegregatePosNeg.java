class SegregatePosNeg{

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
    public static void PosNeg(int[] arr,int size){
    		
            int i =0;
            int j=size-1;

    	while(i < j ){
        	while( arr[i] < 0){//negetive Number 
                i++;
    	   }

            while(arr[j]>=0){

                j--;
            }

            swap(i,j,arr);
        }
 }

 public static void main(String[] args) 
    { 

    	//0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1
        int arr[] = {-1,3,8,-4,-5,-6,-7,-20,30,40};
        int size = arr.length; 
        PosNeg(arr,size);
        System.out.println("Array after segregation "); 
        printArray(arr); 
    } 
}
