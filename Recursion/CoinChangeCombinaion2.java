import java.util.*;
class CoinChangeCombinaion2{
	
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);	
		int t = sc.nextInt();

	   while(t-->0){

    int n  = sc.nextInt();
        
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    
    int sum = sc.nextInt();
    
	       
// 	int n = 7;
// 		int[] arr = { 10,1,2,7,6,1,5};
//	int sum = 8;
     Set<String> set = new LinkedHashSet<>();
    	Arrays.sort(arr);
		CoinChange(arr,0,sum,"",set);
    
        if(set.size() == 0){
            System.out.println("Empty");
        }else{
           
		Iterator<String> itr = set.iterator();

		while(itr.hasNext()){
			String s = itr.next();
			s = s.trim();
			System.out.print("("+s+")");
		}
		System.out.println();
		
        }   
   }
}


		public static void CoinChange(int[] arr , int preIndex , int amount , String ans,Set<String> set){

			if(amount == 0){
			   // ans.trim();
				set.add(ans);
				//System.out.print("("+ans+")");
				return ;
			}
			
			if(amount < 0 || preIndex == arr.length ){
				return ;
			}

			// place
			CoinChange(arr,preIndex+1,amount-arr[preIndex],ans+arr[preIndex]+" ",set);

			// not place

			CoinChange (arr, preIndex+1,amount, ans,set);



		}
}