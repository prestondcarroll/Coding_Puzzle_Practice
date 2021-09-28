class Solution {
    public int countComponents(int n, int[][] edges) {
        
        //declare adj list size n
        //for each edge in edges
        //. add first vertex to first vertex spot in adj list
        //. add second vertex to second vertex spot in adj list
        
        // declare visited array
        // starting with first node
        // run dfs on node
        // add numComponent
        
        // dfs
        //.take node
        // mark as visited
        // recurse with next node in list
        // if none in list return
        int components = 0;
        int[] visited = new int[n];
        
        List<Integer>[] adjList = new ArrayList[n];
        
        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<Integer>();
        }
        
        for(int i = 0; i < edges.length; i++){
            adjList[edges[i][0]].add(edges[i][1]);
            adjList[edges[i][1]].add(edges[i][0]);
        }
        
        for(int i = 0; i < n; i++){
            if(visited[i] == 0){
                dfs(i, visited, adjList);
                components++;
            }
        }
        return components;
    }
    
    public void dfs(int edge, int[] visited, List<Integer>[] adjList){
        visited[edge] = 1;
        
        //for each node in list
        for(int i = 0; i < adjList[edge].size(); i++){
            if(visited[adjList[edge].get(i)] == 0){
                dfs(adjList[edge].get(i), visited, adjList);
            }
        }
    }
}






















