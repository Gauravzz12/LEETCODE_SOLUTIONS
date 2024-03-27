class Solution {

public:
    void nextPermutation(vector<int>& nums) {
        next_permutation(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-1;i++){
            cout<<nums[i]<<",";
        }
        cout<<nums[nums.size()-1];
        
    }
};