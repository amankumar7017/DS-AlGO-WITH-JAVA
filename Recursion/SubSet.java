import java.util.*;
class SubSet{
	
	public static void main(String[] args) {

//Input:
// 2
// 3
// 1 2 2
// 4
// 1 2 3 3

// Output:
// ()(1)(1 2)(1 2 2)(2)(2 2)
// ()(1)(1 2)(1 2 3)(1 2 3 3)(1 3)(1 3 3)(2)(2 3)(2 3 3)(3)(3 3)

// hint -  make recursive tree Easily Solvable

	 
	   Scanner sc = new Scanner(System.in);	
		int t = sc.nextInt();

	  while(t-->0){

    int n  = sc.nextInt();
        
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }  
        
   Arrays.sort(arr);
    
    Set<String> set = new TreeSet();
	    
	Subset(arr,0,n,"",set);

	Iterator<String> itr = set.iterator();

		while(itr.hasNext()){
			String s = itr.next();
			s = s.trim();
			System.out.print("("+s+")");
		}
		System.out.println();
		
        }   
}

	public static void Subset(int[] arr , int si,int n, String ans,Set<String> set){
	if(si == n){
			set.add(ans);
			return ;
		}


		Subset(arr,si+1,n,ans+arr[si]+" ",set);
		Subset(arr,si+1,n,ans,set);
	}
}