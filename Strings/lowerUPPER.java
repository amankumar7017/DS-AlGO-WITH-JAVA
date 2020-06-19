import java.util.*;
class lowerUPPER{	
	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
    	
    	char c = s.next().charAt(0); 
   
    	if(c >= 'a' && c <='z'){

		System.out.print("lower");
		}else if(c >= 'A' && c <='Z'){
			System.out.print("UPPER");
		}else{
			System.out.print("invalid");
		}

	
}
}
