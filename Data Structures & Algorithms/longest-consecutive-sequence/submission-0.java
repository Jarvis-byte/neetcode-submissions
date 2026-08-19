class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int countLongest = 0;

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int tempCount = 1;
                int currentNum = nums[i];
                while(set.contains(currentNum + 1)){
                    currentNum = currentNum + 1;
                    tempCount++;
                }
               countLongest = Math.max(countLongest,tempCount);      
            }
        }
        return countLongest;
    }
}
