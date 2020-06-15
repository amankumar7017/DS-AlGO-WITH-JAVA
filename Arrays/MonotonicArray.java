
public class MonotonicArray{
    public static void main(String args[]) {


//to check weather the array is in increasing or decraesing order .
//without using any extra Space 


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    

    
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();

        }

    boolean increasing =true;
    boolean decreasing =true;
       

        for(int i=1;i<n;i++){

          
          if(arr[i-1] < arr[i]){
        decreasing =false;
      }
          
      if(arr[i-1] > arr[i]){
          increasing =false;
      }

        }

        if(increasing){
          System.out.println("true");
        }else if(decreasing){
          System.out.println("true");
        }else{
      System.out.println("false");
    }


   

    } 
} 
