import java.io.*;
import java.util.*;

// ques link - https://www.geeksforgeeks.org/boolean-parenthesization-problem-dp-37/

class eet{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s1 = "TFT";
		String s2 = "^&";
		System.out.println(solution(s1, s2)); // output 2;
	}

	static int solution(String s1,String s2){

		int s1Length = s1.length();
	    int s2Length =  s2.length();

		int[][] tc  = new int[s1Length][s1Length];
		int[][] fc  = new int[s1Length][s1Length];

		for(int slide = 0 ; slide <=s1Length-1;slide++){
			for(int si = 0;si<=s1Length-slide-1;si++){

				int ei = si+slide;

				if(slide == 0 ){
					tc[si][ei] = s1.charAt(si) == 'T' ? 1 : 0;
					fc[si][ei] = s1.charAt(si) == 'F' ? 1 : 0;
				}else{
					for (int k = si ; k<ei ; k++ ) {
						
						char sign = s2.charAt(k);


						int ltc = tc[si][k];
						int rtc = tc[k+1][ei]; 
						int lfc = fc[si][k];
						int rfc = fc[k+1][ei];

						if (sign == '&') {
							
							tc[si][ei] += ltc*rtc;
							fc[si][ei] += lfc*rtc + ltc*rfc + lfc*rfc;

						}else if (sign == '|') {
							
							tc[si][ei] += ltc*rtc + lfc*rtc + ltc*rfc;
							fc[si][ei] += lfc*rfc;

						}
						else if (sign == '^') {
							tc[si][ei] += ltc*rfc + lfc*rtc;
							fc[si][ei] += lfc*rfc + ltc*rtc;
						}	
					}
				}


			}
		}

		return tc[0][s1Length-1];
	}
}