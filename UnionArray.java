import java.util.*;
class UnionArray{


    public static void Union1(int[] arr1,int[] arr2){

    	int[] union = new int[14];
    	int m = arr1.length; 
        int n = arr2.length; 
        int e = m-1; 

    	for(int i=0;i<m;i++) {
    		union[i] = arr1[i];
    	}
    	boolean found =false;
    	for (int i=0;i<n;i++ ) {
    		found = false;
    		for (int j=0;j<m ;j++ ) {
    			if(arr2[i] == arr1[j]){
    				found = true;
    				break;
    			}
    		}	
    		if(found==false){
    			union[++e] = arr2[i];
    		}

    	}


    	
    	System.out.println();
    	for(int temp: union){
    		if(temp==0){
    			break;
    		}
    		System.out.print(" "+temp);
    	}
    }

    public static void Union2(int[] arr1,int[] arr2){
    	Set<Integer> s1= new HashSet<>();
    	Set<Integer> s2= new HashSet<>();
    	
    	int m = arr1.length; 
        int n = arr2.length; 

        for (int i=0;i<m;i++) {
        	s1.add(arr1[i]);
        }
        for (int i=0;i<n;i++) {
        	s2.add(arr2[i]);
        }
        s1.addAll(s2);
        System.out.println(s1);

    }


	public static void main(String[] args) {

		int arr1[] = {7, 1, 5, 2, 3, 6}; 
        int arr2[] = {3, 8, 6, 20, 7}; 
        
        System.out.println("Union of two arrays is "); 
        Union1(arr1,arr2);
        Union2(arr1,arr2);
	}
}