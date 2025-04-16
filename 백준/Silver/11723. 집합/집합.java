import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set.add(x);
            } else if (cmd.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                set.remove(x);
            } else if (cmd.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                sb.append(set.contains(x) ? "1\n" : "0\n");
            } else if (cmd.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) set.remove(x);
                else set.add(x);
            } else if (cmd.equals("all")) {
                set.clear();
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (cmd.equals("empty")) {
                set.clear();
            }
        }

        System.out.print(sb);
    }
}