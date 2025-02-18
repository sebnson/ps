def solution(n):
    stack = []
    for i in range(n):
        if i.contains("push"):
            stack.append() # i의 숫자 넣기
        if i.contains("pop"):
            if len(stack) == 0:
                print(-1)
            else:
                stack.pop()
                print(stack[-1])
        if i.contains("size"):
            print(len(stack))
        if i.contains("empty"):
            if stack==[]:
                print(0)
            else: 
                print(1)
        if i.contains("top"):
            if stack==[]:
                print(-1)
            else:
                print(stack[-1])
        