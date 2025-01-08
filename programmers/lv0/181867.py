def solution(myString):
    answer = []
    a = myString.split('x')
    for i in range(len(a)):
        answer.append(len(a[i]))
    return answer

# 추구미
def solution(myString):
    return [len(w) for w in myString.split('x')]