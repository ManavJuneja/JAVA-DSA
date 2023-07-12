package Linked_List;

public class DeleteNthNode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
           this.data=data;
           this.next=null;
        }
       
    }
    public void addLast(int data){
        //step 1= create new node
        
        Node newNode=new Node(data);
        if(tail==null){
            head=tail=newNode;
            return;
        }
        //step 2 tail ka next point kar new node ko
        tail.next=newNode;

        //step 3 tail=new node
        tail=newNode;
 

    }
    public static void print(){
        if(head==null){
            System.out.println("LinkedList is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthNode(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iTofind=sz-n;
        Node prev=head;
        while(i<iTofind){
            prev.next=prev.next.next;
            i++;
        }
    }
    public static void addFirst(int data){
        //step 1 = create new nOde
        Node newNode=new Node(data);
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2=new Node next =head
        newNode.next=head;//link kardi new node ke next ko head se

        //step 3 = now make new node =head
        head=newNode;
    }
    public static Node head;
    public static Node tail;
    
  
    public static void main(String[] args) {
        DeleteNthNode ll=new DeleteNthNode();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();
        ll.deleteNthNode(1);
        ll.print();
        
    }
}
