import java.util.*;

class Solution {
    static class Process{
        int id;
        int priority;
        
        Process(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = -1;
        Queue<Process> q = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            q.offer(new Process(i, priorities[i]));
        }
        
        int order = 0;
        
        while(!q.isEmpty()){
            boolean hasHigher = false;
            Process cur = q.poll();
            
            for(Process p : q){
                if(p.priority >  cur.priority){
                    hasHigher = true;
                }
            }
            if(hasHigher){
                q.offer(cur);
            }else{
                order++;
                if(cur.id == location){
                    return order;
                }
            }
        }
        
        
        return answer;
    }
}