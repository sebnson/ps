def solution(n):
    x = 2
    while n % x != 1:
        x += 1
    return x
