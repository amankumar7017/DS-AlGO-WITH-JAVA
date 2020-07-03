import java.util.*;
public class PermutationWithSpace{
    
  public static void main(String args[]) {



      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-->0){


      String str = sc.next();

        String ans = str.substring(0,1);
        String ros = str.substring(1);

         getSS(ros,ans);

        }
   }

   public static void getSS(String ques,String ans){

      if(ques.length()== 0){
        System.out.println(ans);
        return ;
      }

        char c = ques.charAt(0);
        String ros = ques.substring(1);

        getSS(ros,ans+"_"+c);

        getSS(ros,ans+c);

    }
   
}   