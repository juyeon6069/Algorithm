import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long left = 1;
        long right = (long) Arrays.stream(times).max().getAsInt() * n;
        
        
        
        while(left <= right){
            long mid = (left+right)/2;
            long possiblePeople = 0;
            for(int time : times){
                possiblePeople = possiblePeople + mid / time; 
            }
            
            if(possiblePeople >= n){
                answer = mid;
                right = mid -1;
            }else{
                left = mid +1;
            }
            
        }
        
        return answer;
    }
}