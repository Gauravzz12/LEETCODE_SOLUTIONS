class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m + n - 1;
        if (n == 0)
            return;
        int a = m - 1;
        int b = n - 1;
        while (a >= 0 && b >= 0) {
            if (nums1[a] > nums2[b]) {
                nums1[j] = nums1[a];
                a--;
            } else {
                nums1[j] = nums2[b];
                b--;
            }
            j--;
        }
        while (b >= 0) {
            nums1[j] = nums2[b];
            b--;
            j--;
        }
    }
}
