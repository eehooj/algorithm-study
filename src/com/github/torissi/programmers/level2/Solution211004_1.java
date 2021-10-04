package com.github.torissi.programmers.level2;


public class Solution211004_1 {

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] number = {"4", "1", "2"};
        int count = n;

        while (count > 0) {
            answer.insert(0, number[count % 3]); // 인덱스 0번째에 삽입
            count = (count - 1) / 3;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
    }
}

/* 124 나라의 숫자
문제 설명
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법	124 나라	10진법	124 나라
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 500,000,000이하의 자연수 입니다.
입출력 예
n	result
1	1
2	2
3	4
4	11
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.06ms, 72.9MB)
테스트 2 〉	통과 (0.04ms, 74MB)
테스트 3 〉	통과 (0.03ms, 75MB)
테스트 4 〉	통과 (0.06ms, 79.1MB)
테스트 5 〉	통과 (0.05ms, 77.9MB)
테스트 6 〉	통과 (0.03ms, 75.9MB)
테스트 7 〉	통과 (0.04ms, 71.6MB)
테스트 8 〉	통과 (0.03ms, 70.9MB)
테스트 9 〉	통과 (0.03ms, 76.7MB)
테스트 10 〉	통과 (0.04ms, 75.5MB)
테스트 11 〉	통과 (0.04ms, 71.5MB)
테스트 12 〉	통과 (0.04ms, 81.7MB)
테스트 13 〉	통과 (0.04ms, 83MB)
테스트 14 〉	통과 (0.04ms, 77MB)
효율성  테스트
테스트 1 〉	통과 (0.06ms, 53.1MB)
테스트 2 〉	통과 (0.05ms, 51.9MB)
테스트 3 〉	통과 (0.07ms, 52.1MB)
테스트 4 〉	통과 (0.06ms, 51.9MB)
테스트 5 〉	통과 (0.06ms, 52.5MB)
테스트 6 〉	통과 (0.05ms, 52MB)
*/
