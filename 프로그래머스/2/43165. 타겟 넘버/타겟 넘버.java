class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        int calculatedNum = 0;
        dfs(0, -1, target, numbers);
        return answer;
    }
    
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
    }
}