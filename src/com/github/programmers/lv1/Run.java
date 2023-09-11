package com.github.programmers.lv1;

import java.util.*;

public class Run {

    // 시간초과
/*    public static String[] solution(String[] players, String[] callings) {
        LinkedList<String> run = new LinkedList<>(Arrays.asList(players));
        String[] answer = new String[players.length];

        for (String item : callings) {
            int i = run.indexOf(item);
            run.set(i, run.get(i - 1));
            run.set(i - 1, item);
        }

        for (int i = 0; i < run.size(); i++) {
            answer[i] = run.get(i);
        }

        return answer;
    }*/

    public static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> run = new HashMap<>();
        int length = players.length;

        for (int i = 0; i < length; i++) {
            run.put(players[i], i);
        }

        for (String item : callings) {
            Integer num = run.get(item);
            run.put(item, num - 1);
            run.put(players[num - 1], num);

            players[num] = players[num - 1];
            players[num - 1] = item;
        }

        return players;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        solution(players, callings);
    }
}

/*
*
*
* */