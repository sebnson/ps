def solution(n):
    ans = 1
    while n > 1:
        while n % 2 == 0:
            n /= 2
            
        if n == 1:
            break
            
        n -= 1
        ans += 1
        
    return ans

# bin으로 이진수 문자열 치환 -> 이진수에서 1의 개수를 센다
# "1을 빼는 연산"과 "2로 나누는 연산"의 횟수는 이진수 표현에서 1의 개수와 정확하게 일치함
def solution(n):
    return bin(n).count('1')