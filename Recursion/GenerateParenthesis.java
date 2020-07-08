import java .util.*;
class GenerateParenthesis{

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);

		//String str = sc.nextLine();
		int n = 2; 

		String str = "(";

		printPermutation(str,n,1,0);// 1 is count of ( and 0 is for left paren count at initial state.



	}

	public static void printPermutation(String ans,int n,int lpcount,int rpcount){

		if(ans.length() == n*2 ){
			
			if(isValid(ans,lpcount,rpcount)){
				System.out.println(ans);
			}	


			return ;
		}


		printPermutation(ans+"(", n ,lpcount+1,rpcount);


		printPermutation(ans+")", n ,lpcount,rpcount+1);


	}


	public static boolean isValid(String ques,int lpcount , int rpcount){

			if(lpcount == rpcount){
				
				Stack<Character> st = new Stack<>();

				for(int i=0;i<ques.length();i++){

					char ch = ques.charAt(i);

					if(ch == '('){
						st.push(ch);
					}else{
						if(st.isEmpty() == false){
						st.pop();
					}

					}


				}
			
				if(st.size() ==0){
					return  true;
				}
			}

			return false;
	}
}

///// CB Soln 
// import java.util.*;
// public class Main {
  
// 	public static void main(String[] args) {
		
// 		Scanner sc = new Scanner(System.in);

// 		//String str = sc.nextLine();
// 		int n = sc.nextInt(); 

// 		String str = "";

// 		 Stack<String> set = new Stack<>();

// 		printPermutation(str,n,0,0,set);// 1 is count of ( and 0 is for left paren count at initial state.

// 		while(!set.isEmpty()){
// 			System.out.println(set.pop());
			
// 		}
// 	}
	

// 	public static void printPermutation(String ans,int n,int lpcount,int rpcount,Stack<String> set){

// 		if(ans.length() == n*2 ){
			
			
// 			set.push(ans);


// 			return ;
// 		}


// 	if(lpcount < n) printPermutation(ans+"(", n ,lpcount+1,rpcount,set);


// 	if(rpcount < lpcount) printPermutation(ans+")", n ,lpcount,rpcount+1,set);


// 	}


// }