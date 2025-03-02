def solution(d, budget):
    d.sort()
    total_cost = 0
    answer = 0

    for cost in d:
        if total_cost + cost > budget:
            return answer
        total_cost += cost
        answer += 1

    return answer