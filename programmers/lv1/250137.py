# 1트
def solution(bandage, health, attacks): # [기술시전시간, 1초당 회복걍, 추가회복량] 최대체력, [[공격시간, 피해량], ,,,]
    cur_health = health
    heal_cnt = 0
    extra_point = bandage[2]
    playtime = attacks[len(attacks)-1][0]
    attack_cnt = 0

    for time in range(playtime):
        # 공격 안당했을 때(회복)
        if time != attacks[time][0]:
            heal_cnt += 1
            cur_health
        # 공격 당했을 경우
        else:
            cur_health -= attacks[0][1]
            heal_cnt = 0

    for time, damage in attacks:
        if time == bandage[0]: # 공격 당했을 경우
            cur_health -= damage
            suceed_num = 0
        else: # 공격 안당했을 때 (일반적인 경우)
            suceed_num += 1
            if cur_health < health:
                cur_health += bandage[1]
            if suceed_num == bandage[0]:
                cur_health += extra_point
                suceed_num = 0
            if cur_health > health:
                cur_health = health
    if cur_health <= 0:
        return -1
    return cur_health