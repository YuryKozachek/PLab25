package Lecture1_Intro;

public class HomeWork_2 {

    public static void main(String[] args) {

//        В переменной n хранится двузначное число. Создайте программу,
//        вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
//        результате мы должны получить 8 (2 + 6).

        int n = 26;
        int a = n / 10;
        int b = n % 10;

        System.out.println(a + b);

    }
}
