package com.github.torissi.programmers.level1;

import java.util.*;

public class Solution220510_1 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int length = id_list.length;
        int[] answer = new int[length];
        Map<String, Set<String>> bad = new HashMap<>();
        Map<String, Integer> user = new HashMap();

        for (String item : id_list) {
            user.put(item, 0);
            bad.put(item, new HashSet<>());
        }

        for (String item : report) {
            String[] temp = item.split(" ");
            bad.get(temp[1]).add(temp[0]);
        }

        for (String item : bad.keySet()) {
            Set<String> temp = bad.get(item);
            int size = temp.size();

            if (size >= k) {
                for (String name : temp) {
                    user.put(name, user.get(name) + 1);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            answer[i] = user.get(id_list[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        solution(id_list, report, 2);
    }
}

/* 신고 결과 받기
1. 한 번에 한 유저만 신고 가능
2. 유저는 신고 횟수 제한은 없으나, 동일한 유저에 대한 신고는 1회만 처리
3. k번 이상 신고된 유저는 정지처리
4. 정지되면 그 유저 신고한 유저들은 메일을 받음
5. 각 유저 별로 처리 결과 메일을 받은 횟수를 배열에 담아 return
*/

/*
런타임 에러
*/
