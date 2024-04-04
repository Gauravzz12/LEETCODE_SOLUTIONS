class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE,cnt1=0,cnt2=0;
        for(int i:nums){
            if(cnt1==0 && i!=ele2){
                ele1=i;
                cnt1=1;

            }
            else if(cnt2==0 && i!=ele1){
                ele2=i;
                cnt2=1;
                
            }
            else if(i==ele1)
            cnt1++;
            else if(i==ele2)
            cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0;
        cnt2=0;
        int min=n/3;
        for(int i:nums){
            if(i==ele1)
            cnt1++;
            if(i==ele2)
            cnt2++;
        }
        if(cnt1>min)
        ans.add(ele1);
        if(cnt2>min)
        ans.add(ele2);
        return ans;
    }
}