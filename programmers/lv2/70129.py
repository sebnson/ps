def solution(s):
    zero_count = 0
    change_count = 0

    while s != "1":
        zero_count += s.count("0")
        s = bin(s.count("1"))[2:]
        change_count += 1

    
    return [change_count, zero_count]

