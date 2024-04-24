

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {
	private int V;
    private List<List<Integer>> adjList; // Adjacency list to store the graph
    private boolean[] visited; 
    
    public DepthFirstSearch(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);
        this.visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
    }
    
    public void dfs(int source) {
        
        Arrays.fill(visited, false);
        
        dfsUtil(source);
    }
    
    private void dfsUtil(int vertex) {
        
        visited[vertex] = true;
        System.out.print(vertex + " ");
        
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor);
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        DepthFirstSearch graph = new DepthFirstSearch(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        
        System.out.println("Depth-First Search starting from vertex 0:");
        graph.dfs(0);
    }
}