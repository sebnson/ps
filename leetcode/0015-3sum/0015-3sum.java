class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();  //정렬된 순서 유지 불가
        if(nums == null || nums.length < 3)
            return new ArrayList<>(result);
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-2; i++) {
            int j = i+1; //현재에서 하나 다음 위치
            int k = nums.length-1; //k배열의 마지막 위치
            
            while (j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                    result.add(Arrays.asList(nums[i],nums[j++],nums[k--]));//result 집합 추가, 왼쪽 증가/오른쪽 감소(새로운 조합 찾기)
                else if(sum < 0) // 왼쪽 포인터 이동 (값 올림)
                    j++;
                else if(sum > 0) // 오른쪽 포인터 이동(값 내림)
                    k--;
            }
        }
        return new ArrayList<>(result); //집합 리스트로 변환하여 반환
    }
}