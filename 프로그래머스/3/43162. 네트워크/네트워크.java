/*class Solution {
    int answer = 0;
    public int solution(int n, int[][] computers) {
        // 방문체크
        boolean[] visited = new boolean[computers.length];
        // 방문하지 않은 모든 노드 순회
        for(int i = 0; i<computers.length; i++){
            if(!visited[i]){
                dfs(i, visited, computers);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;
        for(int i=0; i<computers.length; i++){
            if(computers[node][i] == 1 && !visited[i]){
                dfs(i, visited, computers);
            }
        }
    }
}*/



























class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[computers.length];
        int count = 0;
        for(int i=0; i < computers.length; i++){
            if(!visited[i]){
                dfs(i, visited, computers);
                count++;
            }
            
        }
        return count;
    }
    
    public void dfs(int i, boolean[] visited, int[][] computers){
        visited[i] = true;
        for(int j=0; j<computers.length; j++){
            if(computers[i][j] == 1 && !visited[j]){
                dfs(j, visited, computers);
            }
        }
    }
}
