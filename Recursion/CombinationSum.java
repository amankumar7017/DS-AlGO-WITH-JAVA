import java.util.*;
public class CombinationSum{
  
    //Given an array of integers A and a sum B, find all unique combinations in A where the sum is equal to B. The same repeated number may be chosen from A unlimited number of times.

// Note:
//         1. All numbers will be positive integers.
//         2. Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
//         3. The combinations themselves must be sorted in ascending order.

// Input:
// First line of input contains number of testcases T. For each testcase, there will be three lines of input, first of which contains N, size of array. Next line contains N space seperated integers, and the last line contains B.

// Output:
// For each testcase, print the sets enclosing a backet "(" and ")". No space between two sets. If no set can be formed with the given set, then print "Empty" (without quotes).


  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ; i++){
            a[i]= sc.nextInt();
        }
        int sum = sc.nextInt();
        Arrays.sort(a);
        Set<String> result = new TreeSet<>();
        combinationSum(a,result,"",0,sum,0,n);
        if(result.size()>0){
            for(String resStr : result){
                System.out.print(resStr);
            }
        }else{
            System.out.print("Empty");
        }
        System.out.println();
        t--;
    }
  }
  
  public static void combinationSum(int[] a, Set<String> result, String currStr,int currSum, int sum, int i , int n){
      
      if(currSum>sum) return;
      if(currSum==sum){
          result.add("("+currStr.trim()+")");
          return;
      }
      if(i==n) return;
      combinationSum(a,result,currStr+a[i]+" ",currSum+a[i],sum,i,n);
      combinationSum(a,result,currStr,currSum,sum,i+1,n);
  }
}