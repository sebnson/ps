# tc 미통과
def solution(s):
    answer = True
    if s.count('p') != s.count('y'):
        answer = False
    if s.lower().count('p') == 0 and s.lower().count('p') == 0:
        answer = True

    return answer

# 깔끔 ver
def solution(s):
    s = s.lower()
    return s.count('p') == s.count('y')
