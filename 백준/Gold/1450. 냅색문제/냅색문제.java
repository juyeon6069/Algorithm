import java.util.*;

public class Main {
    static int n, c;
    static int[] weights;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextInt();
        weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        int mid = n/2;
        List<Long> leftSums = getSubSums(Arrays.copyOfRange(weights, 0, mid));
        List<Long> rightSums = getSubSums(Arrays.copyOfRange(weights, mid, n));
    
        Collections.sort(leftSums);
        Collections.sort(rightSums);

        int l = 0;
        int r = rightSums.size()-1;
        int cnt = 0;

        while(l < leftSums.size() && r >= 0){
            long subSum = leftSums.get(l) + rightSums.get(r);
            if(subSum > c){
                r--;
            }else{
                cnt += r+1;
                l++;
            }
        }

        System.out.println(cnt);
    }

    static List<Long> getSubSums(int[] arr) {
        int length = arr.length;
        int size = 1 << length;
        List<Long> result = new ArrayList<>();

        for(int i=0; i<size; i++){
            long sum = 0;
            for(int j=0 ; j<length; j++){
                if((i & (1<<j)) != 0){
                    sum += arr[j];
                }
            }
            if(sum <= c){
                result.add(sum);
            }
        }
        return result;
    }
}
