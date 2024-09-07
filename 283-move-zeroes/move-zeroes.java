class Solution {
    public void moveZeroes(int[] nums) {
        int z=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z=i;
                break;
            }
        }
        if(z==-1)
        return;
        for(int i=z+1;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,i,z);
                z++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}