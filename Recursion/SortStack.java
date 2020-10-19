import java.util.*;
public class SortStack{
    
 
   public static void main(String args[]) {

          Stack<Integer> st = new Stack<>();
          //Stack<Integer> result = new Stack<>();
          st.add(20);
          st.add(10);
          st.add(3);
          st.add(50);

          System.out.println("Orignal Stack");
          System.out.print(st);

          sort_step1(st);

          System.out.println(st);

         }

   public static void sort_step1(Stack<Integer> st){

      if(st.size() > 0){
         
         int a = st.peek();
         st.pop();

         sort_step1(st);

         sort_step2(a,st);
       }

   }

   // main step in sorting

       public static void sort_step2(int x,Stack<Integer> st){

            if(st.isEmpty() || st.peek() <  x){
              st.push(x);

        }
           if(st.peek() > x){
          int a = st.peek();
          st.pop();
          sort_step2(x,st);

         st.push(a);
        
        }
    }
}
