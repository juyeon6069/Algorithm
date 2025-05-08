import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        Queue<int[]> queue = new LinkedList<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        int danji = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    int count = 1;
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                    while(!queue.isEmpty()){
                        int[] cur = queue.poll();
                        int cx = cur[0];
                        int cy = cur[1];
                        
                        for(int k=0; k<4; k++){
                            int nx = cx+dx[k];
                            int ny = cy+dy[k];
                            if(nx>=0 && ny>=0 && nx<n && ny<n && arr[nx][ny] == 1 && !visited[nx][ny]){
                                queue.offer(new int[]{nx, ny});
                                visited[nx][ny] = true;
                                count++;
                            }
                        }
                    }
                    list.add(count);
                }
            }
        }
        
        Collections.sort(list);
        System.out.println(list.size());
        for (int num : list) {
            System.out.println(num);
        }
    }
}
