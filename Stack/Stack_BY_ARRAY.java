public class Stack { 

        //constructor is not used over here 
    //because constructor is use  to initialize   the value..
        int[] stack = new int[5];
        int top = 0;

    public void push(int data){
        try{
        stack[top] = data;
        top++;
        System.out.println("inserted data "+data);
    }
    catch(Exception e){
        System.out.println("stack overflow after this data "+data);
    }
}


    public void pop(){
        try{
         top--;
        stack[top]=0;
     System.out.println("\npop operation done ( top element removed )");
    }catch(Exception e){
        System.out.println("stack underflow");
    }
    }

    public void show(){
        System.out.println("your stack : ");
        for(int i: stack){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
     
     Stack s =  new Stack();
     s.push(10);
     s.push(20);
     s.push(30);
     s.push(40);

    s.push(3230);
     s.push(420);
     
     s.show();
     s.pop();
     s.show();


    }
}

   
