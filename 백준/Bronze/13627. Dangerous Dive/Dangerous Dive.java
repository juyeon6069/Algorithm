import java.util.*;

// 13627
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // totalNumber 추출
        int total = sc.nextInt();
        int notReturnLen = sc.nextInt();
        
        HashSet<Integer> hs = new HashSet<>();
        if(notReturnLen == total){
            System.out.println("*");
            return;
        }
        int[] notReturn = new int[total - notReturnLen];
        for(int i = 0; i < notReturnLen; i++){
            hs.add(sc.nextInt());
        }
        int j = 0;
        for(int i = 1; i <= total; i++){
            if(!hs.contains(i)){
                notReturn[j] = i;
                j++;
            }
        }
        for(int ar: notReturn){
            System.out.print(ar+" ");
        }
        
    }
}