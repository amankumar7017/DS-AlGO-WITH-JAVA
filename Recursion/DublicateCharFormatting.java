import java.util.*;
public class DublicateCharFormatting {
   public static void main(String[] args) {
   

      String s= "hello";


   String ans = getAns(s,0,1,'*');

      System.out.print(ans);
  }

   public static String getAns(String str,int si,int siNext,char ch){

      if(str.length()==siNext){
         return str;
      }
         char a = str.charAt(si);
         char b  = str.charAt(siNext);

         if(a==b){
            
            str = str.substring(0,siNext)+ch+str.substring(siNext);
         }

        str  =  getAns(str,si+1,siNext+1,ch);

         return str;
   }


   /* static String duplicateChar(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String ros = duplicateChar(s.substring(1));

        if (s.charAt(0) == ros.charAt(0)) {
            return s.charAt(0) + "*" + ros;
        }

        return s.charAt(0) + ros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(duplicateChar(s));
    }
*/
}