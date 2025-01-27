import java.util.*;

class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        int calculatedNum = 0;
        //dfs(0, 0, target, numbers);
        
        int n = numbers.length;
        bfs(numbers, target);
        return answer;
    }
    
    public void bfs(int[] numbers, int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentSum = current[0];
            int idx = current[1];

            if (idx == numbers.length) {
                if (currentSum == target) {
                    answer++;
                }
                continue;
            }

            queue.offer(new int[]{currentSum + numbers[idx], idx + 1});
            queue.offer(new int[]{currentSum - numbers[idx], idx + 1});
        }
    }
    
/*
    public void dfs(int calculatedNum, int index, int target, int[] arr){
        // Base Case
        if(calculatedNum == target && arr.length == index+1){
            answer++;
            return;
        }
        if(arr.length <= index+1){
            return;
        }
        dfs(calculatedNum+arr[index+1], index+1, target, arr);
        dfs(calculatedNum-arr[index+1], index+1, target, arr);
    }*/
    
}