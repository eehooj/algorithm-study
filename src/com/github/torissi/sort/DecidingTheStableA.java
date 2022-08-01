package com.github.torissi.sort;

import java.util.Arrays;
import java.util.Scanner;

public class DecidingTheStableA {

    private static int count(int[] arr, int mid) {
        int count = 1;
        int length = arr.length;
        int end = arr[0];

        for (int i = 1; i < length; i++) {
            if (arr[i] - end >= mid) {
                count++;
                end = arr[i];
            }
        }

        return count;
    }

    private static int solution(int n, int c, int[] arr) {
        Arrays.sort(arr);

        int answer = 0;
        int lt = 1;
        int rt = arr[n - 1];

        while(lt <= rt){
            int mid = (lt + rt) / 2;

            if(count(arr, mid) >= c){
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(n, c, arr));
    }
}

/*
* 1. N개의 마굿간
* 2. C마리의 말
* 3. 가장 가까운 두 말의 거리가 최대가 되도록 마구간 배치
* 4. C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 최대가 되는 그 최대값 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
148ms
2
정답입니다
27MB
152ms
3
정답입니다
27MB
181ms
4
정답입니다
30MB
219ms
5
정답입니다
34MB
484ms
* */