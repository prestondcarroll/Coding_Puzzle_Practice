/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        
        //create queue
        //while queue is not 0 
        // dequeue
        // get two children and add to queue
        
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        
        if(root == null){
            return 0;
        }
        queue.add(new Pair(root, 1));
        int result = 0;
        while(queue.size() != 0){
            Pair<TreeNode,Integer> nodePair = queue.poll();
            TreeNode node = nodePair.getKey();
            int depth = nodePair.getValue();          
            
            if(node.left != null) {
                queue.add(new Pair(node.left, depth + 1));
            }
            
            if (node.right != null){
                queue.add(new Pair(node.right, depth + 1));
            }
            
            if(node.right == null && node.left == null) {
                result = depth;
                break;
            }
        }     
        
        return result;
    }
}
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          