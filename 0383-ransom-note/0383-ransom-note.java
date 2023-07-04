class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha = new int[26];
            
        for (char c : magazine.toCharArray()) {//배열에 magazine의 알파벳 추가하며 count
        alpha[c - 'a']++;
        }
            
        for (char c : ransomNote.toCharArray()) { //배열에서 ransomeNote에 필요한 글자수만큼 빼기
            alpha[c - 'a']--;
            if (alpha[c - 'a'] < 0) return false;
        }
        return true;
    }
}