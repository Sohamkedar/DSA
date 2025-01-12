package graph.dfs;
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
void DFSUtil(int v, boolean[] visited) { 
visited[v] = true; 
System.out.print(v + " "); 
for (int n : adjList[v]) { 
if (!visited[n]) { 
DFSUtil(n, visited); 
} 
} 
} 
void DFS(int v) { 
boolean[] visited = new boolean[V]; 
DFSUtil(v, visited); 
} 
} 
class Main { 
public static void main(String[] args) { 
Graph graph = new Graph(5); 
graph.addEdge(0, 1); 
graph.addEdge(0, 4); 
graph.addEdge(1, 2); 
graph.addEdge(1, 3); 
graph.addEdge(1, 4); 
graph.addEdge(2, 3); 
graph.addEdge(3, 4); 
System.out.println("Depth First Search starting from vertex 0:"); 
graph.DFS(0); 
} 
} 

