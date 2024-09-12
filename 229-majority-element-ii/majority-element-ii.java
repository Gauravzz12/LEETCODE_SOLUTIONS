class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
            int ele1=Integer.MIN_VALUE;
            int ele2=Integer.MIN_VALUE;
            int count1=0;
            int count2=0;
            for(int i:nums){
               if(count1==0 && ele2!=i){
                count1=1;
                ele1=i;
               }
               else if(count2==0 && ele1!=i){
                count2=1;
                ele2=i;
               }
               else if(i==ele1)count1++;
               else if(i==ele2)count2++;
               else{
                count1--;
                count2--;
               }
            }
            int n=nums.length/3;
            count1=0;
             count2=0;
            for(int i:nums){
                if(i==ele1)
                count1++;
                else if(i==ele2)
                count2++;
            }
            if(count1>n)
            ans.add(ele1);
            if(count2>n)
            ans.add(ele2);

            return ans;
    }
}