import java.util.*;
public class StockSpane{

	public static void main(String[] args) {
		
	
/////////////////stock span////////////////////
// input is  2 5 9 3 1 12 6 8 7  
//output 1 2 3 1 1 6 1 2 1
        int[] arr = {2,5,9,3,1,12,6,8,7};
       
    Stack<Integer> s = new Stack<>();

        s.push(0);
        
        int[] result = new int[arr.length];
        result[0] = 1; 

        for(int i=1;i<arr.length;i++){
            
            while(s.size()>0 && arr[i] > arr[(s.peek())]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]  = i+1;
            }else{
                int diff = i-s.peek();
                result[i]  = diff;
            }
            s.push(i);
        }
            for(int temp: result){
            System.out.print(temp+" ");
        }
    }
}
