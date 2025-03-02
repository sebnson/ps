# 소요시간

10분

# 시공간 복잡도

시간: O(NlogN) = 정렬 O(NlogN) + 반복문 O(N)

공간: O(1)

# 처음 코드

```
def solution(d, budget):
    answer = 0
    calc = 0
    d.sort()

    for i in d:
        if calc <= budget:
            calc += i
            answer += 1
        else:
            answer -= 1
            return answer
    return answer

```

1개의 tc 실패.
calc가 예산과 같은 경우에도, i를 더했을 때 초과될 수 있다. -> 더하기 전에 초과 여부 체크해야 함

또한, 예산을 초과하기 전에 이미 정해진 횟수에서 return하면 되므로 answer -= 1은 필요없다.

# 다른 풀이

```
def solution(d, budget):
    d.sort()
    while budget < sum(d):
        d.pop()
    return len(d)
```

배열 d 특성을 활용한 풀이.
