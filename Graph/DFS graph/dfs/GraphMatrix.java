package graph.dfs;
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
void DFSUtil(int v, boolean[] visited) { 
visited[v] = true; 
System.out.print(v + " "); 
for (int i = 0; i < V; i++) { 
if (adjMatrix[v][i] == 1 && !visited[i]) { 
DFSUtil(i, visited); 
} 
} 
} 
void DFS(int v) { 
boolean[] visited = new boolean[V]; 
DFSUtil(v, visited); 
} 
} 