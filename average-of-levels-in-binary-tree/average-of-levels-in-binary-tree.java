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
    public List<Double> averageOfLevels(TreeNode root) {
        
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
        
        //declare hashmap
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>(); 
        //declare current depth
        // int currentDepth = 0;
                
        //add root to queue with depth 0
        //while queue is not empty
        //. pop queue with current Node
        //. add to map ArrayList for current depth
        //. add children to queue with current depth + 1
        //. 
        
        queue.add(new Pair<TreeNode, Integer>(root, 0));
        
        while(queue.size() != 0){
            Pair<TreeNode, Integer> current = queue.poll();
            int currentDepth = current.getValue();
            TreeNode currentNode =current.getKey();
            if(map.get(currentDepth) != null){
                // get arraylist
                ArrayList list = map.get(currentDepth);
                list.add(currentNode.val);
                map.put(currentDepth, list);
            } 
            else {
                //new arraylist 
                ArrayList<Integer> newList = new ArrayList<Integer>();
                newList.add(currentNode.val);
                map.put(currentDepth, newList);              
            }
            if(currentNode.left != null){
                queue.add(new Pair<TreeNode, Integer>(currentNode.left, currentDepth + 1));                
            }
            if(currentNode.right != null){
                queue.add(new Pair<TreeNode, Integer>(currentNode.right, currentDepth + 1));                
            }
        }
        
        List<Double> result = new ArrayList<Double>();
        for(int key: map.keySet()){
            double avg = 0;
            int numNodes = map.get(key).size();
            
            for(int i = 0; i < map.get(key).size(); i++){
                avg += map.get(key).get(i);
            }
         
            result.add(avg / numNodes);             
        }
        return result;

    }
        
               
        //for each key average arraylist and add to return list
      
}




















