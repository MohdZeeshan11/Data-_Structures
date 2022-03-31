//User function Template for Java


/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
        int result = checkDiffOFHeight(root);
        if(result == -1)
        return false;
        else 
        return true;
    }
    int checkDiffOFHeight(Node root)
    {
        if(root == null)
        return 0;
        
        int left = checkDiffOFHeight(root.left);
        int right = checkDiffOFHeight(root.right);
        
        if(left == -1 || right == -1)
        return -1;
        
        if(Math.abs(left-right)>1)
        return -1;
        
        return 1+Math.max(left,right);
    }
}