import java.util.*;
class Game1{
	public static void main(String[] args) {
		
		// assumption - arr must be even length;

		int[] arr = {1,5,100,2};

	// problem link - https://practice.geeksforgeeks.org/problems/optimal-strategy-for-a-game-1587115620/1/?category[]=Dynamic%20Programming&page=1&query=category[]Dynamic%20Programmingpage1

	// Optimal Strategy For A Game 

		int len = arr.length;

		int[][] strg =new int[len][len];

		System.out.println(gameRec(arr,0,len-1));
		System.out.println(gameRecTD(arr,0,len-1,strg));
		System.out.println(gameRecBU(arr,len));

	}

	public static int gameRec(int[] arr,int l , int r){


		// base case 

		if(l+1 == r) return Math.max(arr[l],arr[r]) ; 


		int a = arr[l] + Math.min(gameRec(arr,l+2,r),gameRec(arr, l+1,r-1));
		int b = arr[r]+Math.min(gameRec(arr, l+1,r-1),gameRec(arr,l,r-2));

		int res = Math.max(a,b);

		return res ; 	   	


	}


	public static int gameRecTD(int[] arr,int l , int r,int[][] strg){


		// base case 

		if(l+1 == r) return Math.max(arr[l],arr[r]) ; 


		if(strg[l][r] != 0){
			return strg[l][r];
		}


		int a = arr[l] + Math.min(gameRecTD(arr,l+2,r,strg),gameRecTD(arr, l+1,r-1,strg));
		int b = arr[r]+Math.min(gameRecTD(arr, l+1,r-1,strg),gameRecTD(arr,l,r-2,strg));

		int res = Math.max(a,b);

		strg[l][r] = res;

		return res ; 	   	


	}

	public static int gameRecBU(int[] arr,int length){

		int[][] strg = new int[length][length];

		for(int g = 0 ; g < length ; g++){


			for (int i =0,j = g; j < length;i++,j++ ) {


				if(g== 0){
					strg[i][j] = arr[i];
				}else if(g==1){
					strg[i][j] = Math.max(arr[i],arr[j]);
				}else{


					int a = arr[i] + Math.min(strg[i+2][j],strg [i+1][j-1]);
					int b = arr[j] + Math.min(strg[i+1][j-1],strg[i][j-2]);

					int res = Math.max(a,b);

					strg[i][j] = res;



				}
				
			}



		} 

		return strg[0][length-1];

	}
}