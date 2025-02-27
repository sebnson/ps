# 시공간 복잡도

## 시간복잡도

- Counter(tangerine): O(n)
- sorted(count.values(), reverse=True): O(m log m) (m은 고유한 귤 크기 수)
- for 루프: O(m)
- 최악의 경우 m = n일 수 있으므로 O(n log n)

## 공간복잡도

- Counter 저장 공간: O(m)
- 정렬된 리스트: O(m)
- 기타 변수 (O(1))
- 최종 공간 복잡도: O(m)

# 다른 풀이

정렬 없이 딕셔너리와 그리디 사용하기

```
from collections import Counter

def solution(k, tangerine):
    # 1. 귤 크기별 개수 세기
    count = Counter(tangerine)

    # 2. 개수 내림차순 정렬
    sorted_counts = sorted(count.values(), reverse=True)

    # 3. 가장 빈도가 높은 귤부터 선택하여 k개 채우기
    total = 0
    kinds = 0

    for i in sorted_counts:
        total += i
        kinds += 1
        if total >= k:
            return kinds

```
