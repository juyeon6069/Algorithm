import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[m][n];
        
        for (int i = 0; i < k; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    arr[y][x] = 1; 
                }
            }
        }

        ArrayList<Integer> areas  = new ArrayList<>();

        int[] dx = new int[]{-1,1,0,0};
        int[] dy = new int[]{0,0,-1,1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    int areaSize = 1;
                    while(!queue.isEmpty()){
                        int[] cur = queue.poll();
                        arr[i][j] = 2;
                        int x = cur[0];
                        int y = cur[1];
                        

                        for (int d = 0; d < 4; d++) {
                            int nx = x + dx[d];
                            int ny = y + dy[d];

                            if (nx >= 0 && nx < m && ny >= 0 && ny < n && arr[nx][ny] == 0) {
                                areaSize++;
                                queue.offer(new int[]{nx, ny});
                                arr[nx][ny] = 2;
                            }
                        }
                    }
                    areas.add(areaSize); 
                }
            }
        }
        Collections.sort(areas);
        System.out.println(areas.size());
        for (int size : areas) {
            System.out.print(size + " ");
        }
    }
}
