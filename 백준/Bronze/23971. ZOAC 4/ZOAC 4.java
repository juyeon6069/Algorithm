import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        double H = sc.nextDouble();
        double W = sc.nextDouble();
        double N = sc.nextDouble();
        double M = sc.nextDouble();

        int a = (int) Math.ceil(H/(N+1));
        int b = (int) Math.ceil(W/(M+1));
        System.out.println(a*b);
    }
}