from itertools import combinations

def solution(numbers):
    combi = list(combinations(numbers, 2))
    answer = [sum(pair) for pair in combi]
    answer = sorted(set(answer))
    return answer