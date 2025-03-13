def solution(a, b, n):
    answer = 0
    
    while n >= a:
        tmp = (n // a) * b
        answer += tmp
        n  %= a
        n += tmp
    return answer