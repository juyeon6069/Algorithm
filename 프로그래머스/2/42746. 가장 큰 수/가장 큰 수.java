/*
import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        String[] numStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));
        for(String i: numStrings){
            System.out.println(i);
        }
        
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
*/










import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        String[] strnum = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            strnum[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strnum, (a,b) -> {return (b+a).compareTo(a+b);});
        if (strnum[0].equals("0")) return "0";
        String answer = "";
        for(String s: strnum){
            answer = answer+s;
        }
        return answer;
    }
}
