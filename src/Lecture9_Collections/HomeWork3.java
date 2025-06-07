package Lecture9_Collections;

import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("c", "f", "c"));
        Map<String, Integer> count = new HashMap<>();
        Map<String, Boolean> value = new HashMap<>();
        for (String str : list) {
            if (count.containsKey(str)) {
                count.put(str, count.get(str) + 1);
            } else {
                count.put(str, 1);
            }
        }
        for (String key : count.keySet()) {
            value.put(key, count.get(key) > 1);
        }
        System.out.println(value);
    }
}
