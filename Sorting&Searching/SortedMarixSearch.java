import java.util.*;
public class SortedMatrixSearch{
    public static void main(String args[]) {

      // sorted matrix linear search element
      // main crux - start search from end of each array

      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();

      int[][] arr = new int[row][col];

      for(int i=0;i<row;i++){
        for (int j=0;j<col ;j++) {
          
          arr[i][j] = sc.nextInt();
        }
      }

        // int[][] arr = {{10,11,12,13},{20,21,22,23},{30,31,32,33},{40,41,42,43}};
        // int row = 4,col =4;
       
     int targ = sc.nextInt();
     // if element found the print 1 else 0;
    System.out.print(matrix(arr,row,col,targ)) ;    

  }
  

       public static  int matrix(int[][] arr,int row,int col,int targ){

            for (int i=0; i< row ;i++) {

                  if(arr[i][col-1] > targ){           

              for(int j = 0 ; j < col ; j++) {
                    
                if(arr[i][j] == targ)
                    return 1;
                  }

                }
            
          }

        return 0;

       
  


}

}