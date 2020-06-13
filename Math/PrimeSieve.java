import java.util.*;
public class PrimeSieve{
    public static void main(String args[]) {


		int[] arr = new int[100];

	
		for(int i=3;i<=100;i+=2){
			arr[i] = 1;
		}

		for(int i=3;i<100;i+=2){
			
			if(arr[i] == 1){

				for (int j=i*i;j<100 ;j = j+i) {
					arr[j] = 0;
				}


			}

		}

			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 1;


				for(int i=0;i<100;i++){
					if(arr[i] == 1){
						System.out.print(i+" ");
					}
			}


	}

}
		