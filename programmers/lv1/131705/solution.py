from itertools import combinations

def solution(number):
    answer = 0
    combis = list(combinations(number, 3))
    
    for combi in combis:
        if sum(combi) == 0:
            answer +=1
    return answer