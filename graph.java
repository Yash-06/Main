import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class graph {

    private int v;
    private int e;
    private int[][] adjMatrix;

    // public graph(int nodes){
    //     this.v = nodes; // vertices
    //     this.e = 0; // Edges
    //     this.adjMatrix = new int[nodes][nodes];
    // }

    // public void addEdge(int u, int v){
    //     adjMatrix[u][v] = 1;
    //     adjMatrix[v][u] = 1; // because it is an undirected graph
    //     e++;
    // }

    // public String toString(){
    //     StringBuilder sb = new StringBuilder();
    //     sb.append(v + " vertices " + e + " edges " + "\n");
    //     for(int k=0;k<v;k++){
    //         sb.append(k + ": ");
    //         for(int l : adjMatrix[k]){
    //             sb.append(l + " ");
    //         }
    //         sb.append("\n");
    //     }
    //     return sb.toString();
    // }

    //Adjacency List :
    
    LinkedList<Integer>[]adj;
    public graph(int nodes){
        this.e = 0;
        this.v = nodes;
        this.adj = new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        e++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(v + " Vertices, " + e + " edges " + "\n");
        for(int i=0;i<v;i++){
            sb.append(i + ": ");
            for(int j : adj[i]){
                sb.append(j + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void BFT(int s){
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for(int v : adj[u]){
                if(!visited[v]){
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }
    
    public void DFT(int s){
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                System.out.print(u + " ");
                for(int k : adj[u]){
                    if(!visited[k]){
                        stack.push(k);
                    }
                }
            }
        }
    };

    public void recursiveDFT(){
        boolean[] visited = new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[v]){
                DFT(i, visited);
            }
        }
    }
    public void DFT(int i, boolean[] visited){
        visited[i] = true;
        System.out.print(i + " ");
        for(int k : adj[i]){
            if(!visited[k]){
                DFT(k, visited);
            }        
        }
    }

    public void connectedComponents(){
        boolean[] visited = new boolean[v];
        int[] compId = new int[v];
        int count = 0;
        for(int i=0; i<v; i++){
            if(!visited[i]){
                dfs(i, visited, compId, count);
                count++;
            }
        }
    }
    void dfs(int i, boolean[] visited, int[] compId, int count){
        visited[i] = true;
        compId[i] = count;
        for(int j : adj[i]){
            if(!visited[j]){
                dfs(j, visited, compId, count);
            }
        }
    }
    
    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);  
        g.addEdge(3, 0);  
        g.addEdge(2, 4);
        //g.BFT(0);
        System.out.println(" ");
        //g.DFT(0);
        //g.recursiveDFT();
        // System.out.print(g);
        g.connectedComponents();

    }
}
