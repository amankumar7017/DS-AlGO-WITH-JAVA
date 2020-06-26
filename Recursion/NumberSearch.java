import java.util.*;
public class NumberSearch{


  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();

    int[] arr = new int[n];

    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();

    System.out.print("enter Number To be Search ");

    int Search = sc.nextInt();

    getAns(arr,0,n,Search);
 
 }
    public static void getAns(int[] arr,int si,int li,int search){

      if(si == li){
        return;
      }
        if(arr[si] == search){
          System.out.print(si+" ");

        }
            getAns(arr,si+1,li,search);
    }

}  