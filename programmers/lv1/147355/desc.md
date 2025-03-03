## 소요시간

20분

## 시공간 복잡도

슬라이딩 윈도우(brute-force) 방식으로 문자열을 추출하고 비교하는 방법 사용.

- 시간복잡도: O(m * n) = 부분 문자열 추출 (O(m - n + 1) = O(m)) + 숫자 변환 O(n*m) + 비교연산 O(m)
- 공간복잡도: O(m)

## 다른 코드

### 슬라이싱 없는 버전

```
def solution(t, p):
    answer = 0
    n = len(p)
    p = int(p)  # 미리 정수로 변환
    num = int(t[:n])  # 첫 번째 숫자 변환

    for i in range(len(t) - n + 1):
        if num <= p:
            answer += 1
        if i + n < len(t):  # 다음 숫자로 이동
            num = (num % (10 ** (n - 1))) * 10 + int(t[i + n])

    return answer
```

슬라이싱 없이 미리 정수로 변환. t를 전체 리스트에 저장하지 않으므로, 공간 복잡도가 O(1)이며 시간 복잡도는 O(m)이다

### 슬라이싱 버전

```
def solution(t, p):
    answer = 0

    for i in range(len(t) - len(p) + 1):
        if int(p) >= int(t[i:i+len(p)]):
            answer += 1

    return answer
```
