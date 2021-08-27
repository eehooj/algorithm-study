package com.github.torissi.programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution210825_2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() != 0) {
                answer = e.getKey();
            }
        }


        return answer;
    }
}

/* 완주하지 못한 선수
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
입출력 예
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.05ms, 72.1MB)
테스트 2 〉	통과 (0.10ms, 73.2MB)
테스트 3 〉	통과 (0.58ms, 73.3MB)
테스트 4 〉	통과 (0.72ms, 60.4MB)
테스트 5 〉	통과 (1.49ms, 76.6MB)
효율성  테스트
테스트 1 〉	통과 (36.04ms, 81MB)
테스트 2 〉	통과 (73.82ms, 89.1MB)
테스트 3 〉	통과 (92.30ms, 95MB)
테스트 4 〉	통과 (98.74ms, 95.1MB)
테스트 5 〉	통과 (85.61ms, 95.3MB)
=> map으로 푸니까 훨씬 효율성이 좋음
=> HashMap은 검색에 최고의 성능을 보임
=> 해시는 배열과 링크드리스트의 조합
*/