import java.util.*;
public class Celebrity{

	public static void main(String[] args) {
		
			    Stack<Integer> s = new Stack<>();         
    int[][]    arr = {{0,1,1,1},{1,0,1,0},{0,0,0,0},{1,1,1,0}};
      int len= arr.length;
     for(int i=0;i<arr.length;i++){
         s.push(i);
     }
      
      //till now stack is ready to use for celebrity
      
      while(s.size()>= 2){
         int a = s.pop();
         int b = s.pop();
         
         if(arr[a][b] == 1 )//if i(3) know j(2);
         {
             s.push(b);
         }else{ //i does not Know j;
             s.push(a);
         }
        
      }
      //pot = potential to be celebrity
      int pot = s.pop();
      //  System.out.println(pot+" ");
        
      for(int i=0;i<arr.length;i++){
          
          if(i!=pot){
              if(arr[i][pot] == 0 || arr[pot][i] ==1){
                  System.out.println("none celebrity");
                  return ;
              }
              
          }
      }
        System.out.println("celebrity is "+pot);//output row 2 is celebrity
    }
}