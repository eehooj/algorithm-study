package com.github.torissi.programmers.level2;

public class Solution210912_1 {

     int solution(int[][] land) {
        int length = land.length;

        for (int i = 1; i < length; i++) {
            land[i][0] += maxValue(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
            land[i][1] += maxValue(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
            land[i][2] += maxValue(land[i - 1][1], land[i - 1][0], land[i - 1][3]);
            land[i][3] += maxValue(land[i - 1][1], land[i - 1][2], land[i - 1][0]);
        }

        return maxValue(land[length - 1]);
     }

     int maxValue(int[] ints) {
        int max = 0;
        for (int num : ints) {
            max = Math.max(max, num);
        }

        return max;
     }

     int maxValue(int i, int i1, int i2) {
        return Math.max(Math.max(i, i1), i2);
     }

     public static void main(String[] args) {
        //int[][] land = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}}; //15
        int[][] land = {{1,1,1,1}, {2,2,2,3}, {3,3,3,6}, {4,4,4,7}}; //14
        //solution(land);
     }
}

/* 땅따먹기
문제 설명
땅따먹기 게임을 하려고 합니다. 땅따먹기 게임의 땅(land)은 총 N행 4열로 이루어져 있고, 모든 칸에는 점수가 쓰여 있습니다. 1행부터 땅을 밟으며 한 행씩 내려올 때, 각 행의 4칸 중 한 칸만 밟으면서 내려와야 합니다. 단, 땅따먹기 게임에는 한 행씩 내려올 때, 같은 열을 연속해서 밟을 수 없는 특수 규칙이 있습니다.

예를 들면,

| 1 | 2 | 3 | 5 |

| 5 | 6 | 7 | 8 |

| 4 | 3 | 2 | 1 |

로 땅이 주어졌다면, 1행에서 네번째 칸 (5)를 밟았으면, 2행의 네번째 칸 (8)은 밟을 수 없습니다.

마지막 행까지 모두 내려왔을 때, 얻을 수 있는 점수의 최대값을 return하는 solution 함수를 완성해 주세요. 위 예의 경우, 1행의 네번째 칸 (5), 2행의 세번째 칸 (7), 3행의 첫번째 칸 (4) 땅을 밟아 16점이 최고점이 되므로 16을 return 하면 됩니다.

제한사항
행의 개수 N : 100,000 이하의 자연수
열의 개수는 4개이고, 땅(land)은 2차원 배열로 주어집니다.
점수 : 100 이하의 자연수
입출력 예
land	answer
[[1,2,3,5],[5,6,7,8],[4,3,2,1]]	16
입출력 예 설명
입출력 예 #1
문제의 예시와 같습니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.42ms, 61.7MB)
테스트 2 〉	통과 (0.39ms, 72.2MB)
테스트 3 〉	통과 (0.38ms, 59.2MB)
테스트 4 〉	통과 (0.37ms, 58.4MB)
테스트 5 〉	통과 (0.36ms, 72.5MB)
테스트 6 〉	통과 (0.38ms, 75MB)
테스트 7 〉	통과 (0.36ms, 71.3MB)
테스트 8 〉	통과 (0.37ms, 58MB)
테스트 9 〉	통과 (0.36ms, 72.7MB)
테스트 10 〉	통과 (0.38ms, 60.6MB)
테스트 11 〉	통과 (0.36ms, 60.5MB)
테스트 12 〉	통과 (0.36ms, 71.1MB)
테스트 13 〉	통과 (0.39ms, 73.8MB)
테스트 14 〉	통과 (0.38ms, 59.1MB)
테스트 15 〉	통과 (0.39ms, 61.5MB)
테스트 16 〉	통과 (0.39ms, 61.1MB)
테스트 17 〉	통과 (0.42ms, 58.2MB)
테스트 18 〉	통과 (0.37ms, 73.7MB)
효율성  테스트
테스트 1 〉	통과 (16.01ms, 86.1MB)
테스트 2 〉	통과 (16.39ms, 85.6MB)
테스트 3 〉	통과 (16.75ms, 85.4MB)
테스트 4 〉	통과 (15.92ms, 85.6MB)
=> Dynamic Programming
동적 계획법이란 특정 범위까지의 값을 구하기 위해 그것과 다른 범위까지의 값을 이용하여 효율적으로 값을 구하는 알고리즘 설계 기법
*/
