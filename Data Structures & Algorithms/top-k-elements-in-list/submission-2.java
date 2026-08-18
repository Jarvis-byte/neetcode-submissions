class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

    List<Integer>[] bucket = new List[nums.length + 1];

        for(int key:map.keySet()){
            int value = map.get(key);
            if(bucket[value]==null){
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        }
        int[] result = new int[k];
       int index = 0;
        for(int i=bucket.length-1;i>=0 && index<k;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    result[index] = num;
                    index++;
                    if(index == k) break;
                }
            }
        }

        return result;

    }
}
