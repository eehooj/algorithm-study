package com.github.torissi.stackorqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

    public static String solution(char[] req, char[] curri){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char item : curri) {
            queue.offer(item);
        }

        for (char item : req) {
            if (queue.contains(item)) {
                while (!queue.isEmpty()) {
                    char temp = queue.poll();

                    if (temp == item) {
                        break;
                    }
                }
            } else {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        char[] req = scanner.nextLine().toCharArray();
        char[] curri = scanner.nextLine().toCharArray();
        String solution = solution(req, curri);

        System.out.println(solution);
    }
}

/*
* 1. 필수 과목은 무조건 이수해야 하며, 순서도 정해져 있음
* 2. 수업 설계가 잘됐으면 YES, 아니면 NO 리턴
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
141ms
2
정답입니다
27MB
149ms
3
정답입니다
27MB
144ms
4
정답입니다
27MB
146ms
5
정답입니다
27MB
124ms
* */