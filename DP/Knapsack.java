import java.util.*; 
public class Knapsack{
	public static void main(String[] args) {
		

		int[] wt = {1,3,4,5};
		int[] price = {1,4,5,7}; 

		int capacity = 7 ;

//		int ans = KnapsackRecursion(wt,price,0,capacity);

	//	int ans = KnapsackTD(wt,price,0,capacity , new int[wt.length][capacity+1]);

		int ans = KnapsackBU(wt,price,capacity);

		System.out.println(ans);

	}

	public static int KnapsackRecursion(int[] wt , int[] price , int vidx , int capacity){


		if(vidx == wt.length || capacity <= 0){
			return 0 ;
		}

		int o1 = KnapsackRecursion(wt,price,vidx+1,capacity);

		int o2 = 0 ;

		if(capacity >= wt[vidx]){
			o2 = KnapsackRecursion(wt,price,vidx+1,capacity-wt[vidx])+price[vidx];
		}

		return Math.max(o1,o2);

	}

	public static int KnapsackTD(int[] wt , int[] price , int vidx , int capacity,int[][] strg ){


		if(vidx == wt.length || capacity <= 0){
			return 0 ;
		}


		if(strg[vidx][capacity] != 0){
			return strg[vidx][capacity] ;
		}

		int o1 = KnapsackTD(wt,price,vidx+1,capacity,strg);

		int o2 = 0 ;

		if(capacity >= wt[vidx]){
			o2 = KnapsackTD(wt,price,vidx+1,capacity-wt[vidx],strg)+price[vidx];
		}

		int ans = Math.max(o1,o2);

		strg[vidx][capacity] = ans; 

		return ans;

	}

	public static int KnapsackBU(int[] wt , int[] price,int capacity){

		int[][] strg = new int[wt.length+1][capacity+1];


		for(int i = wt.length-1; i >= 0 ; i-- ){

			for (int j = 1 ;j <= capacity ;j++ ) {
		


		int o1 = strg[i+1][j];

		int o2 = 0 ;

		if( j >= wt[i]){
			o2 =strg[i+1][j-wt[i]]+price[i];
		}

		int ans = Math.max(o1,o2);

		strg[i][j] = ans; 

			}


		}

		return strg[0][capacity];

	}
}