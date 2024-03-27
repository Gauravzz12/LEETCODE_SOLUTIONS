class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int [] val=new int[nums.length];
        for(int i:nums){
            if(i>0){
                val[left++]=i;
            }
            else
            val[right--]=i;
        }
        int l=0;
        int r=nums.length-1;

        for(int i=0;i<val.length;i++){
            if(i%2==0)
            nums[i]=val[l++];
            else
            nums[i]=val[r--];

           }
           return nums;
    }
}