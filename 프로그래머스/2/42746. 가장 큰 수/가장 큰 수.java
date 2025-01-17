import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        String[] numStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));

        if (numStrings[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String num : numStrings) {
            result.append(num);
        }
        return result.toString();
    }
}