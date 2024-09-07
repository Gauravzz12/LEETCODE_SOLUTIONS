class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=1;
        int ele=nums[0];
        int k=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]>ele){
            ans++;
            nums[k++]=nums[i];
            ele=nums[i];
           }
           
        }
        return ans;
    }
}