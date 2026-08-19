class Solution {
    public int[] twoSum(int[] num, int target) {
        int R = 0;
        int L = num.length -1;
        
        while(R<L){
         int currentSum = num[R] + num[L];
         if(currentSum == target){
            break;
         }
         if(currentSum<target){
            R++;
         }else{
            L--;
         }
        }
        int ans[] = {R+1,L+1};
        return ans;
    }
}
