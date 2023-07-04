포인터 2개를 이용
pointer1 = 리스트 1칸 이동
pointer2 = 리스트 2칸 이동

1. cycle이 있는 경우: 포인터가 만남
2. cycle이 없는 경우: pointer2가 먼저 null

리스트 순회 중단 조건: pointer2의 next, next.next 값이 null

 
