package com.github.torissi.focus.level1.a;

public class ReversionTriadSystemA {

    public int solution(int n) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();

        while (n >= 3) {
            builder.append(n % 3);
            n /= 3;
        }

        builder.append(n);

        answer = Integer.parseInt(builder.toString(), 3);

        return answer;
    }

    public static void main(String[] args) {
        ReversionTriadSystemA add = new ReversionTriadSystemA();
        int left = 45;

        add.solution(left);
    }
}

/*
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (n >= 3) {
            list.add(n % 3);
            n /= 3;
        }

        list.add(n);

        for (int i = 0; i < list.size(); i++) {
            answer += Math.pow(3, list.size() - 1 - i) * list.get(i);
        }

        return answer;
    }
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 76.8MB)
테스트 2 〉	통과 (0.04ms, 60.4MB)
테스트 3 〉	통과 (0.04ms, 68.6MB)
테스트 4 〉	통과 (0.04ms, 70.5MB)
테스트 5 〉	통과 (0.05ms, 71.1MB)
테스트 6 〉	통과 (0.05ms, 60.6MB)
테스트 7 〉	통과 (0.05ms, 71.7MB)
테스트 8 〉	통과 (0.05ms, 69.2MB)
테스트 9 〉	통과 (0.05ms, 58.1MB)
테스트 10 〉	통과 (0.06ms, 61.8MB)
* */

/* 3진법 뒤집기
* 1. 자연수 n 입력
* 2. 3진법으로 만든 후 뒤집어
* 3. 다시 10진법으로 표현
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 74.6MB)
테스트 2 〉	통과 (0.03ms, 72.5MB)
테스트 3 〉	통과 (0.04ms, 70.1MB)
테스트 4 〉	통과 (0.04ms, 72.9MB)
테스트 5 〉	통과 (0.03ms, 79.9MB)
테스트 6 〉	통과 (0.04ms, 75.4MB)
테스트 7 〉	통과 (0.07ms, 74.9MB)
테스트 8 〉	통과 (0.04ms, 73.7MB)
테스트 9 〉	통과 (0.04ms, 73.9MB)
테스트 10 〉	통과 (0.04ms, 75.3MB)
* */