
public class KadaneAlgo{
	public static void main(String[] args) {
		//  Maximum subArray 

		 int[] arr = {2,3,-6,1,2,3,-4,-5};
		int maxSum =arr[0];
		int sum;
		for(int i=0;i<arr.length;i++){
				sum=0;
			for(int j=i;j<arr.length;j++){

				sum = sum + arr[j];

				if(maxSum < sum){
					maxSum = sum;
				}

			}

		}
			System.out.println("this is maxSum subArray "+maxSum);
			System.out.println("time Complexity N^2 ");
			System.out.println("Now with time Complexity o(n) wiht kadane's Algo");

		// kadane's Algo (prepByte Approch)

				int maxSofar =arr[0];
				int max= arr[0];

				for(int i=1;i<arr.length;i++)
				{

					maxSofar = Math.max(maxSofar+arr[i],arr[i]);

					if(maxSofar >max){
						max = maxSofar;
					}

				}

					System.out.println("this is maxSum subArray "+max);

				//kadane's AlGo(pep code)	

				int Osum = arr[0];//Osum = Overallsum
				int Csum  = arr[0];//Csum = Current Sum 

				for(int i=1;i<arr.length;i++){

					if(Csum < 0){
						Csum = arr[i];

					}else{
						Csum  =Csum+arr[i]; 
					}

					if(Csum > Osum){
						Osum = Csum;
					}


				}

				System.out.print("this is Max subArray ");
				System.out.print(Osum);

	}
}