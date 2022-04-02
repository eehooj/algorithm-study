package com.github.torissi.java;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {

    public static void main(String[] args) throws Exception {
        String filePath = "src/com/github/torissi/java/AddLineNumberExample.java"; // 출력할 파일
        FileReader reader = new FileReader(filePath); // 입력 스트림 선언
        BufferedReader br = new BufferedReader(reader); // 보조스트림 선언

        int row = 0; // 라인 수

        while(true) { // while문 벗어날 조건은 없음
            String data = br.readLine(); // 버퍼리더에서 한 줄씩 읽어들이기
            
            if (data == null) { // 만약 데이터가 없으면 (마지막 줄이라면)
                break; // 반복문 벗어나기
            }

            System.out.println(++row + " : " + data); // 콘솔 출력
        }

        br.close(); // 스트림 닫기
    }
}

