def solution(price, money, count):
    priceSum = 0
    for i in range(count+1):
        priceSum += price * i
    result = priceSum - money
    
    if result >= 0:
        return result
    else:
        return 0