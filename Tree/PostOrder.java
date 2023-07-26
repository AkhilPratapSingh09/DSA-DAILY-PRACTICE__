import java.util.*;
public class PostOrder {
    class Node {
        int data;
        Node left, right;
       Node(int item)    {
            data = item;
            left = right = null;
        }
    } 
    
    class Tree
    {
        //Function to return a list containing the postorder traversal of the tree.
        ArrayList<Integer> postOrder(Node root)
        {
           // Your code goes here
           ArrayList<Integer>List=new ArrayList<>();
           if(root!=null){
               postOrder(root.left);
               postOrder(root.right);
               System.out.print(root.data+" ");
           }
           return List;
        }
    }

    
}
