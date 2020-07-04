import java.util.*;
public class A{
    
////////// this print the ways..

  /* public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
     



      // int t =sc.nextInt();
    int m = sc.nextInt();
    int n = sc.nextInt();


    char[][] maze = new char[m][n]; 

      for (int i=0;i<m;i++) {
        for(int j=0;j<n;j++)
          maze[i][j] = sc.next().charAt(0);
      }

      //int[][] maze = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};


     boolean[][] visited = new boolean[m][n];
      
      int[][] ans = new int[m][n]; 

      BlockedMaze(maze,0,0,visited,ans);

     for (int i =0;i<m ;i++ ) {
       for (int j=0;j<n ;j++ ) {
         System.out.print(ans[i][j]);
       }
       System.out.println();
     }
     
  }

  public static  void BlockedMaze(char[][] maze,int row,int col,boolean[][] visited,int[][] ans){
   
      //positive base case 
    if(row == maze.length-1 && col == maze[0].length-1 && visited[row][col] == true){
     ans[row][col] =2;
     //System.out.print("hl");
      return ;
    }
 
    //negetive base case

    if (row == -1 || row == maze.length || col == -1 || col == maze[0].length || maze[row][col] == 'X'
       || visited[row][col] == true) { 
            return ;
    }


    
     
      // put a mark 
    visited[row][col] = true;

    // top
    BlockedMaze(maze,row-1,col,visited,ans);
    
    // down 
    BlockedMaze(maze,row+1,col,visited,ans);
   
    // left
    BlockedMaze(maze,row,col-1,visited,ans);

    //right 
    BlockedMaze(maze,row,col+1,visited,ans);

    visited[row][col] = false; // backtrack


  }

}*/
//////////////this print a path in form of matrix
public class RatMaze
{
    final int N = 4;

    /* A utility function to print solution matrix
       sol[N][N] */void printSolution(int sol[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + sol[i][j] +
                                 " ");
            System.out.println();
        }
    }

    /* A utility function to check if x,y is valid
        index for N*N maze */
    
boolean isSafe(int[][] maze, int x, int y)
{
    // if (x,y outside maze) return false
    if(x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1)
        return true;

    return false;
} 

    
    boolean solveMaze(int maze[][])
    {
        int sol[][] = {{0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

        if (solveMazeUtil(maze, 0, 0, sol) == false)
        {
            System.out.print("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    /* A recursive utility function to solve Maze
       problem */
    boolean solveMazeUtil(int maze[][], int x, int y,
                          int sol[][])
    {
        // if (x,y is goal) return true
      if (x == N - 1 && y == N - 1)
        {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y) == true)
        {
            // mark x,y as part of solution path
            sol[x][y] = 1;

            /* Move forward in x direction */
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            /* If moving in x direction doesn't give
               solution then  Move down in y direction */
               if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            /* If none of the above movements work then
               BACKTRACK: unmark x,y as part of solution
               path */
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String args[])
    {
        RatMaze rat = new RatMaze();
        int maze[][] = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        rat.solveMaze(maze);
    }
}