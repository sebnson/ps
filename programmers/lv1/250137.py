# 2트
def solution(bandage, health, attacks): # [기술시전시간, 1초당 회복걍, 추가회복량] 최대체력, [[공격시간, 피해량], ,,,]
    cast_time, heal, add_heal = bandage
    cur_health = health
    pre_attack_time = attacks[0][0]

    time_btw = time-pre_attack_time -1 # 공격이 발생한다면 그 시간동안 체력 회복 불가
    for time, damage in attacks:
        if time_btw > 0:
            cur_health += (time_btw * heal)
            cur_health += ((time_btw // cast_time)) * add_heal

            if cur_health > health:
                cur_health = health
        
        cur_health -= damage
        if cur_health <= 0:
            return -1
        
        pre_attack_time = time

    return cur_health

# 내 첫 풀이에 집착하지 말 것,,,