package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "pet","mock", "golf", "lock"};

        // Task 1.a
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // subtask 1.b.
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // subtask 2
        Phonebook pb = new Phonebook();

        pb.add("Sidorov", "123");
        pb.add("Manycian", "456");
        pb.add("Azamatov", "789");

        System.out.println(pb.get("Petrov"));
    }
}


