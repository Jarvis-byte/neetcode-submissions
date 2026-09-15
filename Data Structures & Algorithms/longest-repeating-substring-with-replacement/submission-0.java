class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A'] = freq[ch - 'A'] + 1;
            maxFreq = Math.max(freq[ch - 'A'], maxFreq);
            int windowLength = right - left + 1;

            while (windowLength - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
                windowLength = right - left + 1;
            }

            maxLength = Math.max(maxLength, windowLength);
        }
        return maxLength;
    }
}
