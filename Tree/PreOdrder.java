import java.util.*;
class PreOrder{
     class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
    class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
   
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
       ArrayList<Integer> List=new ArrayList<>();
       if(root !=null) {
            System.out.print(root.data +" " );
            preorder(root.left);
            preorder(root.right);
        }
        return List;
    }

}
}
}