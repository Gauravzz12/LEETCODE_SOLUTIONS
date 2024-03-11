class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n];
        for(int i = 0; i < n; i++){
            newNums[nums[i] - 1] = -1;
        }    
        var response = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            if(newNums[i] != -1){
                response.add(i+1);
            }
        }
        return response;
    }
}