import java.util.*; 

class MCM_DP{

	public static void main(String[] args) {
		
		int[] arr = {4,2,3,5,1}; // ans 29

		//int ans = MCMRecursion(arr,0,arr.length-1);
		//int ans = MCMTD(arr,0,arr.length-1,new int[arr.length+1][arr.length+1]);

		int ans = MCMBU(arr);

		System.out.println(ans);

	}

	public static int MCMRecursion(int[] arr, int si,int ei){

		// base case 

		if(si+1 == ei){
			return 0 ;
		}

		int min = Integer.MAX_VALUE;

		for(int k = si+1;k <= ei-1; k++ ){

		int o1 = MCMRecursion(arr,si,k);
		int o2 = MCMRecursion(arr,k,ei);

		int sw = arr[si] * arr[k] * arr[ei];

		int total = o1+o2+sw;

		if(total < min){
			min = total ; 
		}
	}

		return min ;

	}

	public static int MCMTD(int[] arr, int si,int ei,int[][] strg){

		// base case 

		if(si+1 == ei){
			return 0 ;
		}

		if(strg[si][ei] != 0){
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for(int k = si+1;k <= ei-1; k++ ){

		int o1 = MCMTD(arr,si,k,strg);
		int o2 = MCMTD(arr,k,ei,strg);

		int sw = arr[si] * arr[k] * arr[ei];

		int total = o1+o2+sw;

		strg[si][ei] = total;

		if(total < min){
			min = total ; 
		}
	}

		return min ;

	}


	public static int MCMBU(int[] arr){

		int n = arr.length;

		int[][] strg = new int[n][n];

		for(int slide = 1 ; slide < n ; slide++){

			for(int si=0 ; si <= n-slide-1; si++){

				int ei = si+slide ;


		if(si+1 == ei){
			strg[si][ei] = 0 ;
		}else{

		

		int min = Integer.MAX_VALUE;

		for(int k = si+1;k <= ei-1; k++ ){

			int o1 = strg[si][k];

			int o2 = strg[k][ei];

		int sw = arr[si] * arr[k] * arr[ei];

		int total = o1+o2+sw;

	

		if(total < min){
			min = total ; 
		}

		strg[si][ei] = min;

	}

	}



			}

		} 

		display(strg);

		return strg[0][n-1];
	}

	public static void display(int[][] strg){
		
		for(int i =0 ; i < strg.length; i++){
			for(int j = 0 ; j<strg[0].length;j++){
				System.out.print(strg[i][j]+" ");
			}
			System.out.println();
		}

	}


}