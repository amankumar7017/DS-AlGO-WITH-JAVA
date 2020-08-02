import java.util.*;
class KSmallestElement{
	
	//Approch 1 - sort the Array then get arr[required smallest] . tc - nlogn
	//Approch 2 - using  max heap with stack and sort the required Elements only.(implemented Approch) tc = nlogK 

	public static void main(String[] args) {
		
		int[] arr = {10,4,3,20,15};

		int k  = 3; // third smallest element find.
		int i = 0 ;

		Stack<Integer> st = new Stack<>();

		for (i=0;i<k;i++) {
				
				
			st.add(arr[i]);
			
			}

        Collections.sort(st);

		for (;i<arr.length;i++) {
			
			if(st.peek() > arr[i]){
				Collections.sort(st);
				st.pop();
			}
		}

		

		System.out.println(st.peek());

	}
}
