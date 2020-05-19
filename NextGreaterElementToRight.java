import java.util.*;
public class NextGreaterElementToRight{

	public static void main(String[] args) {
		
			       int[] arr = {2,5,9,3,1,12,6,8,7};
        
        Stack<Integer> s = new Stack<>();
        
//////////////////////NEXT greater element to the right side ...............  

//       s.push(arr[arr.length-1]);
//       
//       int[] res = new int[arr.length] ;
//       res[arr.length-1] = -1;
//       
//       for(int i=arr.length-2;i>=0;i--){
//           
//           while(s.size()>0 && arr[i]>s.peek())
//           {
//               s.pop();
//           }
//           if(s.size() == 0){
//               res[i] = -1;
//           }else{
//               res[i] = s.peek();
//           }
//           
//           s.push(arr[i]);
//           
//       }
//       
//       for(int temp: res){
//           System.out.print(temp+" ");
//       }
//////////////////////////Alternate approch for same .......................

        s.push(0);
        
        int[] res = new int[arr.length];
        
        for(int i=1;i<arr.length;i++)
        {
         while(s.size()>0 && arr[i]> arr[s.peek()])
         {
             int  pos = s.peek();
             res[pos] = arr[i];
             s.pop();
         }
         s.push(i);
            
        }
       while(!s.isEmpty()){
           int pos = s.peek();
           res[pos]= -1;
           s.pop();
       }
        
         for(int temp: res)
         {
           System.out.print(temp+" ");
         }

    }
}
