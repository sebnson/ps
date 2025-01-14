def solution(n):
    answer = []
    # 뒤집기
    arr = str(n)[::-1]
    
    for i in arr:
        answer.append(int(i))
        
    return answer


# 리스트 컴프리핸션
def solution(n):
    return [int(i) for i in str(n)[::-1]]