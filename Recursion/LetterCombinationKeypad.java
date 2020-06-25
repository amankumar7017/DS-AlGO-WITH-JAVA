import java.util.*;
public class LetterCombinationKeypad{

// ques  You will be given a numeric Keypad string S. Print all the possible codes for S(input). leet code 17




  static String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    keypad(input,"");

  }


  static void keypad(String ques,String ans){

    if(ques.length() == 0){
      System.out.println(ans);
      return ;
    }

      char ch = ques.charAt(0);
      String ros = ques.substring(1);
      String  code  = table[ch -'0'];


      for(int i=0;i<code.length();i++){
          keypad(ros,ans+code.charAt(i));
      }


  }
  
}