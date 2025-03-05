## 소요시간

20분

## 시공간 복잡도

시간: O(n) = split O(n) + 순회 O(n) + join O(n)
공간: 리스트 O(n)

공간: O(1)

## 다른 풀이

```
def solutions(s):
    answer = ''
    count = 0
    for word in s:
        if word == ' ':
            answer += ' '
            count = 0
        elif count %2 == 0 :
            answer += word.upper()
            count += 1
        else:
            answer += word.lower()
            count += 1
    return answer

```
