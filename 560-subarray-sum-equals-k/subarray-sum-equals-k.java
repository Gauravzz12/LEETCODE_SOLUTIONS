class Solution {
    public int subarraySum(int[] nums, int k) {
    int sum = 0;
    int count = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    
    for(int num : nums) {
        sum += num;
        count += map.getOrDefault(sum - k, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        if (sum == k) 
            count++;
    }
    
    return count;
}

}