
public class Inverse{
//inverse of a number;
    public static void main(String[] args) {
   
    	int n = 21453;
        System.out.println("the orignal number is "+n);
        //some Assumption that i have taken and that is no missing term out of input single digit;
        //op = orignal position
        //od = orignal digit
        //id = inverse digit
        //ip = inberse position
    	int inv =  0;
    	int op = 1;
    	while(n!=0){
    		int od = n % 10;
    		int id = op;
    		int ip =  od;

    		//make change to inv using ip and id 

    		inv = inv+id*(int )Math.pow(10,ip-1);

    		n  =n/10;
    		op++;

    	}
        System.out.println("this is inversed "+inv);
        System.out.print("now i will reverse the Number : ");
        
        while(inv!=0){
            int q = inv%10;
            System.out.print(q);
            inv = inv/10;
        }



	}
    
}