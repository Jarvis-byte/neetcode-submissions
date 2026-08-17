class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>list = new ArrayList<>();

        for(int value:map.keySet()){
            int count = map.get(value);
            if(count>=k){
                list.add(value);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();


    }
}
