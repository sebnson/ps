def solution(arr):
    if len(arr) == 1:
        return [-1]
    else:
        arr.remove(min(arr))
        return arr

# arr가 기본적으로 내림차순 정렬된 상태이므로, sorted는 필요하지 않음