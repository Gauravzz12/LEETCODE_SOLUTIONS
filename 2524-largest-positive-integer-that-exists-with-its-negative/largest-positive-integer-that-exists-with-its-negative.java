class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        int max=Integer.MIN_VALUE;
        for(int i : mp.keySet()){
            if(mp.containsKey((-1*i))){
                if(Math.abs(i)>max){
                    max=Math.abs(i);
                }
            }
        }
        if(max==Integer.MIN_VALUE)
        return -1;
        else
        return max;
    }
}