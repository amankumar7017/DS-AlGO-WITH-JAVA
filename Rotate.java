
public class Rotate{
//rotation of a number;
    public static void main(String[] args) {
   
    	 	int n = 21453;
        int k=2;
        
        int div = 1,mul=1;
        
        int temp = n ;
        int count =0;
        while(temp!=0){
            temp =temp/10;
            count++;
        }
        // for special cases
         k = k%count;
         if(k<0){
             k = k+count;
         }
         
        for(int i=1;i<=count;i++){
            if(i<=k){
                div = div*10;
            }else{
                mul = mul*10;
            }
        }
        
        int q = n/div;
        int r  = n%div;
        
        int ans = r*mul+q;
        System.out.println(ans);
        

	}
    
}