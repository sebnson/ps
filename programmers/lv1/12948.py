def solution(phone_number):
    masked_num = '*' * (len(phone_number)-4)
    last_four = phone_number[-4:]
    return masked_num+last_four