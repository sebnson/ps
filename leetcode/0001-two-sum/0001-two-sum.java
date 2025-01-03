//O(n) by using Map
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>map = new HashMap<>();

        for(int i=0;i<nums.length;i++){//save nums element at map
            if(map.containsKey(target - nums[i])){ //find 'target-element'
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i],i); // making target
        }
        return null;
    }
}