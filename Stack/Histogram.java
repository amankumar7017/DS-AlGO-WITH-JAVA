import java.util.*;
public class Histogram{

	public static void main(String[] args) {
		
			     //histogram output 12;
         
         int[] arr = {6,2,5,4,5,1,6};
       
         Stack<Integer> s = new Stack<>();
          s.push(0);
        
        int[] result = new int[arr.length];
        result[0] = -1; 

        for(int i=1;i<arr.length;i++){
            
            while(s.size()>0 && arr[i] < arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]  = -1;
            }else{
                 result[i] = s.peek();
            }
            s.push(i);
        }
            System.out.println("this is address of next smaller element to the left");
            for(int temp: result){
            System.out.print(temp+" ");
        }
            System.out.println("");
            
            int[] res = new int[arr.length];
            
            Stack<Integer> st = new Stack<>();
            
            res[arr.length-1] = -1;
            
            st.push(arr.length-1);
            
            for(int i=arr.length-2;i>=0;i--){
              
                while(st.size()>0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
                if(st.isEmpty()){
                    res[i] = -1;
                }else{
                    res[i] = st.peek();
                }
                   st.push(i);
                
            }
            System.out.println("this is address next smaller element to the right");
            for(int temp: res){
                System.out.print(temp+" ");
            }
            System.out.println("");
            // histogram main operation
            
            int maxArea  = 0;
            for (int i=0;i<arr.length;i++){
                    int width =res[i] - result[i] - 1;
                   
                    int area = arr[i] * width;
                  
                    if(area >maxArea){
                        maxArea = area;
                    }
            }
            System.out.println("the histogram MAXAREA is "+maxArea);
            
    }
}
