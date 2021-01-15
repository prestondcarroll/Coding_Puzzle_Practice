package qu1;

import java.util.LinkedList;

public class q1 {
    public enum State {
        Unvisited, Visited, Visiting;
    }


    public q1(){
        Graph g = createNewGraph();
        Node[] n = g.getNodes();




        Node start = n[3];
        Node end = n[5];

        System.out.println(isPath(g, start, end));
    }

    static boolean isPath(Graph g, Node start, Node end){
        if(start == end){
            return true;
        }

        //create queue
        LinkedList<Node> q = new LinkedList<Node>();

        //mark all as unvisited
        for( Node i: g.getNodes()){
            i.state = State.Unvisited;
        }

        start.state = State.Visiting;
        q.add(start);
        Node u;
        while(!q.isEmpty()){
            u = q.removeFirst();
            if(u != null){
                for( Node v : u.getAdjacent()){
                    if(v.state == State.Unvisited){
                        if(v == end){
                            return true;
                        }
                        else{
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
            }
            u.state = State.Visited;
        }

        return false;

    }


    public static Graph createNewGraph()
    {
        Graph g = new Graph();
        Node[] temp = new Node[6];

        temp[0] = new Node("a", 3);
        temp[1] = new Node("b", 0);
        temp[2] = new Node("c", 0);
        temp[3] = new Node("d", 1);
        temp[4] = new Node("e", 1);
        temp[5] = new Node("f", 0);

        temp[0].addAdjacent(temp[1]);
        temp[0].addAdjacent(temp[2]);
        temp[0].addAdjacent(temp[3]);
        temp[3].addAdjacent(temp[4]);
        temp[4].addAdjacent(temp[5]);
        for (int i = 0; i < 6; i++) {
            g.addNode(temp[i]);
        }
        return g;
    }
}
