import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        for (int t = 0; t < P; t++) {
            int T = sc.nextInt(); 
            int[] heights = new int[20];
            for (int i = 0; i < 20; i++) {
                heights[i] = sc.nextInt();
            }

            List<Integer> line = new ArrayList<>();
            int totalBackwardSteps = 0;

            for (int i = 0; i < 20; i++) {
                int currentHeight = heights[i];
                int insertIndex = line.size(); 

                for (int j = 0; j < line.size(); j++) {
                    if (line.get(j) > currentHeight) {
                        insertIndex = j;
                        break;
                    }
                }

                line.add(insertIndex, currentHeight);
                totalBackwardSteps += line.size() - insertIndex - 1;
            }
            System.out.println(T + " " + totalBackwardSteps);
        }
            sc.close();
    }
}

