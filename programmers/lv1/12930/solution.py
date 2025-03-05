def solution(s):
    answer = []
    split_s = s.split(' ')
    for s in split_s:
        tmp = ''
        for idx, word in enumerate(s):
            if idx % 2 != 0:
                tmp += word.lower()
            else:
                tmp += word.upper()
        answer.append(tmp)
    return ' '.join(answer)