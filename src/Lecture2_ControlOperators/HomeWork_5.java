package Lecture2_ControlOperators;

import java.util.Scanner;

public class HomeWork_5 {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит любое целое положительное
//        число. А программа суммирует все числа от 1 до введенного пользователем числа. Для
//        ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
//        пользователь не мог ввести некорректные данные.
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Введено не число");
        }
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                result += i;
            }
            System.out.println(result);
        } else {
            System.out.println("Введено отрицательное число или 0");
        }
        scanner.close();
    }
}
