def solution(n):
    cnt_one = bin(n).count("1")
    temp = 1

    while True:
        n += 1
        compare = bin(n).count("1")

        if cnt_one == compare:
            break

    return n