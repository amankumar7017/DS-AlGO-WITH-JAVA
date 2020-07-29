import java.util.*;
class Tries{

	public class Node{

		char data;
		HashMap<Character,Node> children;
		boolean isTerminal;

		Node(char data, boolean isTerminal){
			this.data =data;
			this.isTerminal = isTerminal;
			this.children =  new HashMap<>();
		}
	}


	private int numWords ;
	private Node root ;

	Tries(){
		this.numWords = 0;
		this.root = new Node('\0',false);
	}

	public int numWords(){
		 return this.numWords;
	}

	public void addWord(String word){
		this.addWord(this.root,word);
	}

	private void addWord(Node parent,String word){

		// base case 

		if(word.length()== 0){


			if(parent.isTerminal)
			{
				// word Already Exist ; 
			}else{
				parent.isTerminal = true;
				this.numWords++;
			}

			return ;
		}


		char cc = word.charAt(0);
		String ros = word.substring(1);

		Node child = parent.children.get(cc);

		if(child==null){
			child = new Node(cc,false);
			parent.children.put(cc,child);
		}

		this.addWord(child,ros);
	}


	public void display(){
		this.display(this.root,"");
	}
	//osf = output so far;
	private void display(Node node,String osf){

		//base case 

		if(node.isTerminal){
			String toDisplay = osf.substring(1)+node.data;
			System.out.println(toDisplay);
		}


		Set<Map.Entry<Character,Node>> entries  = node.children.entrySet();

		for(Map.Entry<Character,Node> entry : entries ){
			this.display(entry.getValue(),osf+node.data);
		}


	}

	public boolean search(String str){
		return  search(this.root,str);
	}

	private boolean search(Node parent,String word){

		//base case 
		if(word.length() == 0){
			if(parent.isTerminal){
				return  true;
			}else{
				return  false;
			}

		}

		char cc = word.charAt(0);
		String ros = word.substring(1);

		Node child = parent.children.get(cc);

		if(child==null){
			return false;
		}
		return this.search(child,ros);
	}



	public void remove(String str){
		 this.remove(this.root,str);
	}

	private void remove(Node parent,String word){

		//base case 
		if(word.length() == 0){
			if(parent.isTerminal){
				parent.isTerminal = false;
				this.numWords--;
			}else{
				//word is a part of another word
			}
			return;
		}


		char cc = word.charAt(0);
		String ros = word.substring(1);

		Node child = parent.children.get(cc);

		if(child==null){
			return ;
		}
		
		 this.remove(child,ros);

		 if(!child.isTerminal && child.children.size() == 0){
		 	parent.children.remove(cc); // ye remove hash map vala h!
		 }
	}
	

}