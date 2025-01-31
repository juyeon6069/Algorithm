import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] arr = new int[N];
        int count = 0;
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                count++;
            }
        }
        
        int[] ans = new int[count];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            if(idx<count){
                if (arr[i] == 0) {
                    if(minHeap.size()==0){
                        ans[idx] = 0;
                        idx++;
                    }else{
                        ans[idx] = minHeap.poll();
                        idx++;
                    }
                } else {
                    minHeap.offer(arr[i]);
                }
            }
            
        }
        for(int i = 0; i<count; i++){
            System.out.println(ans[i]+" ");
        }
    }
}
