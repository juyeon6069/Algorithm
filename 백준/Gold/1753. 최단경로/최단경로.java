import java.util.*;
import java.io.*;

public class Main {
    static class Node{
        int index;
        int distance;

        Node(int index, int distance){
            this.index = index;
            this.distance = distance;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Node>[] graph = new ArrayList[V+1]; 
        for(int i=1; i<=V; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph[u].add(new Node(v,w));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> a.distance - b.distance);
        pq.offer(new Node(K, 0));
        int[] dist = new int[V+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K] = 0;

        while(!pq.isEmpty()){
            Node current = pq.poll();

            if (current.distance > dist[current.index]) continue;

            for(Node next : graph[current.index]){
                if(dist[next.index] > dist[current.index] + next.distance){
                    dist[next.index] = dist[current.index] + next.distance;
                    pq.offer(new Node(next.index, dist[next.index]));
                }
            }
        }
        for(int i=1; i<=V; i++){
            if(i == K){
                System.out.println("0");
            }else if(dist[i] == Integer.MAX_VALUE){
                System.out.println("INF");
            }else{
                System.out.println(dist[i]);
            }
        }
    }
}
