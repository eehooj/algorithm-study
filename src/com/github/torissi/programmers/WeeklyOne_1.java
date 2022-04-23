package com.github.torissi.programmers;

import java.util.Arrays;

public class WeeklyOne_1 {
    public static String solution(int[] numbers) {
        int length = numbers.length;
        String[] arr = new String[length];
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        /*answer = Arrays.stream(arr)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.joining());

        if (answer.startsWith("0")) {
            answer = "0";
        }*/

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for (String item : arr) {
            answer.append(item);
        }

        if (answer.toString().startsWith("0")) {
            return "0";
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int [] arr = {3, 30, 34, 5, 9};

        solution(arr);
    }
}

