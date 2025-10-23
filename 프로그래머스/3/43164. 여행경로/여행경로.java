import java.util.*;

class Solution {
    ArrayList<String> answer = new ArrayList<>();
    boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, (a, b) -> {
            int cmp = a[0].compareTo(b[0]);
            if(cmp != 0) return cmp;
            return a[1].compareTo(b[1]);
        });
        
        visited = new boolean[tickets.length];
        dfs("ICN", "ICN", tickets, 0);
        
        
        return answer.get(0).split(" ");
    }
    
    void dfs(String from, String path, String[][] tickets, int c){
        if(c == tickets.length){
            answer.add(path);
            return;
        }
            
        for(int i=0; i<tickets.length; i++){
            if(from.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1],tickets, c+1);
                visited[i] = false;
            }
        }
    }
}