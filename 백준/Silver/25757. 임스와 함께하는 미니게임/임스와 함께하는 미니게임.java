import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        HashSet<String> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String s = sc.nextLine();
        for(int i=0; i<count; i++){
            String id = sc.nextLine();
            hs.add(id);
        }
        int div = 0;
        if(s.equals(" Y")){
            div = 1;
        }else if(s.equals(" F")){
            div = 2;
        }else{
            div = 3;
        }
        System.out.print(hs.size()/div);
    }
}
