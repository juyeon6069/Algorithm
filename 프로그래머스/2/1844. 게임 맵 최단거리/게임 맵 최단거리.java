import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        int[][] visited = new int[n][m];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        visited[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int ci = current[0];
            int cj = current[1];
            
            if(ci==n-1 && cj==m-1){
                return visited[ci][cj];
            }
            
            for(int k = 0; k < 4; k++){
                int ni = ci+dx[k];
                int nj = cj+dy[k];
                
                if(ni >= 0 && ni < n && nj >= 0 && nj < m && maps[ni][nj] == 1 && visited[ni][nj] == 0){
                    queue.offer(new int[]{ni, nj});
                    visited[ni][nj] = visited[ci][cj] + 1;
                }
            }
        }
        return answer;
    }
}