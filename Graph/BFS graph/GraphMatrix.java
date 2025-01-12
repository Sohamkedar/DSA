package graph;
import java.util.*; 
class GraphMatrix { 
    private int V; // number of vertices 
    private int[][] adjMatrix; // adjacency matrix 
    GraphMatrix(int vertices) { 
        V = vertices; 
        adjMatrix = new int[V][V]; 
    } 
    void addEdge(int src, int dest) { 
        adjMatrix[src][dest] = 1; 
        adjMatrix[dest][src] = 1; // For undirected graph 
    } 
    void BFS(int start) { 
        boolean[] visited = new boolean[V]; 
        LinkedList<Integer> queue = new LinkedList<>(); 
        visited[start] = true; 
        queue.add(start); 
        while (queue.size() != 0) { 
            start = queue.poll(); 
            System.out.print(start + " "); 
            for (int i = 0; i < V; i++) { 
                if (adjMatrix[start][i] == 1 && !visited[i]) { 
                    visited[i] = true; 
                    queue.add(i); 
                } 
            } 
} 
} 
} 
