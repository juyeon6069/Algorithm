import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));

        int camera = Integer.MIN_VALUE; // 마지막 설치한 카메라 위치

        for (int[] route : routes) {
            int start = route[0];
            int end = route[1];

            // 차량 진입점이 마지막 카메라보다 크면 새로운 카메라 설치
            if (start > camera) {
                camera = end;
                answer++;
            }
        }

        return answer;
    }
}