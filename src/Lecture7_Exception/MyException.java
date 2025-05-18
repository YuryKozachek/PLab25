package Lecture7_Exception;

public class MyException {

    public static int getDivision(int a, int b) {
        return a / b;
    }

    public static int getParseInt(String a) {
        return Integer.parseInt(String.valueOf(a));
    }

    public static int getLengthStr(String str) {
        return str.length();
    }

    public static int getArrayElement(int[] array, int num) {
        return array[num];
    }

    public static void main(String[] args) {
        try {
            System.out.println(getDivision(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("И так сойдёт");
        }

        try {
            System.out.println(getParseInt("hi"));
            System.out.println(getDivision(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Нормально");
        } catch (NumberFormatException e) {
            System.out.println("Потянет");
        }

        try {
            System.out.println(getLengthStr(null));
            System.out.println(getParseInt("hi"));
            System.out.println(getDivision(5, 0));

        } catch (NullPointerException | ArithmeticException | NumberFormatException e) {
            System.out.println("Прокатит");
        }

        try {
            System.out.println(getArrayElement(new int[]{1, 2, 3, 4, 5}, 10));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("А ты боялся");
        } finally {
            System.out.println("Всё работает");

        }
    }
}