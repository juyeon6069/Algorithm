import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        boolean[] visited = new boolean[n+1];
        int[] parent = new int[n+1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < n - 1; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(1, visited, graph, parent);

        for(int i=2; i<=n; i++){
            System.out.println(parent[i]);
        }
        
    }

    public static void dfs(int node, boolean[] visited, ArrayList<Integer>[] graph, int[] parent){
        visited[node] = true;
        for(int next : graph[node]){
            if(!visited[next]){
                parent[next] = node;
                dfs(next, visited, graph, parent);
            }
        }
    }
}