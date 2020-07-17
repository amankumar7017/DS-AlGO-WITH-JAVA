import java.util.*;
class Tree{

	class Node{

		int data ; 
		ArrayList<Node> children ;

		Node(int data){
			this.data = data ;
			this.children = new ArrayList<>();

		}

	}
	private Node root ;
	private int size ; 

	Tree(){

		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc,null,0);
	}

	private Node takeInput(Scanner sc,Node parent, int ithChild){


			if(parent == null){
				System.out.println("Enter the data For root node ");
			}else{
				System.out.println("Enter the data For "+ithChild+" child of  "+parent.data);
			}


			int nodedata = sc.nextInt();
			Node node = new Node(nodedata);
			this.size++;


			System.out.println("Enter the number for children of "+node.data);
			int  countChild = sc.nextInt();

			for(int i=0;i<countChild;i++){

				Node child = this.takeInput(sc,node,i);

				node.children.add(child);
			}

			return node;

	}
			public void display(){
				this.display(this.root);
			}
			private void display(Node node){

				String str = node.data+"=>";

				for (int i=0;i<node.children.size();i++) {
					
					str = str+node.children.get(i).data+", ";

				}

				str = str+" END";

			System.out.println(str);


				
				for (int i=0;i<node.children.size();i++) {
					this.display(node.children.get(i));
				}


			}
}
public class TreeCB{
	public static void main(String[] args) {
		
			Tree t = new Tree();
			t.display();

	}
}