package Lecture2_ControlOperators;

import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args) {
//        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
//        «Warm».
//        Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp > -5) {
            System.out.println("Warm");
        } else if (temp > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        scanner.close();
    }
}
