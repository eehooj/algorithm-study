package com.github.programmers.lv1;

import java.util.HashMap;

public class MemoryScore {

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> score = new HashMap<>();
        int[] answer = new int[photo.length];

        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int num = 0;
            String[] photoArr = photo[i];

            for (String s : photoArr) {
                if (score.containsKey(s)) {
                    num += score.get(s);
                }
            }

            answer[i] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        solution(name, yearning, photo);
    }
}
