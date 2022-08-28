package com.github.torissi.focus.level1.a;

import java.util.Stack;

public class DartsGameA {

    public int solution(String dartResult) {
        int answer = 0;
        char[] darts = dartResult.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int length = darts.length;

        for (int i = 0; i < length; i++) {
            String item = String.valueOf(darts[i]);
            int temp = 0;

            if (Character.isDigit(darts[i])) { // 숫자
                if (darts[i] == '1' && darts[i + 1] == '0') {
                    item = "10";
                    i++;
                }

                temp = Integer.parseInt(item);
            } else {
                temp = stack.pop();

                switch (item) {
                    case "S" :
                        temp = (int) Math.pow(temp, 1);

                        break;
                    case "D" :
                        temp = (int) Math.pow(temp, 2);

                        break;
                    case "T" :
                        temp = (int) Math.pow(temp, 3);

                        break;
                    case "*" :
                        if (!stack.isEmpty()) {
                            Integer pop = stack.pop() * 2;
                            stack.push(pop);
                        }

                        temp *= 2;
                        break;
                    case "#" :
                        temp *= (-1);

                        break;
                }

            }

            stack.push(temp);
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        DartsGameA add = new DartsGameA();
        String dartResult = "1D2S0T";

        add.solution(dartResult);
    }
}

/*
        StringTokenizer token = new StringTokenizer(dartResult, "SDT*#", true);
        StringTokenizer number = new StringTokenizer(dartResult, "SDT*#", false);
        String[] sarr = new String[token.countTokens()];
        int[] narr = new int[number.countTokens()];
        int num = 0;
        int temp2 = 0;
        String reg = "^[0-9]*$";

        int length = sarr.length;
        for (int i = 0; i < length; i++) {
            String s = token.nextToken();
            if (s.equals("*")) {
                sarr[i] = "a";
            } else {
                sarr[i] = s;
            }
        }

        int i = 0;
        for (String str : sarr) {
            if (Pattern.matches(reg, str)) { // 숫자이면
                temp2 = Integer.parseInt(str);
            } else {
                switch (str) {
                    case "S":
                        narr[i] = (int) Math.pow(temp2, 1);
                        i++;
                        break;
                    case "D":
                        narr[i] = (int) Math.pow(temp2, 2);
                        i++;
                        break;
                    case "T":
                        narr[i] = (int) Math.pow(temp2, 3);
                        i++;
                        break;
                    case "a":
                        narr[i - 1] *= 2;
                        if (i > 1) narr[i - 2] *= 2;
                        break;
                    case "#":
                        narr[i - 1] *= -1;
                        break;
                }
            }

        }

        for (int a : narr) {
            num += a;
        }

        return num;
    }
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.28ms, 68.4MB)
테스트 2 〉	통과 (0.26ms, 76.3MB)
테스트 3 〉	통과 (0.26ms, 72.2MB)
테스트 4 〉	통과 (0.39ms, 69.6MB)
테스트 5 〉	통과 (0.25ms, 68.4MB)
테스트 6 〉	통과 (0.25ms, 71.7MB)
테스트 7 〉	통과 (0.41ms, 70.4MB)
테스트 8 〉	통과 (0.25ms, 70MB)
테스트 9 〉	통과 (2.06ms, 70.3MB)
테스트 10 〉	통과 (0.30ms, 71.5MB)
테스트 11 〉	통과 (0.37ms, 69.2MB)
테스트 12 〉	통과 (0.28ms, 72.8MB)
테스트 13 〉	통과 (0.27ms, 71.2MB)
테스트 14 〉	통과 (0.29ms, 71.2MB)
테스트 15 〉	통과 (0.30ms, 71.6MB)
테스트 16 〉	통과 (0.40ms, 60.2MB)
테스트 17 〉	통과 (0.43ms, 70.1MB)
테스트 18 〉	통과 (0.49ms, 72.9MB)
테스트 19 〉	통과 (0.29ms, 69.8MB)
테스트 20 〉	통과 (0.52ms, 70.7MB)
테스트 21 〉	통과 (0.29ms, 74.1MB)
테스트 22 〉	통과 (0.29ms, 68.2MB)
테스트 23 〉	통과 (0.37ms, 59MB)
테스트 24 〉	통과 (0.30ms, 60.5MB)
테스트 25 〉	통과 (0.28ms, 74.9MB)
테스트 26 〉	통과 (0.26ms, 59.9MB)
테스트 27 〉	통과 (0.42ms, 73.7MB)
테스트 28 〉	통과 (0.39ms, 72.9MB)
테스트 29 〉	통과 (0.44ms, 72.1MB)
테스트 30 〉	통과 (0.28ms, 74.9MB)
테스트 31 〉	통과 (0.26ms, 67.5MB)
테스트 32 〉	통과 (0.28ms, 74.9MB)
* */

/* 다트 게임
* 1. S, D, T (1제곱, 2제곱, 3제곱)
* 2. *, # (해당 점수와 바로 전 얻은 점수 2배, 해당 점수 마이너스)
* 3. * 중첩될 경우 4배
* 4. *과 # 중첩될 경우 -2배
* 5.
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.16ms, 75.5MB)
테스트 2 〉	통과 (0.16ms, 77.4MB)
테스트 3 〉	통과 (0.18ms, 74.3MB)
테스트 4 〉	통과 (0.16ms, 70MB)
테스트 5 〉	통과 (0.15ms, 75.7MB)
테스트 6 〉	통과 (0.15ms, 74.5MB)
테스트 7 〉	통과 (0.18ms, 71.2MB)
테스트 8 〉	통과 (0.17ms, 75.7MB)
테스트 9 〉	통과 (0.16ms, 81MB)
테스트 10 〉	통과 (0.15ms, 69.8MB)
테스트 11 〉	통과 (0.19ms, 72.3MB)
테스트 12 〉	통과 (0.16ms, 73.3MB)
테스트 13 〉	통과 (0.15ms, 78.4MB)
테스트 14 〉	통과 (0.26ms, 69.8MB)
테스트 15 〉	통과 (0.18ms, 72.5MB)
테스트 16 〉	통과 (0.24ms, 76.9MB)
테스트 17 〉	통과 (0.16ms, 77.4MB)
테스트 18 〉	통과 (0.17ms, 73.2MB)
테스트 19 〉	통과 (0.82ms, 74.6MB)
테스트 20 〉	통과 (0.16ms, 82.4MB)
테스트 21 〉	통과 (0.20ms, 78.5MB)
테스트 22 〉	통과 (0.16ms, 77.3MB)
테스트 23 〉	통과 (0.23ms, 74.6MB)
테스트 24 〉	통과 (0.19ms, 75.9MB)
테스트 25 〉	통과 (0.18ms, 77.2MB)
테스트 26 〉	통과 (0.15ms, 74.1MB)
테스트 27 〉	통과 (0.16ms, 75.3MB)
테스트 28 〉	통과 (0.17ms, 74MB)
테스트 29 〉	통과 (0.15ms, 74.5MB)
테스트 30 〉	통과 (0.16ms, 74.7MB)
테스트 31 〉	통과 (0.16ms, 75.6MB)
테스트 32 〉	통과 (0.23ms, 75.6MB)
* */