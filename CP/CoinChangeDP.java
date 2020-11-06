import java.util.*;
class CoinChangeDP{

	 static int[] coins = {1,2,3};

	public static void main(String[] args)
	 {

	 	int amount = 4;
	 	int[][] strg = new int[coins.length][amount+1];	

	 	for (int i =0 ;i<coins.length ;i++ ) {
	 		Arrays.fill(strg[i],-1);
	 	}

       System.out.println(count(amount,0));
       System.out.println(countTD(amount,0,strg));
     }



	public static int count(int n, int vidx)
	{
    // If n is 0 then there is 1 solution
    if (n == 0)
        return 1;
     
    // If n is less than 0 then no solution exists
    if (n < 0 || vidx == coins.length)
        return 0;
 	
 	//int nCoinCount = 0 ;


 		int a = count(n-coins[vidx],vidx);
 		int b = count(n,vidx+1);

 		return a+b;

 	
	}


	public static int countTD(int n, int vidx,int[][] strg)
	{
    // If n is 0 then there is 1 solution
    if (n == 0)
        return 1;
     
    // If n is less than 0 then no solution exists
    if (n < 0 || vidx == coins.length)
        return 0;
 	
 	//int nCoinCount = 0 ;


    	if(strg[vidx][n] != -1){
    		return strg[n][vidx];
    	}

 		int a = countTD(n-coins[vidx],vidx,strg);
 		int b = countTD(n,vidx+1,strg);

 		strg[vidx][n] = a+b;

 		return a+b;

 	
	}




}