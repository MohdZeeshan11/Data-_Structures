//User function Template for Java

/*
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
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        if(node == null)
        return new ArrayList<>();
        
        ArrayList <Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            
            list.add(temp.data);
            
            if(temp.left != null)
            queue.offer(temp.left);
            if(temp.right != null)
            queue.offer(temp.right);
        }
        return list;
    }
}