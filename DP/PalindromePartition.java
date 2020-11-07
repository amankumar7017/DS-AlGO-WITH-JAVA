import java.util.*;
class Pp{

	public static void main(String[] args) {
		
		String s = "abacd";

		int[][] strg  = new int[s.length()][s.length()];
	//	boolean[][] isPalindrome = isPalindromeInfo(s,s.length());

		for(int i =0 ;i<s.length();i++){
			Arrays.fill(strg[i],-1);
			//Arrays.fill(isPalindrome[i],true);
		}

		System.out.println(palindromePartition(s,0,s.length()-1));
		System.out.println(palindromePartitionTD(s,0,s.length()-1,strg));
		System.out.println(palindromePartitionBU(s,s.length()));

	}

	static int palindromePartition(String s ,int si,int ei){


		if(isPalindrome(s,si,ei)){
			return 0 ;
		}

		int min  = Integer.MAX_VALUE;
		
		for(int k =si;k<=ei-1;k++){

			int a = palindromePartition(s,si,k);
			int b = palindromePartition(s,k+1,ei);

			int total = a+b+1;

			if(total < min){
				min = total;
			}

		}

		return min;

	}
	
	static int palindromePartitionTD(String s ,int si,int ei,int[][] strg){


		if(si+1 == ei ) return 1;


		if(isPalindrome(s,si,ei)){
			return 0 ;
		}

		if(strg[si][ei] != -1){
			return strg[si][ei];
		}

		int min  = Integer.MAX_VALUE;
		
		for(int k =si;k<=ei-1;k++){

			int a = palindromePartitionTD(s,si,k,strg);
			int b = palindromePartitionTD(s,k+1,ei,strg);

			int total = a+b+1;

			if(total < min){
				min = total;
			}

			strg[si][ei] = min;


		}

		return min;

	}


	static int palindromePartitionBU(String s,int length){

	  

		int[][] strg = new int[length][length];

		for(int slide = 0 ; slide <=length-1;slide++){
			for(int si = 0;si<=length-slide-1;si++){

				int ei = si+slide;

				if(isPalindrome(s,si,ei)){
					strg[si][ei] = 0 ;
				}else{
					int min  = Integer.MAX_VALUE;
		
				for(int k =si;k<=ei-1;k++){

					int a = strg[si][k];
					int b = strg[k+1][ei];

					int total = a+b+1;

					if(total < min){
						min = total;
					}

						strg[si][ei] = min;


					}
				}


			}
		}

		return strg[0][length-1];

	}




	static boolean isPalindrome(String s,int si, int ei){

		int l = si ;
		int r = ei;

		while(l<r){
			if(s.charAt(si)!=s.charAt(ei)) return false;

			l++;
			r--;
		}

		return true;

	}


	static boolean[][] isPalindromeInfo(String s,int length){

		boolean[][] isStringPalindrome = new boolean[length][length];

		for(int row = length-2;row >= 0 ;row -- ){
			for(int col = row+1;col<s.length();col++){

				if(s.charAt(row) == s.charAt(col)){
					isStringPalindrome[row][col] = isStringPalindrome[row+1][col-1];
				}else{
					isStringPalindrome[row][col] = false;
				}

			}
		}

		return isStringPalindrome;

	}
}