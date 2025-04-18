class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, target, numbers, 0);
        return answer;
    }
    
    public void dfs(int depth, int target, int[] numbers, int result){
        if(numbers.length == depth  && result == target){
            answer++;
            return;
        }
        if(numbers.length == depth){
            return;
        }
        dfs(depth+1, target, numbers, result-numbers[depth]);
        dfs(depth+1, target, numbers, result+numbers[depth]);
    }
}
