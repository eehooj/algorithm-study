package com.github.torissi.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

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

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0, rt = n - 1;

        Arrays.sort(arr);

        while(lt <= rt){
            int mid=(lt + rt) / 2;

            if(arr[mid] == m){
                answer = mid + 1;

                break;
            } else if(arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }
}

/*
* 1. 임의의 N개 숫자 입력
* 2. 오름차순으로 정렬
* 3. M 숫자가 몇 번째에 있는지?
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
152ms
2
정답입니다
27MB
161ms
3
정답입니다
27MB
159ms
4
정답입니다
29MB
204ms
5
정답입니다
33MB
275ms
* */