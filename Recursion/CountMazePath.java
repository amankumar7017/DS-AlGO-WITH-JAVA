import java.util.*;
public class CountMazePath{
    
 


  public static void main (String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int t =sc.nextInt();
      while(t-->0){
      
      int row = sc.nextInt();
      int col = sc.nextInt();
      
      int[][] arr = new int[row][col];
      
     // for(int i=0;i<row;i++){
     //     for(int j=0;j<col;j++){
     //         arr[i][j] = sc.nextInt();
     //     }
     // }
      
     int count = GetPath(arr,0,0,row-1,col-1);
       System.out.println(count);
      }
  }
          
         public static int GetPath(int[][] arr,int r,int c,int dr,int dc){
             
         if(r == dr && c == dc){
             return 1;
         }
         
         if(r > dr || c  > dc){
             return 0;
         }
         
         int e = GetPath(arr,r+1,c,dr,dc);
         int d = GetPath(arr,r,c+1,dr,dc);

         System.out.println(e+" this is ans");
         
          return e+d;
         
             
         }
  
}
   