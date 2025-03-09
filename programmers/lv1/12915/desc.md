## 소요시간

20분

## 시공간 복잡도

- 시간: O(NlogN). timsort 알고리즘(sorted) 사용. 람다의 경우 O(1)
- 공간: O(N). sorted에서 O(N)

### sorted

```
sorted(대상, key=기준)
```

### lambda 식

```
lambda 매개변수 : 반환값

key=lambda x: (x[n], x)
# 리스트의 각 요소인 x를 하나씩 가져와 key 기준으로 정렬
# lambda x: (x[n], x)는 두 가지 기준을 사용해 정렬한다.
# 1. 문자열 x의 n번째 글자를 기준으로 정렬하고
# 2. n번째 글자가 같을 경우 전체 문자열을 기준으로 정렬
```
