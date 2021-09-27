package com.github.torissi.programmers.level2;

public class Solution210927_1 {

    public static int solution(String name) {
        int answer = 0;
        int length = name.length();

        int minMove = length - 1;

        for (int i = 0; i < length; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            int next = i + 1;

            while (next < length && name.charAt(next) == 'A') {
                next++;
            }

            minMove = Math.min(minMove, i + length - next + i);
        }

        return answer += minMove;
    }

    public static void main(String[] args) {
        solution("JEROEN");
    }
}

/*https://parksuu.github.io/139-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A1%B0%EC%9D%B4%EC%8A%A4%ED%8B%B1-(java)/*/

/* 조이스틱
문제 설명
조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA

조이스틱을 각 방향으로 움직이면 아래와 같습니다.

▲ - 다음 알파벳
▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
▶ - 커서를 오른쪽으로 이동
예를 들어 아래의 방법으로 "JAZ"를 만들 수 있습니다.

- 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
- 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
- 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해 조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.

제한 사항
name은 알파벳 대문자로만 이루어져 있습니다.
name의 길이는 1 이상 20 이하입니다.
입출력 예
name	return
"JEROEN"	56
"JAN"	23
출처

※ 공지 - 2019년 2월 28일 테스트케이스가 추가되었습니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 78.1MB)
테스트 2 〉	통과 (0.04ms, 75.9MB)
테스트 3 〉	통과 (0.04ms, 70.6MB)
테스트 4 〉	통과 (0.04ms, 75.1MB)
테스트 5 〉	통과 (0.04ms, 72.9MB)
테스트 6 〉	통과 (0.04ms, 73.7MB)
테스트 7 〉	통과 (0.05ms, 71.7MB)
테스트 8 〉	통과 (0.03ms, 75.9MB)
테스트 9 〉	통과 (0.03ms, 74.5MB)
테스트 10 〉	통과 (0.03ms, 76.3MB)
테스트 11 〉	통과 (0.05ms, 75.7MB)
*/


/* i + length - next + i
앞으로 쭉가는 경우는 처음 초기화로 하드코딩합니다. min = length.
그것보다 작은 경우를 찾는 알고리즘이
min = Math.min(min, i + length - next + Math.min(i, length - next)); 입니다.
i+length-next는 '바로옆의 a들을 제외한 다른 문자들의 길이 -1' 입니다.
예를 들면 AAABBBBBBBAA 는 I=2일 경우 next = 10, length는 12 이어서 4이됩니다.
즉, B를 건너지 않고 반대로 넘어가는 경우를 고려하는 것입니다.
여기서 문제는 우리의 시작점은 인덱스 0인것에 있습니다.
우리는 i까지 갔다가 되돌아가거나 처음부터 뒤로가서 length-next까지 갔다가 다시 돌아오는 경우를 생각해야합니다.
앞의 예에서는 i=2 두칸앞으로 갔다가 돌아오느냐,
처음부터 뒤로가서 length-next = 12 - 10 = 2를 하느냐를 고려해야하는 것입니다.
이 경우에는 두개가 같은 값이지만 다를 수 있어서 Math.min으로 방향을 선택해주는 것입니다.


내 위치에서 첫위치로 돌아간 후 (i+i)
A가 연속으로 나오는 지점의 다음 (next)을 끝(len)에서 계산해 주는 것이다 -> len-next


len - next :
총 길이에서 현재 바로 다음에 연속된 A가 지나고 남은 문자 갯수
i : 오른쪽으로의 현재까지의 이동횟수
i + len - next + i : 현재까지 왔다가 다시 돌아가서 남은 거 까지 가는 이동 횟수
min(i,len-next)에서,
i 보다 len-next 값이 작은 경우에 len-next를 선택하는데
이는, 마지막 문자가 A인 경우를 제외 하면
무조건 len-1 보다 크게 된다 (len-next >=1)
따라서,i가 len-next(남은 문자)보다 큰 경우는
굳이 왼쪽으로 다시 돌아갈 필요가 없다.
대신 끝이 A인 경우는, len-next가 0이 되므로,
무조건 len-1 보다 작은 i 가 최소 이동횟수가 된다.
따라서 Math.min(i,len-next) 이 부분은 식에서 필요하게 된다.
*/