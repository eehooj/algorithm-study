package com.github.torissi.hash;

import java.util.*;

public class KthLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int answer = -1;
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    tSet.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt=0;

        for(int x : tSet){
            cnt++;

            if(cnt==k) {
                answer = x;
            }
        }

        System.out.println(answer);
    }

}

/*
* 1. 1부터 100까지 적힌 N장의 카드를 가지고 있음 (같은 숫자가 여러 장 있을 수 있음)
* 2. 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록할 예정
* 3. 3장을 뽑을 수 있는 모든 경우를 기록
* 4. 기록 중 K번째로 큰 수를 출력
* */