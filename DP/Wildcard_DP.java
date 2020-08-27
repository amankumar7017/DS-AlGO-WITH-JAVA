import java.util.*; 
class Wildcard_DP{
	public static void main(String[] args) {
		
		String text = "abacde";
		String pattern = "a?**e";

		//boolean ans = Wildcard(text,pattern,0,0);
		boolean ans = WildcardTD(text,pattern,0,0,new int[text.length()][pattern.length()]);

		System.out.println(ans);
	}

	public static boolean Wildcard(String text, String pattern,int vidxt , int vidxp){



		if(text.length() == vidxt &&  pattern.length() == vidxp){
			return true;
		}

		if( text.length() != vidxt && pattern.length() == vidxp ){
			

			return false;
		}

		if( text.length() == vidxt && pattern.length() != vidxp ){

		

			for(int i = vidxp;i < pattern.length() ; i++ ){
				if(pattern.charAt(i) !=  '*' ){
					return false;
				}
			}

			return  true;
		}

		boolean ans ;

		char chs = text.charAt(vidxt);
		char chp = pattern.charAt(vidxp);


		if(chs == chp || chp == '?') {
				

			ans  = Wildcard(text,pattern,vidxt+1,vidxp+1);
			
	
		}else if(chp == '*') {

			boolean blank = Wildcard(text,pattern,vidxt,vidxp+1);
			boolean multi = Wildcard(text,pattern,vidxt+1,vidxp);

			ans = blank || multi ; 
			

		}else{

			ans = false;

		} 


		return ans ; 
		
	}

	public static boolean WildcardTD(String text, String pattern,int vidxt , int vidxp,int[][] strg){



		if(text.length() == vidxt &&  pattern.length() == vidxp){
			return true;
		}

		if( text.length() != vidxt && pattern.length() == vidxp ){
			

			return false;
		}

		if( text.length() == vidxt && pattern.length() != vidxp ){

		

			for(int i = vidxp;i < pattern.length() ; i++ ){
				if(pattern.charAt(i) !=  '*' ){
					return false;
				}
			}

			return  true;
		}

		if(strg[vidxt][vidxp] == 2 ) {
			return true;
		}
		

		if(strg[vidxt][vidxp] == 1){
			return  false;
		}

		boolean ans ;

		char chs = text.charAt(vidxt);
		char chp = pattern.charAt(vidxp);


		if(chs == chp || chp == '?') {
				

			ans  = WildcardTD(text,pattern,vidxt+1,vidxp+1,strg);
			
	
		}else if(chp == '*') {

			boolean blank = WildcardTD(text,pattern,vidxt,vidxp+1,strg);
			boolean multi = WildcardTD(text,pattern,vidxt+1,vidxp,strg);

			ans = blank || multi ; 
			

		}else{

			ans = false;

		} 

		strg[vidxt][vidxp] = ( ans == true ? 2 : 1 ) ;

		return ans ; 
		
	}
}