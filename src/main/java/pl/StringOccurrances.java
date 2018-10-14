package pl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOccurrances {

    public static void main(String[] args) {
        String text = getInputText("Podaj tekst: ");
        String key = getInputText("Podaj szukany tekst: ");
        int[][] result = findAll(text, key);
        print(result);
    }

    private static void print(int[][] result) {
    }

    private static String getInputText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    private static int[][] findAll(String text, String key) {

        Pattern pattern = Pattern.compile(key);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            //System.out.println(matcher.start() + " " + (matcher.end() - 1));
            //System.out.println(matcher.group());
        }
        matcher.reset();

        //int index = text.indexOf(key);
        //System.out.println("[{" + index + "," + (index + key.length()) +"}]");
        return null;
    }
}
