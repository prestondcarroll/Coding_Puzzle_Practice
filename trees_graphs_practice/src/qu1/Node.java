package qu1;

public class Node{
    public String name;
    public Node[] adjacent;
    public int adjacentCount;
    public q1.State state;
    private String vertex;



    public Node(String vertex, int adjacentLength){
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];
    }

    public void addAdjacent(Node x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.print("No more adjacent can be added");
        }
    }

    public Node[] getAdjacent() {
        return adjacent;
    }
    public String getVertex() {
        return vertex;
    }


}
