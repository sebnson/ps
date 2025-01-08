# 내코드
def solution(arr, n):
    answer = []
    if len(arr)%2 == 1: # 홀수
        for i in range(len(arr)):
            if i%2==1:
                answer.append(arr[i])
            else:
                answer.append(arr[i]+n)
    else: # 짝수
        for i in range(len(arr)):
            if i%2==1:
                answer.append(arr[i]+n)
            else:
                answer.append(arr[i])
    return answer

# 효율적인 코드
def solution(arr, n):
    # 홀수길이 여부에 따라 처리
    is_odd_length = len(arr) % 2 == 1
    answer = []

    # 배열을 순회하면서 처리
    for i, value in enumerate(arr):
        if i % 2 == 0:  # 짝수 인덱스일 경우
            # 홀수 길이이면 n을 더하고, 짝수 길이면 그대로 둔다.
            # value = array의 값, i=index
            answer.append(value + n if is_odd_length else value)
        else:  # 홀수 인덱스일 경우
            # 짝수 길이이면 n을 더하고, 홀수 길이면 그대로 둔다.
            answer.append(value if is_odd_length else value + n)

    return answer