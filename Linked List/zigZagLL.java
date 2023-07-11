import java.util.LinkedList;
public class zigZagLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public void zigzag(){
        // mid
        Node slow=head;
        Node fast= head;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        Node mid=slow;

        // reverse 2nd half

        Node curr= mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr != null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
    
        }
        Node left=head;
        Node right=prev;
        Node nextL, nextR;

        // alternate merge - zigZag merge
        while(left !=null && right !=null){
            nextL = left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            // update
            left= nextL;
            right=nextR;
        }
    }
    public static void main(String[]args){
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addLast(1);
         ll.addLast(2);
         ll.addLast(3);
         ll.addLast(4);
         ll.addLast(5);
         ll.addLast(6);

        //  System.out.println(ll);
        //  System.out.println(ll.zigzag());
         
        

    }
}
