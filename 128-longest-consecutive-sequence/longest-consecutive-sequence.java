class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums)
        set.add(i);

        int count=1;
        int max=0;
       for(int i:nums){
        if(!set.contains(i-1))
        {   int ele=i;
            count=1;
        
            while(set.contains(ele+1)){
                count++;
                ele++;

            }
            if(count>max){
                max=count;
                count=1;
            }
        }
        }    
        return max;
        }
}