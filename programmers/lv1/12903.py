def solution(s):
    mid = len(s) // 2
    if len(s)%2 == 0: # 짝수
        answer = s[mid-1:mid+1]
        
    else:
        answer = s[mid]
    return answer