class RotateMatrix90{

	public void print(int[][] arr){

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();

			}
		}


	public void Transpose(int[][] arr){

		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				//this is for lit optimize
				//System.out.print("this is extends");
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				
			}
		}
	}

	public void flipHorizontally(int[][] arr){
			for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length/2;j++){

					int temp = arr[i][j];
					arr[i][j] = arr[i][arr.length-1-j] ;
					arr[i][arr.length-1-j]= temp;                     

			}}
			
	
}
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		//step 1 : Transpose matrix
		//Step 2 : Flip horizontally

		RotateMatrix90 obj= new RotateMatrix90();
		obj.print(arr);
		System.out.println();
		obj.Transpose(arr);
		System.out.println("Transpose");

		obj.print(arr);
		
		obj.flipHorizontally(arr);
		System.out.println("flipHorizontally");
		obj.print(arr);


	}
}
