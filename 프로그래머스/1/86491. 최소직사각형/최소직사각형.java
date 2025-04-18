class Solution {
    public int solution(int[][] sizes) {
        for(int[] s : sizes){
            if(s[0]<s[1]){
                int temp = s[0];
                s[0] = s[1];
                s[1] = temp;
            }
        }
        int maxG = sizes[0][0];
        int maxS = sizes[0][1];
        for(int i=1; i<sizes.length; i++){
            if(maxG<sizes[i][0]){
                maxG = sizes[i][0];
            }
            if(maxS<sizes[i][1]){
                maxS = sizes[i][1];
            }
        }
        return maxG*maxS;
    }
}