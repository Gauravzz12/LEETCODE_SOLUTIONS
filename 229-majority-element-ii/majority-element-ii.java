class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=  new ArrayList<>();

        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            
            }
            else{
                map.put(i,map.get(i)+1);
            }

        }
        int n=(int)(nums.length/3);
        System.out.print(n);
        map.forEach((k,v)->{
            if(v>n){
                ans.add(k);
            }
        });
        return ans;
    }
}