package Graph;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    static class Edge {
        int dest, wt; 
        public Edge(int d, int w) {
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(2, 4));

        graph[1].add(new Edge(3, 7));
        graph[1].add(new Edge(2, 1));

        graph[2].add(new Edge(4, 3));

        graph[3].add(new Edge(5, 1));

        graph[4].add(new Edge(3, 2));
        graph[4].add(new Edge(5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int node, dist;
        public Pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist; // ascending
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = (i == src) ? 0 : Integer.MAX_VALUE;
        }

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;

                for (Edge e : graph[curr.node]) {
                    int v = e.dest;
                    if (dist[curr.node] + e.wt < dist[v]) {
                        dist[v] = dist[curr.node] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("No path from " + src + " to " + i);
            } else {
                System.out.print(dist[i] +  " ");
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0, V);
    }
}
