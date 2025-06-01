package Lecture9_Collections;

import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        List<Integer> list = new ArrayList<>(set);
        System.out.println("Числа без повторов:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
