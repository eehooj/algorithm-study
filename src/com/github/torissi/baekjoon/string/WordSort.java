package com.github.torissi.baekjoon.string;

import java.util.*;

public class WordSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < num; i++) {
            set.add(scanner.nextLine());
        }

        List<String> list = new ArrayList<>(set);

        list.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        for (String item : list) {
            System.out.println(item);
        }
    }
}
