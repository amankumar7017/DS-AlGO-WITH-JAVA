import java.util.*;


/*Example:
Input
1
8
15 -2 2 -8 1 7 10 23

Output
5

Explanation
Testcase 1: In the above test case the largest subarray with sum 0 will be -2 2 -8 1 7.*/

class MaxLenZeroSumSub{

    public static void main(String arg[]) {
        
           int[] arr = {15,-2, 2,-8, 1, 7 , 10, 23 };

           maxLen(arr, arr.length);
           
        }

    



static void maxLen(int arr[], int n) {

        int maxLength = 0, prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0)
                maxLength = i + 1;

            Integer index = map.get(prefixSum);
            if (index == null)
                map.put(prefixSum, i);
            else{
                 
                maxLength = Math.max(maxLength, i - index);
            }
        }
        System.out.println("this is ans "+maxLength);
    }
}