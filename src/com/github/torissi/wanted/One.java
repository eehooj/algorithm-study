package com.github.torissi.wanted;

import java.util.*;

public class One {

    private static class Town {
        int power;
        int resident;
        int score;

        public Town(int power, int resident) {
            this.power = power;
            this.resident = resident;
        }

        public int getPower() {
            return power;
        }

        public int getResident() {
            return resident;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    public static int solution(int monster, int strength, int[] power, int[] resident) {
        int answer = 0;
        int init = strength;
        List<Town> list = new ArrayList<>();

        for (int i = 0; i < monster; i++) {
            list.add(new Town(power[i], resident[i]));
        }

        list.sort((a, b) -> {
            if (a.getResident() < b.getResident()) return 1;
            else if (a.getResident() > b.getResident()) return -1;
            else return Integer.compare(a.getPower(), b.getPower());
        });

        for (int i = 0; i < monster; i++) {
            Town item = list.get(i);
            int tempPower = item.getPower();
            int score = 0;
            int temp = strength;

            for (int j = 0; j < i; j++) {
                score += list.get(j).getScore();
                temp -= list.get(j).getScore();
            }

            if (temp - tempPower >= 0) {
                score += tempPower;
                strength = temp - tempPower - (init - strength);
                answer += item.getResident();

                item.setScore(score);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monster = scanner.nextInt();
        int strength = scanner.nextInt();
        int[] power = new int[monster];
        int[] resident = new int[monster];

        for (int i = 0; i < monster; i++) {
            power[i] = scanner.nextInt();
        }

        for (int i = 0; i < monster; i++) {
            resident[i] = scanner.nextInt();
        }

        System.out.println(solution(monster, strength, power, resident));
    }
}

/*
* 1. 0부터 N개의 마을 존재
* 2. 시작시 0번의 마을에 위치
* 3. 0번 마을에는 몬스터가 없으며, 다른 마을에는 몬스터가 한 마리씩 존재
* 4. 어떤 마을에서 다른 마을로 이동할 때 반드시 0번 마을을 지남
* 5. 주인공은 적당한 마을을 골라 방문하여 몬스터와 싸움
* 6. i번째 마을의 몬스터 공격력은 A[i]이고 주민 수는 P[i]이다
* 7. 주인공의 초기 체력은 K이고, 마을을 방문하여 몬스터와 싸울 때 마다 그 만큼 소모 (i + (i + i1) + ....)
* 8. 체력이 0보다 작아지면 주민을 해방 시키지 못하고 게임 종료
* 9. 최대한 많은 주민을 해방하고자 함
* 10. 주인공이 해방시킬 수 있는 주민들의 최대 수 구하기
*
* 첫째줄에 몬스터 수 N과 주인공 초기 체력 K 입력
* 둘째줄에 각 마을에 있는 몬스터 공격력
* 셋째줄에 각 마을에 있는 주민 수
* */