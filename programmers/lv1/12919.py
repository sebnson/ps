def solution(seoul):
    for i, name in enumerate(seoul):
        if name == 'Kim':
            index = i
    answer = '김서방은 '+str(index)+'에 있다'
    return answer