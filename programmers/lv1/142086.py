def solution(s):
    answer = []
    last_seen = {}
    
    for idx, word in enumerate(s):
        if word in last_seen:
            answer.append(idx - last_seen[word])
        else:
            answer.append(-1)
        
        last_seen[word] = idx 
    
    return answer
