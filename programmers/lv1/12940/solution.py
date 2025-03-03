def gcd(n,m) :
    while m > 0 :
        n, m = m, n%m
    return n
def lcm(num, GCD):
    return num / GCD

def solution(n, m):
    GCD = 0
    GCD = gcd(n,m)
    
    return [GCD, lcm(n*m, GCD)]