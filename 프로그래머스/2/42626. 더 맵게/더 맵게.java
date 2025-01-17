import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i<scoville.length; i++){
            minHeap.offer(scoville[i]);
        }
        for(int i = 0; i<scoville.length; i++){
            if(minHeap.size() > 1){
                if(minHeap.peek() < K){
                    int newScoville = minHeap.poll() + (minHeap.poll()*2);
                    minHeap.offer(newScoville);
                    answer++;
                } else {
                    break;
                }
            } else if(minHeap.peek() < K){
                return -1;
            } 
        }
        
        return answer;
    }
}