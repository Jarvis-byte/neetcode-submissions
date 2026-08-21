class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }
    int count = 0;
    for(int num:set){
        if(!set.contains(num-1)){
            int currCount = 1;
            while(set.contains(num+1)){
                currCount++;
                num = num+1;
            }
            count = Math.max(currCount,count);
        }
    }
    return count;

    }
}
