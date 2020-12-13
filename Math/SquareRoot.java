import java.util.*;
import java.lang.*;
import java.io.*;

public class CF{
   
 //    static double MOD=1e9+7;



        static float BinarySearch(int low,int high,int val,int precision){

           double ans = 0;
          
            while(high>=low){

            int mid = low + (high - low) / 2;        

            if(mid*mid > val){
                high = mid-1;
            }else{
                ans = mid;
                low = mid+1;
            }

        }
            double increment = 0.1; 
        for (int i = 0; i < precision; i++) { 
            while (ans * ans <= val) { 
                ans += increment; 
            } 
  
            // loop terminates when ans * ans > number 
            ans = ans - increment; 
            increment = increment / 10; 

        } 
        return (float)ans; 
                
        }




     public static void main (String[] args) 
    {
 
            FastReader scan = new FastReader();
            PrintWriter out = new PrintWriter(System.out);
            Task solver = new Task();
         
                
           int testcase = 1;
            // int testcase = scan.nextInt();

            for(int tt = 1; tt <= testcase ; tt++) solver.solve(tt, scan, out);
            out.close();
        
    }

        
    // main code in task 
    
      static class Task {
     
        public void solve(int testNumber, FastReader scan, PrintWriter out) {

            int n = scan.nextInt();
           


           // int[] arr = new int[n];for(int i =0 ; i<n;i++)arr[i] = scan.nextInt();
            
         

             int num = scan.nextInt();
             int precision = scan.nextInt();


             out.println(BinarySearch(0,num,num,precision));

       

    }
        }
     
 
 static class FastReader {
            BufferedReader br;
            StringTokenizer st;
     
            public FastReader() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
     
            public FastReader(String s) throws FileNotFoundException {
                br = new BufferedReader(new FileReader(new File(s)));
            }
     
            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }
     
            int nextInt() {
                return Integer.parseInt(next());
            }
     
            long nextLong() {
                return Long.parseLong(next());
            }
     
            double nextDouble() {
                return Double.parseDouble(next());
            }
     
            String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
            
       

 
 
        }


 }       