class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint = -1;
                for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpoint = i;
                break;
            }
        }
                if (breakpoint == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            int nextgreater = -1;
            for (int i = nums.length - 1; i > breakpoint; i--) {
                if (nums[i] > nums[breakpoint]) {
                    nextgreater = i;
                    break;
                }
            }
            
            swap(nums, breakpoint, nextgreater);
            reverse(nums, breakpoint + 1, nums.length - 1);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
