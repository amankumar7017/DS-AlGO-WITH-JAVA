import java.util.*;
public class knightCombination2D{
    
  public static void main(String args[]) {



      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-->0){

        int n = sc.nextInt();
        int m = sc.nextInt();
        // int n=2;
        // int m =2;

        boolean[][] arr = new boolean[n][m];

        
       
      int result =knightCombination2D(arr,0,0,0,2,"");

      System.out.println("this is ans "+result*2); 
        
   }

    
    } 
   

   static int count =0; 

   public static int knightCombination2D(boolean[][] board,int row ,int col , int qpsf ,int tq,String ans){

         if(qpsf == tq){
        count ++;
       // System.out.println(count+". "+ans);
        return count;
         }

         if(col == board[0].length){
         
            row++;
            col =0;

         }

         if(row == board.length){
          return count;
         }

         if(isItsSafeToPlaceQuee(board,row,col)){

          board[row][col] = true;

          knightCombination2D(board,row,col+1,qpsf+1,tq,ans+"{"+row+"-"+col+"}");

          board [row][col] = false;

       }

          knightCombination2D(board,row,col+1,qpsf,tq,ans);

          return  count;
   } 

   public static boolean isItsSafeToPlaceQuee(boolean[][] board,int row,int col){

      int[]  rowArr = {-1,-2,-2,-1};
      int[] colArr = {2,1,-1,-2};


      for(int i=0 ; i< 4;i++){
        
        int r = row+rowArr[i];
        int c= col+colArr[i];

        if(r >= 0 &&  r<board.length && c >=0 && c<board[0].length){
          if(board[r][c]){
           return  false;
        }

      }


      }

      return true;

   }
}
   
