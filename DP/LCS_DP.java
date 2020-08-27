import java.util.*;
class LCS_DP{
	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "agcfd";

		//System.out.println(LCSRecursion(s1,s2,0,0));

		// int[][] strg = new int[s1.length()][s2.length()];

		// for(int i = 0 ; i < s1.length() ; i++){
		// 	Arrays.fill(strg[i],-1);
		// }

		//System.out.println(LCSTD(s1,s2,0,0,strg));


		System.out.println("Longest sub seq "+LCSBU(s1,s2));


	}

	public static int LCSRecursion(String s1, String s2 , int vidx1, int vidx2){

		if(vidx1 == s1.length() || vidx2 == s2.length() ){
			return 0 ; 
		}

		int ans ;

		if(s1.charAt(vidx1) == s2.charAt(vidx2)){
			ans = LCSRecursion(s1,s2,vidx1+1,vidx2+1)+1;
		}else{

			int o1 = LCSRecursion(s1,s2,vidx1,vidx2+1);
			int o2 = LCSRecursion(s1,s2,vidx1+1,vidx2);

			ans = Math.max(o1,o2);

		}

		return ans;
	}

	// top down dp 

	public static int LCSTD(String s1, String s2 , int vidx1, int vidx2,int[][] strg){

		if(vidx1 == s1.length() || vidx2 == s2.length() ){
			return 0 ; 
		}

		if(strg[vidx1][vidx2] != -1){
			return strg[vidx1][vidx2];
		}


		int ans ;

		if(s1.charAt(vidx1) == s2.charAt(vidx2)){
			ans = LCSTD(s1,s2,vidx1+1,vidx2+1,strg)+1;
		}else{

			int o1 = LCSTD(s1,s2,vidx1,vidx2+1,strg);
			int o2 = LCSTD(s1,s2,vidx1+1,vidx2,strg);

			ans = Math.max(o1,o2);

			strg[vidx1][vidx2] = ans ; 
		}

		return ans;
	}

	public static int LCSBU(String s1, String s2 ){

		int[][] strg = new int[s1.length()+1][s2.length()+1]; 

		// StringBuilder str = new StringBuilder() ; 

		for(int row = 1 ;row <= s1.length() ;row++){

			for (int col = 1 ; col <= s2.length() ; col++) {
				
			if(s1.charAt(row-1) == s2.charAt(col-1)){
				
				 strg[row][col] = strg[row-1][col-1]+1;

				// str.append(s1.charAt(strg[row][col]));

			}else{

			int o1 = strg[row-1][col];
			int o2 = strg[row][col-1];

			int	ans = Math.max(o1,o2);

			strg[row][col] = ans ; 
		    
		    }


			}
		}

		//display(strg);


		printsub(strg,s1,s2);

		//System.out.println(str.reverse());
 
		return strg[s1.length()][s2.length()];
	}


	public static void printsub(int[][] strg,String s1 , String s2 ){

		int i  = s1.length();
		int j =  s2.length();

		StringBuilder str = new StringBuilder() ; 


		while(i != 0  && j != 0 ){

			if(strg[i][j] == strg[i-1][j] && strg[i][j] == strg[i][j-1] ){

				j--;

			}else if( strg[i-1][j] == strg[i][j-1] ){

				i--;
				j--;

				str.append(s1.charAt(i));

			}else{

				if(strg[i-1][j] > strg[i][j-1]){
					i--; 

				}else{
					j-- ;
				}

			}


		}

		System.out.println(str.reverse());

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

