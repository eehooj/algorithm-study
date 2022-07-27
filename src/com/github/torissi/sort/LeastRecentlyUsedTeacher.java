package com.github.torissi.sort;

import java.util.Scanner;

public class LeastRecentlyUsedTeacher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] answer = solution(s, arr);

        for (int item : answer) {
            System.out.print(item + " ");
        }
    }

    private static int[] solution(int s, int[] arr) {
        int[] cache=new int[s];

        for(int x : arr){
            int pos=-1;

            for(int i=0; i<s; i++) if(x==cache[i]) pos=i;

            if(pos==-1){
                for(int i=s-1; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            } else{
                for(int i=pos; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }

            cache[0]=x;
        }
        return cache;
    }
}

/*
* 1. LRU 알고리즘 : 캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것은 제거하는 알고리즘
* 2. 캐시 크기 S
* 3. 작업의 개수 N
* 4. 마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
140ms
2
정답입니다
27MB
147ms
3
정답입니다
27MB
151ms
4
정답입니다
27MB
164ms
5
정답입니다
27MB
149ms
* */