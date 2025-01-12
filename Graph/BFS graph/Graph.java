package graph;
import java.util.*; 
class Graph { 
private int V; // number of vertices 
private LinkedList<Integer>[] adjList; // adjacency list 
Graph(int vertices) { 
V = vertices; 
adjList = new LinkedList[V]; 
for (int i = 0; i < V; i++) { 
adjList[i] = new LinkedList<>(); 
} 
    } 
 
    void addEdge(int src, int dest) { 
        adjList[src].add(dest); 
        adjList[dest].add(src); // For undirected graph 
    } 
    void BFS(int start) { 
        boolean[] visited = new boolean[V]; 
        LinkedList<Integer> queue = new LinkedList<>(); 
        visited[start] = true; 
        queue.add(start); 
        while (queue.size() != 0) { 
            start = queue.poll(); 
            System.out.print(start + " "); 
            for (int n : adjList[start]) { 
                if (!visited[n]) { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
} 
class Main{ 
    public static void main(String[] args) { 
        Graph graph = new Graph(5); 
 
graph.addEdge(0, 1); 
graph.addEdge(0, 4); 
graph.addEdge(1, 2); 
graph.addEdge(1, 3); 
graph.addEdge(1, 4); 
graph.addEdge(2, 3); 
graph.addEdge(3, 4); 
System.out.println("Breadth First Search starting from vertex 0:"); 
graph.BFS(0); 
} 
}