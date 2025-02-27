from collections import Counter

def solution(k, tangerine):
    count = Counter(tangerine)
    
    # 빈도수를 기준으로 내림차순 정렬
    sorted_counts = sorted(count.values(), reverse=True)
    
    total = 0
    kinds = 0
    
    for freq in sorted_counts:
        total += freq  # 현재 크기의 귤을 추가
        kinds += 1     # 사용한 귤 크기 종류 증가
        if total >= k: # k개 이상 선택했으면 종료
            return kinds
