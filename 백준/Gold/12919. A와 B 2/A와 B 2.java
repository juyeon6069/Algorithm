import java.util.*;

public class Main {
    static int answer = 0;
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc. nextLine();
        dfs(s, t);
        System.out.println(answer);
    }
    
    public static void dfs(String target, String now){
        if(now.equals(target)){
            answer = 1;
            return;
        }

        if(now.length() < target.length()){
            return;
        }

        if (now.charAt(now.length()-1) == 'A') {
            dfs(target, now.substring(0, now.length() - 1));
        }
        
        if (now.charAt(0) == 'B') {
            StringBuilder sb = new StringBuilder(now);
            sb.reverse();
            sb.deleteCharAt(sb.length() - 1); 
            dfs(target, sb.toString());
        }
    }
}
