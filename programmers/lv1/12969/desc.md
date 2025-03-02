# 소요시간

5분

# 시공간복잡도

시간: O(a + b) = 반복문

공간: O(a) = 출력에 필요한 공간

# 다른 풀이

## 리스트 컴프리핸션을 사용

동일 로직이나, 리스트컴프리핸션 사용

```
a, b = map(int, input().strip().split())
print("\n".join(["*" * a for _ in range(b)]))

```

## 단순 구현

```
a, b = map(int, input().strip().split(' '))
answer = ('*'*a +'\n')*b
print(answer)
```

단순 출력 사용하기
