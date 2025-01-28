import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] country = new int[n];
        String[] values = new String[n];
        int index = 0;
        while(index < n) {
            country[index] = sc.nextInt();
            values[index] = String.valueOf(sc.nextInt()) + String.valueOf(sc.nextInt()) + String.valueOf(sc.nextInt());
            index++;
        }
        int[] intValues = new int[n];
        int[] intVal = new int[n];
        for(int i=0; i<n; i++){
            map.put(country[i], Integer.parseInt(values[i]));
            intValues[i] = Integer.parseInt(values[i]);   
        }
        Arrays.sort(intValues);
        for(int i=0; i<n; i++){
            intVal[i] = intValues[n-i-1];
            
        }
        int val = map.get(k);
        int[] rank = new int[n];
        int r = 1;
        for(int i=1; i<n; i++){
            rank[i-1] = i; 
        }
        for(int i=1; i<n; i++){
            if(intVal[i-1] == intVal[i]){
                rank[i] = rank[i-1];
            }
            if(intVal[i] == val){
                System.out.println(rank[i]);
                break;
            }
        }
    }
}
