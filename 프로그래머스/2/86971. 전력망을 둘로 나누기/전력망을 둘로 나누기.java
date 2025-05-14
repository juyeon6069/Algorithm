import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        // 인접 리스트 생성
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 그래프 연결
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a].add(b);
            graph[b].add(a);
        }

        // 간선 하나씩 끊어보며 최소 차이 계산
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];

            // 간선 임시 제거
            graph[a].remove((Integer) b);
            graph[b].remove((Integer) a);

            // DFS로 한쪽 트리 크기 구하기
            boolean[] visited = new boolean[n + 1];
            int count = dfs(graph, visited, a);

            // 차이 계산
            int diff = Math.abs(n - count - count);
            answer = Math.min(answer, diff);

            // 간선 다시 복원
            graph[a].add(b);
            graph[b].add(a);
        }

        return answer;
    }

    private int dfs(List<Integer>[] graph, boolean[] visited, int node) {
        visited[node] = true;
        int count = 1;

        for (int next : graph[node]) {
            if (!visited[next]) {
                count += dfs(graph, visited, next);
            }
        }
        return count;
    }
}