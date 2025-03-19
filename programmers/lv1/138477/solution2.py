import heapq

def solution(k, score):
    answer = []
    hall= []

    for s in score:
        if len(hall) < k:
            heapq.heappush(hall, s) # 1. s를 hall에 삽입 2. 가장 작은 값인 hall[0]을 제거
        else:
            if s > hall[0]: # hall중 최하위 점수보다 크면 교체
                heapq.heappushpop(hall, s)
        
        answer.append(hall[0])
    
    return answer

# heapq: 최소힙. heap[0]에는 가장 작은 값이 위치한다.