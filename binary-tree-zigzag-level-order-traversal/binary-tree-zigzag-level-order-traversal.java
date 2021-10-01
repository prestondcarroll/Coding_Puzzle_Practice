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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        //declare return list
        //declare queue
        //add root to queue , with depth
        //keep track of current depth
        
        //while queue is not empty
        //  pop from queue
        //  if new depth
        //.   determine to reverse current list
        //.   add list to return list
        //.   change current depth
        //. add current to list
        //. add left and right and new depth to queue
        if(root == null){
            List<List<Integer>> returnVal = new ArrayList<>();
            return returnVal;
        }
        
        
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        int currentDepth = 0;
        int newDepth = -1;
        List<Integer> levelList = new ArrayList<Integer>();
        
        while(queue.size() != 0){
            Pair<TreeNode, Integer> current = queue.poll();
            TreeNode newNode = current.getKey();
            newDepth = current.getValue();
            if(currentDepth != newDepth){
                if(newDepth % 2 == 0){
                    List<Integer> reverseList = new ArrayList<Integer>();
                    for(int i = levelList.size() - 1; i >= 0 ; i--){
                        reverseList.add(levelList.get(i));
                    }
                    returnList.add(reverseList);
                } else {
                    returnList.add(levelList);
                }
                currentDepth = newDepth;
                levelList = new ArrayList<Integer>();            
            }
            levelList.add(newNode.val);
            if(newNode.left != null){
                queue.add(new Pair(newNode.left, newDepth + 1));
            }
            if(newNode.right != null){
                queue.add(new Pair(newNode.right, newDepth + 1));
            }                       
        }
        
        if(newDepth % 2 == 1){
            List<Integer> reverseList = new ArrayList<Integer>();
            for(int i = levelList.size() - 1; i >= 0 ; i--){
                reverseList.add(levelList.get(i));
            }
            returnList.add(reverseList);
        } else {
            returnList.add(levelList);
        }   
        
        return returnList;
    }
}




































