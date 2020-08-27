import java.util.*;
class Ugly_Number_DP {

    // Ist Approch  - upto n for prime factor(2,3,5) multiply the number and Store in ArrayList 
                        // sort it
                        // get n th number . (this Approch is not implemented here )
                       

    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t-->0){

			int n = sc.nextInt();

			int ans = Ugly(n);

			System.out.println(ans);

		}
    }

	public static int Ugly(int n) {

        int[] ugly = new int[n];
        ugly[0] = 1;

        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;

        for(int i=1;i<n;i++){
            int min = Math.min(Math.min(factor2,factor3),factor5);
            ugly[i] = min;
            if(factor2 == min)
                 factor2 = 2*ugly[++index2];
            if(factor3 == min)
                factor3 = 3*ugly[++index3];
            if(factor5 == min)
                factor5 = 5*ugly[++index5];
        }
		
        return ugly[n-1];
    }
}