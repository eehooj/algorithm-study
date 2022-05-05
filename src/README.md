# 수식
> 경우의 수 <br/>
> - 프로그래머스 위장(level2) <br/>
>   ``` java
>   int answer = 1;
>    HashMap<String, Integer> map = new HashMap<>();
>
>    for (String[] item : clothes) {
>        map.put(item[1], map.getOrDefault(item[1], 0) + 1);
>    }
>
>    for (Integer item : map.values()) {
>        answer *= (item + 1);  // 경우의 수 = (A + 1) * (B + 1) * ....
>    }
>
>    return answer - 1; // 아무것도 안입는 경우 제외하기
>   ```

