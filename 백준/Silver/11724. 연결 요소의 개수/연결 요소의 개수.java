import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] visited = new boolean[n + 1];
        ArrayList<Integer>[] graph = new ArrayList[n + 1];

        for(int i=0; i<=n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        int count = 0;
        for(int i=1; i<=n; i++){
            if (!visited[i]) {
                dfs(i, graph, visited);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void dfs(int i, ArrayList<Integer>[] graph, boolean[] visited){
        visited[i] = true;
        for(int node : graph[i]){
            if (!visited[node]) {
                dfs(node, graph, visited);
            }
        }
    }
}
