class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            
            while(k>0 && answer.length()>0 && answer.charAt(answer.length() - 1) < c){
                answer.deleteCharAt(answer.length() - 1);
                k--;
            }

            answer.append(c); 
        }
        
        
        if (k > 0) {
            answer.setLength(answer.length() - k);
        }
        return answer.toString();
    }
}