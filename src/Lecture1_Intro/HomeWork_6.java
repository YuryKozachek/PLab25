package Lecture1_Intro;

public class HomeWork_6 {

    public static void main(String[] args) {

//        Написать программу которая будет менять местами значение целочисленных
//        переменных.
//                Пример:
//        int a = 1;
//        int b = 2;
//код (ваше решение)
//        sout(a); //выведет 2
//        sout(b); //выведет 1

        int a = 1;
        int b = 2;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println(a);
        System.out.println(b);
    }
}
