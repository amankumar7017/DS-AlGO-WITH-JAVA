public class TriesClient extends Tries{

	public static void main(String[] args) {
		
		Tries tries = new Tries();

		tries.addWord("art");
		tries.addWord("arts");		
		tries.addWord("bug");
		tries.addWord("boy");
		tries.addWord("see");
		tries.addWord("seen");
		tries.addWord("sea");
		tries.display();
		System.out.println(tries.search("sea"));
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		tries.remove("bug");
		tries.display();
	}
}