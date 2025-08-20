package Graph;

import java.util.ArrayList;

public class DFS {
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

    public static void dfs (ArrayList <edge> graph[], int curr, boolean vis[]) {
        System.out.println(curr +  " "); // Print the current node
        vis[curr] = true; // Mark the current node as visited

        for (int i = 0; i < graph[curr].size(); i++) { // Iterate through all edges from the current node
            edge e = graph[curr].get(i); // Get the edge
            if (vis[e.dest] == false) { // If the destination node is not visited
                dfs(graph, e.dest, vis); // Perform DFS on the destination node
            }
            
        }
    }
    
    public static void main(String[] args) {
        int V = 4;
        ArrayList <edge> graph[] = new ArrayList[V];
         boolean[] vis = new boolean[V]; 
           createGraph (graph);
        for (int i = 0; i < V; i++) { // For each node in the graph
            if (!vis[i]) { // If the node is not visited
                 dfs (graph, i, vis); // Perform DFS from that node
            }
        }
        System.out.println ();
    }
}


