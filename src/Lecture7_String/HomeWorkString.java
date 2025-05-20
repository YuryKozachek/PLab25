package Lecture7_String;

import java.util.Scanner;

public class HomeWorkString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        String text3 = scanner.nextLine();
//        Задача 1:
        String max = text1;
        String min = text1;
        if (text2.length() > max.length()) {
            max = text2;
        }
        if (text3.length() > max.length()) {
            max = text3;
        }
        if (text2.length() < min.length()) {
            min = text2;
        }
        if (text3.length() < min.length()) {
            min = text3;
        }
        System.out.println("Короткая сторка " + min + " длинной " + min.length());
        System.out.println("Длинная сторка " + max + " длинной " + max.length());
//        Задача 2:
        String[] texts = {text1, text2, text3};
        for (int i = 0; i < texts.length - 1; i++) {
            for (int j = 0; j < texts.length - 1 - i; j++) {
                if (texts[j].length() > texts[j + 1].length()) {
                    String temp = texts[j];
                    texts[j] = texts[j + 1];
                    texts[j + 1] = temp;
                }
            }
        }
        for (String str : texts) {
            System.out.println("Сторка " + str + " длинной " + str.length());
        }
//        Задача 3:
        int num1 = text1.length();
        int num2 = text2.length();
        int num3 = text3.length();
        int average = (num1 + num2 + num3) / 3;
        for (String i : texts) {
            if (i.length() < average) {
                System.out.println("Сторка " + i + " длинной " + i.length());
            }
        }
//        Задача 4:
        String result = null;
        if (getCharSet(text1.toCharArray())) {
            result = text1;
        } else if (getCharSet(text2.toCharArray())) {
            result = text2;
        } else if (getCharSet(text3.toCharArray())) {
            result = text3;
        }
        if (result != null) {
            System.out.println("Первое слово с различными символами: " + result);
        } else {
            System.out.println("Слов с различными символами не найдено.");
        }
        //        Задача 5:
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();
        String result1 = getDuplicateChar(input);
        System.out.println("Результат: " + result1);
    }

    private static boolean getCharSet(char[] chars) {
        boolean[] charSet = new boolean[256];
        for (char c : chars) {
            if (charSet[c]) {
                return false;
            }
            charSet[c] = true;
        }
        return true;
    }

    private static String getDuplicateChar(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(c);
            result.append(c);
        }
        return result.toString();
    }
}
