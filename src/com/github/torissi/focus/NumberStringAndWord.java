package com.github.torissi.focus;

public class NumberStringAndWord {

    public int solution(String s) {
        String[] word = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(word[i], number[i]);
        }

        return Integer.parseInt(s);
    }
}


/* 숫자 문자열과 영단어
* 1. 숫자의 일부 자릿수를 영어로 바꿈
* 2. 원래 숫자로 리턴
* */