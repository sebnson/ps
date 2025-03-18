def solution(s, skip, index):
    answer = ""
    alphabet = [chr(i) for i in range(ord('a'), ord('z') +1) if chr(i) not in skip]
    
    for char in s:
        current_idx = alphabet.index(char)
        new_idx = (current_idx + index) % len(alphabet)
        answer += alphabet[new_idx]
    return answer