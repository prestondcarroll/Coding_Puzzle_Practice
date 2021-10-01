/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        //declare queue with level
        //declare currentlevel = -1
        //declare prev
        //add root to queue
        
        //while queue is not 0
        //. get current depth
        //. get current node
        //. if new level / first one
        //.   prev.next = null;
        //    prev = current;
        //  else
        //.   prev.next = current;
        //  add left and add right
        
        //make last node next = null
        
        if(root == null){
            return root;
        }
        
        Queue<Pair<Node, Integer>> queue = new LinkedList<>();
        int currentDepth = -1;
        Node prev = root;
        queue.add(new Pair(root, 0));
        
        while(queue.size() != 0){
            Pair<Node, Integer> current = queue.poll();
            Node newNode = current.getKey();
            // System.out.println(newNode.val);
            int newDepth = current.getValue();
            
            if(currentDepth != newDepth){
                prev.next = null;
                prev = newNode;  
                currentDepth = newDepth;
            }
            else{
                // System.out.println(prev.val);
                prev.next = newNode;
                prev = newNode;
            }
            
            if(newNode.left != null){
                queue.add(new Pair(newNode.left, newDepth + 1));

            }
            if(newNode.right != null){
                queue.add(new Pair(newNode.right, newDepth + 1));
            }
                        
        }
        
        prev.next = null;
        
        return root;        
    }
}

























