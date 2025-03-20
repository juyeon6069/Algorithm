import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        String[] strarr = firstLine.split(" ");
        int N = Integer.parseInt(strarr[0]);
        int newVal = Integer.parseInt(strarr[1]);
        int P = Integer.parseInt(strarr[2]);

        ArrayList<Integer> values = new ArrayList<>(); 
        for(int i=0; i<N; i++){
            values.add(sc.nextInt());
        }
        int rank = 0;
        if(N==0 && P==0){
            rank=-1;
        }else{
            if(N == P && newVal <= values.get(values.size()-1)){
                System.out.print(-1);
            }else{
                rank = 1;
                for(int i=0; i<values.size(); i++){
                    if(newVal < values.get(i)){
                        rank++;
                    }else{
                        break;
                    }  
                }
                System.out.print(rank);
            }
        }
        
    }
}
