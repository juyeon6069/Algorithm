import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int prev = 1;
        int cnt = 1;
        while(prev < a){
            prev = prev + 6*cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}
