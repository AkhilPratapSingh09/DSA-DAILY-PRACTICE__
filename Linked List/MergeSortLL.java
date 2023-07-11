import java.util.LinkedList;
public class MergeSortLL {
    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data=data;
            this.next=null;
    
        }
    }
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;//mid
    }
    private Node merge(Node head1, Node head2){
        Node mergeLL= new Node(-1);
        Node temp= mergeLL;
        while(head1 != null && head2 !=null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;

            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }

        }
        while(head1 != null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null && head.next==null){
            return head;
        }
        //find
        Node mid= getMid(head);
        //left & right Merge sort
        Node rightHead= mid.next;
        mid.next=null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }
    public static void main(String[]args){
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        System.out.println(ll);
        // ll.head= ll.mergeSort(ll.head);
    }
}
