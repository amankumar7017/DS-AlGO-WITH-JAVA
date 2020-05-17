
public class Patterns{
//digit of a number;
    public static void main(String[] args) {
               
       //pattern program
       //height;
//pattern 1
//*
//**
//***
//****
//*****
        
//    for(int i=0;i<=5;i++){
//        for(int j=0;j<i;j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//    
        
//pattern 2 
//*****
//****
//***
//**
//*
//        for(int i=0;i<5;i++){
//          for(int j=5;j>i;j--){
//             System.out.print("*");
//        }
//         System.out.println();
//   }

//    int n=5;
//    int sp=n-1,st=1;
//    
//     for(int i=0;i<n;i++){
//      
//           for(int j=0;j<sp;j++){
//               System.out.print(" ");
//           }
//           for(int j=0;j<st;j++){
//               System.out.print("*");
//           }
//              
//               
//              sp--;
//              st++;
//              System.out.println();
//        }
//output 
//    *
//   **
//  ***
// ****
//*****
//////////////pattern 3
//    int n=5;
//    int sp=0,st=5;
//    
//      for(int i=0;i<n;i++){
//      
//           for(int j=0;j<sp;j++){
//               System.out.print(" ");
//           }
//           for(int j=0;j<st;j++){
//               System.out.print("*");
//           }
//              
//               
//              sp++;
//              st--;
//              System.out.println();
//        }
      
      
//output
//*****
// ****
//  ***
//   **
//    *
////////////////////////pattern 4
//    int n=5;
//    int sp =n/2;
//    int st = 1;
//    
//    for(int i=0;i<n;i++){
//        
//        for(int j=0;j<sp;j++){
//            System.out.print(" ");
//        }
//        for(int j=0;j<st;j++){
//            System.out.print("*");
//        }
//        
//        
//        if(i < n/2){
//            sp--;
//            st=st+2;
//        }else{
//            sp++;
//            st= st-2;
//        }
//        System.out.println("");
//        
//    }
    
//output
//  *
// ***
//*****
// ***
//  *

//////////////pattern 5

//    int n=5;
//    
//    int st=3,sp = 1;
//    
//    for(int i=0;i<n;i++){
//        
//        for(int j=0;j<st;j++){
//            System.out.print("*");
//        }
//        
//        for(int j=0;j<sp;j++){
//            System.out.print(" ");
//        }
//         
//        for(int j=0;j<st;j++){
//            System.out.print("*");
//        }
//       
//        if(i < n/2){
//            st--;
//            sp = sp+2;
//        }else{
//            st++;
//            sp = sp-2;
//        }
//       
//        
//        System.out.println("");
//    }
//    
//o/p
//*** ***
//**   **
//*     *
//**   **
//*** ***
////////////////////pattern 6

//            int n=7;
//          int os=n/2;
//          int is = -1;
//         
//          for(int i=0;i<n;i++){
//              
//              for(int j=0;j<os;j++){
//                  System.out.print(" ");
//              }
//              
//              System.out.print("*");
//              
//              for(int j=0;j<is;j++){
//                  System.out.print(" ");
//              }
//              if(i>=1 && i < n-1){
//              System.out.print("*");
//              }
//            
//              if(i<n/2){
//                  os--;
//                  is = is+2;
//              }else{
//                  os++;
//                  is = is-2;
//              }
//              
//              System.out.println("");
//             
//          }
//        
//output
//   *
//  * *
// *   *
//*     *
// *   *
//  * *
//   *
///////////////////pattern 7

//    int n=7;
//    int val =1;
//    for(int i=0;i<n;i++){
//        for(int j =0;j<i;j++){
//            System.out.print(val+" ");
//            val++;
//        }
//        System.out.println("");
//    }
//   
//output
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20 21

////////////////pattern 8 (fibonacii series on triangle)

   int n=7;
   int a =0;
   int b=1;
    for(int i=0;i<n;i++){
        for(int j =0;j<i;j++){
           int c =a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println("");
    }

} 
}
    
}