
public class Digit{
//digit of a number;
    public static void main(String[] args) {
        int n = 75421;
        
        int nod = 0;
        int temp = n;
        while(temp!=0){
            temp = temp/10;
            nod++;
        }
          System.out.println("the number of digit is "+nod);  
          
          int div = (int)Math.pow(10,nod-1);
         
          while(n != 0){
              int q = n/div;
              System.out.println(q);
              n=n%div;
              div=div/10;
          }
    }
    
}
