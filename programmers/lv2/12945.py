def fibo(n):
    a, b = 0, 1
    for i in range(n):
        a, b = b, a + b
    return a

def solution(n):
    return fibo(n) % 1234567