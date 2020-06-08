
public class PrimeFactorization{

    public static void main(String[] args) {
   
    // program to prime factorization
     int n = 1440;
     
     for(int div=2;div*div <= n; div++){
         
         while(n%div == 0){
              n= n/div;
              System.out.print(div+" ");
         }
         
     }
        if(n!=1){
            System.out.println(n);
        }
    

	}
    
}
