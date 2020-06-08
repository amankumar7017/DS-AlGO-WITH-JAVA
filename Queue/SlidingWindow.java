import java.util.*;
public class SlidingWindow{

	public static void main(String[] args) {
		
		 //sliding window maximum 
        //output 9 9 8 12 12 14 14 32 32 32 32 19 19 19
        int[] arr = {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        
        int k =4;//window size
        
        //step 1 next greater element to the right
        
        Stack<Integer> s = new Stack<>();
        int[] res = new int[arr.length];
       
        s.push(arr.length-1);
        
        //here default value is not taking -1 ;
        
        res[arr.length-1] = arr.length;
        
        for(int i=arr.length-2;i>=0;i--){
        
            while(s.size() > 0 && arr[i] > arr[s.peek()]){
            s.pop();
        }
            if(s.isEmpty()){
                res[i] = arr.length;
            }else{
                res[i] = s.peek();
            }
            s.push(i);
            
            
        }
        System.out.println("this is index of next greater element");
        for(int temp: res){
            System.out.print(temp+" ");
        }
        
        int count=1;
        System.out.println("");
        for(int i=0;i<=arr.length-k;i++){
            int j=i;
            
           while(res[j]<i+k) {
               j= res[j];
             //  System.out.println(count+"<-count ");
               count++;
           }
            System.out.print(arr[j]+" ");
        }
        System.out.println("\nAnother Approch by doubly ended queue");
        
        int n = arr.length;
        Deque<Integer> dq =  new LinkedList<>();
        int ans[] = new int[n-k+1];
        
        int i=0;
        for(;i<k;i++){
            while(!dq.isEmpty() && arr[dq.peek()]<= arr[i]){
                dq.remove();
            }
            dq.addLast(i);
        }
       
        for(;i<n;i++){
            ans[i-k] = arr[dq.peekFirst()];
             
            
            while(!dq.isEmpty() && dq.peekFirst() <=i-k){
                dq.remove();
                      
            }
            
              while(!dq.isEmpty() && arr[dq.peek()]<= arr[i]){
                dq.remove();
            }
            dq.addLast(i);
        }
          ans[i-k]  = arr[dq.peekFirst()];  
            
        
          for(int temp : ans){
              System.out.print(temp+" ");
          }
        

    }
    
}
