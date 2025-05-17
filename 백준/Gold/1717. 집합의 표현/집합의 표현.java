import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    static int[] size;

    static void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);

        if(size[rootA] < size[rootB]){
            int temp = rootA;
            rootA = rootB;
            rootB = temp;
        }

        parent[rootB] = rootA;
        size[rootA] += size[rootB]; 
    }

    static int find(int a){
        if(parent[a] != a){
            parent[a] = find(parent[a]);
        }
        return parent[a];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n, m;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        size = new int[n + 1]; 

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (op == 0) {
                union(a, b);
            } else {
                if (find(a) == find(b)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }

        System.out.print(sb);
    }
}