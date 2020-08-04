import java.util.*;

/*Input:
N = 6
A[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are [0], [0],
[0], [0], [0 0], and [0 0].

Example 2:

Input:
N = 10
A[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4]
[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
*/

class ZeroSumSubarrays{

static    class Pair  
{ 
    int first, second; 
    Pair(int a, int b)  
    { 
        first = a; 
        second = b; 
    } 
} 

    public static void main(String arg[]) {
        
           int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

          // int a =  findSubarray(arr, arr.length);
           
          // System.out.print("this is ans "+a);

        ArrayList<Pair> out = findSubArrays(arr, arr.length); 
              
            // if we did not find any subarray with 0 sum,  
            // then subarray does not exists  
            if (out.size() == 0) 
                System.out.println("No subarray exists"); 
            else
                print(out); 


        }

    


// tle Soln
// public static int findSubarray(int[] arr ,int n) 
// {
    
//     int ans  = 0;
    
//     int sum = 0 ;
    
//     Map<Integer,ArrayList<Integer>> map = new HashMap<>();
    
//     for(int i = 0 ;i<n ;i++)
//     {
//         sum += arr[i];
        
//         if(sum == 0 ){
            
//            ans += 1;
            
//         }
        
        
//         ArrayList<Integer> index = map.get(sum);
        
//         if(index == null){
            
//              ArrayList<Integer> list = new ArrayList<>();
            
//             list.add(i);
            
//             map.put(sum, list);
            
//         }else{
            
//             ArrayList<Integer> list = map.get(sum); 
            
//             list.add(i);
           
//             map.put(sum,list); 
           
//         }
//     }
    
    
//     for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()){
        
//         ArrayList<Integer> al =  entry.getValue();
        
//         int a  = al.size();

//         for (int i =0;i<a;i++ ) {
            
//             for (int j = i+1 ;j<a;j++ ) {
                
//                 ans +=1;
//             }


//         }

      
        
//     }

//     return ans; 
    
// }

    static ArrayList<Pair> findSubArrays(int[] arr, int n) 
    { 
            // create an empty map  
            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>(); 
  
            // create an empty vector of pairs to store  
            // subarray starting and ending index  
            ArrayList<Pair> out = new ArrayList<>(); 
  
            // Maintains sum of elements so far 
            int sum = 0; 
  
            for (int i = 0; i < n; i++)  
            { 
               
               
                sum += arr[i]; 
  
                
                if (sum == 0) 
                    out.add(new Pair(0, i)); 
                ArrayList<Integer> al = new ArrayList<>(); 
                  
                 
               
                if (map.containsKey(sum)) 
                { 
                    // map[sum] stores starting index of all subarrays 
                    al = map.get(sum); 
                   // System.out.println("al print "+al);
                    for (int it = 0; it < al.size(); it++) 
                    { 

                        out.add(new Pair(al.get(it) + 1, i));  
                   } 
                } 
               
                al.add(i); 
                map.put(sum, al); 
            } 

            return out; 
    }  
    static void print(ArrayList<Pair> out) 
    { 
            for (int i = 0; i < out.size(); i++) 
            { 
                Pair p = out.get(i); 
                System.out.println("Subarray found from Index "
                        + p.first + " to " + p.second);  
            } 
    } 
    // Perfect answer 

    public static int findSubarray(int[] arr ,int n) 
{
     HashMap<Integer,ArrayList<Integer>> map = new HashMap<>(); 
  
            int ans = 0;
            int sum = 0; 
  
            for (int i = 0; i < n; i++)  
            { 
               
               
                sum += arr[i]; 
    
   
                
                if (sum == 0) {
                    ans +=1;
                   
                }
                
                ArrayList<Integer> al = new ArrayList<>(); 
                  
                 
               
                if (map.containsKey(sum)) 
                { 
                    
                    al = map.get(sum); 
                   
                   
                   ans += al.size();
                }
               
                al.add(i); 
                map.put(sum, al); 
            } 

            return ans; 
    }  


}
