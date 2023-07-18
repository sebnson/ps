주어진 points 배열에서 가장 가까운 k개의 점을 찾기

- minHeap: PriorityQueue<int[]>. Distance가 작을수록 우선순위가 높게 설정됨 <br/><br/>

  
- points 배열에서 각 점의 x, y 값을 추출-> minHeap 저장.
- Distance는 피타고라스 공식(a^2 + b^2 = c^2) 사용
- minHeap.offer(point)로 minHeap에 원소 추가 (k보다 클 시 우선순위가 가장 낮은 원소 제거(minHeap.poll() -> 가장 가까운 원소 남기기)<br/><br/>


- minHeap의 값 2차원 배열로 변환해서 반환
- minHeap에서 원소를 추출 -> res에 역순으로 저장 (거리 가까운 순 res 저장됨)<br/><br/>

<br/>
다른 풀이방식: [정렬 이용하기](https://jaime-note.tistory.com/187)
<br/><br/>
  PriorityQueue
- 데이터의 우선순위를 정해 우선순위가 높은 순서대로 나가는 것
- 우선순위 힙으로 구현
- 데이터를 삽입시 우선순위의 최대, 최소를 구성 -> 데이터가 빠지면 공백을 채워넣는 방식<br/><br/>

  특징
- 값을 비교해야 함 -> null 비허용, 비교 불가 객체는 큐 생성 불가
- 내부구조 -> 이진트리 힙 (add() 및 poll() 메서드(추가, 삭제 메서드) 0(log(n)) 시간 소요)
- AbstractQueue , AbstractCollection , Collection 및 Object클래스에서 메소드 상속<br/><br/>

[출처](https://crazykim2.tistory.com/575)

