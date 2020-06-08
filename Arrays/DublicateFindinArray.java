import java.util.*;
class DublicateFindinArray{
	

	public static void main(String[] args) {
			
		int[] arr = { 4,3,2,7,8,2,3,1};

		for(int i=0; i<arr.length ;i++){
			int index =Math.abs(arr[i])-1; // index genrating
		if(arr[index]>= 0){
			arr[index]  = -arr[index];
		}else{
			System.out.println(" "+Math.abs(arr[index]));
		}

		}

	}
}
