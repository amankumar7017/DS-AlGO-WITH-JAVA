import java.util.*;
public class MinStack{

	public static void main(String[] args) {
		
     Stack<Integer> s = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    

    int[] arr ={ 2,20,30,5,8,12,3,16,10,14};

    s.push(arr[0]);
    minStack.push(arr[0]);

    for(int i=1;i<arr.length;i++){
        if(arr[i]< minStack.peek()){
            minStack.push(arr[i]);
        }
        s.push(arr[i]);
        
    }
        System.out.println(minStack.peek());
    }
    
}
