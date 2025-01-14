def solution(numbers):
    compare_num = set(range(1,10))
    num_set = set(numbers)
    missed_num = compare_num-num_set
    return sum(missed_num)