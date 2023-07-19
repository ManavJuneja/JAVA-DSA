<<<<<<< HEAD
package Linked_List;


public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
           this.data=data;
           this.next=null;
        }
       
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        //step 1 = create new nOde
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2=new Node next =head
        newNode.next=head;//link kardi new node ke next ko head se

        //step 3 = now make new node =head
        head=newNode;
    }
    public void addLast(int data){
        //step 1= create new node
        
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newNode;
            return;
        }
        //step 2 tail ka next point kar new node ko
        tail.next=newNode;

        //step 3 tail=new node
        tail=newNode;
 

    }
  


    public static void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1 temp-> prev
        newNode.next=temp.next;
        temp.next=newNode;

    } 

    // REMOVE FIRST

    public  int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //REMOVE LAST

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
             int val=head.data;
             head=tail=null;
             size=0;
             return val;
        }
        //prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    public int itrSearch(int key){  //TC O(n)
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;

    }

    public int helper(Node head,int  key){
        if(head==null){
            return -1;
        }
        
        if(head.data==key){
            return 0;
        }
         
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }


    public int recursiveSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }


    public  void print(){
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
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        ll.addLast(9);
        ll.print();
        ll.addMiddle(2, 15);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();

        System.out.println(ll.itrSearch(1));
        System.out.println(ll.recursiveSearch(1));
        ll.reverse();
        ll.print();


    }
    public Node mergeSort(Node head2) {
        return null;
    }
   
}
=======
package Linked_List;


public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
           this.data=data;
           this.next=null;
        }
       
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        //step 1 = create new nOde
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2=new Node next =head
        newNode.next=head;//link kardi new node ke next ko head se

        //step 3 = now make new node =head
        head=newNode;
    }
    public void addLast(int data){
        //step 1= create new node
        
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newNode;
            return;
        }
        //step 2 tail ka next point kar new node ko
        tail.next=newNode;

        //step 3 tail=new node
        tail=newNode;
 

    }
  


    public static void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1 temp-> prev
        newNode.next=temp.next;
        temp.next=newNode;

    } 

    // REMOVE FIRST

    public  int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //REMOVE LAST

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
             int val=head.data;
             head=tail=null;
             size=0;
             return val;
        }
        //prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    public int itrSearch(int key){  //TC O(n)
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;

    }

    public int helper(Node head,int  key){
        if(head==null){
            return -1;
        }
        
        if(head.data==key){
            return 0;
        }
         
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }


    public int recursiveSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }


    public  void print(){
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
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        ll.addLast(9);
        ll.print();
        ll.addMiddle(2, 15);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();

        System.out.println(ll.itrSearch(1));
        System.out.println(ll.recursiveSearch(1));
        ll.reverse();
        ll.print();


    }
   
}
>>>>>>> 75795f850c1fbd95e5f0815d62d1ff8aba8a9c27
