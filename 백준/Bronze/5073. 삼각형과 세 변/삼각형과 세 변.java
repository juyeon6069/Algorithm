import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == 0 && b == 0 && c == 0){
                break;
            }
            int[] arr = {a,b,c};
            Arrays.sort(arr);
            a = arr[2];
            b = arr[1];
            c = arr[0];
            decideTri(a, b, c);
        }
    }

    public static void decideTri(int a, int b, int c){
        if(a>=b+c){
            System.out.println("Invalid");
            return;
        } else if(a == b && b == c && c == a){
            System.out.println("Equilateral");
            return;
        } else if(a == b || b == c){
            System.out.println("Isosceles");
            return;
        } else{
            System.out.println("Scalene");
            return;
        }

    } 
}
