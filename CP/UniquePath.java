import java.util.*;
class UniquePath{
	public static void main(String[] args) {
		

		int[][] board = new int[3][4];

		for(int i = 0 ; i< 3;i++)
{
		Arrays.fill(board[i],-1);
}
		System.out.println(solve(board,0,0,2,3));
		System.out.println(solveTD(board,0,0,2,3));
		System.out.println(numberOfPaths(3,4)); // coin change(DP) diito code ;

	}

	public static int solve(int[][] board , int cr,int cc ,int er , int ec ){


	if(cr==er && cc == ec ) return 1;

	if(cr > er || cc > ec) return 0;


	int a = solve(board,cr,cc+1,er,ec);
	int b = solve(board,cr+1,cc,er,ec);

	return a+b;	



	}


	public static int solveTD(int[][] strg , int cr,int cc ,int er , int ec ){


	if(cr==er && cc == ec ) return 1;

	if(cr > er || cc > ec) return 0;


	if(strg[cr][cc] != -1) return strg[cr][cc];

	int a = solveTD(strg,cr,cc+1,er,ec);
	int b = solveTD(strg,cr+1,cc,er,ec);

	strg[cr][cc] = a+b;

	return a+b;	

	}


	static int numberOfPaths(int m, int n) 
    { 
        // Create a 1D array to store results of subproblems 
        int[] dp = new int[n]; 
        dp[0] = 1; 
  
        for (int i = 0; i < m; i++) { 
            for (int j = 1; j < n; j++) { 
                dp[j] += dp[j - 1]; 
            } 
        } 
  
        return dp[n - 1]; 
    } 

}