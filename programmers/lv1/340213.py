def toSec(string):
    arr = string.split(':')
    sec = int(arr[0])*60 + int(arr[1])
    return sec

def toMin(sec): # 도움받음
    minutes = sec // 60
    seconds = sec % 60
    return f"{minutes:02d}:{seconds:02d}"  # 두 자리로 0을 채운 형식으로 출력

def opSkip(pos, op_start, op_end):
    if op_start<=pos and pos<=op_end:
        pos=op_end
    return pos

def solution(video_len, pos, op_start, op_end, commands):
    video_len, pos, op_start, op_end = toSec(video_len), toSec(pos), toSec(op_start), toSec(op_end)
    pos = opSkip(pos, op_start, op_end)

    for command in commands:
        if command == 'prev':
            if pos < 10:
                pos = 0
            else:
                pos -= 10
        elif command == 'next':
            if video_len-pos < 10:
                pos = video_len
            else:
                pos += 10
        pos = opSkip(pos, op_start, op_end)
    return toMin(pos)

# 약 40분 소요