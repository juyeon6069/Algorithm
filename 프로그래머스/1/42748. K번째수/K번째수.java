import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int a=0; a<commands.length; a++){
            for(int j = commands[a][0]-1; j<commands[a][1]; j++){
                    arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[a] = arr.get(commands[a][2]-1);
            arr.clear();
        }
        return answer;
    }
}