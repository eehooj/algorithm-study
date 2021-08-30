package com.github.torissi.programmers.level1;

public class Solution210816_3 {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int length = phone_number.length();
        String phone_number_back = phone_number.substring(length - 4, length);

        for (int i = 0; i < length - 4; i++) {
            answer.append("*");
        }

        answer.append(phone_number_back);

        return answer.toString();
    }
}

/*핸드폰 번호 가리기
문제 설명
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 4 이상, 20이하인 문자열입니다.
입출력 예
phone_number	return
"01033334444"	"*******4444"
"027778888"	"*****8888"
*/

/*테스트 1 〉	통과 (0.03ms, 60.2MB)
테스트 2 〉	통과 (0.02ms, 59.2MB)
테스트 3 〉	통과 (0.03ms, 68.5MB)
테스트 4 〉	통과 (0.03ms, 70.1MB)
테스트 5 〉	통과 (0.02ms, 68.7MB)
테스트 6 〉	통과 (0.03ms, 68.4MB)
테스트 7 〉	통과 (0.03ms, 59MB)
테스트 8 〉	통과 (0.03ms, 69.8MB)
테스트 9 〉	통과 (0.02ms, 60.4MB)
테스트 10 〉	통과 (0.02ms, 60.1MB)
테스트 11 〉	통과 (0.02ms, 72.9MB)
테스트 12 〉	통과 (0.03ms, 71.4MB)
테스트 13 〉	통과 (0.03ms, 58.6MB)*/

/*public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }*/