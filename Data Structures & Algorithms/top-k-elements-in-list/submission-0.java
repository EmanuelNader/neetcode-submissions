class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] buckets = new List [nums.length + 1];
        for (int key : map.keySet()){
            int frequency = map.get(key);
            if (buckets[frequency] == null){
               buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        int index = 0;
        int[]result = new int[k];
        for (int i = buckets.length - 1; i >= 0; i--){
            if (buckets[i] != null){
                for (int j = 0; j < buckets[i].size(); j++){
                    result[index] += buckets[i].get(j);
                    index++;
                    if (index == k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
