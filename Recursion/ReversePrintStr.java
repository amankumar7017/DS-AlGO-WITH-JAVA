import java.util.*;

  class c{

   // don't erase

   public static void main(String args[]) {

        String str = "Geek For Geeks ";
        get(str);
   }

   public static void get(String str){

      if(str.length()==1){
         return ;
      }
         
         get(str.substring(1));

         System.out.print(str.charAt(0));


   }
      
}
