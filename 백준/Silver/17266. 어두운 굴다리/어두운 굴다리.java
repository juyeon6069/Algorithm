import java.util.*;

public class Main {
    static int N, M;
    static int[] lamp;

    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); 
        M = sc.nextInt();  
        lamp = new int[M];

        for (int i = 0; i < M; i++) {
            lamp[i] = sc.nextInt(); 
        }

        int left = 0;
        int right = N;
        while(left<=right){
            int mid = (left+right)/2;
            if(canLightAll(mid)){
                answer = mid;
                right = mid -1;
            } else {
                left = mid + 1; 
            }
        }
        System.out.println(answer);
    }

    public static boolean canLightAll(int h) {
        if(lamp[0]-h>0){
            return false;
        }else if(lamp[lamp.length-1]+h<N){
            return false;
        }
        for (int i = 0; i < M - 1; i++) {
            if (lamp[i + 1] - lamp[i] > 2 * h) {
                return false;
            }
        }
        return true;
    }
}
