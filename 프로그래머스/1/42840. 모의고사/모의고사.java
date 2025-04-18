import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int p1res = 0;
        int p2res = 0;
        int p3res = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == p1[i%p1.length]){
                p1res++;
            }
            if(answers[i] == p2[i%p2.length]){
                p2res++;
            }
            if(answers[i] == p3[i%p3.length]){
                p3res++;
            }
        }
        
        int maxVal = Math.max(p1res, Math.max(p2res, p3res));
        if(maxVal == p1res) answer.add(1);
        if(maxVal == p2res) answer.add(2);
        if(maxVal == p3res) answer.add(3);
        
        int[] arr = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            arr[i] = answer.get(i);
        }
        return arr;
    }
}