import java.util.*;
public class BoardPath(ludo){
    
      
    
  public static void main(String args[]) {
       getSS(0,10,"");
   }

   public static void getSS(int curr, int end,String ans){

    System.out.println("curr value "+curr+" ");

      if(curr == end ){
       System.out.println(ans);
         return ;
      }

      if (curr > end){

         return ;
      
        }

     
      ArrayList<String> myResult = new ArrayList<>();
     
     for(int dice =1;dice<=6;dice++){

        getSS(curr+dice,end,ans+dice);
        System.out.println("loop executed");
     }

      
   }
}