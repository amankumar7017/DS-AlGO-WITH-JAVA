public class Anagram{
	
		
		 public static void main(String[] args) {
		
		String s1 = "aab123";
		String s2 = "aba321";
	/*	boolean isAnagram  = false;
              
                if(s1.length() == s2.length()){
                     boolean[] visited = new boolean[s1.length()];
		for (int i=0;i<s1.length();i++ ) {
				char s= s1.charAt(i);
                                isAnagram= false;
			for (int j=0;j<s2.length();j++ ) {
				
				if(s==s2.charAt(j) && !visited[j]){
					isAnagram = true;
                                        visited[j] = true;
					break;
			}			
				}
                        if(!isAnagram){
                            break;
                        }
		}
                }
		if(isAnagram){
			System.out.println("Strings are Anagram");

		}else

		System.out.println("Strings are Not Anagram");
*/
        
            boolean isAnagram = true;
            int[] arr1 = new int[256];
//            int[] arr2=  new int[256];
//            
//            for(char c: s1.toCharArray()){
//            int index = (int) c;
//            arr1[index]++;
//            }
//	
//            
//            for(char c: s2.toCharArray()){
//            int index = (int) c;
//            arr2[index]++;
//            }
//            
//            for(int i=0;i<256;i++){
//                if(arr1[i] != arr2[i]){
//                    isAnagram =false;
//                } 
//            }

        for(char c: s1.toCharArray()){
        
            int index = (int) c;// type conversion;
            arr1[index]++;
        }
        for(char c: s2.toCharArray()){
        
            int index = (int) c;// type conversion;
            arr1[index]--;
        }

        for(int i=0;i<256;i++){
            if(arr1[i]!=0){
                isAnagram =false;
            }
        }

            if(isAnagram){
			System.out.println("Strings are Anagram");

		}else{

		System.out.println("Strings are Not Anagram");
    }
	
}
}
 