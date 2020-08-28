import java.util.*;

// climb stairs with jumps(arr jumps)
// output - no. of ways to reach last cell ;


class Main {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t-->0){

		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i =0;i < n;i++){
			arr[i] = sc.nextInt();
		}

		int ans = CSJ(arr,n);

		System.out.println(ans);

		}

    }

	public static int CSJ(int[] arr,int n ){

		int[] strg = new int[n+1];

		strg[n] = 1 ; 

		for(int i = n -1; i >= 0; i-- ){

			for(int j = 1 ; j <= arr[i]  && i+j < strg.length ; j++ ){

				strg[i] += strg[i+j];

			}
		}

		return strg[0];

	}

}