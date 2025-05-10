/*
import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        Queue<Word> queue = new LinkedList<>();
        queue.offer(new Word(begin, 0));
        
        while (!queue.isEmpty()) {
            Word cur = queue.poll();
            
            if (cur.word.equals(target)) {
                return cur.step;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canConvert(cur.word, words[i])) {
                    visited[i] = true;
                    queue.offer(new Word(words[i], cur.step + 1));
                }
            }
        }
        return answer;
    }
    
    private boolean canConvert(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
    
    private class Word{
        String word;
        int step;

        Word(String word, int step) {
            this.word = word;
            this.step = step;
        }
    }
}
*/





















import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<Words> queue  = new LinkedList<>();
        queue.offer(new Words(begin,0));
        while(!queue.isEmpty()){
            Words current = queue.poll();
            String cw = current.word;
            int cs = current.step;
            if(cw.equals(target)){
                return cs;
            }
            for(int i=0; i<words.length; i++){
                if(!visited[i] && canConvert(cw, words[i])){
                    visited[i] = true;
                    queue.offer(new Words(words[i],cs+1));
                }
            }
        }
        return 0;
        
    }
    public boolean canConvert(String word1, String word2){
        int count = 0;
        for(int i=0; i<word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i) ){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
    
    class Words{
        String word;
        int step;
        
        Words(String word, int step){
            this.word = word;
            this.step = step;
        }
    }
}