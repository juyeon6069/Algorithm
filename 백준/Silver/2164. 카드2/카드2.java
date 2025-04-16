import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int N = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            list.add(i);
        }
        while(list.size()>=1){
            if(list.size() == 1){
                System.out.println(list.get(0));
                return;
            }
            list.remove(0);
            int second = list.remove(0);
            list.add(second);
        }
    }
}
