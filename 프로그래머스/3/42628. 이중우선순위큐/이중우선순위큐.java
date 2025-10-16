import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].charAt(0) == 'I') {
                q.offer(Integer.parseInt(operations[i].substring(2)));
            }else{
                if(operations[i].charAt(2) == '1'){
                    if(!q.isEmpty()){
                        q.remove(findMax(q));
                    }                    
                }else{
                    if(!q.isEmpty()){
                        q.remove(findMin(q));
                    } 
                }
            }
        }
        
        
        if(q.isEmpty()){
            return new int[]{0,0};
        }
        
        int min = q.peek();
        for(int i: q){
            if(min > i){
                min = i;
            }
        }
        
        int max = q.peek();
        for(int i: q){
            if(max < i){
                max = i;
            }
        }
        return new int[]{max, min};
    }
    
    static int findMin(Queue<Integer> q){
        int min = q.peek();
        for(int i: q){
            if(min > i){
                min = i;
            }
        }
        return min;
    }
    
    static int findMax(Queue<Integer> q){
        int max = q.peek();
        for(int i: q){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}