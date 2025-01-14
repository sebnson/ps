# 하드코딩 ver
def solution(a, b):
    answer = 0
    if a<b:
        for i in range(a,b+1):
            answer += i
    elif a>b:
        for i in range(b,a+1):
            answer += i
    else:
        answer = a
        
    return answer

# 깔끔 ver
def solution(a,b):
    start, end = min(a,b), max(a,b)
    return sum(range(start, end+1))