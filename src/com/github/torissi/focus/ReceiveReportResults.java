package com.github.torissi.focus;

import java.util.*;

public class ReceiveReportResults {

    public int[] solution(String[] id_list, String[] report, int k) {
        int length = id_list.length;
        Map<String, Set<String>> user = new HashMap<>();
        Map<String, Set<String>> badUser = new HashMap<>();
        int[] answer = new int[length];

        for (String id : id_list) {
            badUser.put(id, new HashSet<>());
            user.put(id, new HashSet<>());
        }

        for (String item : report) {
            String[] temp = item.split(" "); // 0 신고자 1 당한 사람

            user.get(temp[0]).add(temp[1]);
            badUser.get(temp[1]).add(temp[0]);
        }

        for (String item : report) {
            String[] temp = item.split(" "); // 0 신고자 1 당한 사람
            int size = badUser.get(temp[1]).size();

            if (size < k) {
                user.get(temp[0]).remove(temp[1]);
            }
        }

        for (int i = 0; i < length; i++) {
            answer[i] = user.get(id_list[i]).size();
        }

        return answer;
    }

}


/* 신고 결과 받기
* 1. 각 유저는 한 번에 한 명의 유저를 신고할 수 있음 (제한 없음, 계속 신고 가능)
* 2. 동일한 유저를 여러 번 신고할 경우 신고 횟수는 1회로 처리
* 3. k번 이상 신고된 유저는 게시판 이용이 정지됨
* 4. 정지된 유저를 신고한 모든 유저에게 메일 발송
* 5. 유저별로 신고처리 결과 메일을 받은 횟수를 배열에 담아 리턴
* */