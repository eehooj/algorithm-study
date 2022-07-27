package com.github.torissi.sort;

import java.util.*;

public class CheckForDuplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        String answer = solution(n, arr);

        System.out.print(answer);
    }

    private static String solution(int n, List<Integer> arr) {
        String answer = "U";
        Queue<Integer> queue = new LinkedList<>();

        for (Integer item : arr) {
            queue.offer(item);
        }

        for (Integer integer : arr) {
            int item = queue.poll();

            if (queue.contains(integer)) {
                answer = "D";

                break;
            }

            queue.offer(item);
        }

        return answer;
    }
}

/*
* 1. 학생들이 각각 좋아하는 수 하나씩 적음
* 2. N명의 학생들이 적어낸 숫자에 중복이 있으면 D 출력
* 3. 없으면 U 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
145ms
2
정답입니다
29MB
212ms
3
정답입니다
32MB
339ms
4
정답입니다
38MB
832ms
5
정답입니다
38MB
909ms
* */