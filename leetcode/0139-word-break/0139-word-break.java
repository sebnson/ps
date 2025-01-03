//dynamic programming
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 0; i < s.length() + 1; i++) {
            for (String word : wordDict) {
                int wordLen = word.length();
                if (i >= wordLen && dp[i - wordLen] && s.substring(i - wordLen, i).equals(word)) {
                    dp[i] = true;
                }
            }
        }

        return dp[s.length()];
    }
}