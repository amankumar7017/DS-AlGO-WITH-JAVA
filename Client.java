public class Client extends HashTable{
	public static void main(String[] args)throws Exception{

	HashTable<String,Integer> map = new HashTable<String,Integer>(10);

	map.put("USA",200);
	map.put("UK",1800);
	map.put("India",250);
	map.put("china",300);
	map.put("India",275);				
	map.put("UAE",100);
	map.put("Nepal",200);
	map.put("Srilanka", 90);
	map.put("Pakistan",100);
	 
 	
	map.display();
	// System.out.println("--------get----------");
	// System.out.println(map.get("India"));
	// //System.out.println(map.get("UAqE"));
	// System.out.println(map.remove("china"));
	// map.display();




	}
}