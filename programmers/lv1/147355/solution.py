def solution(t, p):
    answer = 0
    t = [int(t[i: i+len(p)]) for i in range(len(t) - len(p) + 1)]
    for num in t:
        if num <= int(p):
            answer += 1
        else:
            continue
    return answer