import java.util.*;

class BST{

	class Node{

		int data ;
		Node left;
		Node right ;

	}

	private Node root = null;

	public BST(int[] arr){
		this.root = construct(arr,0,arr.length-1 );
	}


	private Node construct(int[] arr , int lo,int hi){

		if(lo> hi){
			return null;
		}


		int mid = (lo+hi)/2;

		Node nn = new Node();

		nn.data = arr[mid];

		nn.left = construct(arr,lo,mid-1);
		nn.right = construct(arr,mid+1,hi);

		return nn ;

	}

	public void display(){
		this.display(this.root);
	}

	private void display(Node node){

		String str  = "";

		if(node.left!=null){

			str = str+node.left.data+" . ";
		}
		
		str = str+node.data;

		if(node.right!=null){
			str = str+" . "+node.right.data;
		}

		System.out.println(str);

		if(node.left!=null){
			this.display(node.left);
		}
		if(node.right!=null){
			this.display(node.right);
		}
	}

	public boolean find(int item){
		return this.find(this.root,item);
	}

	private boolean find(Node node, int item){

		if(node==null){
			return false;
		}

		if (item > node.data) {
			return find(node.right,item);
		}
		else if(item < node.data){
			return find(node.left,item);
		}else{
			return true;
		}


	}

	public int max(){
		return this.max(this.root);
	}

	private int max(Node node){

		if(node.right == null){
			return node.data;
		}
	
	   return max(node.right);
	
	}

	public void add(int data){
		this.add(this.root, data);
	}

	private void add(Node node, int item){

		if(item > node.data){

			if(node.right == null){

				Node nn = new Node();
				nn.data = item ;

				node.right = null;

			}else{
				add(node.right,item);
			}

	    }else{

	    	if(node.left == null){

	    		Node nn = new Node();
	    		nn.data = item;

	    		node.left = nn ;

	    	}else{
	    		add(node.left , item);
	    	}
	    }

	}

	public void remove(int data){
		this.remove(this.root, null,false,data);

	}

	private void remove(Node node , Node parent ,boolean isLeftChild,int  item )
	{
	
		if(node == null){
			return  ;
		}

		// reach to the element
		// search 

		if(item > node.data){
			remove(node.right,node,false,item);
		}
		else if (item < node.data) {
			remove(node.left,node,true,item);
		}

		else{

			//reached to the element 

			//case 1 

			if(node.left== null && node.right == null){
				if(isLeftChild){
					parent.left = null;
				}else{
					parent.right = null;
				}
			}
			//case 2
			else if(node.left == null && node.right != null){
				if(isLeftChild){
					parent.left = node.right;
				}else{
					parent.right = node.right;
				}

			}

			//case 3
			else if(node.left!=null && node.right == null){
				if(isLeftChild){
					parent.left = node.left;
				}else{
					parent.right = node.left;;;
				}
			}

			//case 4 
			else{

				int max = max(node.left);
				node.data = max;

				remove(node.left ,node,true,max);
			}

		}



	}	

}
public class BinaySearchTree{
public static void main(String[] args) {
	
		int arr[]  = {10,20,30,40,50,60,70};

			BST bst = new BST(arr);
			bst.display();
			System.out.println(bst.max());
			System.out.println("\n"+bst.find(40));


			bst.remove(50);
			bst.display();
			bst.remove(80);
			bst.display();

}

}