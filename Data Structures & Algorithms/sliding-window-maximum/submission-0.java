class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        for (int r = 0; r < n; r++) {
            // 1. Remove elements that are outside the window
            while (!deque.isEmpty() && deque.peekFirst() <= r - k) {
                deque.removeFirst();
            }

            // 2. Remove smaller elements from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[r]) {
                deque.removeLast();
            }

            // 3. Add current index
            deque.addLast(r);

            // 4. Window has reached size k
            if (r >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
