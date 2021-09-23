/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {       
        //put first node in queue
        //clone first node and add to visited hash map
        
        //BFS
        //pop node
        //visit all the neighbors
        //if in the visited map, clone that one
        //otherwise create clone and store in visited map
        //add all clones to current node's adj list
        if(node == null){
            return node;
        }
        
        
        HashMap<Node, Node> map = new HashMap<>();
        
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
              
        Node cloneRoot = new Node(node.val, new ArrayList());
        map.put(node, cloneRoot);
        
        while(queue.size() != 0){
            Node current = queue.poll();
            for(Node i : current.neighbors){
                if(map.get(i) == null){
                    map.put(i, new Node(i.val, new ArrayList()));
                    queue.add(i);
                }
                
                map.get(current).neighbors.add(map.get(i));               
            }
        }
        
        return map.get(node);
           
    }
}







