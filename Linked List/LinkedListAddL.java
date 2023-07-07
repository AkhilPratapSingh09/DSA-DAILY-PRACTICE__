public class LinkedListAddL{
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

    public void addFirst(int data){
         //step1= create new nod
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
   

        //step2- newNode= head
        newNode.next = head;//link

        //step3- head = newNode
        head= newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
          head =tail=newNode;
            return;
        }
        tail.next=newNode;

        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Null");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i= idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next= newNode;
    }


    public static void main(String[]args){
        LinkedListAddL ll= new LinkedListAddL();
        ll.addFirst(1);
        ll.addLast(3);
        ll.addFirst(2);
        ll.add(2,6);
        ll.print();
        System.out.println(ll.size);
    }
}