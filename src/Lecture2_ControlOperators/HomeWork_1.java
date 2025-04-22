package Lecture2_ControlOperators;

import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {
//        Напишите программу, которая будет принимать на вход число из консоли и на
//        выход будет выводить сообщение четное число или нет. Для определения
//        четности числа используйте операцию получения остатка от деления (операция
//        выглядит так: '% 2').
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное " + a);
        } else {
            System.out.println("Число не четное " + a);
        }
        scanner.close();
    }
}
