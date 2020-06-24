import java.util.*;
public class SubSequencePrint{

 // Ques- Print all the subsequences of a string in lexicographical order.
// Answer Approch - first get all subsequnces using recursion after that sort it and then iterate it .




   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

       while(t-->0){

      ArrayList<String> list = new ArrayList<>();

      String input = sc.next();

      list = getSS(input);
         
         Collections.sort(list);
         //System.out.println(list);

         Iterator<String> itr = list.iterator();
         while(itr.hasNext()){

            String s = itr.next();
            System.out.println(s);
         }
      }
   }

   public static ArrayList<String> getSS(String str){


      if(str.length() == 0){
         ArrayList<String> baseResult = new ArrayList<>();
         baseResult.add("");
         return baseResult;
      }

      char  c= str.charAt(0);
      String ros = str.substring(1);
      ArrayList<String> myResult = new ArrayList<>();
      ArrayList<String> recResult = getSS(ros);
     

      for (int i=0;i<recResult.size();i++ ){
         myResult.add(recResult.get(i));
         myResult.add(c+recResult.get(i));
      }

      return myResult;
   }
}
