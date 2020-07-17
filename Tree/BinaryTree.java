import java.util.*;

class Tree{

	class Node{
		int data ;
		Node left;
		Node right ;


		Node(int data,Node left, Node right){

			this.data = data;
			this.left = left ;
			this.right = right;
		}
	}

	private Node root = null;

	int size = 0;

		Tree(){

		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc,null,false);

		}

		private Node takeInput(Scanner sc ,Node parent ,boolean isLeftOrRight){

			if(parent == null){
				System.out.println("Enter the parent Node Data ");
			}else{

				if(isLeftOrRight){
					System.out.println("Enter the data for left child of "+parent.data);
				}else{
					System.out.println("Enter the data for right child of "+parent.data);
				}	

			}

			int nodedata = sc.nextInt();
			Node node = new Node(nodedata,null,null);

			boolean choice = false;

			System.out.println("Do You want left child for "+node.data);
			choice = sc.nextBoolean();

			if(choice){
				node.left = this.takeInput(sc,node,true);
			}

			choice = false;

			System.out.println("Do You want right child for "+node.data);
			choice = sc.nextBoolean();

			if(choice){
				node.right = this.takeInput(sc,node,false);
			}

			return  node;

		}

		public void display(){
			this.display(this.root);
		}

		private void display(Node node){

			String str = "";
		
			if(node.left!=null){
				str = str+node.left.data+" => ";
			}else{
				str = str+" => END";
			}

			str = str+node.data;

			if(node.right!=null){

				str = str+" <= "+node.right.data;

			}else{

				str = str+" <= END";
			}

			System.out.println(str);

			if(node.left!=null){
				this.display(node.left);
			}
			if(node.right!=null){
				this.display(node.right);
			}

		}

		public int heightOfTree(){
			return this.heightOfTree(this.root);
		}

		private int heightOfTree(Node node){

			if(node== null){
				return -1;
			}

			int ll = this.heightOfTree(node.left);
			int rr  = this.heightOfTree(node.right);

			int height = Math.max(ll,rr)+1;

			return  height;

		}

}
public class BinaryTree{
	public static void main(String[] args) {
		
		Tree t = new Tree();
		t.display();
		System.out.println(t.heightOfTree());

	}
}