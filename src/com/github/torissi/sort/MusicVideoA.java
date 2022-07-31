package com.github.torissi.sort;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideoA {

    private static int count(int[] arr, int capacity) {
        int count = 1;
        int sum = 0;

        for (int item : arr) {
            if (sum + item > capacity) {
                count++;
                sum = item;
            } else {
                sum += item;
            }
        }

        return count;
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){
            int mid = (lt + rt) / 2;

            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}

/*
* 1. 총 N개의 곡
* 2. DVD 녹화시 순서가 그대로 유지되어야 함
* 3. M개의 DVD에 나눠서 모든 동영상을 녹화
* 4. 하나의 DVD에 넣을 수 있는 최소 용량 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
33MB
364ms
2
정답입니다
33MB
347ms
3
정답입니다
33MB
384ms
4
정답입니다
34MB
478ms
5
정답입니다
34MB
409ms
* */