import java.util.*;
class KLargestElement{
	
	public static void main(String[] args) {
		
		int[] arr = {10,7,4,3,20,15};

		int k  = 3; // 3 Largest element find.
		int i = 0 ;

		Stack<Integer> st = new Stack<>();

		for (i=0;i<k;i++) {
				
				
			st.add(arr[i]);
			
			}

        Collections.sort(st,Collections.reverseOrder());

		for (;i<arr.length;i++) {
			
			if(st.peek() < arr[i]){
			   
			        st.add(arr[i]);
				  Collections.sort(st,Collections.reverseOrder());
				  st.pop();
			}
		}

		

		System.out.println(st);

	}
}