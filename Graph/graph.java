package Graph;

import java.util.ArrayList;
//Adjacency List
public class graph {
    static class edge {
        int src; // source vertex
        int dest; // destination vertex
        int wt; // weight of the edge
        public edge (int s, int d,int w) {
           this.src = s;
           this.dest = d;
           this.wt = w;
        }
    }
    public static void createGraph (ArrayList <edge> graph[]) {
        for (int i =0; i <graph.length; i++) { // initialize each index with an ArrayList
            graph[i] = new ArrayList<edge>(); // create an empty ArrayList for each vertex
        }
        graph[0].add(new edge(0, 2,2)); // add edge from vertex 0 to vertex 2 with weight 2
        graph[1].add(new edge(1, 2,10)); // add edge from vertex 1 to vertex 2 with weight 10
        graph[1].add(new edge(1, 3,0)); // add edge from vertex 1 to vertex 3 with weight 0

        graph[2].add(new edge(2, 0,2)); // add edge from vertex 2 to vertex 0 with weight 2
        graph[2].add(new edge(2, 1,10)); // add edge from vertex 2 to vertex 1 with weight 10
        graph[2].add(new edge(2, 3,-1)); // add edge from vertex 2 to vertex 3 with weight -1

        graph[3].add(new edge(3, 1,0)); // add edge from vertex 3 to vertex 1 with weight 0
        graph[3].add(new edge(3, 1,-1)); // add edge from vertex 3 to vertex 1 with weight -1
    }
    
    public static void main(String[] args) {
        int V = 4;
        ArrayList <edge> graph[] = new ArrayList[V]; // create an array of ArrayLists for each vertex
        createGraph (graph);
        //print 2 neighbours
        for (int i =0; i < graph[2].size(); i++) { // iterate through the edges of vertex 2
            edge e = graph[2].get(i); // get the edge at index i
            // print the destination vertex and weight of the edge
            System.out.println(e.dest +  " , " + e.wt);
        }
    }
}
