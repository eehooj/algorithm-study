package com.github.torissi.focus.level1.a;

public class SecretMapA {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String bi = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = bi.replaceAll("1", "#").replaceAll("0", " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        SecretMapA add = new SecretMapA();
        int price = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        add.solution(price, arr1, arr2);
    }
}

/* 비밀지도
* 1. 지도는 숫자로 암호화 되어 있음
* 2. 지도는 한 변이 n인 정사각형 배열
* 3. 공백 " ", 벽 #으로 이루어져 있음
* 4. 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있음
* 5. 암호화된 배열은 벽 부분을 1, 공백을 0으로 부호화 했을 때 얻어지는 이진수에 헤당하는 배열
* 6. 공백과 벽 배열 리턴...
* */

/*
정확성  테스트
테스트 1 〉	통과 (8.19ms, 72.4MB)
테스트 2 〉	통과 (9.61ms, 80.2MB)
테스트 3 〉	통과 (10.89ms, 77.9MB)
테스트 4 〉	통과 (7.10ms, 78.1MB)
테스트 5 〉	통과 (7.67ms, 79.9MB)
테스트 6 〉	통과 (7.18ms, 85.7MB)
테스트 7 〉	통과 (7.19ms, 70MB)
테스트 8 〉	통과 (6.39ms, 72.9MB)
* */