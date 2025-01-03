def solution(a, b):
    answer = 0
    for i in range(len(a)):
        answer += int(a[i])*int(b[i])
    return answer

# def solution(a, b):
#     return sum([x*y for x, y in zip(a,b)])