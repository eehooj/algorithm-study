package com.github.torissi.programmers;

public class Solution210820_2 {
    public String solution(String s, int n) {
        char[] cha = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < cha.length; i++) {
            int ascii = cha[i];
            int num = ascii + n;

            if (ascii <= 90 && ascii >= 65) {
                if (num > 90) {
                    num = num - 90 + 64;
                }
            } else if (ascii <= 122 && ascii >= 97) {
                if (num > 122) {
                    num = num - 122 + 96;
                }
            } else {
                num = ascii;
            }

            cha[i] = (char) num;
            builder.append(cha[i]);
        }

        return builder.toString();
    }

}

/*시저 암호
문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
입출력 예
s	n	result
"AB"	1	"BC"
"z"	1	"a"
"a B z"	4	"e F d"
*/

/*
테스트 1 〉	통과 (0.04ms, 56.8MB)
테스트 2 〉	통과 (0.08ms, 56.8MB)
테스트 3 〉	통과 (0.09ms, 67.2MB)
테스트 4 〉	통과 (0.03ms, 56.7MB)
테스트 5 〉	통과 (0.04ms, 57MB)
테스트 6 〉	통과 (0.04ms, 56.8MB)
테스트 7 〉	통과 (0.05ms, 57.3MB)
테스트 8 〉	통과 (0.05ms, 58.7MB)
테스트 9 〉	통과 (0.04ms, 56.9MB)
테스트 10 〉	통과 (0.09ms, 59.2MB)
테스트 11 〉	통과 (0.06ms, 72.4MB)
테스트 12 〉	통과 (0.03ms, 57.4MB)
테스트 13 〉	통과 (0.95ms, 57.2MB)
*/

/*
public String solution(String s, int n) {
    String result = "";
    n = n % 26;
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (Character.isLowerCase(ch)) {
            ch = (char) ((ch - 'a' + n) % 26 + 'a');
        } else if (Character.isUpperCase(ch)) {
            ch = (char) ((ch - 'A' + n) % 26 + 'A');
        }
        result += ch;
    }
    return result;
}
=> 좋아요가 제일 많은 식인데, 시간이.... 몇십초씩이다.

테스트 1 〉	통과 (13.98ms, 57.9MB)
테스트 2 〉	통과 (12.86ms, 57.8MB)
테스트 3 〉	통과 (9.77ms, 72.9MB)
테스트 4 〉	통과 (10.82ms, 57.9MB)
테스트 5 〉	통과 (13.41ms, 58.1MB)
테스트 6 〉	통과 (10.52ms, 57.8MB)
테스트 7 〉	통과 (27.79ms, 70.6MB)
테스트 8 〉	통과 (12.04ms, 73.8MB)
테스트 9 〉	통과 (11.46ms, 59.5MB)
테스트 10 〉	통과 (10.30ms, 60.7MB)
테스트 11 〉	통과 (23.60ms, 68.2MB)
테스트 12 〉	통과 (12.89ms, 58.1MB)
테스트 13 〉	통과 (37.71ms, 91.7MB)


=> 내 코드에서 Character.isLowerCase(ch)만 적용해서 해보았더니 0.03ms 정도 느려짐
테스트 1 〉	통과 (0.09ms, 67.2MB)
테스트 2 〉	통과 (0.07ms, 57.1MB)
테스트 3 〉	통과 (0.06ms, 57.1MB)
테스트 4 〉	통과 (0.08ms, 59.5MB)
테스트 5 〉	통과 (0.04ms, 73.1MB)
테스트 6 〉	통과 (0.07ms, 56.5MB)
테스트 7 〉	통과 (0.08ms, 67.1MB)
테스트 8 〉	통과 (0.07ms, 56MB)
테스트 9 〉	통과 (0.09ms, 73.7MB)
테스트 10 〉	통과 (0.09ms, 70MB)
테스트 11 〉	통과 (0.08ms, 68.5MB)
테스트 12 〉	통과 (0.12ms, 57.6MB)
테스트 13 〉	통과 (3.65ms, 73.8MB)

=> 나머지하는 식이 느린 듯..?
*/

