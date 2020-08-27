import java.util.*;
class EditDistance_DP{
	public static void main(String[] args) {
	

		String s1 ="abcd";
		String s2 ="agcfd";

		// int ans  = EDRecursion(s1,s2,0,0);
		

		int[][] strg = new int[s1.length()][s2.length()];

		for(int i = 0 ; i < s1.length() ; i++){
			Arrays.fill(strg[i],-1);
		}

		int ans  = EDTD(s1,s2,0,0,strg);

		System.out.println(ans);

	}

	public static int EDRecursion(String s1, String s2 ,int vidx1 , int vidx2){

		if(vidx1 == s1.length() || vidx2 == s2.length() ){

			return  Math.max(s1.length()-vidx1,s2.length()-vidx2);

		}

		int ans ;

		if(s1.charAt(vidx1) == s2.charAt(vidx2)){

			ans = EDRecursion(s1,s2,vidx1+1,vidx2+1);
		}else{

			int o1 = EDRecursion(s1,s2,vidx1+1,vidx2);
			int o2 = EDRecursion(s1,s2,vidx1,vidx2+1);
			int o3 = EDRecursion(s1,s2,vidx1+1,vidx2+1);

			ans = Math.min(o1,Math.min(o2,o3))+1;


		}

			return  ans ; 

	}
	public static int EDTD(String s1, String s2 ,int vidx1 , int vidx2,int[][] strg){

		if(vidx1 == s1.length() || vidx2 == s2.length() ){

			return  Math.max(s1.length()-vidx1,s2.length()-vidx2);

		}

		if(strg[vidx1][vidx2] != -1){
			return strg[vidx1][vidx2]   ;
		}

		int ans ;

		if(s1.charAt(vidx1) == s2.charAt(vidx2)){

			ans = EDTD(s1,s2,vidx1+1,vidx2+1,strg);
		}else{

			int o1 = EDTD(s1,s2,vidx1+1,vidx2,strg);
			int o2 = EDTD(s1,s2,vidx1,vidx2+1,strg);
			int o3 = EDTD(s1,s2,vidx1+1,vidx2+1,strg);

			ans = Math.min(o1,Math.min(o2,o3))+1;


		}

		strg[vidx1][vidx2] = ans ; 

			return  ans ; 

	}
//incomplete
	public static int EDBU(String s1 , String s2 ){

		int strg = new int[s1.length()+1][s2.length()+1];

		for(int row = s1.length() -1 ;row >= 0 ;row--){

			for (int col = s2.length()-1 ;col >= 0;col--) {
		

		if(strg[vidx1][vidx2] =  ){

			return  Math.max(s1.length()-vidx1,s2.length()-vidx2);

		}

		if(strg[vidx1][vidx2] != -1){
			return strg[vidx1][vidx2]   ;
		}

		int ans ;

		if(s1.charAt(vidx1) == s2.charAt(vidx2)){

			ans = EDTD(s1,s2,vidx1+1,vidx2+1,strg);
		}else{

			int o1 = EDTD(s1,s2,vidx1+1,vidx2,strg);
			int o2 = EDTD(s1,s2,vidx1,vidx2+1,strg);
			int o3 = EDTD(s1,s2,vidx1+1,vidx2+1,strg);

			ans = Math.min(o1,Math.min(o2,o3))+1;


		}

		strg[vidx1][vidx2] = ans ; 

			}
		}	

	}
}