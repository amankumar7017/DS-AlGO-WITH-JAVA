class SpiralMatrix  {
	public static void main(String[] args) {

		//input 
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		  for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();

		}
		int dir = 0;
		int top = 0;
		int right =	arr.length-1;
		int down =	arr.length-1;
		int left = 	0;
		
		while(top<=down && left<=right){
		System.out.println();
		if(dir==0){

			for(int i=left;i<=right; i++ ){
				System.out.print(arr[top][i]);
				
			}
				top++;
				System.out.println();
		}


		 else if(dir==1){

			for(int i=top;i<=down; i++ ){
			System.out.print(arr[i][right]);
			

			}
			right--;
			System.out.println();
			
		}
		else if(dir==2){

			for(int i=right;i>=left; i--){
				System.out.print(arr[down][i]);
				
			}
				down--;
				System.out.println();
				
		}
		else if(dir==3){

			for(int i=down;i>=top;i--){
				System.out.print(arr[i][left]);
				
			}
			left++;
			System.out.println();
		}
			dir=(dir+1)%4;

			}
		

		
	}	
}
