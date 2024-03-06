package luan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre a String a ser invertida!");
        String value = sc.nextLine();

        System.out.println(invertString(value));
    }

    private static String invertString(final String ORIGINAL_STRING) {
        final int SIZE = ORIGINAL_STRING.length() - 1;

        StringBuilder invertedString = new StringBuilder();

        for(int i = 0; i <= SIZE; i++) {
            invertedString.append(ORIGINAL_STRING.charAt(SIZE - i));
        }

        return invertedString.toString();
    }
}