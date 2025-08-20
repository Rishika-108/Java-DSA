package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class edge {
        int src;
        int dest;
        int wt;
        public edge (int s, int d,int w) {
           this.src = s;
           this.dest = d;
           this.wt = w;
        }
    }
    public static void createGraph (ArrayList <edge> graph[]) {
        for (int i =0; i <graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 2,2));
        graph[1].add(new edge(1, 2,10));
        graph[1].add(new edge(1, 3,0));

        graph[2].add(new edge(2, 0,2));
        graph[2].add(new edge(2, 1,10));
        graph[2].add(new edge(2, 3,-1));

        graph[3].add(new edge(3, 1,0));
        graph[3].add(new edge(3, 1,-1));
    }

    public static void bfs (ArrayList <edge> graph[], int V, boolean vis[], int start) {
        Queue <Integer> q = new LinkedList <> ();    // Initialize a queue
        q.add (start); // Add the starting node to the queue
        vis[start] = true; // Mark the starting node as visited
        
        while ( !q.isEmpty ()) { // While the queue is not empty
            int curr = q.remove (); // Remove the front element from the queue
            System.out.print (curr + " "); // Print the current node
            

                for (int i = 0; i < graph[curr].size (); i++) { // Iterate through all edges from the current node
                    edge e =  graph[curr].get (i); // Get the edge
                    if ( !vis[e.dest]) { // If the destination node is not visited
                        q.add (e.dest); // Add the destination node to the queue
                        vis[e.dest] = true; // Mark the destination node as visited
                        
                    }
                }
            }
            System.out.println();
        }
    
    
    public static void main(String[] args) {
        int V = 4;
        ArrayList <edge> graph[] = new ArrayList[V];
         boolean[] vis = new boolean[V]; 
           createGraph (graph);
        for (int i = 0; i < V; i++) {
            if (!vis[i]) { // If the node is not visited
                 bfs (graph, V, vis, i); // Perform BFS from that node
            }
        }
       
        System.out.println ();
    }
}

