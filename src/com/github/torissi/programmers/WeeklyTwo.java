package com.github.torissi.programmers;

import java.sql.Array;
import java.util.Arrays;
import java.util.OptionalDouble;

public class WeeklyTwo {
    public String solution(int[][] scores) {
        int length = scores.length;
        StringBuilder grade = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int[] score = new int[length];
            int maxj = scores[i][i];
            int maxIndex = i;
            int minj = scores[i][i];
            int minIndex = i;

            for (int j = 0; j < length; j++) {
                if (maxj < scores[j][i]) {
                    maxIndex = j;
                } else if (minj > scores[j][i]) {
                    minIndex = j;
                }

                score[j] = scores[j][i];
            }

            int[] arr = new int[length];
            if (maxIndex == i || minIndex == i) {
                int finalIndex = i;
                arr = Arrays.stream(score).filter(j -> j != finalIndex).toArray();
            } else {
                arr = score;
            }

            OptionalDouble average = Arrays.stream(arr).average();
            double aa = average.getAsDouble();
            int ave = Arrays.stream(score).sum() / length;

            if (ave >= 90) grade.append("A");
            else if (ave >= 80) grade.append("B");
            else if (ave >= 70) grade.append("C");
            else if (ave >= 50) grade.append("D");
            else grade.append("F");
        }

        String answer = "";
        return answer;
    }
}
