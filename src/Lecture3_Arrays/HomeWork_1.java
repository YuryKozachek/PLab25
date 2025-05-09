package Lecture3_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {
//        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        for (int i = arraySize - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

//        Найти минимальный - максимальный элементы и вывести в консоль.

        int maxNum = array[0];
        int minNum = array[0];

        for (int i = 1; i < arraySize; i++) {

            if (array[i] > maxNum) {
                maxNum = array[i];
            }
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }

        System.out.println("\n" + maxNum);
        System.out.println(minNum);

//        Найти индексы минимального и максимального элементов и вывести в консоль.

        int maxI = 0;
        int minI = 0;

        for (int i = 1; i < arraySize; i++) {
            if (array[i] > array[maxI]) {
                maxI = i;
            }
            if (array[i] < array[minI]) {
                minI = i;
            }

        }

        System.out.println(maxI);
        System.out.println(minI);

//        Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
//                вывести сообщение, что их нет.

        int quantityValue = 0;
        for (int x : array) {
            if (x == 0) {
                quantityValue++;
            }
        }
        if (quantityValue == 0) {
            System.out.println("нулевых элементов нет");
        } else {
            System.out.println(quantityValue + " нулевые есть");
        }

//        Пройти по массиву и поменять местами элементы первый и последний, второй
//        и предпоследний и т.д.

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));

//        Проверить, является ли массив возрастающей последовательностью (каждое
//        следующее число больше предыдущего).

        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                tmp++;
            }
        }
        if (tmp == 0) {
            System.out.println("массив возрастает");
        } else {
            System.out.println("массив не возрастает");
        }

        scanner.close();
    }
}
