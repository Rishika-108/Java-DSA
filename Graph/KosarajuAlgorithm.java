package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgorithm {
    static class Edge {
        int src, dest; 
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr); // store finishing order
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " "); // print current node in this SCC
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V) {
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        // Step 1: Topological sort (store in stack by finish time)
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // Step 2: Transpose graph
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<>();
            vis[i] = false;
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3: DFS according to stack order
        System.out.println("Strongly Connected Components:");
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                dfs(transpose, curr, vis);
                System.out.println(); // separate SCCs
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}
