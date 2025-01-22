def solution(s):
    words = list(map(str, s.split(' ')))
    answer = ' '.join([word.capitalize() for word in words])
    return  answer