class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of characters required from s1
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

         int windowSize = s1.length();

          // Build the first window
        for (int i = 0; i < windowSize; i++) {
            windowFreq[s2.charAt(i) - 'a']++;
        }

        if(matches(s1Freq,windowFreq)){
            return true;
        }

        for(int right = windowSize; right < s2.length(); right++){
             windowFreq[s2.charAt(right) - 'a']++;
             
        }



    }
     private boolean matches(int[] s1Freq, int[] windowFreq) {
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] != windowFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
