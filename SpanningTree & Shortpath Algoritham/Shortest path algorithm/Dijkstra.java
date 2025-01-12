package sprenningtree;
import java.util.*;

public class Dijkstra {

public static void dijkstra(int[][] graph, int source) {
int V = graph.length;
int[] dist = new int[V];

boolean[] sptSet = new boolean[V];

Arrays.fill(dist, Integer.MAX_VALUE);
dist[source] = 0;

for (int count = 0; count < V - 1; count++) {
int u = minDistance(dist, sptSet);
sptSet[u] = true;

for (int v = 0; v < V; v++) {
if (!sptSet[v] && graph[u][v] != 0 && dist[u] !=
Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
dist[v] = dist[u] + graph[u][v];
}
}
}

printSolution(dist, source);
}

public static int minDistance(int[] dist, boolean[] sptSet) {
int min = Integer.MAX_VALUE, minIndex = -1;

for (int v = 0; v < dist.length; v++) {
if (!sptSet[v] && dist[v] < min) {
min = dist[v];
minIndex = v;
}

}

return minIndex;
}

public static void printSolution(int[] dist, int source) {
System.out.println("Vertex \t Distance from Source " + source);
for (int i = 0; i < dist.length; i++) {
System.out.println(i + " \t\t " + dist[i]);
}
}

public static void main(String[] args) {
int graph[][] = new int[][] { { 0, 10, 20, 0, 0, 0 },
{ 10, 0, 0, 50, 10, 0 },
{ 20, 0, 0, 20, 33, 0 },
{ 0, 50, 20, 0, 20, 2 },
{ 0, 10, 33, 20, 0, 1 },
{ 0, 0, 0, 2, 1, 0 } };

Dijkstra t = new Dijkstra();
t.dijkstra(graph, 0);
}
}