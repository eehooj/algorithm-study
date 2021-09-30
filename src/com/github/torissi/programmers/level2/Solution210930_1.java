package com.github.torissi.programmers.level2;

import java.util.*;

public class Solution210930_1 {

    public static int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int a : priorities) {
            queue.offer(a);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    if (i == location) {
                        return answer;
                    }

                    queue.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        solution(priorities, 2);
    }
}


/* 프린터
문제 설명
일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다. 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.

1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
3. 그렇지 않으면 J를 인쇄합니다.
예를 들어, 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면 C D A B 순으로 인쇄하게 됩니다.

내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 알고 싶습니다. 위의 예에서 C는 1번째로, A는 3번째로 인쇄됩니다.

현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때, 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.

제한사항
현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.
입출력 예
priorities	location	return
[2, 1, 3, 2]	2	1
[1, 1, 9, 1, 1, 1]	0	5
입출력 예 설명
예제 #1

문제에 나온 예와 같습니다.

예제 #2

6개의 문서(A, B, C, D, E, F)가 인쇄 대기목록에 있고 중요도가 1 1 9 1 1 1 이므로 C D E F A B 순으로 인쇄합니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.56ms, 73MB)
테스트 2 〉	통과 (0.99ms, 72.3MB)
테스트 3 〉	통과 (0.62ms, 83.1MB)
테스트 4 〉	통과 (0.60ms, 70.6MB)
테스트 5 〉	통과 (0.52ms, 75.8MB)
테스트 6 〉	통과 (0.61ms, 73.8MB)
테스트 7 〉	통과 (0.71ms, 74.7MB)
테스트 8 〉	통과 (0.80ms, 66.4MB)
테스트 9 〉	통과 (0.58ms, 71.2MB)
테스트 10 〉	통과 (0.48ms, 73.5MB)
테스트 11 〉	통과 (1.01ms, 73MB)
테스트 12 〉	통과 (0.65ms, 77.9MB)
테스트 13 〉	통과 (0.75ms, 72.3MB)
테스트 14 〉	통과 (0.51ms, 73.1MB)
테스트 15 〉	통과 (0.42ms, 74.3MB)
테스트 16 〉	통과 (0.46ms, 79.6MB)
테스트 17 〉	통과 (1.03ms, 77.3MB)
테스트 18 〉	통과 (0.43ms, 73.5MB)
테스트 19 〉	통과 (0.79ms, 76.5MB)
테스트 20 〉	통과 (0.52ms, 78MB)
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