package com.github.torissi.focus.level2.a;

import java.util.Arrays;

public class HIndexA {

    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < length; i++) {
            if (citations[i] >= length - i) {
                answer = length - i;
                break;
            }
        }

        return answer;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        HIndexA main = new HIndexA();
        int[] truck_weights = {3, 0, 6, 1, 5};

        System.out.println(main.solution(truck_weights));
    }
}

/** H-index
 1. 논문 n편 중 h번 이상 인용된 논문이 h편 이상이고, 나머지가 h번 이하 인용됐다면 h의 최댓값
 2. 구해서 리턴
 */