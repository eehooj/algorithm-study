package com.github.torissi.twopointers;

import java.util.*;

public class FindingCommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> answer = new ArrayList<>();
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];

        for(int i = 0; i < m; i++){
            b[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int ap = 0;
        int bp = 0;

        while (ap < n && bp < m) {
            if (a[ap] == b[bp]) {
                answer.add(a[ap]);
                ap++;
                bp++;
            } else if (a[ap] < b[bp]) {
                ap++;
            } else {
                bp++;
            }
        }

        for (int temp : answer) {
            System.out.print(temp + " ");
        }
    }
}

/*
* 1. 집합 A의 크기(N) 입력
* 2. N개의 원소 입력
* 3. 집합 B의 크기(M) 입력
* 4. M개의 원소 입력
* 5. 공통원소 오름차순 정렬
* */
/*
ID	결과	Memory	Time
1
정답입니다
27MB
171ms
2
정답입니다
27MB
157ms
3
정답입니다
34MB
424ms
4
정답입니다
35MB
720ms
* */

/* Time Limit Exceeded
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        int m = scanner.nextInt();

        for(int i = 0; i < m; i++){
            int temp = scanner.nextInt();

            if (list.contains(temp)) { // 여기서 O^n 돼서 시간 조과 되었을 듯 ㅜ
                answer.add(temp);
            }
        }

        answer.sort(null);
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
154ms
2
정답입니다
27MB
130ms
3
정답입니다
35MB
865ms
4
Time Limit Exceeded
35MB
1798ms

* */