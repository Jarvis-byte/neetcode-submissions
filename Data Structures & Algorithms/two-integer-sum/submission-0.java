class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int currDiff = target - nums[i];
            if(map.containsKey(currDiff)){
                ans[0] = map.get(currDiff);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
