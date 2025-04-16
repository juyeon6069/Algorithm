import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[N][N];
        for(int i=0; i<N; i++){
            arr[i]= sc.nextLine().split("");
        }
        int heartX = 0;
        int heartY = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i > 0 && i < N-1 && j > 0 && j < N-1
                && arr[i][j].equals("*") 
                && arr[i-1][j].equals("*") && arr[i+1][j].equals("*") 
                && arr[i][j-1].equals("*") && arr[i][j+1].equals("*")){
                    heartX = i;
                    heartY = j;
                    break;
                }
            }
        }

        int leftArm = 0;
        for (int j = heartY - 1; j >= 0 && arr[heartX][j].equals("*"); j--) {
            leftArm++;
        }

        int rightArm = 0;
        for (int j = heartY + 1; j < N && arr[heartX][j].equals("*"); j++) {
            rightArm++;
        }

        int waist = 0;
        int waistEndX = heartX;
        for (int i = heartX + 1; i < N && arr[i][heartY].equals("*"); i++) {
            waist++;
            waistEndX = i;
        }

        int leftLeg = 0;
        for (int i = waistEndX + 1; i < N && arr[i][heartY - 1].equals("*"); i++) {
            leftLeg++;
        }

        int rightLeg = 0;
        for (int i = waistEndX + 1; i < N && arr[i][heartY + 1].equals("*"); i++) {
            rightLeg++;
        }

        System.out.println((heartX + 1) + " " + (heartY + 1));
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}
