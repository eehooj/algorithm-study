package com.github.torissi.focus.level1;

public class NumberOfAliquotAndPlus {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = aliquot(i);

            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    private int aliquot(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfAliquotAndPlus add = new NumberOfAliquotAndPlus();
        int left = 13;
        int right = 17;

        add.solution(left, right);
    }
}

/* 약수의 개수와 더하기
* 1. left와 right까지의 모든 수 중에서 약수의 개수가 짝수인 수는 더하고, 홀수인 수는 뺀 수를 리턴
* */
