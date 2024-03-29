import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                breakpoint = i - 1;
                break;
            }
        }
        
        if (breakpoint == -1) {
            Arrays.sort(nums);
        } else {
            int nextGreaterIndex = -1;
            for (int i = nums.length - 1; i > breakpoint; i--) {
                if (nums[i] > nums[breakpoint]) {
                    nextGreaterIndex = i;
                    break;
                }
            }
            
            int temp = nums[breakpoint];
            nums[breakpoint] = nums[nextGreaterIndex];
            nums[nextGreaterIndex] = temp;
            
            int left = breakpoint + 1;
            int right = nums.length - 1;
            while (left < right) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
}
