import java.util.*;

 public class DictonaryOrder{

  //ques -- Take as input str, a string. Write a recursive function which prints all the words 
  //        possible by rearranging the characters of this string which are in dictionary order larger 
  //        than the given string. 


  public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


       //System.out.print(getPermutation("abc")); 
        ArrayList<String> ans = getPermutation(input);
        Collections.sort(ans);
        // compare lexicographically.

        Iterator<String> itr = ans.iterator();

        while(itr.hasNext()){
          String temp = itr.next();

          int res =  input.compareTo(temp);

          //diff return type of compareTo 
          // if str1 == str2 return 0;
          // if str > str2 return +ve value
          // if str < str2 return -ve value

          if(res < 0){
            System.out.print(temp+" ");
          }

        }
     


   }

   public static ArrayList<String> getPermutation(String str){

      if(str.length()==0){

      ArrayList<String> baseResult =  new ArrayList<>();
      baseResult.add("");
      return baseResult;
      }

      char ch = str.charAt(0);
      String ros = str.substring(1);

      ArrayList<String> recResult  =  getPermutation(ros);
       ArrayList<String> myResult =  new ArrayList<>();

      for (String rrs  : recResult ) {
        for(int i=0;i<=rrs.length();i++){
          String val = rrs.substring(0,i)+ch+rrs.substring(i);
          myResult.add(val);
        }
      }

      return myResult;



   }
}
