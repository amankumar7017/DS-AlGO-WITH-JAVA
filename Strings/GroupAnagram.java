import java.util.*;
public class GroupAnagram{
	public static void main(String[] args) {
		//Assumption all inputs String is lowerCase in the format of array;
		//main task to group same anagrams..
		
		String[] strs = {"eat","tea","tan","ate","bat","nat"};

		Map<String,List<String>> map = new HashMap<>();

		for(String s : strs){
			char[] c = s.toCharArray();
			Arrays.sort(c);

			String sorted = new String(c);
			
			if(!map.containsKey(sorted)){
				map.put(sorted,new LinkedList<String>());
			}
			map.get(sorted).add(s);
		}
		System.out.print(map.values());
} 
}
		
