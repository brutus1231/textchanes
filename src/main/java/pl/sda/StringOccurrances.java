package pl.sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOccurrances {

    public static void main(String[] args) {
        String text = getInputText("Podaj tekst: ");
        String key = getInputText("Podaj szukany tekst: ");
        int[][] result = findAll(text, key);
        print(result);

        findAllIndexOf(text, key);
    }

    private static void print(int[][] result) {
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print("{" + result[i][0] + " " + result[i][1] + "}");
        }
        System.out.print("]");
    }

    private static String getInputText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    private static int[][] findAll(String text, String key) {
        Pattern pattern = Pattern.compile(key);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        matcher.reset();
        int[][] occurrances = new int[counter][2];

        for (int i = 0; i < counter; i++) {
            matcher.find();
            occurrances[i][0] = matcher.start();
            occurrances[i][1] = matcher.end() - 1;
        }

        return occurrances;
    }

    private static List findAllIndexOf(String text, String key) {
        System.out.println();
        int index = 0;
        List result = new ArrayList();
        do {
            index = text.indexOf(key, index);
            if (index == -1) break;
            result.add(Arrays.asList(index, index + key.length() - 1));
            index++;
        } while (true);

        System.out.println(result);
        return result;
    }
}
