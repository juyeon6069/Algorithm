import java.util.*;

class Solution {
     public int solution(String numbers) {
        HashSet<Integer> primes = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers, "", visited, primes);
        return primes.size();
    }

    private void dfs(String numbers, String current, boolean[] visited, HashSet<Integer> primes) {
        if (!current.equals("")) {
            int num = Integer.parseInt(current);
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i), visited, primes);
                visited[i] = false;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}