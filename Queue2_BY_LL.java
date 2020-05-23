public class Queue2 {

	public class Node{
		int data;
		Node next;

		public Node(int data){
			this.data =data;

		}
	}

Node front;
Node rear;

public void enqueue(int data){
	Node node = new Node(data);

	if(front==null){
		front = node;
		rear = node;
	}
	else{
		rear.next=node;  
		rear = node;
	}
}
public void dequeue(){
front = front.next;
}
public void print(){
Node temp = front;
while(temp!=null){
	System.out.print( temp.data+" ");
	temp = temp.next;
}
}

		public static void main(String[] args) {
			Queue2 q = new Queue2();
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.enqueue(40);
			q.enqueue(50);
			q.enqueue(60);
			q.enqueue(70);
			q.enqueue(80);
			q.enqueue(90);
			q.print();
			System.out.println("\nAfter the 3 dequeu");
			q.dequeue();
			q.dequeue();
			q.dequeue();
			q.print();

		}
}