import java.util.*;
public class PiushAndMagicalPark(CB){
    public static void main(String[] args) {


// Piyush is lost in a magical park which contains N rows and M columns.
      // In order to get out of park safely and return home, he needs atleast
      //  K amount of strength.Given a N by M pattern, your task is to find 
      //  weather Piyush can ever escape the park.

// Piyush enters the park with strength S. The park is filled
 // with some obstacles denoted by ‘.’ , some magical beans denoted by 
 // ‘*’ and some blockades denoted as ‘#’. If he encounters an 
 // obstacle (.) , strength decreases by 2. If he encounters a magic bean
 //  (' * ') , his strength increases by 5. Piyush can only walk 
 //  row wise, so he starts from left of a row and moves towards
 //   right and he does this for every row. However when he encounters
 //    a blockade (#) , he cannot go any further in his current 
 //    row and simply jumps to the start of a new line without losing any 
 //    strength. Piyush requires a strength of 1 for every step. His 
 //    strength should always be greater than K while traversing or else 
 //    Piyush will get lost. Assume that Piyush can shift immediately from
 //     last of one row to the start of next one without loss of any strength, 
 //     help out Piyush to escape the park. His escape is successful 
 //     if he is able to return home with atleast K strength.

      
    
  
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();

      String[][] arr = new int[row][col];

      for(int i=0;i<row;i++){
        for (int j=0;j<col ;j++) {
          
          arr[i][j] = sc.nextInt();
        }
      }

        // String[][] arr = {{"." , "." ,"*" , "."},{"." , "#" , "." , "."},{"*" , "*" , "." , "."},{"." , "#" , "*" , "*"}};
        // int row = 4,col =4;

        int mxStr = sc.nextInt();
        int minStr = sc.nextInt();
       
     
           matrix(arr,row,col,mxStr,minStr);    

  }
  

       public static  void matrix(String[][] arr,int row,int col,int mxStr,int minStr){

          byte b = 0;

    loop1: for (int i=0; i< row ;i++) {

        System.out.println(mxStr);

            loop2:  for(int j = 0 ; j < col ; j++) {
                    
                
                if(arr[i][j] == "."){
                  b = 1;
                } else if(arr[i][j] == "*"){
                  b = 2;
                }else {
                  b=3;
                }

                switch(b){
                  case 1:
                      mxStr = mxStr - 2;
                      if(j!=0){
                        mxStr = mxStr -1;
                      }
                      break;
                   case 2 :
                      mxStr = mxStr + 5;
                      if(j!=0){
                        mxStr=mxStr-1;
                      }   break;
                    case 3 :

                     
                      if(j!=0){
                        mxStr=mxStr-1;
                      } 
                      

                      if(i==row-1){
                        break loop1;
                      }

                      break loop2;


                }


          }

      }
 
      if(mxStr >= minStr){
        System.out.println("Yes\n"+mxStr);
       }else{
        System.out.println("N0");
       }
  


}
}


