class Solution {
    public int maxArea(int[] heights) {
        int vol = 0;
        int L = 0;
        int R = heights.length-1;
        while(L<R){
            vol = Math.max(vol,((R-L)*Math.min(heights[R],heights[L])));
            if(heights[R]<heights[L]){
                R--;
            }
            else{
                L++;
            }

        }
        return vol;
    }
}
