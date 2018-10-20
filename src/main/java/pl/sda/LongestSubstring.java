package pl.sda;

import java.util.Scanner;

public class LongestSubstring {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String text1, text2;
        text1 = getInputText("Podaj pierwszy napis: ");
        text2 = getInputText("Podaj drugi napis: ");
        System.out.println("Wynik: " + find(text1, text2));
    }

    private static String getInputText(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }

    private static String find(String text1, String text2) {
        String lognestResult = "";
        for (int i = 0; i < text1.length(); i++) {
            String result = "";
            for (int j = 0, k = i; j < text2.length() && k < text1.length(); j++, k++) {

                if (text1.charAt(k) != text2.charAt(j)) {
                    result = "";
                    k = i;
                    continue;
                }

                result += text2.charAt(j);
                if (result.length() >= lognestResult.length()) {
                    lognestResult = result;
                }
            }
        }
        return lognestResult;
    }
}
