def solution(todo_list, finished):
    answer = []
    for idx, todo in enumerate(todo_list):
        if not finished[idx]:
            answer.append(todo)
    return answer

# 리스트 컴프리핸션 ver
def solution(todo_list, finished):
    return [todo for idx, todo in enumerate(todo_list) if not finished[idx]]