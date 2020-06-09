import java.util.*;
class RemoveDublicate{


// 	Another METHOD  (Use Sorting)
//   Algorithm:

//   1) Sort the elements.
//   2) Now in a loop, remove duplicates by comparing the 
//       current character with previous character.
//   3)  Remove extra characters at the end of the resultant string.


// 	Another METHOD  (Use Set)
//   Algorithm:

//   1) Put all Character in set 
//   2) and print the set.
  
// 	Applied METHOD  (Using indexOf() )



	public static String unique(String s) 
    { 
        String str = new String(); 
        int len = s.length(); 
          
       
        for (int i = 0; i < len; i++)  
        { 
            
            char c = s.charAt(i); 
              
            // if c is present in str, it returns 
            // the index of c, else it returns -1 
            if (str.indexOf(c) < 0) 
            { 
                // adding c to str if -1 is returned 
                str += c; 
            } 
        } 
          
        return str; 
    } 
  
    
    public static void main(String[] args) 
    { 
        // Input string with repeating chars 

        String s = "geeksforgeeks"; 
          
        System.out.println(unique(s)); 
    } 
} 