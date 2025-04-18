import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int h = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            h = citations[i];
            if(h >= citations.length - i){
                answer = citations.length - i;
                break;
            }
        }
        return answer;
    }
}