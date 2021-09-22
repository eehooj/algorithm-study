package com.github.torissi.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution210922_1 {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int max = 0;
        Queue<Integer> que = new LinkedList<>();

        for (int truck : truck_weights) {
            while (true) {
                if (que.isEmpty()) {
                    que.offer(truck);
                    max += truck;
                    answer++;
                    break;
                } else if (que.size() == bridge_length) {
                    max -= que.poll();
                } else {
                    max += truck;

                    if (max > weight) {
                        que.offer(0);
                        max -= truck;
                        answer++;
                    } else {
                        que.offer(truck);
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }

    public static void main(String[] args) {
        int[] truck_weights = {7,4,5,6};
        solution(2, 10, truck_weights);
    }
}

/* 다리를 지나는 트럭
문제 설명
트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다. 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.

예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.

경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
0	[]	[]	[7,4,5,6]
1~2	[]	[7]	[4,5,6]
3	[7]	[4]	[5,6]
4	[7]	[4,5]	[6]
5	[7,4]	[5]	[6]
6~7	[7,4,5]	[6]	[]
8	[7,4,5,6]	[]	[]
따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.

solution 함수의 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭 별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.

제한 조건
bridge_length는 1 이상 10,000 이하입니다.
weight는 1 이상 10,000 이하입니다.
truck_weights의 길이는 1 이상 10,000 이하입니다.
모든 트럭의 무게는 1 이상 weight 이하입니다.
입출력 예
bridge_length	weight	truck_weights	return
2	10	[7,4,5,6]	8
100	100	[10]	101
100	100	[10,10,10,10,10,10,10,10,10,10]	110
출처

※ 공지 - 2020년 4월 06일 테스트케이스가 추가되었습니다.
*/

/*
테스트 1 〉	통과 (1.22ms, 69.9MB)
테스트 2 〉	통과 (11.34ms, 77.1MB)
테스트 3 〉	통과 (0.11ms, 72.8MB)
테스트 4 〉	통과 (8.57ms, 60.7MB)
테스트 5 〉	통과 (23.34ms, 67.9MB)
테스트 6 〉	통과 (19.64ms, 77.1MB)
테스트 7 〉	통과 (1.76ms, 67.1MB)
테스트 8 〉	통과 (0.58ms, 58.5MB)
테스트 9 〉	통과 (4.31ms, 72.4MB)
테스트 10 〉	통과 (0.67ms, 62MB)
테스트 11 〉	통과 (0.17ms, 69.3MB)
테스트 12 〉	통과 (0.85ms, 70.9MB)
테스트 13 〉	통과 (1.55ms, 73.4MB)
테스트 14 〉	통과 (0.09ms, 74MB)
*/
