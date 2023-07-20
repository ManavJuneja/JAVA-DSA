

public class Palidrone {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
            if(tail==null){
                head=tail=newNode;

            }
            tail.next=newNode;
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
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkpalidrone(){
        if(head==null||head.next==null){
            return true;
        }
        //step 1 find mid
        Node midNode=findMid(head);
        //step 2;
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half ka head
        Node left=head;
        //step 3 right half equal to left half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        Palidrone ll=new Palidrone();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.addFirst(6);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println(ll.checkpalidrone());
    }

}