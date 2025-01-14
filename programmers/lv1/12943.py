def collatz(num):
    if num%2 == 0:
        calc = num//2
    else:
        calc = num*3 + 1
    return calc
        
def solution(num):
    answer = 0
    while num != 1:
        num = collatz(num)
        answer += 1
        if answer >= 500:
            return -1
        
    return answer