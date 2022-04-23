package com.github.torissi.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeeklyOne_1 {
    public static String solution(int[] numbers) {
        int length = numbers.length;
        String[] arr = new String[length];

        for (int i = 0; i < length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        String answer = Arrays.stream(arr)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.joining());

        if (answer.startsWith("0")) {
            answer = "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        int [] arr = {0, 0, 0, 0, 0};

        solution(arr);
    }
}

