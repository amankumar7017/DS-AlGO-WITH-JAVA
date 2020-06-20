import java.util.*;
class PalindromeCheck{	
	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
    	
    	String str = s.nextLine(); 



   		// first Approch - using String builder..

   		// StringBuilder sb = new StringBuilder(str);

   		// String str2 =sb.reverse().toString();

   		// if(str.equals(str2)){
   		// 	System.out.println("palindrom");
   		// }else{
   		// 	System.out.println("Not palindrom");
   		// }
		
    	//using Recursion

    		int len=str.length()-1;
    		System.out.println(ispalindrom(str,0,len));

		
		}

			public static boolean ispalindrom(String str,int si,int li){

				if(li <= si){
					return true ;

				}

				if(str.charAt(si) != str.charAt(li)){
					return false;
				}



				boolean res = ispalindrom(str,si+=1,li-=1);// s++ && li-- will not working

				return res;
				

			}

}