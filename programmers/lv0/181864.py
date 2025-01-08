def solution(myString, pat):
    changed_string = myString.translate(str.maketrans('AB','BA'))

    if pat in changed_string:
        return 1
    else:
        return 0

# str.maketrans('','') 각 수를 변환하는 "변환테이블" 작성
# .translate(변환테이블): 변환테이블을 사용해 string을 변경