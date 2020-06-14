
public class Patterns{
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
// output
// 1 
// 2 3 
// 5 8 13 
// 21 34 55 89 
// 144 233 377 610 987 
// 1597 2584 4181 6765 10946 17711 
        
       
//        int n=7;
//        int space =n/2;
//        int star = 1;
//        int k =1;
//        
//        for(int i=0;i<n;i++){
//        
//            for(int j=0;j<space;j++)
//            {
//                System.out.print("  ");
//            }
//            int cval = k;
//             for(int j=1;j<=star;j++)
//            {
//                System.out.print(" "+cval+" ");
//                if(j<n/2){
//                cval++;
//                }else{
//                    cval--;
//                }
//                
//            }
//           
//             if(i<n/2){
//                 space--;
//                 star = star+2;
//                 k++;
//             }else{
//                 space++;
//                 star = star-2;
//                   k--;      
//             }
//            System.out.println("");
//            
//        }
// output
//          1 
//     2  3  4 
//   3  4  5  4  3 
// 4  5  6  5  4  3  2 
//   3  4  5  4  3 
//     2  3  4 
//       1 
            
//    int n=4;
//    int sp = 2*n-3;
//    int st =1;
//    
//    for(int i=0;i<n;i++){
//        int val =1;
//        for(int j=0;j<st;j++){
//           
//            System.out.print(val);
//             val++;
//        }
//        for(int j=0;j<sp;j++){
//            System.out.print(" ");
//        }
//        if(i==n-1){
//            st--;
//            val--;
//        }
//        for(int j=0;j<st;j++){
//            val--;
//            System.out.print(val);
//        }
//        sp = sp-2;
//        
//        st++;
//        
//        System.out.println("");
//    
//        }
//output
//1     1
//12   21
//123 321
//1234321

//        int n=7;
//        
//        int sp = n/2;
//       int st =1;
//       
//       for(int i=0;i<n;i++){
//           if(i==n/2){
//               for(int j=0;j<st-1;j++){
//               System.out.print("*\t");
//               sp =0;
//           }
//           }
//           for(int j=0;j<sp;j++){
//               System.out.print("\t");
//           }
//           
//           
//           for(int j=0;j<st;j++){
//               System.out.print("*\t");
//           }
//         
//           
//        if(i<n/2){
//            st++;
//            
//        }else{
//            st--; 
//             sp = n/2;
//          
//        }
//           
//           System.out.println("");
//           
//       }
//output // it is a arrow shape (:
//		        *	
//			*	*	
//			*	*	*	
//*	*	*	*	*	*	*	
//			*	*	*	
//			*	*	
//			*	








//        int n=7;// Assumption - input must be odd for perfact shape;
//        
//       int sp =0;
//       int st = n;
//      
//       for(int i=1;i<=n;i++){
//           for(int j=1;j<=sp;j++){
//               System.out.print(" ");
//           }
//           
//           for(int j=1;j<=st;j++){
//               if(i>1 && i<=n/2 && j > 1 && j < st){
//                   System.out.print(" ");
//           }else{
//               
//               System.out.print("*");
//               }
//           }
//           
//           if(i<=n/2){
//              sp++;
//              st = st-2;
//           }else{
//               sp--;
//               st = st+2;       
//           }
//           System.out.println("");
//       }
//output
//*******
// *   *
//  * *
//   *
//  ***
// *****
//*******

//        int n=7;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                if(i==0)
//                {
//                  if(j==n || j<=n/2+1){
//                      System.out.print("*");
//                  }else{
//                      System.out.print(" ");
//                  }
//                    
//                }
//                
//                 else if(i<n/2)
//                 {
//                     if(j==n || j==n/2+1){
//                      System.out.print("*");
//                  }else{
//                      System.out.print(" ");
//                  }
//                    
//                    }
//                    else if(i<n/2+1)
//                    {
//                        System.out.print("*");
//                    }
//                 else if(i<n-1){
//                     if(j==1 || j==n/2+1){
//                      System.out.print("*");
//                  }else{
//                      System.out.print(" ");
//                  }
//                     }
//                
//                 else if (i==n-1){
//                    if(j==1 || j >= n/2+1){
//                      System.out.print("*");
//                  }else{
//                      System.out.print(" ");
//                  }
//                }
//                
//                      
//            }
//            System.out.println("");
//            
//        }
//        
//output
//****  *
//   *  *
//   *  *
//*******
//*  *   
//*  *   
//*  ****        
//
//
//    int n=7;
//    
//    for(int i=1;i<=n;i++){
//        
//        for(int j=1;j<=n;j++){
//            if(j==1 || j ==n){
//                System.out.print("*");
//                
//            }
//            else if(i >n/2 && (i==j|| i+j==n+1)){
//                System.out.print(" *");
//                
//            }else{
//                System.out.print("  ");
//            }
//        }
//        System.out.println("");
//    }
//output
//*          *
//*          *
//*     *    *
//*   *   *  *
//* *       **
//*          *
 
    //////////////////////////////////////////////////////    
        
        
        // Scanner s = new Scanner(System.in);
    	// int n  = s.nextInt();

//    int n=7;
   
//    int  st = 1 ;
   
//    int sp =  n-1;
//    int isp = -1;
//    int st2 = -1;
//    int k=1;
   
//    for(int i=1;i<=n ;i++)
//    {
   	 

//    	 if(i <= n/2+1 ){
//    	 	k=i;
//    	 }
//    	 else{
//    	 	k = st; 

//    	 }
    

//    		for(int j=1;j<=sp;j++)
//    		{
//    			System.out.print(" ");
//    		}

//    		for(int j=1;j<=st;j++)
//    		{
   			
//    			System.out.print(k+"");
//    			k--;
//    		}

//    		for(int j=1;j<=isp;j++)
//    		{
//    			System.out.print(" ");	
//    		}

//    		for(int j=1;j<=st2;j++)
//    		{
//    			k++;
//    			if(i!=n)
//    			System.out.print(k+"");
   				
//    		}

//    		if(i<=n/2)
//    		{
//    			st++;
//    			sp -=2;
//    			isp += 2; 
//    			st2=st;

//    		}
//    		else
//    		{

//    			 st--;
//    			 sp +=2;
//    			 st2 = st;
//    			 isp -= 2; 
//    		}

//    		System.out.println();
//    }


  
    

//   }
// }
// output
//       1
//     21 12
//   321   123
// 4321     1234
//   321   123
//     21 12
//       1




        
        
} 
}
    
}
