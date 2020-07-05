import java.util.*;
class Test {

    static int count = 0;
    

    public static void main(String[] args) {
            
        int n = 4;

        int[][] board = new int[n][n];
       

        Nquen(board,0,n,0,0);

            
         }

        public static boolean Nquen(int[][] board,int qpsf,int tq,int row, int col){

             //System.out.println(count);
           
            if(qpsf == tq){

              for (int i=0;i<board.length;i++ ) {
                for (int j =0 ;j < board[0].length;j++ ) {
                System.out.print(board[i][j]+" ");
             }
            System.out.println();
               }
                System.out.println();
                return true;
            }


            if(col == board[0].length){
                col= 0;
                row+=1;
               
            }

            // negetive base case
            if(row== board.length){
                return  false;
            } 
            

          

              if(isSafeToplaceQueen(board,row,col)){  
                
                board[row][col] = 1;
              
                Nquen(board,qpsf+1,tq,row,col+1);

                board[row][col] = 0;
            }


                   
                Nquen(board,qpsf,tq,row,col+1);
                
            
             return  false;

             
             
        }  

        public static boolean isSafeToplaceQueen(int[][] board,int row ,int col){


            // vertical check 

            int r = row -1 ;
            int c = col ;

            while(r>=0){
                if(board[r][c] == 1){
                    return false;
                }
                r--;
            }

            // horizontall left check 

            r = row;
            c = col -1;

            while(c>= 0){
                if(board [r][c]==1){
                    return false;
                }
                c--;
            }

            //diagonal left check 
            r= row -1 ;
            c = col -1 ;

            while(r>= 0 && c>= 0){
                if (board[r][c] == 1 ) {
                    return false;
                }
                r--;
                c--;
            }

            // diagonal right

            r = row -1;
            c = col+1;

            while(r>=0 && c < board[0].length){
                if (board[r][c] ==1 ) {
                    return false;
                }
                r--;
                c++;
            }

            return  true;

        }  
}
// import java.util.*;
//     import java.io.*;
     
//     // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
     
//    public  class TestClass {
      
//         public static void main(String args[] ) throws Exception {
            
//      //       Scanner s = new Scanner(System.in);
//             int N = 4;
//             int board[][] = new int[N][N];
//             if(NQueens(board,0,N) == false){
//                 System.out.println("Not possible");
//             }            
     
//         }
     
//         static boolean NQueens(int board[][],int i,int N){
//             if(i == N){
//                 for(int x=0;x<N;x++){
//                     for(int j=0;j<N;j++){
//                         System.out.print(board[x][j]+" ");
//                     }
//                     System.out.println();
//                 }
//                 return true;    
//             }
//                 for(int j=0;j<N;j++){
//                     if(isAttacked(i,j,board,N)){
//                         board[i][j] = 1;
//                     if(NQueens(board,i+1,N))
//                         return true;
//                         board[i][j] = 0;
//                     }           
//                 }
//             return false;   
//         }
     
//         static boolean isAttacked(int i,int j,int board[][],int N){
            
//             for(int rows=0;rows<N;rows++){
//                 if(board[rows][j] == 1)
//                     return false;
//             }
     
//             int x = i;
//             int y = j;
     
//             while(x>=0 && y>=0){
//                 if(board[x][y] == 1)
//                     return false;
//             x--;
//             y--;        
//             }
            
//             x = i;
//             y = j;
     
//             while(x>=0 && y<N){
//                 if(board[x][y] == 1)
//                     return false;
//             x--;
//             y++;        
//             }
     
//             return true;
//         }
//     }