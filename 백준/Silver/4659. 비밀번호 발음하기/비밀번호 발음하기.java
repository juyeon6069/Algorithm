import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Your solution here
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        while(true){
            if(password.equals("end")){
                break;
            }
            if(isAcceptable(password)){
                System.out.println("<"+password+"> is acceptable.");
            }else{
                System.out.println("<"+password+"> is not acceptable.");
            }
            password = sc.nextLine();
        }
        
    }

    public static boolean isAcceptable(String pw) {
        String vowels = "aeiou";
        boolean hasVowel = false;
        int vowelCount = 0;
        int consonantCount = 0;
        char prev = 0;

        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);

            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
                vowelCount++;
                consonantCount = 0;
            } else {
                vowelCount = 0;
                consonantCount++;
            }

            if (vowelCount == 3 || consonantCount == 3) {
                return false;
            }

            if (i >= 1 && c == prev && !(c == 'e' || c == 'o')) {
                return false;
            }

            prev = c;
        }

        return hasVowel;
    }
}
