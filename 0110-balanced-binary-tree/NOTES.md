DFS로 left, right 노드 길이 끝까지 탐색 후 길이 비교

time complexity O(N)
space complexity O(N)

깊이 우선 탐색(DFS, Depth-First Search)
루트 노드(혹은 다른 임의의 노드)에서 시작해서 다음 분기(branch)로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방법
-즉, 넓게(wide) 탐색하기 전에 깊게(deep) 탐색하는 것이다.
-사용하는 경우: 모든 노드를 방문 하고자 하는 경우에 이 방법을 선택한다.
-깊이 우선 탐색(DFS)이 너비 우선 탐색(BFS)보다 좀 더 간단하다.
-단순 검색 속도 자체는 너비 우선 탐색(BFS)에 비해서 느리다.

깊이 우선 탐색(DFS)의 특징
-자기 자신을 호출하는 순환 알고리즘의 형태 를 가지고 있다.
-전위 순회(Pre-Order Traversals)를 포함한 다른 형태의 트리 순회는 모두 DFS의 한 종류이다.
-이 알고리즘을 구현할 때 가장 큰 차이점은, 그래프 탐색의 경우 어떤 노드를 방문했었는지 여부를 반드시 검사 해야 한다는 것이다.
-이를 검사하지 않을 경우 무한루프에 빠질 위험이 있다.


https://gmlwjd9405.github.io/2018/08/14/algorithm-dfs.html
https://gmlwjd9405.github.io/2018/08/14/algorithm-dfs.html
