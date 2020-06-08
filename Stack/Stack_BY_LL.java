public class Stack2{

	public class Node{
		int data;
		Node next;

		public Node(int data){
			this.data =data;

		}
	}

	Node top;

	public void push(int data){

		Node node = new Node(data);

		if(top==null){
			top = node;

	}
	else{

		node.next= top;
		top = node;
	}
}

	public void print(){

		Node temp = top;

		if(temp==null){
			return;
		}else{
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public void pop(){
		top = top.next;
	}

	public static void main(String[] args) {
		Stack2 s = new Stack2();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		s.push(110);

		s.print();
		System.out.println("\nafter the pop operation 4");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.print();

	}



}
