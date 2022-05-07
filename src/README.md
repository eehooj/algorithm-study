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

> BFS(Breadth-First Search) 너비 우선 탐색
> - 프로그래머스 게임 맵 최단 거리(level2)
>  ```java
>
>  ```
> 루트 노드에서 시작하여 인접한 노드를 먼저 탐색하는 방법 <br/>
> 깊이가 가장 얕은 노드부터 모두 탐색한 뒤 깊이가 깊은 노드를 탐색하는 방법 <br/>
> 주로 그래프에서 모든 간선의 비용이 동일한 조건에서 최단 거리를 구하는 문제에 효과적
> 두 노드 사이의 최단 경로를 탐색할 때 활용하기 좋은 방식 (멀리 떨어진 노드는 나중에 탐색하기 때문에) <br/>
> 큐를 활용해 탐색할 노드의 순서를 저장하고 큐에 저장된 순서대로 탐색 <br/>
> 루트 노드와 인접하고 방문한 적 없고, 큐에 저장되지 않은 노드를 큐에 넣음