class MatrixExponention{
	public static void main(String[] args) {
		
		System.out.println(fib(8));


	}

	public static int fib(int n){


		int[][] A = {{1,1},{1,0}};

		if(n == 0 ) return 0 ;


		power(A,n-1);

		return A[0][0];


	}


	public static void power(int[][] A, int n ){

		if(n==0 || n==1) return;

		power(A,n/2);

		multiplyMatrix(A,A);

		if(n%2 != 0 ){


			int[][] M = {{1,1},{1,0}};
			multiplyMatrix(A,M);


		}
	}

	public static void multiplyMatrix(int[][] A,int[][] M ){


		int fval = A[0][0]*M[0][0]+A[0][1]*M[1][0];
		int sval = A[0][0]*M[0][1]+A[0][1]*M[1][1];
		int tval = A[1][0]*M[0][0]+A[1][1]*M[1][0];
		int lval = A[1][0]*M[0][1]+A[1][1]*M[1][1];

		A[0][0] = fval;
		A[0][1] = sval;
		A[1][0] = tval;
		A[1][1] = lval;

	}



}