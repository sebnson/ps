# 소요시간

10분

# 시공간복잡도

시간복잡도: for문 중첩. O(nm)

공간복잡도: O(1)

# 다른 풀이

## numpy 사용하기

```
import numpy as np
def solution(arr1, arr2):
    a1= np.array(arr1)
    a2= np.array(arr2)
    return (a1 + a2).tolist() # tolist()를 사용해 새로운 리스트를 반환함
```

numpy 라이브러리는 벡터 연산을 지원한다.
따라서 행렬 덧셈을 할 때, 반복문 없이 각 요소별 덧셈을 지원한다.

## zip 사용하기

```
def solution(arr1, arr2):
    answer = [[c + d for c, d in zip(a,b)] for a, b in zip(arr1,arr2)]
    return answer
```

zip은 두 개의 리스트를 서로 묶어줄 때 사용한다.

예를 들어,

```
name = ['merona', 'gugucon']
price = [500, 1000]
z = zip(name, price)
print(list(z))

# 출력된 리스트
[('merona', 500), ('gugucon', 1000)]
```

따라서
`for a, b in zip(arr1, arr2)`는 arr1과 arr2에서 같은 인덱스에 있는 행을 가져오게 한다.

zip을 사용해 1차적으로 a, b를 각 행으로 들어오게 했으므로, a,b를 다시 묶어 같은 인덱스의 원소들로 묶어준다.
`[c + d for c, d in zip(a, b)]`
