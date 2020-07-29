class InOrderPreOrderTree{

	
	class Node{
		int data ;
		Node left;
		Node right ;


	}


	static int[] in = {40,20,50,10,30};
	static int[] pre = {10,20,40,50,30}; // and traversal you can provide; 


	public void constuct(){
		Node n = this.constuct(0,pre.length-1,0,in.length-1);

		display(n);
	} 

	private Node constuct(int preLow,int preHi,int inLow,int inHi){

		if(inLow > inHi || preLow > preHi){
			return null;
		}

		Node nn = new Node();
		nn.data = pre[preLow];

		int searchIndex = -1;
		int numberOfElement=0;

		for(int i=0;i<inHi;i++){
			if(pre[preLow] == in[i]){
				searchIndex = i;
			}
			numberOfElement++;
		}	

		nn.left = constuct(preLow+1,preLow+numberOfElement, inLow,searchIndex-1);
		nn.right = constuct(preLow+numberOfElement+1,preHi,searchIndex+1,inHi);
		return  nn;
	}

	public void display(Node node){

		if(node == null){
			return ;
		}
			System.out.println(node.data);
			display(node.left);
			
			display(node.right);
			

		
	}

public static void main(String[] args) {
	

	InOrderPreOrderTree tree = new InOrderPreOrderTree();
	tree.constuct();

}


}
