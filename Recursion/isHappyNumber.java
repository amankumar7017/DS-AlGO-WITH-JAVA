import java.util.*;
public class A{
    

//isHappyNumber() will determine whether a number is happy or not  
    public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        //Calculates the sum of squares of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
      
    public static void main(String[] args) {  
         
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();

      while(t-->0){

        int n = sc.nextInt(); 
        
    loop:    for(int i = 1; i <= 1000000; i++){  
            
            int result = i;  
              
            //Happy number always ends with 1 and   
            //unhappy number ends in a cycle of repeating numbers which contains 4  
            while(result != 1 && result != 4){  
                result = isHappyNumber(result);  
            }  
              
            if(result == 1)  {
                
            if(n< i){
                System.out.println(i);  
                break loop;
            }
        }
      }
    }  
}  
}