class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        int n=nums.length/3;
        for(int i:nums){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else
            mp.put(i,1);
        }
        for(int i:mp.keySet()){
            if(mp.get(i)>n){
                ans.add(i);
            }
        }
        return ans;
    }
}