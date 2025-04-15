import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        HashMap <Character, Integer> map = new HashMap <>();
        for(int i=0; i<word.length(); i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i), map.get(word.charAt(i))+1);
            } else {
                map.put(word.charAt(i), 1);
            }
        }
        int max = 0;
        char result = '?';
        for (char key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                result = key;
            } else if (value == max) {
                result = '?'; 
            }
        }

        System.out.println(result);
    }
}
