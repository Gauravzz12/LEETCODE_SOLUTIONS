class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int positivePointer = 0;
        int negativePointer = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[positivePointer] = nums[i];
                positivePointer += 2;
            } else if (nums[i] < 0) {
                result[negativePointer] = nums[i];
                negativePointer += 2;
            } else {}
        }
        
        return result;
    }
}