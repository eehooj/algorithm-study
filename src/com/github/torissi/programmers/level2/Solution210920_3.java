package com.github.torissi.programmers.level2;

import java.util.Arrays;

public class Solution210920_3 {

    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < length; i++) {
            if (citations[i] >= length - i) {
                answer = length - i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}

/* H-Index
문제 설명
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
입출력 예
citations	return
[3, 0, 6, 1, 5]	3
입출력 예 설명
이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.

※ 공지 - 2019년 2월 28일 테스트 케이스가 추가되었습니다.

https://en.wikipedia.org/wiki/H-index "위키백과" ↩

=> 문제 이해 참고 https://yabmoons.tistory.com/694
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.46ms, 70.9MB)
테스트 2 〉	통과 (0.62ms, 69.6MB)
테스트 3 〉	통과 (0.54ms, 61.3MB)
테스트 4 〉	통과 (0.63ms, 58.3MB)
테스트 5 〉	통과 (0.57ms, 68.7MB)
테스트 6 〉	통과 (0.59ms, 59.2MB)
테스트 7 〉	통과 (0.53ms, 72.6MB)
테스트 8 〉	통과 (0.39ms, 58.8MB)
테스트 9 〉	통과 (0.36ms, 65.4MB)
테스트 10 〉	통과 (0.44ms, 72MB)
테스트 11 〉	통과 (0.96ms, 70.7MB)
테스트 12 〉	통과 (0.37ms, 59.4MB)
테스트 13 〉	통과 (0.64ms, 75.7MB)
테스트 14 〉	통과 (0.68ms, 69.4MB)
테스트 15 〉	통과 (0.91ms, 60.3MB)
테스트 16 〉	통과 (0.36ms, 60.4MB)
*/
