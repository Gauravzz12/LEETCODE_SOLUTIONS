class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int n = piles.length;
        if(n > h) return -1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }

        int low = 1, high = maxi;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(piles, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static int sumByD(int[] arr, int div) {
        int n = arr.length; 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }
}