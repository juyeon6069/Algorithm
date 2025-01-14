import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet(); 
        int n = nums.length / 2;
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        if(set.size() > n){
            answer = n;
        } else {
            answer = set.size();
        }
        
        return answer;
    }
}