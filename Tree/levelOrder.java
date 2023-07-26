import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
    class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        if(node==null)return res;
        Queue<Node> q=new LinkedList<>();
        
        q.add(node);
        while(!q.isEmpty()){
            Node curr=q.remove();
            res.add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return res;
    }
}

}
