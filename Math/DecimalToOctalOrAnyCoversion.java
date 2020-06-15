
import java.util.*;
 class DecimalToOctalOrAnyCoversion{

    public static void main(String args[]) {

    	// Scanner s = new Scanner(System.in);
    	// int n  = s.nextInt();
    	// Decimal to octal Conversion..

    	// decimal no with base 10
  		 int n=45;
   		 //octal base  8

  		 // you can change octal and decimal variable to get any kind of conversion.

  		 int octal = 8 ;
  		 int decimal = 10;

  		 int rem =0;
  		 int result = 0;
  		 int count =0;

   		   while(n!=0){

   		   	rem = n%octal;
   		   	result = result+rem*(int)Math.pow(decimal,count);// type conversion because Math.pow return decimal number.
   		   	count++;
   		   	n = n/octal;

   		   }

		System.out.println(result);// output 45


  }
}
