public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        if(root == null)
        return true;
        
        return isBST(root, Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
    boolean isBST(Node root , int min , int max)
    {
        if(root == null)
        return true;
        
        if(root.data < min || root.data > max)
        return false;
        
        return isBST(root.left , min , root.data)&&isBST(root.right ,root.data ,max);
    }
}