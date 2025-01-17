import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<progresses.length; i++){
            int day = (int) Math.ceil((100.0-progresses[i])/speeds[i]);
            queue.add(day);   
        }
        int count = 1; 
        while (!queue.isEmpty()) {
            int current = queue.poll(); 
            
            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }
            
            list.add(count); 
            count = 1;
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}