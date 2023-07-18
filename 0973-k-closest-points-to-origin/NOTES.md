주어진 points 배열에서 가장 가까운 k개의 점을 찾기

- minHeap: PriorityQueue<int[]>. Distance가 작을수록 우선순위가 높게 설정됨

- points 배열에서 각 점의 x, y 값을 추출-> minHeap 저장.
- Distance는 피타고라스 공식(a^2 + b^2 = c^2) 사용
- minHeap.offer(point)로 minHeap에 원소 추가 (k보다 클 시 우선순위가 가장 낮은 원소 제거(minHeap.poll())
- 결국 minHeap에는 가장 가까운 k개의 점이 남게 됩니다.

- minHeap의 값 2차원 배열로 변환해서 반환
- minHeap에서 원소를 추출 -> res에 역순으로 저장 (거리 가까운 순 res 저장됨)
