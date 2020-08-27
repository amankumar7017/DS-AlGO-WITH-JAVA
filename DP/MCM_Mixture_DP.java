import java.util.*; 

class MCM_Mixture_DP{

	public static void main(String[] args) {
		
		int[] arr = {40,60,20,50}; 

		int[][] strg = new int[arr.length][arr.length];

		for(int i =0 ; i < arr.length;i++){
			Arrays.fill(strg[i],-1);
		}


		int ans = MCMTD(arr,0,arr.length-1,strg);

		//int ans = MCMBU(arr);

		System.out.println(ans);

	}

	

	public static int MCMTD(int[] arr, int si,int ei,int[][] strg){

		// base case 

		if(si == ei){
			return 0 ;
		}

		if(strg[si][ei] != -1){
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for(int k = si ;k <= ei-1; k++ ){

		int o1 = MCMTD(arr,si,k,strg);
		int o2 = MCMTD(arr,k+1,ei,strg);

		int sw = color(arr,si,k) * color(arr,k+1,ei);

		int total = o1+o2+sw;

		strg[si][ei] = total;

		if(total < min){
			min = total ; 
		}
	}

		return min ;

	}

	public static int color(int[] arr , int i, int j){

		int sum = 0 ;

		for(int k = i ; k<=j ; k++){
			sum +=arr[k];
		}

		return sum%100;
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