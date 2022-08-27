package com.github.torissi.focus;

public class PressKeypadA {

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int number : numbers) {
            if (number % 3 == 1) {
                answer.append("L");
                left = number;
            } else if (number % 3 == 0) {
                answer.append("R");
                right = number;
            } else { // 2 5 8 0
                int lTemp = getDigit(left, number);
                int rTemp = getDigit(right, number);

                if (lTemp > rTemp) {
                    answer.append("R");
                    right = number;
                } else if (lTemp < rTemp) {
                    answer.append("L");
                    left = number;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        left = number;
                    } else {
                        answer.append("R");
                        right = number;
                    }
                }
            }
        }

        return answer.toString();
    }

    private int getDigit(int now, int number) {
        return Math.abs((now - 1) / 3 - (number - 1) / 3) + Math.abs((now - 1) % 3 - 1);
    }
}


/* 키패드 누르기
* 1. 처음 왼손엄지는 *에서, 오른손은 #에서 시작
* 2. 1, 4, 7 누를 때는 왼손
* 3. 3, 6, 9는 오른속
* 4. 2, 5, 8, 0은 현재 키패드에서 더 가까운 손 사용 (둘 다 같다면 주 사용 손에 따라 다름)
*
* */