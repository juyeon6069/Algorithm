import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<int[]> arr = new ArrayList<>();
        HashMap<int[],Integer> map = new HashMap<>();

        int k = 0;
        while(k < n){
            int[] wh = new int[2];
            wh[0] = sc.nextInt();
            wh[1] = sc.nextInt();
            
            arr.add(wh);
            map.put(wh, k);
            k++;
        }
        /*
        arr.sort((a, b) -> Integer.compare(b[0], a[0]));
        
        int[] rank = new int[n];
        for(int i=0;i<n;i++){
            rank[i] = i+1;
        }
        for(int i=1;i<n;i++){
            if(arr.get(i-1)[1]<=arr.get(i)[1]){
                rank[i] = rank[i-1];
            }
        }

        int[] finalRank = new int[n];
        int j = 0;
        for (int[] pair : arr) {
            finalRank[map.get(pair)] = rank[j];
            j++;
        }
        for(int a:finalRank){
            System.out.print(a+" ");
        }
        */
        int[] rank = new int[n];
        Arrays.fill(rank, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr.get(i)[0] < arr.get(j)[0] && arr.get(i)[1] < arr.get(j)[1]) {
                    rank[i]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
        
    }
}
