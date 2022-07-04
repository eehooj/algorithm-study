# 수식
> 경우의 수 <br/>
> - 프로그래머스 위장(level2) - com/github/torissi/programmers/WeeklyThree_1.java <br/>
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

> BFS(Breadth-First Search) 너비 우선 탐색
> - 프로그래머스 게임 맵 최단 거리(level2) - com/github/torissi/programmers/WeeklyThree_2.java
>  ```java
>  // 코드 길어서 생략
>  ```
> - 루트 노드에서 시작하여 인접한 노드를 먼저 탐색하는 방법 <br/>
> - 깊이가 가장 얕은 노드부터 모두 탐색한 뒤 깊이가 깊은 노드를 탐색하는 방법 <br/>
> - 주로 그래프에서 모든 간선의 비용이 동일한 조건에서 최단 거리를 구하는 문제에 효과적
> - 두 노드 사이의 최단 경로를 탐색할 때 활용하기 좋은 방식 (멀리 떨어진 노드는 나중에 탐색하기 때문에) <br/>
> - 큐를 활용해 탐색할 노드의 순서를 저장하고 큐에 저장된 순서대로 탐색 <br/>
> - 루트 노드와 인접하고 방문한 적 없고, 큐에 저장되지 않은 노드를 큐에 넣음

> DFS(Depth-First Search) 깊이 우선 탐색
> 
> ```java
> ```
> - 루트 노드에서 시작해 다음 분기로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방법 (자식들을 우선으로 탐색)
> - 넓게 탐색하기 전에 깊게 탐색 (한방향으로 탐색하다 장애물을 만났을 때 다른 방향으로 다시 탐색)
> - 모든 노드를 방문하고자 하는 경우에 사용
> - 단순 검색 속도는 BFS가 더 빠름
> - 순환 호출, 명시적인 스택 사용

> 카탈란 수(Catalan number) 
> - 프로그래머스 올바른 괄호 갯수(level4) - com/github/torissi/programmers/WeeklyThree_3.java
>   ```java
>   public class WeeklyThree_3 {
>   
>       public static int solution(int n) {
>           long mole = 1;
>           long deno = 1;
>           int num = 2 * n;
>   
>           for (int i = 1; i <= n; i++) {
>               mole *= num--;
>               deno *= i;
>           }
>   
>           return (int) (mole / (deno * (n + 1)));
>       }
>   }
>   ```
> - 항상 그 전의 경우의 수가 포함되어 있음
> - 한 가지 경우를 나타내면, 그와 쌍이 되는 다른 경우를 반드시 나타내야 하는 모든 경우의 수
> -쌍을 이루는 것들을 나열하는 모든 경우의 수
> - (가 나오면 무조건 )가 나와야함. ((이면 ))가 나와야 함
> - (2n)! / (n + 1)! * n! 

> DP(Dynamic Programming) 동적 계획법
> - 프로그래머스 정수 삼각형(level3) - 
>   ```java
>   public class WeeklyThree_4 {
>       // Bottom-up
>       public static int solution(int[][] triangle) {
>           int rLength = triangle.length - 2;
>   
>           for (int i = rLength; i >= 0; i--) {
>               for (int j = 0; j < triangle[i].length; j++) {
>                   triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
>               }
>           }
>   
>           return triangle[0][0];
>       }
>   }
>   ```
> - 처음 진행하는 연산은 기록하고, 이미 진행한 연산은 기록되어 있는 값을 가져와 사용 (Memoization)
> - ex) 피보나치 수열
> - 모든 방법을 일일이 검토하여 최적의 해를 찾아냄 => 항상 최적의 해를 구할 수 있음
> - 동일한 작은 문제들이 반복하여 나타나는 경우 사용 (Overlapping Subproblems)
> - 작은 문제의 최적의 결과 값을 사용하여 전체 문제의 최적 결과를 낼 수 있는 경우 사용 (Optimal Substructure)

> 선택정렬(Selection Sort)
> - 데이터 배열에서 가장 작은 데이터를 선택하여 앞으로 보내는 정렬
> - 안정성을 만족하는 방법은 아님
> - O(N^2) -> 비효율적임
> 1. 수열에서 최소값을 찾음
> 2. 찾은 최소값을 배열의 맨 앞 원소와 교환하고 정렬을 확정
> 3. 확정된 정렬을 제외한 나머지 원소 배열부터 반복