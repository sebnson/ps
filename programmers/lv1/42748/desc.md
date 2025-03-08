## 소요시간

10분

## 시공간 복잡도

시간 복잡도 = O(M\*NlogN)

- 슬라이싱 (array[i-1:j]) → O(N)

- 정렬 (tmp.sort()) → O(N log N)

- 인덱싱 (tmp[k-1]) → O(1)

공간 복잡도 = O(N + M)

## 다른 풀이

```
import heapq

def solution(array, commands):
    answer = []

    for i, j, k in commands:
        # 부분 배열 생성 후, 최대 힙을 사용해 k번째 작은 수 찾기
        sub_array = array[i-1:j]
        heapq.heapify(sub_array)  # 힙 구조로 변환 (O(N))

        for _ in range(k-1):
            heapq.heappop(sub_array)  # k번째 원소를 찾을 때까지 제거 (O(k log N))

        answer.append(heapq.heappop(sub_array))  # k번째 작은 값 추가 (O(log N))

    return answer

```
