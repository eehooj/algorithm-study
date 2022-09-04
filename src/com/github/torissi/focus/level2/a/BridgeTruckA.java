package com.github.torissi.focus.level2.a;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruckA {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int max = 0;
        Queue<Integer> que = new LinkedList<>();

        for (int truck : truck_weights) {
            while (true) {
                if (que.isEmpty()) {
                    que.offer(truck);
                    max += truck;
                    answer++;
                    break;
                } else if (que.size() == bridge_length) {
                    max -= que.poll();
                } else {
                    max += truck;

                    if (max > weight) {
                        que.offer(0);
                        max -= truck;
                        answer++;
                    } else {
                        que.offer(truck);
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        BridgeTruckA main = new BridgeTruckA();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(main.solution(bridge_length, weight, truck_weights));
    }
}

/* 올바른 괄호
* 1. (로 열렸으면 반드시 )로 닫혀야 함
* 2. 올바른 분자열이면 true, 아니면 false
* */