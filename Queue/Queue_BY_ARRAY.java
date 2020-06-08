//q.push(q.poll())//size is already defined
public class Queue {
	int[] arr = new int[6];
	int top=0;
	int begin=0;
	public void enqueue(int data){
		try{
		arr[top]  = data;
		top++;
	}catch(Exception e){
		System.out.print("OverflowError");
	}
	}

	public void dequeue(){
		try{
			if(arr[begin] != 0){
			arr[begin] = 0;
			begin++;
	}
		else if(arr[begin] == 0){
			System.out.println("value is already zero");
			begin++;
		}
	}catch(Exception e){
	System.out.println("underflow");
}
}


	public void display(){
		System.out.print("\nyour Queue at present\n");
		for(int i: arr){
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
	}
}
