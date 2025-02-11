def solution(n):
    answer = 1  # n 자체로 표현하는 경우 포함
    for i in range(1, n // 2 + 1):
        total = 0 
        for j in range(i, n + 1):
            total += j
            if total == n:
                answer += 1
                break
            elif total > n:
                break
    return answer
