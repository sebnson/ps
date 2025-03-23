def solution(strs, t):
    dp = [0] + [float('inf')]*len(t)
    
    for i in range(len(t)):
        if dp[i] == float('inf'):
            continue
            
        for word in strs:
            end = i + len(word)

            if end <= len(t) and t[i:end] == word:
                dp[end] = min(dp[end], dp[i] + 1)

    return dp[len(t)] if dp[len(t)] != float('inf') else -1

## dp 사용