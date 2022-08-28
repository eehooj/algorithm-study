package com.github.torissi.focus.level2.a;

public class TargetNumberA {

    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }

    private int dfs (int[] numbers, int index, int sum, int target) {
        if (index == numbers.length) {
            if (sum == target) {
               return 1;
            }

            return 0;
        }

        return dfs(numbers, index + 1, sum + numbers[index], target)
                + dfs(numbers, index + 1, sum - numbers[index], target);
    }

    public static void main(String[] args) {
        TargetNumberA f = new TargetNumberA();
        int[] progresses = {1, 2, 3, 9, 10, 12};
        int k = 7;

        f.solution(progresses, k);
    }
}


/* 타겟 넘버
* 1. n개의 양의 정수들
* 2. 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들고 싶음
* 3. 방법의 수 리턴
* */
