import java.util.*;

class Solution {
    class Song{
        int id;
        int plays;
        
        Song(int id, int plays){
            this.id = id;
            this.plays = plays;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> NumbersOfGenres = new HashMap<>();
        HashMap<String, List> eachSongs = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            if(NumbersOfGenres.containsKey(genres[i])){
                NumbersOfGenres.put(genres[i], NumbersOfGenres.get(genres[i])+plays[i]);
            } else {
                NumbersOfGenres.put(genres[i], plays[i]);
            }
            
            if(!eachSongs.containsKey(genres[i])){
                eachSongs.put(genres[i], new ArrayList<>());
            }
            
            eachSongs.get(genres[i]).add(new Song(i, plays[i]));
        }
        
        List<String> sortedGenres = new ArrayList<>(NumbersOfGenres.keySet());
        sortedGenres.sort((a, b) -> NumbersOfGenres.get(b) - NumbersOfGenres.get(a));
        
        List<Integer> result = new ArrayList<>();
        for(String genre : sortedGenres){
            List<Song> songs = eachSongs.get(genre);
            songs.sort((s1, s2) -> { 
                if (s1.plays == s2.plays) return s1.id - s2.id; 
                return s2.plays - s1.plays; 
            });
            
            for (int i = 0; i < songs.size() && i < 2; i++) {
                result.add(songs.get(i).id);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        
        return answer;
    }
}