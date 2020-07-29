import java.util.*;
public class LinkList {
    
    //Single Linkedlist operatios(insert,delete,display)
  
  public class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            next = null;
        }
    }
        Node root = null;// its a head of node;
        Node tail = null;// its a tail of node;
   public void insertAtLast(int data){
       Node node = new Node(data);
   
       if(root == null){
        root = node;
        tail = node;
    }else{
          
          tail.next = node;  
          tail = node;
          
       }
       
   }
   public void insertAtBeg(int data){
       Node node = new Node(data);
       
       if(root == null){
           root =  node;
           tail = node;
       }else{
           Node temp = root;
           
           root = node;
           node.next  = temp;
           
       }
           
       
       
   }
   public void insertAt(int data,int loc){
       Node node = new Node(data);
       if(root == null){
           root = node;
           tail = node;
       }else{
           int s= size();
           if(loc>s){
               System.out.println("invalid location data can't be inserted");
           }else{
               
               Node temp = root;
               int i=1; 
              
               while(i < loc){
                   temp = temp.next;
                   i++;
               }
             
               Node temp2 = temp.next;
               temp.next = node;
               node.next = temp2;
               System.out.println("insertion Sucessfull");
           
           }
        
       }
       
   }
    
   public void deleteAtBeg(){
       if(root!=null){
       Node temp = root ;
        System.out.println("\ndeletion at begninig Sucessfull\ndeleted data "+temp.data);
       temp = temp.next;
       root = temp;
      
       }else{
           System.out.println("root is already empty deletion not possible");
       }
   }
   public void deleteAtLast(){
       if(root== null){
           System.out.println("No element  present in linked list");
       }else{
           Node temp = root;
           while(temp.next.next!=null){
               temp = temp.next;
           }
           
           System.out.println("deletion At last sucessfull\ndeleted data "+temp.data);
           temp.next = null;
       }
   }
   
   public void deleteAt(int loc){
       if(root == null && loc > size()){
           System.out.println("location invalid or may be no element in Linked List");
       }else{
           Node temp = root;
           int s= size();
           int i=1;
       /* this approch don't work with some corner cases
            while(i < loc){
                temp = temp.next;
                i++;
            }          
           temp.next = temp.next.next;
            */
       Node prev = null;
       
       while(i < loc){
           prev=temp;
           temp = temp.next;
           i++;
       }
           System.out.println("\ndeletion at specific location "+loc+" sucessfull\ndeleted data "+temp.data);
        prev.next  = temp.next;
           
       }
   }
   
    public int size(){
        if(root == null){
            return 0;
        }
        Node temp = root;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
     public int getMiddle()
    {
        if (root == null){
            return -1;
        }else{
            
            Node fast = root ;
            Node slow = root ;
            
            while(fast.next !=null && fast.next.next != null ){
                
                fast = fast.next.next; 
                slow = slow.next; 
                
            }
            
            return slow.data;
            
        }
    public void reverseData() throws Exception
    {
        if(head == null){
			 throw new Exception("Linked list is Empty Nothing At Middle");
		}else{
            
			int left  = 0; 
			int right = this.size();


            while(left < right){

            	Node ln  = getNodeAt(left);
            	Node rn = getNodeAt(right);

            	int temp = ln.data ;

            	ln.data = rn.data; 

            	rn.data = temp;

            	left++;
            	right--;

            }

          
        }
    }
    public void reverseByAddress() throws Exception
    {
        if(head == null){
			 throw new Exception("Linked list is Empty Nothing At Middle");
		}else{
            
			
			Node prev = this.head ;
			Node curr = prev.next;

			while(curr != null){

				Node ahead = curr.next;

				curr.next = prev;

				prev = curr ; 

				curr = ahead ;
			}

			//swap 

			Node temp = this.head ;
			head = this.tail ;
			this.tail = temp;


			// usually Forget
			this.tail.next = null ;


        }
    }
     public void display(){
         System.out.println("Linked list");
         if(root == null){
             System.out.println("No element in Linked list");
         }else{
             Node temp = root;
 
             while(temp !=null){
                 System.out.print(temp.data+" ");
                 temp = temp.next;
     
             }
         
        }
     }   
    
    public static void main(String[] args) {
        
        LinkList obj = new LinkList();
        obj.insertAtLast(10);
        obj.insertAtLast(12);
        obj.insertAtLast(14);
        obj.insertAtLast(16);
         obj.insertAtBeg(9);
          obj.insertAtBeg(8);
          obj.insertAtBeg(2);
          obj.insertAtBeg(5);
         
         obj.insertAt(99,3);
          obj.display(); 
          obj.deleteAtBeg();
          obj.deleteAtLast();
          obj.display();
          obj.deleteAt(2);
          obj.display();
          System.out.println("\nthis is middle of linkedlist "+obj.getMiddle());
   
        }
    }
