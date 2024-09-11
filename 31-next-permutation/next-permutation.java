class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint = -1;
        
        // Step 1: Find the breakpoint where nums[i] < nums[i+1]
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpoint = i;
                break;
            }
        }
        
        // Step 2: If no breakpoint found, reverse the entire array (i.e., last permutation case)
        if (breakpoint == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            // Step 3: Find the smallest element greater than nums[breakpoint] in the right subarray
            int nextgreater = -1;
            for (int i = nums.length - 1; i > breakpoint; i--) {
                if (nums[i] > nums[breakpoint]) {
                    nextgreater = i;
                    break;
                }
            }
            
            // Step 4: Swap the elements at breakpoint and nextgreater
            swap(nums, breakpoint, nextgreater);
            
            // Step 5: Reverse the subarray after the breakpoint
            reverse(nums, breakpoint + 1, nums.length - 1);
        }
    }

    // Helper method to reverse the array from index start to end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
