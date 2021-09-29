class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //make adj list from prereq's
        //keep track of indegree for each course
        //use queue to keep track of elements with indegree 0
             
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();  
        int count = 0;
        
        for(int[] edge : prerequisites){
            int from = edge[1];
            int to = edge[0];
            if(graph.get(from) == null){
                List<Integer> list = new ArrayList<>();
                list.add(to);
                graph.put(from, list);
            } 
            else{
                List<Integer> list = graph.get(from);
                list.add(to);
                graph.put(from, list);
            }
            indegree[to] = indegree[to] + 1;
        }
        
        //add all nodes with 0 indegree to queue
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        
        
        //process until queue is empty
        while(queue.size() != 0){
            //take node from queue
            int node = queue.peek();
            queue.poll();
            //increment count of courses you can take
            count++;
            //Reduce the in-degree of each neighbor by 1
            List<Integer> neighborList = graph.get(node);
            if(neighborList != null){
                for(int neighbor : neighborList){
                    indegree[neighbor] -= 1;
                    //if indegree of neighbor becomes 0 add to queue  
                    if(indegree[neighbor] == 0){
                        queue.add(neighbor);
                    }
                }              
            }     
        }
   
        //see if number of courses is equal to count
        return numCourses == count;
   
    }
}
