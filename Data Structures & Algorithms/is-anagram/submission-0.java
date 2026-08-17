class Solution {
    public boolean isAnagram(String a, String b) {
        char s[] = a.toCharArray();
        char t[] = b.toCharArray();

       HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length;i++){
            if(!map.containsKey(s[i])){
                map.put(s[i],1);
            }
            else{
            int getValue = map.get(s[i]);
            int newValue = getValue+1;
            map.put(s[i],newValue);
            }
        }

        for(int i = 0; i<t.length;i++){
            if(!map.containsKey(t[i])){
                map.put(t[i],1);
            }
            else{
            int getValue = map.get(t[i]);
            int newValue = getValue-1;
            map.put(t[i],newValue);
            }
        }

        boolean allZero = true;

        for (int value : map.values()) {
            if (value != 0) {
                allZero = false;
                break;
            }
        }

        if(allZero){
            return true;
        }
        return false;

    }
}
