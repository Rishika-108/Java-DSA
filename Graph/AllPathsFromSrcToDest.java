package Graph;

import java.util.ArrayList;

public class AllPathsFromSrcToDest {

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

    public static void printAllPath (ArrayList <edge> graph[], boolean vis[], int curr, String path,int tar) {
        if (curr == tar) { // If the current node is the target node
            System.out.println(path); // Print the path
            return; 
        }

        for (int i = 0; i < graph[curr].size(); i++) { // Iterate through all edges from the current node
             edge e = graph[curr].get(i); // Get the edge
             if ( !vis[e.dest]) { // If the destination node is not visited
                vis[curr] = true; // Mark the current node as visited
                printAllPath(graph, vis, e.dest, path+e.dest, tar);// Perform DFS on the destination node
                vis[curr] = false; // Backtrack by marking the current node as unvisited
             }
        }
    }
    
    public static void main(String[] args) {
        int V = 4;
        ArrayList <edge> graph[] = new ArrayList[V];
        createGraph (graph);
        int src = 0, tar = 3;
        printAllPath(graph, new boolean[V], src,  "0", tar);
    }
}

