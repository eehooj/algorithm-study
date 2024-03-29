package com.github.torissi.programmers.level1;

import java.util.*;

public class Solution210907_3 {

    public static int[] solution(int[] weights, String[] head2head) {
        int length = weights.length;
        int[] answer = new int[length];
        int[] weightWin = new int[length];
        HashMap<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            String[] temp = head2head[i].split("");
            Double count = 0.0;
            Double wCount = 0.0;
            int winWeightCount = 0;

            for (int j = 0; j < length; j++) {
                String s = temp[j];
                if (s.equals("W")) {
                    count++;
                    wCount++;

                    if (weights[i] < weights[j]) {
                        winWeightCount++;
                    }
                } else if (s.equals("L")) {
                    count++;
                }

                if (count.equals(0.0)) {
                    map.put(i + 1, 0.0);
                } else {
                    map.put(i + 1, wCount / count);
                }
            }

            weightWin[i] = winWeightCount;
        }

        List<Map.Entry<Integer, Double>> list = new LinkedList<>(map.entrySet());
        list.sort((o1, o2) -> {
            if (o1.getValue() > o2.getValue()) return -1;
            else if (o1.getValue() < o2.getValue()) return 1;
            else {
                if (weightWin[o1.getKey() - 1] < weightWin[o2.getKey() - 1]) {
                    return 1;
                } else if (weightWin[o1.getKey() - 1] > weightWin[o2.getKey() - 1]) {
                    return -1;
                } else {
                    if (weights[o1.getKey() - 1] < weights[o2.getKey() - 1]) {
                        return 1;
                    } else if (weights[o1.getKey() - 1] > weights[o2.getKey() - 1]) {
                        return -1;
                    }
                }
            }
            return 0;
        });

        int k = 0;
        for (Map.Entry<Integer, Double> a : list) {
            answer[k] = a.getKey();
            k++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] weights = {145,92,86};
        String[] head2head = {"NLW","WNL","LWN"};
        solution(weights, head2head);
    }
}

/* 복서 정렬하기
문제 설명
복서 선수들의 몸무게 weights와, 복서 선수들의 전적을 나타내는 head2head가 매개변수로 주어집니다. 복서 선수들의 번호를 다음과 같은 순서로 정렬한 후 return 하도록 solution 함수를 완성해주세요.

전체 승률이 높은 복서의 번호가 앞쪽으로 갑니다. 아직 다른 복서랑 붙어본 적이 없는 복서의 승률은 0%로 취급합니다.
승률이 동일한 복서의 번호들 중에서는 자신보다 몸무게가 무거운 복서를 이긴 횟수가 많은 복서의 번호가 앞쪽으로 갑니다.
자신보다 무거운 복서를 이긴 횟수까지 동일한 복서의 번호들 중에서는 자기 몸무게가 무거운 복서의 번호가 앞쪽으로 갑니다.
자기 몸무게까지 동일한 복서의 번호들 중에서는 작은 번호가 앞쪽으로 갑니다.
제한사항
weights의 길이는 2 이상 1,000 이하입니다.
weights의 모든 값은 45 이상 150 이하의 정수입니다.
weights[i] 는 i+1번 복서의 몸무게(kg)를 의미합니다.
head2head의 길이는 weights의 길이와 같습니다.
head2head의 모든 문자열은 길이가 weights의 길이와 동일하며, 'N', 'W', 'L'로 이루어진 문자열입니다.
head2head[i] 는 i+1번 복서의 전적을 의미하며, head2head[i][j]는 i+1번 복서와 j+1번 복서의 매치 결과를 의미합니다.
'N' (None)은 두 복서가 아직 붙어본 적이 없음을 의미합니다.
'W' (Win)는 i+1번 복서가 j+1번 복서를 이겼음을 의미합니다.
'L' (Lose)는 i+1번 복사가 j+1번 복서에게 졌음을 의미합니다.
임의의 i에 대해서 head2head[i][i] 는 항상 'N'입니다. 자기 자신과 싸울 수는 없기 때문입니다.
임의의 i, j에 대해서 head2head[i][j] = 'W' 이면, head2head[j][i] = 'L'입니다.
임의의 i, j에 대해서 head2head[i][j] = 'L' 이면, head2head[j][i] = 'W'입니다.
임의의 i, j에 대해서 head2head[i][j] = 'N' 이면, head2head[j][i] = 'N'입니다.
입출력 예
weights	head2head	result
[50,82,75,120]	["NLWL","WNLL","LWNW","WWLN"]	[3,4,1,2]
[145,92,86]	["NLW","WNL","LWN"]	[2,3,1]
[60,70,60]	["NNN","NNN","NNN"]	[2,1,3]
입출력 예 설명
입출력 예 #1

다음은 선수들의 정보를 나타낸 표입니다.
선수 번호	vs 1번	vs 2번	vs 3번	vs 4번	승률	자기보다 무거운 복서를 이긴 횟수	몸무게
1번	-	패배	승리	패배	33.33%	1회	50kg
2번	승리	-	패배	패배	33.33%	0회	82kg
3번	패배	승리	-	승리	66.66%	2회	75kg
4번	승리	승리	패배	-	66.66%	0회	120kg
본문에 서술된 우선순위를 따라 [3,4,1,2] 를 return 합니다.
입출력 예 #2

다음은 선수들의 정보를 나타낸 표입니다.
선수 번호	vs 1번	vs 2번	vs 3번	승률	자기보다 무거운 복서를 이긴 횟수	몸무게
1번	-	패배	승리	50%	0회	145kg
2번	승리	-	패배	50%	1회	92kg
3번	패배	승리	-	50%	1회	86kg
본문에 서술된 우선순위를 따라 [2,3,1] 을 return 합니다.
입출력 예 #3

다음은 선수들의 정보를 나타낸 표입니다.
선수 번호	vs 1번	vs 2번	vs 3번	승률	자기보다 무거운 복서를 이긴 횟수	몸무게
1번	-	-	-	0% (무전적)	0회	60kg
2번	-	-	-	0% (무전적)	0회	70kg
3번	-	-	-	0% (무전적)	0회	60kg
본문에 서술된 우선순위를 따라 [2,1,3] 을 return 합니다.
*/

/*
테스트 1 〉	통과 (1.20ms, 69.6MB)
테스트 2 〉	통과 (1.45ms, 59MB)
테스트 3 〉	통과 (1.76ms, 73.2MB)
테스트 4 〉	통과 (1.55ms, 74.8MB)
테스트 5 〉	통과 (1.36ms, 71.6MB)
테스트 6 〉	통과 (130.67ms, 129MB)
테스트 7 〉	통과 (149.89ms, 122MB)
테스트 8 〉	통과 (153.99ms, 128MB)
테스트 9 〉	통과 (86.95ms, 81.6MB)
테스트 10 〉	통과 (81.70ms, 97.8MB)
테스트 11 〉	통과 (149.08ms, 111MB)
테스트 12 〉	통과 (112.80ms, 121MB)
*/

/*
int len = weights.length;
        int[][] rank = new int[len][4];
        for(int i = 0; i < len; i++) {
            int w = weights[i], cnt = 0, win = 0, over = 0;
            for(int j = 0; j < len; j++) {
                char c = head2head[i].charAt(j);
                cnt += c == 'N' ? 0 : 1;
                win += c == 'W' ? 1 : 0;
                over += c == 'W' && weights[i] < weights[j] ? 1 : 0;
            }
            rank[i][0] = i + 1;
            rank[i][1] = (int)((double)win / cnt * 10000000);
            rank[i][2] = over;
            rank[i][3] = weights[i];
        }
        Arrays.sort(rank, (a, b) -> {
            if(a[1] != b[1]) return b[1] - a[1];
            if(a[2] != b[2]) return b[2] - a[2];
            if(a[3] != b[3]) return b[3] - a[3];
            return a[0] - b[0];
        });
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) answer[i] = (int)rank[i][0];
        return answer;
=> 좋아요 많은 답.. 더 빠름.. 다시 해보기!
*/