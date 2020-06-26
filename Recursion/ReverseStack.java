import java.util.*;

 public class ReverseStack{

   public static void main(String args[]) {

          Stack<Integer> st = new Stack<>();
          Stack<Integer> result = new Stack<>();
          st.add(10);
          st.add(20);
          st.add(30);
          st.add(40);

          System.out.println("Orignal Stack");
          System.out.print(st);

          reverse(st);

          System.out.println(st);

         }

   public static void reverse(Stack<Integer> st){

      if(st.size() > 0){
         
         int a = st.peek();
         st.pop();

         reverse(st);

         insertAtBottom(a,st);
       }

   }
       public static void insertAtBottom(int x,Stack<Integer> st){

            if(st.isEmpty()){
              st.push(x);

        }else{
          int a = st.peek();
          st.pop();
          insertAtBottom(x,st);

          st.push(a);

        }
            }
}
