package com.github.torissi.focus.level1.a;

public class WorkoutClothesA {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];

        for (int item : lost) {
            student[item - 1]--;
        }

        for (int item : reserve) {
            student[item - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (student[i] < 0) {
                if (student[i - 1] == 1) {
                    student[i - 1]--;
                    student[i]++;
                } else if (student[i + 1] == 1) {
                    student[i + 1]--;
                    student[i]++;
                }
            }
        }

        for (int item : student) {
            if (item >= 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        WorkoutClothesA add = new WorkoutClothesA();
        int n = 5;
        int[] participant = {2, 4};
        int[] completion = {1, 3, 5};

        System.out.println(add.solution(n, participant, completion));
    }
}



/* 체육복
* 1. 바로 앞 번호의 학생이나 바로 뒷 번호의 학생에게만 체육복을 빌릴 수 있음
* 2. 최대값 리턴
* */
