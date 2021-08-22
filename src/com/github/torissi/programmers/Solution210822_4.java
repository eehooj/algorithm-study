package com.github.torissi.programmers;

import java.util.ArrayList;

public class Solution210822_4 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = arr[0];
        list.add(arr[0]);

        for(int a : arr) {
            if (a != temp) {
                list.add(a);
                temp = a;
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

/* 같은 숫자는 싫어
문제 설명
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
입출력 예
arr	answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]
입출력 예 설명
입출력 예 #1,2
문제의 예시와 같습니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 61MB)
테스트 2 〉	통과 (0.05ms, 73MB)
테스트 3 〉	통과 (0.04ms, 60.5MB)
테스트 4 〉	통과 (0.03ms, 69.8MB)
테스트 5 〉	통과 (0.06ms, 71.7MB)
테스트 6 〉	통과 (0.04ms, 60MB)
테스트 7 〉	통과 (0.03ms, 69.2MB)
테스트 8 〉	통과 (0.05ms, 59.9MB)
테스트 9 〉	통과 (0.05ms, 57.4MB)
테스트 10 〉	통과 (0.06ms, 58.9MB)
테스트 11 〉	통과 (0.05ms, 57.9MB)
테스트 12 〉	통과 (0.05ms, 60.2MB)
테스트 13 〉	통과 (0.04ms, 66.8MB)
테스트 14 〉	통과 (0.04ms, 68.6MB)
테스트 15 〉	통과 (0.05ms, 60.9MB)
테스트 16 〉	통과 (0.05ms, 72.6MB)
테스트 17 〉	통과 (0.03ms, 58.4MB)
효율성  테스트
테스트 1 〉	통과 (30.99ms, 125MB)
테스트 2 〉	통과 (28.51ms, 124MB)
테스트 3 〉	통과 (30.00ms, 125MB)
테스트 4 〉	통과 (28.11ms, 127MB)
*/

/*
List<Integer> list = new ArrayList<>(1_000_000);

Arrays.stream(arr).reduce(arr[0]^1, (before, now) -> {
    if(before != now) { list.add(now); }
    return now;
});

return Arrays.stream( list.toArray( new Integer[0] ) )
        .mapToInt(Integer::intValue)
        .toArray();
* */

/*
정확성  테스트
테스트 1 〉	통과 (5.89ms, 77.3MB)
테스트 2 〉	통과 (5.12ms, 78.8MB)
테스트 3 〉	통과 (4.45ms, 62.8MB)
테스트 4 〉	통과 (4.68ms, 63MB)
테스트 5 〉	통과 (4.90ms, 76.1MB)
테스트 6 〉	통과 (4.71ms, 71.7MB)
테스트 7 〉	통과 (4.80ms, 66.3MB)
테스트 8 〉	통과 (4.88ms, 73.8MB)
테스트 9 〉	통과 (4.78ms, 62.5MB)
테스트 10 〉	통과 (4.61ms, 62.3MB)
테스트 11 〉	통과 (4.57ms, 74.5MB)
테스트 12 〉	통과 (4.68ms, 78.5MB)
테스트 13 〉	통과 (4.67ms, 62.8MB)
테스트 14 〉	통과 (4.90ms, 78.6MB)
테스트 15 〉	통과 (4.76ms, 77.4MB)
테스트 16 〉	통과 (4.83ms, 74.7MB)
테스트 17 〉	통과 (4.42ms, 74.8MB)
효율성  테스트
테스트 1 〉	통과 (40.76ms, 128MB)
테스트 2 〉	통과 (42.01ms, 127MB)
테스트 3 〉	통과 (43.76ms, 127MB)
테스트 4 〉	통과 (41.96ms, 127MB)
* */