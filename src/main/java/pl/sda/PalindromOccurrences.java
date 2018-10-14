package pl.sda;

import java.util.Scanner;

public class PalindromOccurrences {

    public static void main(String[] args) {
        String text = getInputText("Podaj tekst: ");
        printAll(text);
    }

    private static void printAll(String text) {

        for (int i = 1; i < text.length(); i++) {

        }
    }


    private static String getInputText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
