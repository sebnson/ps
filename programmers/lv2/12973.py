def solution(s):
    st = []
    
    for i in s:
        if len(st) > 0 and st[-1] == i:
            st.pop()
        else:
            st.append(i)
    
    return 1 if len(st) == 0 else 0