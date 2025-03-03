## 소요시간

20분

## 시공간 복잡도

시간: 유클리드 호제법을 사용햐여 gcd 풀이. O(log(min(n,m))). lcm은 O(1) => O(log(min(n,m)))

공간: O(1)

### 유클리드 호제법

gcd(n, m): 두 수 n, m에 대해, m이 0이 될 때까지 n, m = m, n % m을 반복하여 최대공약수를 찾음.

최소공배수(LCM)는 두 수의 곱을 최대공약수로 나눈 값이므로, lcm(n, m) = (n \* m) / gcd(n, m)을 활용

## 다른 풀이

```
import math

def solution(n, m):
    GCD = math.gcd(n, m)  # 내장 함수 사용
    LCM = (n * m) // GCD  # 정수 나눗셈
    return [GCD, LCM]

```

파이썬엔 내장함수가 있답니다... ㅎ
