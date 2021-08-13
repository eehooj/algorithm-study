package com.github.torissi.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyTwo {
    public String solution(int[][] scores) {
        int length = scores.length;
        boolean isA = false;
        StringBuilder grade = new StringBuilder();

        for (int i = 0; i < length; i++) { //1
            List<Integer> score = new ArrayList<>();
            int maxj = scores[i][i];
            int maxIndex = i;
            int minj = scores[i][i];
            int minIndex = i;

            for (int j = 0; j < length; j++) { //2
                if (maxj < scores[j][i]) {
                    maxIndex = j;
                    maxj = scores[j][i];
                } else if (minj > scores[j][i]) {
                    minIndex = j;
                    minj = scores[j][i];
                }

                score.add(scores[j][i]);
            }

            if ((maxIndex == i || minIndex == i)) {
                if (Collections.frequency(score, score.get(i)) < 2) {
                    score.set(i, 0);
                    isA = true;
                }
            }

            double ave = 0.0;
            if (isA) {
                ave = (double) score.stream().mapToInt(Integer::intValue).sum() / (length - 1); //3
            } else {
                ave = (double) score.stream().mapToInt(Integer::intValue).sum() / length;
            }

            if (ave >= 90.0) grade.append("A");
            else if (ave >= 80.0) grade.append("B");
            else if (ave >= 70.0) grade.append("C");
            else if (ave >= 50.0) grade.append("D");
            else grade.append("F");

            isA = false;
        }

        return grade.toString();
    }
}

/*class Solution {
    public String solution(int[][] scores) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<scores.length; i++) {
            int max = 0;
            int min = 101;
            int sum = 0;
            int divide = scores.length;
            for(int j=0; j<scores.length; j++) {
                int score = scores[j][i];
                if(i != j) {
                    if(score < min) {
                        min = score;
                    }
                    if(score > max) {
                        max = score;
                    }
                }
                sum += score;
            }
            if(scores[i][i] < min || scores[i][i] > max) {
                sum -= scores[i][i];
                divide--;
            }
            double score = (double) sum / divide;
            builder.append(score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 50 ? "D" : "F" );
        }
        return builder.toString();
    }
}*/

/*문제 설명
대학 교수인 당신은, 상호평가를 통하여 학생들이 제출한 과제물에 학점을 부여하려고 합니다. 아래는 0번부터 4번까지 번호가 매겨진 5명의 학생들이 자신과 다른 학생의 과제를 평가한 점수표입니다.

No.	0	1	2	3	4
0	100	90	98	88	65
1	50	45	99	85	77
2	47	88	95	80	67
3	61	57	100	80	65
4	24	90	94	75	65
평균	45.5	81.25	97.2	81.6	67.8
학점	F	B	A	B	D
위의 점수표에서, i행 j열의 값은 i번 학생이 평가한 j번 학생의 과제 점수입니다.

0번 학생이 평가한 점수는 0번 행에담긴 [100, 90, 98, 88, 65]입니다.
0번 학생은 자기 자신에게 100점, 1번 학생에게 90점, 2번 학생에게 98점, 3번 학생에게 88점, 4번 학생에게 65점을 부여했습니다.
2번 학생이 평가한 점수는 2번 행에담긴 [47, 88, 95, 80, 67]입니다.
2번 학생은 0번 학생에게 47점, 1번 학생에게 88점, 자기 자신에게 95점, 3번 학생에게 80점, 4번 학생에게 67점을 부여했습니다.
당신은 각 학생들이 받은 점수의 평균을 구하여, 기준에 따라 학점을 부여하려고 합니다.
만약, 학생들이 자기 자신을 평가한 점수가 유일한 최고점 또는 유일한 최저점이라면 그 점수는 제외하고 평균을 구합니다.

0번 학생이 받은 점수는 0번 열에 담긴 [100, 50, 47, 61, 24]입니다. 자기 자신을 평가한 100점은 자신이 받은 점수 중에서 유일한 최고점이므로, 평균을 구할 때 제외합니다.
0번 학생의 평균 점수는 (50+47+61+24) / 4 = 45.5입니다.
4번 학생이 받은 점수는 4번 열에 담긴 [65, 77, 67, 65, 65]입니다. 자기 자신을 평가한 65점은 자신이 받은 점수 중에서 최저점이지만 같은 점수가 2개 더 있으므로, 유일한 최저점이 아닙니다. 따라서, 평균을 구할 때 제외하지 않습니다.
4번 학생의 평균 점수는 (65+77+67+65+65) / 5 = 67.8입니다.
제외할 점수는 제외하고 평균을 구한 후, 아래 기준에 따라 학점을 부여합니다.

평균	학점
90점 이상	A
80점 이상 90점 미만	B
70점 이상 80점 미만	C
50점 이상 70점 미만	D
50점 미만	F
학생들의 점수가 담긴 정수형 2차원 배열 scores가 매개변수로 주어집니다. 이때, 학생들의 학점을 구하여 하나의 문자열로 만들어서 return 하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ scores의 행의 길이(학생 수) ≤ 10
scores의 열의 길이 = scores의 행의 길이
즉, scores는 행과 열의 길이가 같은 2차원 배열입니다.
0 ≤ scores의 원소 ≤ 100
return 값 형식
0번 학생의 학점부터 차례대로 이어 붙인 하나의 문자열을 return 합니다.
입출력 예
scores	result
[[100,90,98,88,65],[50,45,99,85,77],[47,88,95,80,67],[61,57,100,80,65],[24,90,94,75,65]]	"FBABD"
[[50,90],[50,87]]	"DA"
[[70,49,90],[68,50,38],[73,31,100]]	"CFD"
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.

입출력 예 #2

No.	0	1
0	50	90
1	50	87
평균	50	90
학점	D	A
1번 학생이 자기 자신을 평가한 87점은 [90, 87]에서 유일한 최저점이므로, 평균을 구할 때 제외합니다.
입출력 예 #3

No.	0	1	2
0	70	49	90
1	68	50	38
2	73	31	100
평균	70.33…	40	64
학점	C	F	D
1번 학생이 자기 자신을 평가한 50점은 [49, 50, 31]에서 유일한 최고점이므로, 평균을 구할 때 제외합니다.
2번 학생이 자기 자신을 평가한 100점은 [90, 38, 100]에서 유일한 최고점이므로, 평균을 구할 때 제외합니다.
*/

/*테스트 1 〉	통과 (1.11ms, 70.3MB)
테스트 2 〉	통과 (1.74ms, 60.8MB)
테스트 3 〉	통과 (1.42ms, 59.1MB)
테스트 4 〉	통과 (2.00ms, 62.4MB)
테스트 5 〉	통과 (1.95ms, 74.5MB)
테스트 6 〉	통과 (1.86ms, 74.5MB)
테스트 7 〉	통과 (1.46ms, 73.4MB)
테스트 8 〉	통과 (1.27ms, 67.5MB)
테스트 9 〉	통과 (1.76ms, 72.5MB)
테스트 10 〉	통과 (1.65ms, 71.6MB)
테스트 11 〉	통과 (1.14ms, 60.6MB)
테스트 12 〉	통과 (1.73ms, 71.7MB)
테스트 13 〉	통과 (1.34ms, 59.5MB)
테스트 14 〉	통과 (1.58ms, 69.5MB)
테스트 15 〉	통과 (1.69ms, 72.9MB)
테스트 16 〉	통과 (1.22ms, 70.1MB)
테스트 17 〉	통과 (1.42ms, 70.9MB)
테스트 18 〉	통과 (2.08ms, 60.9MB)
테스트 19 〉	통과 (1.80ms, 62.1MB)
테스트 20 〉	통과 (1.45ms, 70.2MB)
테스트 21 〉	통과 (1.15ms, 73.4MB)*/