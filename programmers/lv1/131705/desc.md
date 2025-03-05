# 소요시간

10분

# 시공간 복잡도

조합 라이브러리 좋아요

- 시간: 조합 O(n^3)
- 공간: 조합 리스트 저장 O(n^3)

# 다른 풀이

```
def solution(number):
    answer = 0
    n = len(number)

    def backtrack(start, path):
        nonlocal answer
        if len(path) == 3:  # 3개 선택 완료
            if sum(path) == 0:
                answer += 1
            return

        for i in range(start, n):
            backtrack(i + 1, path + [number[i]])

    backtrack(0, [])
    return answer
```

리스트에 조합을 저장하지 않고, 백트래킹을 활용해 직접 조합을 찾고 합을 검사하는 방법.

- 모든 3개 조합을 검사하므로, 시간 복잡도는 O(n^3)
- 공간 복잡도는 O(1)
