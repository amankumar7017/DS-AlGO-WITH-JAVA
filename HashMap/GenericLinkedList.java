import java.util.*;
  
public class GenericLinkedList <T>{

   private class Node{

        T data;
        Node next;
        
        Node(T data){
            this.data = data;
            next = null;
        }
    }
    
    //Single Linkedlist operatios(insert,delete,display)
  
        Node root = null;// its a head of node;
        Node tail = null;// its a tail of node;

   public  void insertAtLast(T data){
       Node node = new Node(data);
   
       if(root == null){
        root = node;
        tail = node;
    }else{
          
          tail.next = node;  
          tail = node;
          
       }
       
   }
   public  void insertAtBeg(T data){
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
   public void insertAt(T data,int loc){
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
    
   public T deleteAtBeg()throws Exception{
       if(root!=null){
          
          throw new Exception("List is Empty");

        }

     // System.out.println("executed");
         Node rv = this.root;

        if(this.size() == 0){
          root = null;
          tail = null;
        }else{
           this.root = this.root.next;
        }
     
      return rv.data;
       
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

       if(root == null && loc >= size()){
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
       
       while(i <= loc){
           prev=temp;
           temp = temp.next;
           i++;
       }
          // System.out.println("\ndeletion at specific location "+loc+" sucessfull\ndeleted data "+temp.data);
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

    // method to get middle element of LinkedList of generic Type;
     public  T getMiddle() 
    {

        Node fast = root ;
            Node slow = root ;

        if (root == null){
           System.out.println("List is Empty ");

            //Question -----------
            //if we have generic method and root is null then we have to return a value
            // what should i return here ?? 
         
           return slow.data;

        }else{
            
           
            
            while(fast.next !=null && fast.next.next != null ){
                
                fast = fast.next.next; 
                slow = slow.next; 
                
            }
            
            return slow.data;
            
        }
      }
   

     public void display(){
         
         if(root == null){
             System.out.println("No element in Linked list");
         }else{
             Node temp = root;
 
             while(temp !=null){
                 System.out.println(temp.data+" ");
                 temp = temp.next;
     
             }
         
        }
     }   

     public boolean isEmpty(){
        return this.size()==0;
     }


     //return index if found.
     public int findElement(T data){

      int index= 0;

      Node temp = root; 

      while(temp!=null){

       if(temp.data.equals(data)){
          return index;
       }
       index+=1;
       temp = temp.next;
     }

      return -1;

   }

     private Node getNode(int index){

          Node temp = this.root;
          int counter=0;
          while(counter < index){
            temp  = temp.next;
            counter++;
          }

          return temp;
     }

     public T getAt(int idx)throws Exception{

        if(this.isEmpty()){
            throw new Exception("List is Empty");
        }
        if(idx <0 || idx >=this.size()){
            throw new Exception("Index out of range");
        }

      Node temp = this.getNode(idx);

        return temp.data;

     }
    
    // public static void main(String[] args) throws Exception{
        
    //     GenericLinkedList<String> linkedList = new GenericLinkedList<>();
        
    //     linkedList.insertAtLast("This");
    //     linkedList.insertAtLast("is ");
    //     linkedList.insertAtLast("generic");
    //     linkedList.insertAtLast("Linkedlist");
    //     linkedList.insertAtBeg("hello");
    //     // linkedList.insertAt(".",linkedList.size());
    //     // linkedList.display();
    //     // //System.out.println(linkedList.getMiddle());
    //    // linkedList.deleteAt(linkedList.size());
    //     // linkedList.display();
    //     //System.out.println(linkedList.isEmpty());
    //     // System.out.println(linkedList.getAt(2));
    //     System.out.println(linkedList.findElement("is "));
    //     }
}
