class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) //hashset에 값 존재한다면 true 반환
                return true; 
            else
                set.add(nums[i]);
        }
        return false;
    }
}

/* 
Hashset.add()
HashSet에 인자로 전달된 아이템을 저장하고, HashSet에 존재하지 않는 아이템이라면 true, 존재하는 아이템이라면 false를 리턴합니다.

for (int num:nums){
    if (!set.add(num)) return true;
}
return false
*/